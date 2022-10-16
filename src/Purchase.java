import java.text.DecimalFormat;

public class Purchase {
    public void showPurchaseDetails(double price){
        System.out.println("Purchase details: ");
        System.out.println("Start prise:" + new DecimalFormat("##.##").format(price));
        System.out.println("Sale:" + new DecimalFormat("##.##").format(calculateSale(price)));
        System.out.println("Final prise:" + new DecimalFormat("##.##").format(countFinalPrise(price)));
    }

    private double calculateSale(double price) {
        if(price <= 5000){
            return price / 20;
        } else if (price <= 10000) {
            return price / 10;
        } else {
            return price / 100 * 15;
        }
    }

    private double countFinalPrise(double prise) {
        return prise - calculateSale(prise);
    }
}


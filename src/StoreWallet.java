public class StoreWallet {

    private static int salesPrice;

    public static void priceUp(int price) {

        salesPrice += price;
    }


    public static void priceDown(int price) {
        salesPrice -= price;
    }

    public static int getSalesPrice() {
        return salesPrice;
    }

}

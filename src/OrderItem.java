public class OrderItem {

    private int customer;
    private String foodName;
    private int foodCost;

    public OrderItem(int customer , String foodName,int foodCost){
        this.customer = customer;
        this.foodName = foodName;
        this.foodCost = foodCost;
    }

    public int getFoodCost() {
        return foodCost;
    }

    public int getCustomer() {
        return customer;
    }

    public String getFoodName() {
        return foodName;
    }
}

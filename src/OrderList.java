import java.util.ArrayList;
import java.util.List;

public class OrderList {

    private static final List<OrderItem> orders = new ArrayList<>();

    public static void addList(OrderItem orderItem){
        orders.add(orderItem);
    }

    public static int getSumCost(){
        int sum = 0;
        for(OrderItem orderitem : orders){
            sum += orderitem.getFoodCost();
        }
        return sum;
    }
    public static int getOrderList(){
        System.out.printf("%d번 고객님의 주문내역%n",orders.get(orders.size()-1).getCustomer());
        System.out.println("=====================");
        for(OrderItem orderitem : orders){
            System.out.println(orderitem.getFoodName()+ " : " + orderitem.getFoodCost() + "원");
        }
        return 1;
    }

}

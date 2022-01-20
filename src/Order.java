import exception.NotMenuException;

import java.util.Scanner;

public class Order {
    private static int customercnt = 10000;

    Scanner sc = new Scanner(System.in);

    private boolean ordered = true;


    public void mainOrder() {
        System.out.println("주문을 시작합니다.\n");
        order();
        System.out.println("주문이 종료되었습니다. 감사합니다.");
        sc.close();
        customercnt++;
    }

    public void order() {
        Menu.menuPrepare();
        if (ordered) {
            orderResult();
        } else {
            ordered = true;
        }
        System.out.println("메뉴를 선택해주세요, 주문을 취소하려면 x를 입력해주세요\n");
        try {
            if (selectOrder(sc.nextLine()) == 1) {

                calPrice(OrderList.getSumCost(),sc.nextLine());
                return;
            }
        } catch (NotMenuException e) {
            System.out.println(e.getMessage() + "다시 주문해주세요.");
        }
        order();
    }

    public int doOrder(String ordered) throws NotMenuException {
        return Menu.getFoodMenu(ordered);
    }

    public int selectOrder(String ordered) throws NotMenuException{
        if (ordered.equals("x")) {
            return 1;
        } else {
            final int orderedPrice = doOrder(ordered);
            System.out.println("주문하신 " + ordered + "의 금액은 " + orderedPrice + "원입니다.");
            OrderList.addList(new OrderItem(customercnt, ordered, orderedPrice));
            return 3;
        }
    }

    public int reOrderOptions(String ordered) {
        if (ordered.equals("o")) {
            return 0;

        } else if (ordered.equals("x")) {
            return 1;

        } else {
            System.out.println("잘못입력하셨습니다.");
            return 2;
        }
    }

    public void orderResult() {

        System.out.println("주문하신 음식의 총 금액은 " + OrderList.getSumCost() + "원입니다.\n");

    }


    public void calPrice(int money,String paidMoney) {
        int change = 0;
        int payable = money;
        System.out.printf("%d원을 결제해주세요\n\n", payable);


        try {
            change = Integer.parseInt(paidMoney) - payable;

        } catch (ClassCastException cce) {
            System.out.println("정상적으로 처리되지 않았습니다. 다시 금액을 입력해주세요.\n");
            calPrice(money, sc.nextLine());
            return;
        }

        if (Integer.parseInt(paidMoney) <= 0) {
            System.out.println("정상적으로 처리되지 않았습니다. 다시 금액을 입력해주세요.\n");
            calPrice(money, sc.nextLine());
            return;
        }

        if (change < 0){
            System.out.print("금액이 부족합니다.");
            calPrice(-change, sc.nextLine());
            return;
        }

        settlement(change, Integer.parseInt(paidMoney));

        System.out.printf("%d원을 받았습니다.\n", OrderList.getSumCost());
        System.out.printf("거스름돈은 %d원입니다. 감사합니다.\n", change);

    }

    public void settlement(int change, int paid) {
        StoreWallet.priceUp(paid);
        StoreWallet.priceDown(change);

        System.out.println("결재가 완료되었습니다.");
    }
}


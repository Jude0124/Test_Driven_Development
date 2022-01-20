import exception.NotMenuException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {

/*      test 4. 가게의 클래스를 추가하여 주문 완료시 가게의 매출이 추가되는 기능을 구현
        test 5. 주문을 계산한 후 주문한 Customer와 주문사항, 계산목록에 대한 정보를 저장하고 원할시에 show
        test 6. 손님이 제시한 금액이 더 클 경우, 거스름돈을 지급받고 가게 매출을 마이너스 시키는 기능 구현 추가
        test 7. 손님이 지불한 금액이 더 적을 경우 요청 메시지를 리턴.
        */

    @Test
    void calculate() throws NotMenuException {
        new Order().selectOrder("참치비빔밥");
        new Order().selectOrder("원조김밥");
        StoreWallet.priceUp(OrderList.getSumCost());
        assertEquals(9500,StoreWallet.getSalesPrice()); //Success
    }

    @Test
    void orderShowInfo() throws NotMenuException{
        new Order().selectOrder("참치비빔밥");
        new Order().selectOrder("원조김밥");
        StoreWallet.priceUp(OrderList.getSumCost());
        assertEquals(1,OrderList.getOrderList());
    }

    @Test
    void minusPrice() {
        new Order().settlement(2500,5000);
        assertEquals(2500,StoreWallet.getSalesPrice());
    }

    @Test
    void reRequest() {
        new Order().settlement(2500,1000);
        assertEquals(-1500,StoreWallet.getSalesPrice());
    }
}

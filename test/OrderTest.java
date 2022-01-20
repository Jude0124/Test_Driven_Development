import exception.NotMenuException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderTest {

        /*  test 1. 사용자가 주문을 할 수 있는 기능을 구현
            test 2. 주문 후에 다시 추가 주문을 하거나 주문을 완료 할 수 있도록 구현
            test 3. 주문이 완료되었을 시 주문 금액의 합계를 보여주는 화면을 구현
            */

    @Test
    void menuPriceMatchTest() throws NotMenuException {
        assertEquals(7000,new Order().doOrder("참치비빔밥")); //입력값 : 참치비빔밥
    }

    @Test
    void selectReOrderTest() throws NotMenuException{
        assertEquals(1,new Order().selectOrder("x")); //1 : 주문 취소
        Assertions.assertThrows(NotMenuException.class, () -> {
           new Order().selectOrder("야끼우동"); // 2 : 메뉴에 없는 메뉴 잘못 입력
        });
        assertEquals(3,new Order().selectOrder("참치비빔밥")); // 3 : 메뉴 정상입력
        assertEquals(0,new Order().reOrderOptions("o")); // 0 : 재주문
        assertEquals(1,new Order().reOrderOptions("x")); // 1 : 주문종료
        assertEquals(2,new Order().reOrderOptions("jkn.,we")); //2 : 잘못입력

    }

    @Test
    void sumOfPrice() throws NotMenuException{
        new Order().selectOrder("참치비빔밥");
        new Order().selectOrder("원조김밥");
        assertEquals(9500, OrderList.getSumCost()); //Success
    }


}
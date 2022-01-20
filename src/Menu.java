import exception.NotMenuException;

import java.util.Arrays;
import java.util.List;

public enum Menu {
    없음(-1),
    원조김밥(2500),
    김치김밥 (3000),
    참치김밥 (3000),
    치즈김밥 (3000),
    땡초김밥 (3000),
    샐러드김밥 (3000),
    소고기김밥 (3500),
    돈까스김밥 (3500),
    계란말이김밥 (4000),
    소시지김밥 (3500),
    새우김밥 (3500),
    모듬김밥 (5000),
    돈까스 (7000),
    더블돈까스 (9000),
    치킨까스 (7500),
    생선까스 (7500),
    새우까스 (7500),
    치즈돈까스 (7500),
    카레돈까스 (8000),
    고구마돈까스 (7500),
    갈릭스테이크 (7500),
    스페셜정식 (8500),
    유부우동 (5000),
    오뎅 (4500),
    바지락칼국수 (6000),
    김치칼국수 (7000),
    들깨칼국수 (7000),
    바지락손수제비 (6000),
    김치손수제비 (7000),
    들깨손수제비 (7000),
    잔치국수 (6000),
    쫄면 (6000),
    떡국 (6000),
    만두국 (6000),
    떡만두 (6000),
    물냉면 (6000),
    비빔냉면 (6000),
    고기만두_8개 (4000),
    김치만두_8개 (4000),
    갈비만두_8개 (4000),
    군만두_8개 (4000),
    떡볶이 (4000),
    깻잎떡볶이 (5000),
    치즈떡볶이 (5000),
    라볶이 (5000),
    치즈라볶이 (5000),
    쫄볶이 (5000),
    치즈쫄볶이 (6000),
    치즈스파게티 (6000),
    열무냉면 (7000),
    열무국수 (7000),
    냉콩국수 (7000),
    비빔국수 (7000),
    메밀막국수 (7000),
    냉모밀 (7000),
    칠리탕수육 (7000),
    카레덮밥 (6000),
    참치덮밥 (6500),
    소불고기덮밥 (6500),
    제육덮밥 (6500),
    김치제육덮밥 (7000),
    오징어덮밥 (7000),
    낙지덮밥 (8000),
    오삼불고기덮밥 (8000),
    낙삼덮밥 (8000),
    쭈꾸미덮밥 (8000),
    소고기볶음밥 (6500),
    새우볶음밥 (6500),
    김치볶음밥 (6500),
    참치김치볶음밥 (7000),
    야채비빔밥 (6000),
    날치알비빔밥 (7000),
    참치비빔밥 (7000),
    소불고기비빔밥 (7000),
    된장찌개 (6000),
    우렁된장찌개 (7000),
    청국장 (6000),
    콩비지 (6000),
    해물순두부찌개 (7000),
    참치김치찌개 (7000),
    돼지김치찌개 (7000),
    김치고등어조림 (7000),
    꽁치조림 (7000),
    갈치조림 (7000),
    스팸마요덮밥 (6000),
    참치마요덮밥 (6000),
    치킨마요덮밥 (6000),
    돈까스마요덮밥 (6000),
    오므라이스 (6500),
    호불정식 (7000),
    낙지소면 (12000),
    콩나물국밥 (6000),
    육개장 (7000),
    갈비탕 (7000),
    설렁탕 (7000),
    순대국 (7000),
    부대찌개 (7000),
    동태탕 (7000),
    황태탕 (7000),
    양평해장국 (7000),
    소머리국밥 (7000),
    소고기미역국 (7000),
    소고기무국 (7000),
    내장탕 (8000),
    해물알탕 (8000),
    뼈해장국 (8000),
    삼계탕(11000),
    콜라_소 (1000),
    사이다_소 (1000),
    콜라_대 (3000),
    사이다_대 (3000),
    공기밥 (1000),
    계란후라이 (1000),
    계란찜 (5000);

    private int price;

    public int getPrice() {
        return price;
    }

    //    private final Map<String, Integer> foodMenu = new LinkedHashMap<>();

    public static Menu getMenuByName(String name) throws NotMenuException {
        return Arrays.stream(Menu.values()).filter(menu -> menu.name().equals(name)).findFirst().orElseThrow(() -> new NotMenuException());
    }

    Menu(int price) {
        this.price = price;
    }

//    public void menuPrepare() {
//        System.out.println("=================================감귤의 김밥천국에 오신것을 환영합니다=================================");
//        int column = 4, row = foodMenu.size() / 4; //보여주고 싶은 열 수 = column, 행수 = row
//        ArrayList key = new ArrayList<String>(foodMenu.keySet());
//        for (int i = 0; i < foodMenu.size(); i++) {
//            System.out.printf("%-11s\t%5d\t", String.valueOf(key.get(i / column + (row * i) % (column * row))), foodMenu.get(key.get(i / column + (row * i) % (column * row))));
//            if (i % column == column - 1) System.out.println("|");     //get 뒷부분부터 나머지정리와 행수를 통해 행렬을 Transpose시켜서
//        } //원하는 행수와 열수를 입력하여 메뉴판 모양(콘솔창)을 보여주도록 구성
//        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t|");
//        System.out.println("================================================================================================");
//    }

    public static void menuPrepare() {
        System.out.println("=================================감귤의 김밥천국에 오신것을 환영합니다=================================");
        int column = 4, row = Menu.values().length / 4; //보여주고 싶은 열 수 = column, 행수 = row
        List<Menu> key = Arrays.asList(Menu.values());
        for (int i = 1; i < Menu.values().length; i++) {
            System.out.printf("%-11s\t%5d\t", key.get(i / column + (row * i) % (column * row)).name(),  key.get(i / column + (row * i) % (column * row)).price);
            if (i % column == column - 1) System.out.println("|");     //get 뒷부분부터 나머지정리와 행수를 통해 행렬을 Transpose시켜서
        } //원하는 행수와 열수를 입력하여 메뉴판 모양(콘솔창)을 보여주도록 구성
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("================================================================================================");
    }

    public static int getFoodMenu(String ordered) throws NotMenuException {
        return getMenuByName(ordered).price;
    }
}

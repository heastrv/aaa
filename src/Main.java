public class Main {
    public static void main(String[] args) {
        new Main().run2();

    }

    private void run2() {
        String name = "чипсы";
        double cost = 39.99;
        System.out.printf("Товар: %s; Цена: %.2f UAH",name,cost);
    }

    private void run1() {
        int nBox = 12;
        int apples = 45;
        System.out.printf("В коробке №%d лежит %d",nBox,apples);
    }
}
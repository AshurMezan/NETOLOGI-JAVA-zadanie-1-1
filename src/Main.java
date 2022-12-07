public class Main {
    public static void main(String[] args) {
        int price = 2800; // цена билета
        int discount = 20; // скидка за каждые 20 рублей, потраченные на билет, начисляется 1 миля.
        int bonus = price / discount; // расчитываем бонусы
        System.out.println(bonus); // будет 140 бонусных милей. Всё работает, проверял ещё числа 19 (0), 40 (2), 2819 (140)
    }
}
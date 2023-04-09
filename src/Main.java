public class Main {

    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService(); // создаем объект с переменной service для вычисления количества миль
        int price = 1_000; // значение стоимости билета
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}

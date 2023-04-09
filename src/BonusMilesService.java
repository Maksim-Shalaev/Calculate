public class BonusMilesService { // описание действий данного объекта

    public int calculate(int price) {
        int bonus = 20;
        int miles = price / bonus;
        return miles;
    }
}

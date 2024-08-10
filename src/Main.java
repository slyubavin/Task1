public class Main {
    public static void main(String[] args) {

        int ticketPrice = 13_676; // Стоимость билета в рублях
        int priceBonusMiles = 20; // Цена в рублях за 1 бонусную милю

        int BonusMiles = ticketPrice / priceBonusMiles; // Расчет миль за 1 билет

        System.out.println(BonusMiles + " Бонусных миль за билет"); // Выводим результат
    }
}
public class Main {
    public static void main(String[] args) {
        int balance = 125;
        short promotion = 1000;
        int bonus;
        int refill = 2820;
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        if (refill > promotion) {
            bonus = refill / 100;
            balance = balance + bonus + refill;
            System.out.println("Ваш баланс " + balance + " начислено бонусных рубрей " + bonus);
        } else {
            balance = balance + refill;
            System.out.println("Ваш баланс " + balance + " начислено бонусных рубрей 0");
        }
        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}
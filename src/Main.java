public class Main {
    public static void main(String[] args) {

        int initialAccount = 200;
        int refill = 1100;

        int bonus = 11;
        if (refill > 1000) {
            bonus = refill / 100;
        }

        int finalAccount = initialAccount + refill + bonus;

        System.out.println("Итоговый счет: " + finalAccount);
        System.out.println("Бонус: " + bonus);

    }
}
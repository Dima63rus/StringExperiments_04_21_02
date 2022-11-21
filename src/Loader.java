public class Loader {
    public static void main(String[] args) {
        String loTextStr = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        System.out.println(loTextStr);
//Задание
//***
//        Посчитать сумму заработка всех друзей (Васи, Пети и Маши).
//        Числа могут быть разными
//***
        final String LC_VASYA = "VASYA";
        final String LC_PETYA = "PETYA";
        final String LC_MASHA = "MASHA";

        final String LC_L = "л";
        final String LC_R = "р";
        final String LC_DASH = "-";

        SumBuddy loSumBuddy = new SumBuddy();

        // Поиск суммы Васи
        int lvVasyaSumInt = loSumBuddy.getSum(loTextStr, LC_VASYA, LC_L, LC_R);
        System.out.println("Сумма заработка Пети: " + lvVasyaSumInt);

        // Поиск суммы Пети
        int lvPetyaSumInt = loSumBuddy.getSum(loTextStr, LC_PETYA, LC_DASH, LC_R);
        System.out.println("Сумма заработка Пети: " + lvPetyaSumInt);

        // Поиск суммы Маши
        int lvMashaSumInt = loSumBuddy.getSum(loTextStr, LC_MASHA, LC_DASH, LC_R);
        System.out.println("Сумма заработка Маши: " + lvMashaSumInt);

        // Сумма заработка всех друзей (Васи, Пети и Маши)
        int lvAllBuddySum = lvVasyaSumInt + lvPetyaSumInt + lvMashaSumInt;
        System.out.println("Сумма заработка всех друзей: " + lvAllBuddySum);
    }
}
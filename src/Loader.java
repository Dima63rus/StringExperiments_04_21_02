public class Loader {
    public static void main(String[] args) {
        String loTextStr = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        System.out.println(loTextStr);
//Задание
//***
//        Посчитать сумму заработка всех друзей (Васи, Пети и Маши).
//        Числа могут быть разными
//***

// Поиск суммы Васи
        final String LC_L = "л";
        final String LC_R = "р";
        final String LC_DASH = "-";
        final int LC_1 = 1;

        // Начальный индекс
        int lvVasyaBegInd = loTextStr.indexOf(LC_L);
        // Конечный индекс
        int lvVasyaLastInd = loTextStr.indexOf(LC_R, lvVasyaBegInd);
        // Считать строку между индексами
        String lvVasyaSumStr = loTextStr.substring(lvVasyaBegInd + LC_1, lvVasyaLastInd);
        lvVasyaSumStr = lvVasyaSumStr.trim();
        int lvVasyaSumInt = Integer.parseInt(lvVasyaSumStr);
        System.out.println("Сумма заработка Васи: " + lvVasyaSumInt);

// Поиск суммы Пети
        int lvPetyaBegInd = loTextStr.indexOf(LC_DASH);
        int lvPetyaLastInd = loTextStr.indexOf(LC_R, lvPetyaBegInd);
        String lvPetyaSumStr = loTextStr.substring(lvPetyaBegInd + LC_1, lvPetyaLastInd);
        int lvPetyaSumInt = Integer.parseInt(lvPetyaSumStr.trim());
        System.out.println("Сумма заработка Пети: " + lvPetyaSumInt);

// Поиск суммы Маши
        int lvMashaBegInd = loTextStr.indexOf(LC_DASH, lvPetyaLastInd);
        int lvMashaLastInd = loTextStr.indexOf(LC_R, lvMashaBegInd);
        String lvMashaSumStr = loTextStr.substring(lvMashaBegInd + LC_1, lvMashaLastInd);
        int lvMashaSumInt = Integer.parseInt(lvMashaSumStr.trim());
        System.out.println("Сумма заработка Маши: " + lvMashaSumInt);

// Сумма заработка всех друзей (Васи, Пети и Маши)
        int lvAllBuddySum = lvVasyaSumInt + lvPetyaSumInt + lvMashaSumInt;
        System.out.println("Сумма заработка всех друзей: " + lvAllBuddySum);
    }
}
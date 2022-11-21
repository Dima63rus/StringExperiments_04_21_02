public class SumBuddy {
    public static final String MC_VASYA = "VASYA";
    public static final String MC_PETYA = "PETYA";
    public static final int MC_1 = 1;

    //Необходим для Маши
    private int mvLastIndexForCurrentBuddy = 0;

    public int getSum(String ioTextStr, String ivCurBuddy, String ivFirstFind, String ivLastFind) {
        // Начальный индекс
        int lvBegInd;
        if (ivCurBuddy.equalsIgnoreCase(SumBuddy.MC_VASYA) || ivCurBuddy.equalsIgnoreCase(SumBuddy.MC_PETYA)) {
            lvBegInd = ioTextStr.indexOf(ivFirstFind);
        } else {
            lvBegInd = ioTextStr.indexOf(ivFirstFind, this.mvLastIndexForCurrentBuddy);
        }

        // Конечный индекс
        this.mvLastIndexForCurrentBuddy = ioTextStr.indexOf(ivLastFind, lvBegInd);

        // Считать строку между индексами
        String lvSumStr = ioTextStr.substring(lvBegInd + SumBuddy.MC_1, this.mvLastIndexForCurrentBuddy);
        lvSumStr = lvSumStr.trim();
        return Integer.parseInt(lvSumStr);
    }
}
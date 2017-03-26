package md.jug.numeral;

public class NumeralLocal {

    private int num;

    public NumeralLocal(int num) {
        this.num = num;
    }

    public String getRoman() {
        final int n = num;
        if (n == 1) return "I";
        if (n == 2) return "II";
        if (n == 3) return "III";
        if (n == 4) return "IV";
        return "?";
    }
}

package md.jug.numeral;

public class NumeralInstance {

    private int num;

    public NumeralInstance(int num) {
        this.num = num;
    }

    public String getRoman() {
        if (num == 1) return "I";
        if (num == 2) return "II";
        if (num == 3) return "III";
        if (num == 4) return "IV";
        return "?";
    }
}

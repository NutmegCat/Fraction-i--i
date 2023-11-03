// Aaron Prince Anu

public class FractionDriver {
    public static void main(String[] args) {
        Fraction[] fractions = new Fraction[100];

        for (int i = 0; i < 100; i++) {
            fractions[i] = new Fraction(1+i-1,2+i-1);
        }

        for (int i = 0; i < fractions.length; i++) {
            System.out.println(fractions[i]);
        }
    }
}
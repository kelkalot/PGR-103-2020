public class HarmonicSequence {
    public static void main (String[] arg) {
        int fsum = 0;
        double dsum = 0;
        int n = 10;
        for (int i = n; i > 0; i--) {
            fsum += 1 / i;
            dsum += 1.0d / i;
        }
        System.out.println("fsum = " + fsum);
        System.out.println("dsum = " + dsum);
    }
}


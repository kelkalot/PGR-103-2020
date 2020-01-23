public class FloatVsDouble {


    public static void main (String[] arg) {

        float sum = 0;
        int n = 10;
        for (int i = n; i > 0; i--){
            sum += 1.0f / i;
        }

        System.out.println("sum = " + sum);


        double sumD = 0;
                int nD = 10;
                for (int i = nD; i > 0; i--)
                    sumD += 1.0d / i;

                System.out.println("sumD = " + sumD);


    }


}

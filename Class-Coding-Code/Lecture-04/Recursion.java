// A Java program to demonstrate
// working of recursion

    class Recursion {


        //main class
        public static void main(String[] args)
        {
            int test = 3;
            printFun(test);
        }


        static void printFun(int test)
        {
            if (test < 1)
                return;

            else {
                System.out.printf("%d ", test); //

                // Statement 2
                printFun(test - 1);

                System.out.printf("%d ", test);
                return;
            }
        }

    }


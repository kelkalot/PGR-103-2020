public class MethodMultiInput {


    //Method with multiple input
    static void testInput(int... values)
    {
        for (int value:values) {
              System.out.print(value+"\t");
             }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] myArray = {12, 2, 32, 74, 26, 42, 53, 22};

        //It works with both
        //input can be:
        System.out.println("Multi input to method version 1");
        testInput(1,2,3,4,5,6,7,8,10,11);
        //or and array
        System.out.println("\nMulti input to method version 2");
        testInput(myArray);


        //2d arrays
        int[][] my2dArray = { {1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15} };
        //my2dArray = new int[3][5];

        System.out.println("\nPrining 2d array with standard for loop");
        for (int i=0;i<my2dArray.length;i++) {
            for (int j=0;j<my2dArray[i].length;j++) {
                System.out.print(my2dArray[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("\nPrining 2d array with for each");
        for (int[] row:my2dArray) {
            for (int image:row) {
                System.out.print(image+"\t");
            }
            System.out.println();
        }




    }

}

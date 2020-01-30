public class ArraySortingExample {
    public static void main(String[] args) {

        int[] myArray = {3, 2, 1, 5, 4, 7, 8, 6};
        // create result array
        int[] sortedArray = new int[myArray.length];



        int[] positionOrder = new int[myArray.length];

        for (int i = 0; i < myArray.length; i++){
            for (int j = 0; j < myArray.length; j++){
                if (myArray[i] > myArray[j]){
                    positionOrder[i]++;
                }
            }
        }

        for (int i = 0; i < myArray.length; i++){
            sortedArray[i] = myArray[positionOrder[i]];
        }

   /*     for (int i = 0; i < sortedArray.length; i++) { // set each item of the sorted array
            int minimum = 999;
            int pos = 0;

            for (int j = 0; j < myArray.length; j++) { // find minimum
                if (myArray[j] < minimum) {
                    minimum = myArray[j];
                    pos = j;
                }
            }
            sortedArray[i] = minimum;
            myArray[pos] = 999; // set visited.
        }*/

        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + ", ");
        }
    }
}

public class Exercise43 {


    public static boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length-1] == 6)
        return true;
        else return false;
    }

    public static void main(String args[]){

        int[] myArray = new int[6];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i+1;
        }

        int[] myArray2 = new int[5];
        for (int i = 0; i < myArray2.length; i++) {
            myArray2[i] = i+1;
        }

        System.out.println(firstLast6(myArray));
        System.out.println(firstLast6(myArray2));

    }


}

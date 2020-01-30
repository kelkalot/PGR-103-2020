//Java Program to get the cube of a given number using the static method

class Calculate{

    static int cube(int x){
        return x*x*x;

    }

    public static void main(String args[]){
        //static method is directly invoked wihtout creating the class object
        int result=Calculate.cube(5);
        System.out.println(result);
    }
}

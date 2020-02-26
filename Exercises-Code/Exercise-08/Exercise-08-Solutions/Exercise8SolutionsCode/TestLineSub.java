public class TestLineSub {


    public static void main(String[] args) {

        //First line created
        LineSub l1 = new LineSub(0, 0, 3, 4);
        System.out.println(l1);

        //create some new points and a line
        Point p1 = new Point(10,20);
        Point p2 = new Point(20,10);
        LineSub l2 = new LineSub(p1, p2);
        System.out.println(l2);

        //test length and gradient methods
        System.out.println(l2.getGradient());
        System.out.println(l2.getLength());
    }


}

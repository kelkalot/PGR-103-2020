public class TestMovableRectangle {


        public static void main(String[] args) {


            Movable r1 = new MovableRectangle(1, 2, 3, 4, 5, 5);  // upcast
            System.out.println(r1);
            r1.moveRight();
            System.out.println(r1);

        }

}

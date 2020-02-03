public class CommandLineParamsExample {
    public static void main(String[] args) {
        String filepath = args[0];


        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            System.out.println(arg);
        }
    }
}

public class CommandLineArgumentUsage {
    public static void main(String[] args) {
        System.out.println("The first argument is "+args[0]);
        System.out.println("The second argument is "+args[1]);
        int x = Integer.valueOf(args[0]);
        int y = Integer.valueOf(args[1]);
        System.out.println("Their sum is "+(x+y));
    }
}

import java.util.Random;

public class numplate {
    public static void main(String[] args) {
        int d =(int)Math.floor(Math.random()*10000);
        Random r = new Random();
        char c = (char)(r.nextInt(26) + 'A');
        char b = (char)(r.nextInt(26) + 'A');
        char a = (char)(r.nextInt(26) + 'A');
        System.out.printf("%c%c%c",a,b,c);
        System.out.println(d);

    }
}

import java.util.Scanner;

// Your First Program

class URLShortner {
    private static final String HELLO_WORLD = "Hello, World!";

    public static void main(String[] args) {
        System.out.println("What's your name, sweetie?");
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        System.out.println("Hello " + name); 
    }

    public URLShortner() {
    }

    @Override
    public String toString() {
        return "URLShortner []";
    }

    public static String getHelloWorld() {
        return HELLO_WORLD;
    }
}
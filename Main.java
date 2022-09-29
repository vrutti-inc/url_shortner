// Your First Program

class URLShortner {
    private static final String HELLO_WORLD = "Hello, World!";

    public static void main(String[] args) {
        System.out.println(getHelloWorld()); 
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
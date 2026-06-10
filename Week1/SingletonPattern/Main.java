class Singleton {

    // Create only one object
    private static Singleton obj = new Singleton();

    // Private constructor
    private Singleton() {
    }

    // Return the same object
    public static Singleton getInstance() {
        return obj;
    }
}

public class Main {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1);
        System.out.println(s2);
    }
}
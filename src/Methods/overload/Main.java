package Methods.overload;

class Display {
    public void show(int a) {
        System.out.println("Integer: " + a);
    }

    public void show(String s) {
        System.out.println("String: " + s);
    }
}

public class Main {
    public static void main(String[] args) {
        Display display = new Display();
        display.show(10); // Calls the method with int parameter
        display.show("Hello"); // Calls the method with String parameter
    }
}

/**
 Method overloading allows multiple methods to have the same name but with different parameter lists within the same class.
 */
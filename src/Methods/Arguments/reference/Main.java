package Methods.Arguments.reference;

class Box {
    int size;
}

public class Main {
    public static void resize(Box box, int newSize) {
        box.size = newSize; // Modifies the object's size attribute
    }

    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.size = 5;
        resize(myBox, 10);
        System.out.println(myBox.size); // Output: 10 (Object modified)
    }
}

package Control_Structures.Branching.Break;

public class Loop {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Exit loop when i is 5
            }
            System.out.println(i);
        }

    }
}

/**
 * The break statement is used to exit a loop or switch statement prematurely.
 */
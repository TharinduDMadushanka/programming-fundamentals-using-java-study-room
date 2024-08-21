package Control_Structures.Branching.Continue;

public class Loop {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.println(i);
        }

    }
}

/**
 * The continue statement skips the current iteration of a loop and moves on to the next iteration.
 */
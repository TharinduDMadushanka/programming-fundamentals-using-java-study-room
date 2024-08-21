package Control_Structures.Conditional.If;

public class ElseIf {
    public static void main(String[] args) {

        int score = 85;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }

    }
}

/**

 if (condition1) {
 // Code to be executed if condition1 is true
 } else if (condition2) {
 // Code to be executed if condition2 is true
 } else {
 // Code to be executed if none of the conditions are true
 }


 */
package Control_Structures.Conditional.If;

public class Switch {
    public static void main(String[] args) {

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }


    }
}

/**

 switch (variable) {
 case value1:
 // Code to be executed if variable equals value1
 break;
 case value2:
 // Code to be executed if variable equals value2
 break;
 // more cases...
 default:
 // Code to be executed if none of the cases match
 }

 */
import java.util.*;

class guessing_number {

    public static void main(String[] args) {

        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int rand = r.nextInt(100) + 1;
        
        int num = 0;
        int count = 5;
        while (rand != num) {

            if (count <= 0) {
                System.out.println("Sorry you failed ,try again");
                break;
            }

            System.out.println("Enter guesssing number");
            num = s.nextInt();

            if (rand == num) {
                System.out.println("congratulation,You guess it!");
                System.out.println("You guess in " + (6 - count) + " Attempt");
                if (count == 1) {
                    System.out.println("you got 2 point");
                }
                if (count == 2) {
                    System.out.println("You got 4 point");
                }
                if (count == 3) {
                    System.out.println("you got 6 point");
                }
                if (count == 4) {
                    System.out.println("you got 8 point");
                }
                if (count == 5) {
                    System.out.println("You got 10 point");
                }

            } else if (rand < num) {

                System.out.println("number is greater ,please enter small number");
            } else {
                System.out.println("number is small ,please enter greater number");
            }
            count--;
        }
    }
}
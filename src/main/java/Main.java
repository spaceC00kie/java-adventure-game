import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println(name);

        System.out.println("go left or right");
        String answer1 = scanner.nextLine();
        boolean answered = false;
        while (!answered) {
            if (answer1.equals("left")) {
                //do a thing
                System.out.println("go up or down");
                String answer2 = scanner.nextLine();
                boolean answered2 = false;
                while (!answered2) {
                    if (answer2.equals("up")) {
                        //do a thing
                        System.out.println("pick red or blue");
                        String answer3 = scanner.nextLine();
                        boolean answered3 = false;
                        while (!answered3) {
                            if (answer3.equals("red")) {
                                System.out.println("you are done");
                                answered3 = true;
                            }
                            else if (answer3.equals("blue")) {
                                answered3 = true;
                            }
                            else{
                                //try again
                            }
                        }
                        answered2 = true;
                    }
                    else if (answer2.equals("down")) {
                        //do another thing
                        answered2 = true;
                    }
                    else {
                        //try again for answer2
                    }
                }
                answered = true;
            } else if (answer1.equals("right")) {
                //do another thing
                //System.out.println("go through or around");
                answered = true;
            } else {
                //try again
            }
        }
    }

    private static void sample(){
        System.out.println("A sample was called");
    }
}

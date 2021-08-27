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
                                answered3 = true;
                            }
                            else if (answer3.equals("blue")) {
                                answered3 = true;
                            }
                            else{
                                //try again for answer3
                            }
                        }
                        answered2 = true;
                    }
                    else if (answer2.equals("down")) {
                        //do another thing
                        System.out.println("pick black or white");
                        String answer4 = scanner.nextLine();
                        boolean answered4 = false;
                        while (!answered4) {
                            if (answer4.equals("black")) {
                                answered4 = true;
                            }
                            else if (answer4.equals("white")) {
                                answered4 = true;
                            }
                            else {
                                //try again for answer4
                            }
                        }
                        answered2 = true;
                    }
                    else {
                        //try again for answer2
                    }
                }
                answered = true;
            } else if (answer1.equals("right")) {
                //do another thing
                System.out.println("dog or cat");
                String answer5 = scanner.nextLine();
                boolean answered5 = false;
                while (!answered5) {
                    if (answer5.equals("dog")) {

                    }
                    else if (answer5.equals("cat")) {

                    }
                    else {
                        //try again for answer5
                    }
                }
                answered = true;
            } else {
                //try again for answer1
            }
        }
    }

    private static void sample(){
        System.out.println("A sample was called");
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String isPlaying = "yes";
        while (isPlaying.equals("yes")) {
            Scanner scanner = new Scanner(System.in);
            //System.out.println("What is your name?");
            //String name = scanner.nextLine();
            //System.out.println(name);

            boolean answered = false;
            System.out.println("go left or right");
            String answer1 = scanner.nextLine();
            while (!answered) {
                if (answer1.equals("left")) {
                    System.out.println("go up or down");
                    String answer2 = scanner.nextLine();
                    boolean answered2 = false;
                    while (!answered2) {
                        if (answer2.equals("up")) {
                            System.out.println("pick red or blue");
                            String answer3 = scanner.nextLine();
                            boolean answered3 = false;
                            while (!answered3) {
                                if (answer3.equals("red")) {
                                    answered3 = true;
                                } else if (answer3.equals("blue")) {
                                    answered3 = true;
                                } else {
                                    System.out.println("you gotta pick one");
                                    answer3 = scanner.nextLine();
                                }
                            }
                            answered2 = true;
                        } else if (answer2.equals("down")) {
                            System.out.println("pick black or white");
                            String answer4 = scanner.nextLine();
                            boolean answered4 = false;
                            while (!answered4) {
                                if (answer4.equals("black")) {
                                    answered4 = true;
                                } else if (answer4.equals("white")) {
                                    answered4 = true;
                                } else {
                                    System.out.println("pick a side");
                                    answer4 = scanner.nextLine();
                                }
                            }
                            answered2 = true;
                        } else {
                            System.out.println("Pick up or down");
                            answer2 = scanner.nextLine();
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
                            System.out.println("yes or no");
                            String answer6 = scanner.nextLine();
                            boolean answered6 = false;
                            while (!answered6) {
                                if (answer6.equals("yes")) {
                                    answered6 = true;
                                } else if (answer6.equals("no")) {
                                    answered6 = true;
                                } else {
                                    System.out.println("Yes or no, man. That's all I got.");
                                    answer6 = scanner.nextLine();
                                }
                            }
                            answered5 = true;
                        } else if (answer5.equals("cat")) {
                            System.out.println("rain or shine");
                            String answer7 = scanner.nextLine();
                            boolean answered7 = false;
                            while (!answered7) {
                                if (answer7.equals("rain")) {
                                    answered7 = true;
                                } else if (answer7.equals("shine")) {
                                    answered7 = true;
                                } else {
                                    System.out.println("pick some weather");
                                    answer7 = scanner.nextLine();
                                }
                            }
                            answered5 = true;
                        } else {
                            System.out.println("just pick a pet, dude");
                            answer5 = scanner.nextLine();
                        }

                    }
                    answered = true;
                } else {
                    System.out.println("try again");
                    answer1 = scanner.nextLine();
                }
            }

            System.out.println("Would you like to play again?");
            isPlaying = scanner.nextLine();
        }
    }
}

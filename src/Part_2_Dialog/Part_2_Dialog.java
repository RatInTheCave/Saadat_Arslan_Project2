package Part_2_Dialog;

import java.util.Scanner;
import java.util.Random;

public class Part_2_Dialog {
    public static void main(String[] args) {
        //Random Name Generator
        Random RandomName = new Random();
        int RandomNameNumber = RandomName.nextInt(5);
        String randomName = "";
        switch (RandomNameNumber) {
            case 0 -> randomName = "Hans";
            case 1 -> randomName = "Steve";
            case 2 -> randomName = "Arslan";
            case 3 -> randomName = "Arthur";
            case 4 -> randomName = "Donald";
        }
        System.out.println("Hello! My name is " + randomName + ". What is your name?");
        Scanner Input = new Scanner(System.in);
        Scanner Input2 = new Scanner(System.in);
        String name = Input.nextLine();
        System.out.println("Nice to meet you " + name);
        System.out.println("What is your favorite color?");
        String color = Input.nextLine();
        System.out.println(color + " is a nice color. Personally I like School Bus Yellow. Yes, that is a color");
        System.out.println("Do you like geometric shapes? Please answer with Y or N");
        boolean userInputFlag = false;
        String shapeOrTimesOfTheYear = null;
        String YorN = null;
        while (!userInputFlag) {
            YorN = Input.nextLine();
            YorN = YorN.toUpperCase();
            if (YorN.startsWith("Y")) {
                System.out.println("Let's discuss shapes, then.");
                System.out.println("What is your favorite shape?");
                shapeOrTimesOfTheYear = Input.nextLine();
                if (shapeOrTimesOfTheYear.toUpperCase().contains("HEXAGON")) {
                    System.out.println("I also like hexagons!");
                } else {
                    System.out.println(shapeOrTimesOfTheYear + " Is an interesting shape. My favorite shape is Hexagon");
                }
                userInputFlag = true;
            } else if (YorN.startsWith("N")) {
                System.out.println("Oh. Then let's discuss times of the year, then.");
                System.out.println("What is your favorite time of the year?");
                shapeOrTimesOfTheYear = Input.nextLine();
                while (!userInputFlag) {
                    if (shapeOrTimesOfTheYear.toUpperCase().contains("SUMMER")) {
                        System.out.println("So you like summer? Okay");
                        userInputFlag = true;
                    } else if (shapeOrTimesOfTheYear.toUpperCase().contains("WINTER")) {
                        userInputFlag = true;
                        System.out.println("So you like winter? Okay");
                    } else if (shapeOrTimesOfTheYear.toUpperCase().contains("SPRING")) {
                        userInputFlag = true;
                        System.out.println("So you like spring? Okay");
                    } else if (shapeOrTimesOfTheYear.toUpperCase().contains("AUTUMN")) {
                        userInputFlag = true;
                        System.out.println("So you like autumn? Okay");
                    } else if (shapeOrTimesOfTheYear.toUpperCase().contains("FALL")) {
                        userInputFlag = true;
                        System.out.println("So you like autumn? Okay");
                    } else {
                        System.out.println("I don't understand.");
                        System.out.println("What is your favorite time of the year?");
                        shapeOrTimesOfTheYear = Input.nextLine();
                    }
                }
            } else {
                System.out.println("I don't understand.");
                System.out.println("Do you like geometric shapes? Please answer with Y or N");
            }
        }
        System.out.println("I forgot to ask you your age. How old are you?");
        String age = Input.nextLine().replaceAll(" ", "");
        System.out.println("So you are " + age.toLowerCase() + " years old. Noted");
        System.out.println("What is your favorite movie?");
        String favoriteMovie = Input.nextLine();
        System.out.println("``" + favoriteMovie + "``" + "? Interesting choice, my favorite is ``The Thing (1982)``.");
        System.out.println("What country are you in?");
        String country = Input.nextLine();
        if (country.toUpperCase().startsWith("US")) {
            System.out.println("So you are in the US right now");
        } else if (country.equalsIgnoreCase("UK")) {
            System.out.println("So you are in the United Kingdom right now");
        } else {
            country = country.substring(0, 1).toUpperCase() + country.substring(1).toLowerCase();
            System.out.println("So you are in " + country + " right now");
        }
        System.out.println("Great! I have another question, what city are you in?");
        String city = Input2.nextLine();
        city = city.substring(0, 1).toUpperCase() + city.substring(1).toLowerCase();
        System.out.println("So you are in " + city);
        System.out.println("Could you tell me your phone number? I am not going to save it, I am just curious. Just do not use spaces or" +
                " any non-integer symbols, please");
        long phoneNumber = Input.nextLong();
        System.out.println("Your phone number is " + phoneNumber + ". Got it.");
        System.out.println("Last question, where did you study?");
        String schoolAndOrUniversity = Input2.nextLine();
        if (schoolAndOrUniversity.contains("never")) {
            System.out.println("Oh. It is a shame you didn't study");
        } else if (schoolAndOrUniversity.toLowerCase().contains("did not")) {
            System.out.println("Oh. It is a shame you didn't study");
        } else if (schoolAndOrUniversity.toLowerCase().contains("didn't")) {
            System.out.println("Oh. It is a shame you didn't study");
        } else if (schoolAndOrUniversity.toLowerCase().contains("homeschooled")) {
            System.out.println("Oh. So you were homeschooled? Okay");
        } else {
            System.out.println("So you studied in " + schoolAndOrUniversity);
        }
        System.out.println("So to summarize:");
        System.out.println("Your name is " + name);
        System.out.println("Your favorite color is " + color.toLowerCase());
        if (YorN.equalsIgnoreCase("Y")) {
            System.out.println("Also your favorite shape is " + shapeOrTimesOfTheYear);

        } else if (YorN.equalsIgnoreCase("N")) {
            System.out.println("Also your favorite time of the year is " + shapeOrTimesOfTheYear.toLowerCase());
        }
        System.out.println("You are " + age + " years old");
        System.out.println("Your favorite movie is " + favoriteMovie);
        System.out.println("You are in " + country + ", specifically in " + city);
        System.out.println("Your phone number is " + phoneNumber);
        if (schoolAndOrUniversity.contains("never")) {
            System.out.println("You did not go to school or a university");
        } else if (schoolAndOrUniversity.toLowerCase().contains("did not")) {
            System.out.println("You did not go to school or a university");
        } else if (schoolAndOrUniversity.toLowerCase().contains("didn't")) {
            System.out.println("You did not go to school or a university");
        } else if (schoolAndOrUniversity.toLowerCase().contains("homeschooled")) {
            System.out.println("You were homeschooled");
        } else {
            System.out.println("You studied in " + schoolAndOrUniversity);
        }
        System.out.println("Before we close, did you like this conversation?");
        String YorN2 = Input2.nextLine();
        boolean userInputFlag2 = false;
        while (!userInputFlag2) {
            if (YorN2.toLowerCase().startsWith("y")) {
                System.out.println("Thank you for your review =)");
                userInputFlag2 = true;
            } else if (YorN2.toLowerCase().startsWith("n")) {
                System.out.println("Thank you for your review.");
                userInputFlag2 = true;
            } else if (YorN2.toLowerCase().startsWith("i did not")) {
                System.out.println("Thank you for your review.");
                userInputFlag2 = true;
            } else if (YorN2.toLowerCase().startsWith("i didn't")) {
                System.out.println("Thank you for your review.");
                userInputFlag2 = true;
            } else if (YorN2.toLowerCase().startsWith("i did")) {
                System.out.println("Thank you for your review =).");
                userInputFlag2 = true;
            } else {
                System.out.println("I don't understand.");
                System.out.println("Did you like this conversation?");
                YorN2 = Input2.nextLine();
            }
        }
    }

}
/* MODULE TWO Project - Odds And Evens Game - Pre-Merit America AP Certification Class Assignment*/

import java.util.*;

public class OddsAndEvens {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

/* PART 1 - PICK EVEN OR ODDS */

        System.out.println("Let’s play a game called “Odds and Evens”");

        System.out.print("What is your name? ");
        String name = input.nextLine();

        System.out.print("Hi " + name + ", which do you choose? (O)dds or (E)vens? ");
        String selection = input.nextLine();

        if (selection.equals("E")) {
            System.out.println(name + " has picked EVENS! The computer will be ODDS.");
        } else if (selection.equals("O")) {
            System.out.println(name + " has picked ODDS! The computer will be EVENS.");
        } else {
            System.out.println(name + " Only O or E PLEASE TRY AGAIN!");
        }
        System.out.println("-----------------------------------------");

/* PART 2 - PLAY THE GAME */

        System.out.print("How many “fingers” do you put out? ");
        int fingers = input.nextInt();

        /*Computer Random Fingers*/
        Random rand = new Random();
        int computer = rand.nextInt(6);

        System.out.println("The computer plays " + computer + " \"fingers\"");
        System.out.println("-----------------------------------------");

/* PART 3 - WHO WON? */

        var added = fingers + computer;

        System.out.println(fingers + " + " + computer + " = " + added);

        if (added % 2 == 0) {
            System.out.println(added + " is ... EVEN");

            if (selection.equals("E")) {
                System.out.println("That means " + name + " wins!");
            }
            else if (selection.equals("O"));{
                System.out.println(name + " Sorry the computer wins! :) ");
            }
        }
        else {
            if (added % 2 != 0) {
                System.out.println(added + " is ... ODD");

                if (selection.equals("E")) {
                    System.out.println(" Sorry the computer wins! :) ekkkk ");

                } else if (selection.equals("O"));{
                    System.out.println(name + " That means " + name + " wins! eeekkkkk ");
                }
            }
        }
        System.out.println("-----------------------------------------");
        }
    }


        // Intro
        // Takes in the users name
        // Asks Odd or Even

        // Randomizer
        // Takes in the number of fingers the user would like to play and uses
        // The random generator to decide what th computer will play

        //Sum
        //Adds the 2 integers together and produces the sum

        //Who wins?
        //Decided whether the final answer is even or odd and declares a winner.


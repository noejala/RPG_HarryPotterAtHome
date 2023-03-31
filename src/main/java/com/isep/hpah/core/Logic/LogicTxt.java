package com.isep.hpah.core.Logic;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Setter
@Getter
public class LogicTxt {

    static Scanner sc = new Scanner(System.in);

    // print console
    public void printconsole(String prompt) {
        System.out.println(prompt);
    }

    // user input from console
    public int askInt(String prompt, int Choices) {
        int input;

        do {
            System.out.print(prompt);

            try {
                input = Integer.parseInt(sc.next());
            } catch (Exception e) {
                input = -1;
                System.out.println("Unknown choice, please enter one of the proposals");
            }

        } while(input < 1 || input > Choices);

        return input;
    }

    // ask for String
    public String askStr(String prompt, boolean askForConfirmation) {
        String input;

        do {
            System.out.print(prompt);
            input = sc.next();

        } while (!askYesNo("Are you sure of your choice ? (y or n)") || !askForConfirmation);

        return input;
    }


    // yes = true ; no = false
    public boolean askYesNo(String prompt) {
        String input;
        boolean yn;

        do {
            System.out.println(prompt);
            input = sc.next();

            try {
                if (input.toLowerCase().equals("y") || input.toLowerCase().equals("o")) {
                    yn = true;
                    break;
                } else if (input.toLowerCase().equals("n")) {
                    yn = false;
                    break;
                } else {
                    throw new Exception("");
                }
            } catch (Exception e) {
                System.out.println("Unknown answer, please enter 'y' or 'n'");
            }

        } while(true);

        return yn;
    }

    // simulate a clear console
    public void clearConsole() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

    // separator
    public static void separator(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    // print a title
    public static void header(String title) {
        separator(title.length());
        System.out.println(title);
        separator(title.length());
    }

    // give time to user to read or anything before continue
    public void anythingToContinue() {
        System.out.println("\nEnter anything to continue...");
        sc.next();
    }
}



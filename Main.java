package com.company;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class Main {
    Scanner userInput = new Scanner(System.in);
    public static int characterHealth = 60;
    public static int characterDamage = 12;
    public static int characterSpeed = 20;
    //-----------------------------------------
    public static int lionHealth = 100;
    public static int lionDamage = 3;
    public static int lionSpeed = 15;
    public static void profile()
    {

        System.out.println("Your Profile");
        System.out.println("Health: " + characterHealth);
        System.out.println("Damage: " + characterDamage);
        System.out.println("Speed: " + characterSpeed);
    }
    public static void lionProfile()
    {
        System.out.println("Lion's Stats");
        System.out.println("Lion's Health: " + lionHealth);
        System.out.println("Lion's Damage: " + lionDamage);
        System.out.println("Lion's Speed: " + lionSpeed);
    }
    public static void main(String[] args)
    {
        System.out.println("-----Text Adventure-----");
        profile();
        System.out.println("Press \"1\" to play.");
        int playButton = userInput.nextInt();
        if (playButton == 1)
        {
            System.out.println("Player information.");
            System.out.println("Current location: AzrakCity.");
            System.out.println("Type the location you want to travel to.");
            System.out.println("Unlocked Location: LaythDen");
            System.out.println("Locked location: NamirForest, LostSandDesert");
            String locationInput = userInput.nextLine();
            if (locationInput == LaythDen)
            {
                System.out.println("You are in LaythDen!Beware of lions appearing!");
                System.out.println("A lion has appeared!");
                System.out.println("Press \"2\" to fight the lion!");
                int fightInput = userInput.nextInt();
                if (fightInput == 2)
                {
                    System.out.println("You are now fighting the lion!");
                    profile();
                    lionProfile();
                    System.out.println("Press \"3\" to attack the lion!");
                    int attackInput = userInput.nextInt();
                    if (attackInput == 3)
                    {

                        while (lionHealth >= characterHealth)
                        {
                            lionHealth -= 12;
                            characterHealth -=3;
                            System.out.println("The lion the 12 damage the lion now has: " + lionHealth + "health.");
                            System.out.println("You took 3 damage, you now have: " + characterHealth + "health.");
                            if (characterHealth <= 0)
                            {
                                System.out.println("Your character has been defeated!");
                            }
                        }
                    }
                }


            }
        }
    }
}

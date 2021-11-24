import java.util.Scanner;

public class Game {

    Scanner scan = new Scanner(System.in);
    Scanner enterScan = new Scanner(System.in);

    int playerHp;
    int choice;

    String name;
    String playerWep;


    public static void main(String[] args) {

        Game start;
        start = new Game();
        start.playerSetUp();
        start.gate();
        start.castleTown();
        start.evening();
        start.onRun();
    }

    public void playerSetUp(){

        playerHp = 100;
        playerWep = "dirty underpants";

        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("Your stats: ");
        System.out.println("Your hp: " + playerHp);
        System.out.println("You are carrying: ");
        System.out.println("---------------------------------------------------------------------------------------------");

        System.out.println("What is thy name, horse feces?");
        System.out.println("");
        name = scan.nextLine();

        System.out.println("What is your weapon of choice?");
        playerWep = scan.nextLine();

        System.out.println("");
        System.out.println("Oh really, " + name + ". how ghastly of your mama and papa- to curse thee with thy name!");
        System.out.println("And " + playerWep + " what a crude weapon of choice! tsk tsk tsk. ");
        System.out.println("There are naught one reason to stand and mope around, " + name + ". We shall start thy game!");
        System.out.println("---------------------------------------------------------------------------------------------");

    }

    public void gate(){

        System.out.println("");
        System.out.println("You are standing outside of the gates outside of the town. Two guards stands in front of the entrance.");
        System.out.println("The two guards looks at you, disgusted. Doesn't seem like their letting you in.");
        System.out.println("");
        System.out.println("Guard: Hello there. Is that your face posted on that wanted sign? Your name is " + name + " right?");
        System.out.println("");
        System.out.println("What will you do?");
        System.out.println("");
        System.out.println("1: telling them a joke?");
        System.out.println("2: try to attack the guards!");
        System.out.println("3: Run like the hedge-born, that you are.");
        System.out.println("");

        choice = scan.nextInt();

        if(choice==1){
            System.out.println(name + ": Why was the court jester almost executed? Because the Queen got the joke at the last moment!" +
                    " The guards laughed at your joke, but judged you for your lack of intelligence. They let you pass.");
        }
        if (choice==2){
            System.out.println("You pull out your " + playerWep + ". " + name +": I will take you both o-");
            System.out.println("you were sliced by the guard before you could finished your sentence.");
            System.out.println("");
            System.out.println(name + " died. Try again.");
            enterScan.nextLine();
            gate();
        }
        if (choice==3){
            playerHp = playerHp - 10;
            System.out.println("You panicked and started to run. " +
                    "You were so blind by your own fear that you got run over by a carriage" +
                    "you lost 10 hp, but you survived.");
            System.out.println("");
            System.out.println("---------------------------------------------------------------------------------------------");
            System.out.println("your current stats:");
            System.out.println("Your hp: " + playerHp);
            System.out.println("You are carrying: " + playerWep);
        }
    }
    public void castleTown(){
        System.out.println("");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("You stand now at the middle of the town square.");
        System.out.println("If you go north, you shall end up at the castle");
        System.out.println("If you go to the west, you will end up at the brothel");
        System.out.println("Or if you prefer you can go to the east. End up in a mysterious back ally");
        System.out.println("Or return back south.");
        System.out.println("");
        System.out.println("Where do you go?");
        System.out.println("");
        System.out.println("1: North.");
        System.out.println("2: South?!");
        System.out.println("3: West!");
        System.out.println("4: East?");

        choice = scan.nextInt();

        if(choice==1){
            System.out.println(name + ": North! Of course, its the obvious answer! " +
                    "You said as you venture off. You suddenly see that there is a massive crowd of protesters that" +
                    "comes storming towards you. You get trampled on, and suffocates to death.");
            System.out.println("");
            System.out.println(name + " died. Try again.");
            enterScan.nextLine();
            castleTown();
        }
        if (choice==2){
            System.out.println("For some odd reason you went back to the gate. Why? Are you daft? Go back, you idiotic bedswerver!");
            System.out.println("");
            System.out.println("You insulted the author, you shall start again from the START!!");
            enterScan.nextLine();
            gate();
            System.out.println("");
            System.out.println("---------------------------------------------------------------------------------------------");

        }
        if (choice==3){
            playerHp = playerHp - 35;
            System.out.println("You decided to head straight for the brothel! You decided to spend the night with a handful of people." +
                    "your crotch itches, and you feel awful, yet in heaven!. You loose 35 hp!");
            System.out.println("");
            System.out.println("---------------------------------------------------------------------------------------------");
            System.out.println("your current stats:");
            System.out.println("Your hp: " + playerHp);
            System.out.println("You are carrying: " + playerWep + " and sexual diseases.");
            System.out.println("");
            System.out.println("---------------------------------------------------------------------------------------------");
        }
        if (choice==4){
            System.out.println(name + ": HAH! A sketchy, dark and scary ally? I smell the adventure from here!");
            System.out.println("you walk in there proudly, with your head held high");
            System.out.println("Someone grabs you from behinds and takes you further inn");
            System.out.println("Your body was never found, and you probably died a horrific death. ");
            System.out.println("");
            System.out.println(name + " died. Try again.");
            enterScan.nextLine();
            castleTown();
        }
    }
    public void evening(){
        System.out.println("");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("It's turning dark. You are exhausted, after a long day. You are itching and feel even worse.");
        System.out.println("You see an inn near by, but you don't have any gold in your pockets.");
        System.out.println("What shall you do?");
        System.out.println("");
        System.out.println("1: Sleep on the street.");
        System.out.println("2: Sneak into the inn.");
        System.out.println("3: Go back to the brothel");

        choice = scan.nextInt();

        if(choice==1){
            System.out.println("You found a corner in the slump");
            System.out.println("sadly someone emptied their night potty out of their window, and splashed you with it.");
            System.out.println("You caught e-coli and died in a pretty shitty way.");
            System.out.println("");
            System.out.println(name + " died. Try again.");
            enterScan.nextLine();
            evening();
        }
        if(choice==2){
            System.out.println("You took your " + playerWep + " out and walked to the inn.");
            System.out.println("You walked slowly inn, and you see a sleeping man, behind the counter.");
            System.out.println("You stepped on a mousetrap, and screamed. The man woke up and shoot you with his crossbow.");
            System.out.println(name + " died. Try again.");
            enterScan.nextLine();
            evening();
        }
        if(choice==3){
            System.out.println(name + ": nah, I shall head back, and have a good time");
            System.out.println("");
            System.out.println("As you walked towards the brothel, you hear men yelling, and horse shoes clacking hard on the cobblestone street.");
            System.out.println("");
            System.out.println("Unknown female voice: Watch out!");
            System.out.println("The hooded female on the horse crashes onto you.");
            System.out.println("The woman, horse and you went tumbling.");
            System.out.println("Luckily you lived with horses for many years, and you got on the horse, calmed it.");
            System.out.println("You grabbed the half unconscious female. And rode away.");
            System.out.println("You lost 5 hp");
            System.out.println("");
            System.out.println("---------------------------------------------------------------------------------------------");
            System.out.println("your current stats:");
            System.out.println("Your hp: " + playerHp);
            System.out.println("You are carrying: " + playerWep + " and sexual diseases.");
            System.out.println("");
            System.out.println("---------------------------------------------------------------------------------------------");
        }
    }
    public void onRun(){

    }

}

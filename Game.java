//for our Game class
// runs Player class

import java.util.*;


public class Game{

private Map coloradoCollege;
private int healthScore;

  public static void main(String[] args){

    System.out.println( "Nick: Welcome to Colorado College; unfortunately, you have come at a really bad time. \nSquirrels are attacking everyone and they all have rabies. We need the special elixir to cure CC. \nI need to find my special elixir or the world is doomed; \nIt is somewhere on campus and you're going to have to help me \nFirst, what is your name?\n");

    System.out.println("Enter your name: ");
    Scanner userInput = new Scanner(System.in);
    String name = userInput.nextLine();
    System.out.println("Welcome, " + name +". \nYou have to go around campus, visiting the different locations. \nIn each, you will be faced with 2 choices. \nIf you make the right choice, you will get a clue to find the elixir. \nBut if you make the wrong choice, you will be attacked by a squirrel and get -20 health; \n5 wrong choices will kill you");

  }

}

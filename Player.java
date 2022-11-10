
import.java.util.*;

public class Player{

  private String name;

//Constructor class for instantiating a player. It takes in the name of the user. next
  public Player(String name){
    System.out.println("Enter your name: ");
    Scanner console = new Scanner(System.in);
    name = console.next();
    System.out.println("Player: " + name);
    System.out.println("\nWelcome, " + name);
  }
// mutator for name
  public void setName(String name){
    this.name = name;
  }
// accessor for name
  public String getName(){
    return this.name;
  }
}

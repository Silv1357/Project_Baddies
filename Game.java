//for our Game class
// runs Player and Map class
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game{

private Map coloradoCollege;
private int healthScore;

  public static void main(String[] args){
    JOptionPane.showMessageDialog(null, "In this game, you will walk around visiting different parts of Colorado College, \nYou will be faced with 2 options at each location: \nIf you choose correctly you get a clue to find the elixir \nbut if you choose the wrong option, the rabid squirrels will attack you and deduct 20 health from you \nFind the elixir before your health gets to 0 to save CC!", "Instructions", JOptionPane.PLAIN_MESSAGE);
    JOptionPane.showMessageDialog(null, "Welcome to Colorado College; unfortunately, you have come at a really bad time. \nSquirrels are attacking everyone and they all have rabies. We need the special elixir to cure CC. \nI need to find my special elixir or the world is doomed; it is somewhere on campus and you're going to have to help me! \nHint: Start at Worner ", "Welcome!!", JOptionPane.PLAIN_MESSAGE);

  }

}

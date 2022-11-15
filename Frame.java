// This program creates and displays welcome screen
// and calls and displays button class when start button is clicked

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.io.*; // Files
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// class for welcome screen and calling button class
public class Frame extends JButton implements ActionListener {
  JButton start;
  JFrame b;

  // method for creating and displaying welcome screen
  public void welcomeScreen(){

    // create new frame
    b = new JFrame();
    b.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    b.setSize (800, 500); // sets size of frame

    // scale image
    final ImageIcon originalImage = new ImageIcon ("sq1.jpeg");
    final ImageIcon scaledImage = new ImageIcon (originalImage.getImage().getScaledInstance(770, 490, Image.SCALE_SMOOTH));

    // create a JLabel for image
    JLabel label = new JLabel (scaledImage);
    Dimension size = label.getPreferredSize ();
    label.setPreferredSize (new Dimension (100, 100));
    b.add(label);

    // create a JLabel for game title
    JLabel title = new JLabel("Attack of the Squirrels");
    title.setBounds (70, 45, 500, 80);
    title.setFont (new Font ("Courier BOLD", Font.PLAIN, 40));
    b.add (title);

    // start button
    start = new JButton ("Start");
    start.setBounds (540, 60, 80, 50);
    start.setFont (new Font ("Arial", Font.PLAIN, 20));
    b.add (start);
    b.setLayout(null);

    // create a new JPanel
    JPanel panel = new JPanel (new BorderLayout());
    panel.setSize (800, 500);
    panel.add(label);
    b.add(panel);

    b.setVisible (true);
    start.addActionListener(this);
    b.setResizable(false); // set resizability (of frame) to false

  }

  // method for when start button is clicked, display Button class
  public void actionPerformed (ActionEvent e){
    JButton userClicked = (JButton)e.getSource();
    if (userClicked == start){
      b.setVisible(false);

      // try and catch for welcomeMessage method
      try{
        welcomeMessage();
      } catch(FileNotFoundException except){
        System.out.println("Check your file name.");
      }

      Button butt = new Button();
      butt.button();
    }
  }

  // method for displaying welcome message and explaining how game is played
  public void welcomeMessage () throws FileNotFoundException {

      ArrayList <String> list = new ArrayList <String>();
      Scanner console = new Scanner (new File ("Welcome.txt"));
      while (console.hasNext()){
        String nextWord = console.next();
        list.add (nextWord);
      }

      String message1 = JOptionPane.showInputDialog(list.toString().replace ("[", "").replace(",", "").replace("]", "").replace(".",".\n").replace("?", "?\n\n"));

      JOptionPane.showMessageDialog(b,"Welcome, " + message1 +". \nYou have to go around campus, visiting the different locations. \nIn each, you will be faced with 2 choices. \nIf you make the right choice, you will get a clue to find the elixir. \nBut if you make the wrong choice, you will be attacked by a squirrel and get -20 health; \n5 wrong choices will kill you");
  }
}

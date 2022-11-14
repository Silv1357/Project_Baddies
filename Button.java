
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JButton implements ActionListener{
  JButton sports, languageHouses, westCampus, worner, musicAndTheatre, tuttLibrary, armstrong, southHall, edRobson, shove, classes, mathias, eastCampus;
  int healthScore = 100;
  JLabel healthDisplay;

  public void button(){
    // create a JFrame
    JFrame a = new JFrame();
    a.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    a.setSize (800, 500); // sets size of frame
    //health display will be here so it prints on top of the image
    healthDisplay = new JLabel(String.valueOf(healthScore));
    healthDisplay.setBounds(8, 5, 75, 25);
    a.add(healthDisplay);

    // scale image
    final ImageIcon originalImage = new ImageIcon ("map2.jpeg");
    // original image dimensions 1011x742
    final ImageIcon scaledImage = new ImageIcon (originalImage.getImage().getScaledInstance (761, 492, Image.SCALE_SMOOTH));

    // create a JLabel
    JLabel label = new JLabel (scaledImage);
    Dimension size = label.getPreferredSize();
    label.setPreferredSize (new Dimension (250, 100));

    a.add(label); // add label (image) to frame
    a.setVisible (true);

    // Athletics and Sports Button
    sports = new JButton ("Sports");
    sports.setBounds (30, 200, 100, 25);
    a.add(sports);
    a.setLayout (null);
    a.setVisible(true);
    sports.addActionListener(this);

    // Language House Button
    languageHouses = new JButton ("Language Houses");
    languageHouses.setBounds (200, 20, 150, 25);
    a.add(languageHouses);
    a.setLayout (null);
    a.setVisible(true);
    languageHouses.addActionListener(this);

    // West Campus Button
    westCampus = new JButton ("West Campus");
    westCampus.setBounds (150, 175, 120, 25);
    a.add (westCampus);
    a.setLayout (null);
    a.setVisible(true);
    westCampus.addActionListener(this);

    // Worner
    worner = new JButton ("Worner");
    worner.setBounds (240, 300, 100, 25);
    a.add (worner);
    a.setLayout(null);
    a.setVisible(true);
    worner.addActionListener(this);

    // Music and Theatre
    musicAndTheatre = new JButton ("Music & Theatre");
    musicAndTheatre.setBounds (300, 375, 130, 25);
    a.add (musicAndTheatre);
    a.setLayout(null);
    a.setVisible(true);
    musicAndTheatre.addActionListener(this);

    // Tutt Library
    tuttLibrary = new JButton ("Tutt Library");
    tuttLibrary.setBounds (350, 130, 100, 25);
    a.add (tuttLibrary);
    a.setLayout(null);
    a.setVisible(true);
    tuttLibrary.addActionListener(this);

    // Armstrong
    armstrong = new JButton ("Armstrong");
    armstrong.setBounds (375, 300, 100, 25);
    a.add (armstrong);
    a.setLayout(null);
    a.setVisible(true);
    armstrong.addActionListener(this);

    // South Hall
    southHall = new JButton ("South Hall ");
    southHall.setBounds (525, 300, 100, 25);
    a.add (southHall);
    a.setLayout(null);
    a.setVisible(true);
    southHall.addActionListener(this);

    // Ed Robson
    edRobson = new JButton ("Ed Robson ");
    edRobson.setBounds (510, 380, 100, 25);
    a.add (edRobson);
    a.setLayout(null);
    a.setVisible(true);
    edRobson.addActionListener(this);

    // Shove Chapel
    shove = new JButton ("Shove Chapel");
    shove.setBounds (510, 220, 110, 25);
    a.add (shove);
    a.setLayout(null);
    a.setVisible(true);
    shove.addActionListener(this);

    // Class
    classes = new JButton ("Class");
    classes.setBounds (500, 130, 100, 20);
    a.add (classes);
    a.setLayout(null);
    a.setVisible(true);
    classes.addActionListener(this);

    // Mathias
    mathias = new JButton ("Mathias");
    mathias.setBounds (530, 30, 75, 20);
    a.add (mathias);
    a.setLayout(null);
    a.setVisible(true);
    mathias.addActionListener(this);

    // East Campus
    eastCampus = new JButton ("East Campus ");
    eastCampus.setBounds (650, 150, 120, 25);
    a.add (eastCampus);
    a.setLayout(null);
    a.setVisible(true);
    eastCampus.addActionListener(this);

    // create a new JPanel
    JPanel panel = new JPanel (new BorderLayout());
    panel.setSize (800, 500);

    panel.add (label);
    a.add(panel);
}

  @Override
  public void actionPerformed(ActionEvent e){
    healthDisplay.setText("Health: " + String.valueOf(healthScore));
    JButton userClicked = (JButton) e.getSource();
    if(userClicked == sports) {
      String sp = JOptionPane.showInputDialog("1. Run as fast as you can (runner track-star type run) or \n2. Play soccer with the cute (but rabid) squirrels \nEnter 1 or 2");
      // print something
      // take scanner input
      if(sp.equals("1")){
        healthScore += 0;
        //print the clue here
        JOptionPane.showMessageDialog(null, "Testing purposes", "Clue", JOptionPane.PLAIN_MESSAGE); //change "testing purposes to the clues"
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      } else {
        healthScore -= 20;
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      }
    }
    if(userClicked == languageHouses){
      String lh = JOptionPane.showInputDialog("1. Let the squirrels teach you squirrel-talk, yesss! or \n2. No thanks, I can go without learning \nEnter 1 or 2");
      if(lh.equals("2")){
        healthScore += 0;
        //print the clue here
        JOptionPane.showMessageDialog(null, "Testing purposes", "Clue", JOptionPane.PLAIN_MESSAGE); //this will dsplay the message but removes the health score
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      } else {
        healthScore -= 20;
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      }
    }
    if(userClicked == westCampus){
      String wc = JOptionPane.showInputDialog("1. Give the squirrels a tour of lovely Loomis  or \n2. The squirrels can get lost \nEnter 1 or 2");
      if(wc.equals("2")){
        healthScore += 0;
        //print clue here
        JOptionPane.showMessageDialog(null, "Testing purposes", "Clue", JOptionPane.PLAIN_MESSAGE);
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      } else {
        healthScore -= 20;
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      }
    }
    if(userClicked == worner){
      String wo = JOptionPane.showInputDialog("1. Sorry, but I was told to NOT feed the squirrels or \n2. Aww feed them some tasty rasties!! \nEnter 1 or 2");
      if(wo.equals("1")){
        healthScore += 0;
        //print clue here
        JOptionPane.showMessageDialog(null, "Testing purposes", "Clue", JOptionPane.PLAIN_MESSAGE);
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      } else {
        healthScore -= 20;
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      }
    }
    if(userClicked == musicAndTheatre){
      String mth = JOptionPane.showInputDialog("1. Show off my amazing theatre skills to these squirrels or \n2. Lock them up backstage \nEnter 1 or 2");
      if(mth.equals("2")){
        healthScore += 0;
        //print clue here
        JOptionPane.showMessageDialog(null, "Testing purposes", "Clue", JOptionPane.PLAIN_MESSAGE);
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      } else {
        healthScore -= 20;
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      }
    }
    if(userClicked == tuttLibrary){
      String ttl = JOptionPane.showInputDialog("1. Reading can wait to be honest or \n2. Storytime with the squrrels!!! \nEnter 1 or 2");
      if(ttl.equals("1")){
        healthScore += 0;
        //print clue here
        JOptionPane.showMessageDialog(null, "Testing purposes", "Clue", JOptionPane.PLAIN_MESSAGE);
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      } else {
        healthScore -= 20;
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      }
    }
    if(userClicked == armstrong){
      String arm = JOptionPane.showInputDialog("1. I don't even like armstrong, easy pass or \n2. Quick armstrong tour sounds fun \nEnter 1 or 2");
      if(arm.equals("1")){
        healthScore += 0;
        //print clue here
        JOptionPane.showMessageDialog(null, "Testing purposes", "Clue", JOptionPane.PLAIN_MESSAGE);
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      } else {
        healthScore -= 20;
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      }
    }
    if(userClicked == southHall){
      String sh = JOptionPane.showInputDialog("1. Play a quick volleyball game with them in the South court!  or \n2. No time to lose now, even though South is really nice \nEnter 1 or 2");
      if(sh.equals("2")){
        healthScore += 0;
        //print clue here
        JOptionPane.showMessageDialog(null, "Testing purposes", "Clue", JOptionPane.PLAIN_MESSAGE);
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      } else {
        healthScore -= 20;
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      }
    }
    if(userClicked == edRobson){
      String ed = JOptionPane.showInputDialog("1. I'll just watch the next game  or \n2. Take the squirrels to the game!  \nEnter 1 or 2");
      if(ed.equals("1")){
        healthScore += 0;
        //print clue here
        JOptionPane.showMessageDialog(null, "Testing purposes", "Clue", JOptionPane.PLAIN_MESSAGE);
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      } else {
        healthScore -= 20;
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      }
    }
    if(userClicked == shove){
      String shv = JOptionPane.showInputDialog("1. Moment of meditation with the squirrels. That might cure them, no?  or \n2. I choose my own peace away from them, byeee! \nEnter 1 or 2");
      if(shv.equals("2")){
        healthScore += 0;
        //print clue here
        JOptionPane.showMessageDialog(null, "Testing purposes", "Clue", JOptionPane.PLAIN_MESSAGE);
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      } else {
        healthScore -= 20;
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      }
    }
    if(userClicked == classes){
      String cls = JOptionPane.showInputDialog("1. Take them to class with me as my pet? or \n2. I can afford to skip class just today \nEnter 1 or 2");
      if(cls.equals("2")){
        healthScore += 0;
        //print clue here
        JOptionPane.showMessageDialog(null, "Testing purposes", "Clue", JOptionPane.PLAIN_MESSAGE);
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      } else {
        healthScore -= 20;
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      }
    }
    if(userClicked == mathias){ //edit this since we said the elixir will be here
      String math = JOptionPane.showInputDialog("1. I saw we all stop for snacks at the C-Store or \n2. I have to sneak in the c-store without them! \nEnter 1 or 2");
      if(math.equals("2")){
        healthScore += 0;
        //print message of elixir found here
        JOptionPane.showMessageDialog(null, "You have found the elixir! It was hidden in the C-store shelf!", "ELIXIR FOUND", JOptionPane.PLAIN_MESSAGE);
        //maybe do a final question in order to be able to buy the elixir??
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      } else {
        healthScore -= 20;
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      }
    }
    if(userClicked == eastCampus){
      String ec = JOptionPane.showInputDialog("1. Keep running, the nice apartments will still be there later or \n2. Party with them outside the apartments! \nEnter 1 or 2");
      if(ec.equals("1")){
        healthScore += 0;
        //print clue here
        JOptionPane.showMessageDialog(null, "Testing purposes", "Clue 12", JOptionPane.PLAIN_MESSAGE);
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      } else {
        healthScore -= 20;
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      }
    }
    if(healthScore == 0){ 
      JOptionPane.showMessageDialog(null, "Uh oh, you got squirrel rabies; better luck next time!", "No Health", JOptionPane.PLAIN_MESSAGE);
      System.exit(0);
    }
    healthDisplay.setText("Health: " + String.valueOf(healthScore));
    //how do we get word health to pop up from the start
  }
}

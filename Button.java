

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// this button class serves to create the buttons on the map as well as get the button the user clicks on and based on the button
// it will print a window with 2 options from which the player must choose from and based on that they will either get a window wiht a clue or get health deducted

public class Button extends JButton implements ActionListener{
  JButton sports, languageHouses, westCampus, worner, musicAndTheatre, tuttLibrary, armstrong, southHall, edRobson, shove, classes, mathias, eastCampus;
  int healthScore = 100; //health of the player will start at 0
  JLabel healthDisplay; //we want the heakth to be displayed at all times
  RabidSquirrel mathySquirrel = new RabidSquirrel(); //we are creating different squirrels for each location and assigning them actions
  RabidSquirrel wornerSquirrel = new RabidSquirrel();
  RabidSquirrel sportsSquirrel = new RabidSquirrel();
  RabidSquirrel languageHousesSquirrel = new RabidSquirrel();
  RabidSquirrel westCampusSquirrel = new RabidSquirrel();
  RabidSquirrel musicAndTheatreSquirrel = new RabidSquirrel();
  RabidSquirrel tuttLibrarySquirrel = new RabidSquirrel();
  RabidSquirrel armstrongSquirrel = new RabidSquirrel();
  RabidSquirrel southHallSquirrel = new RabidSquirrel();
  RabidSquirrel edRobsonSquirrel = new RabidSquirrel();
  RabidSquirrel shoveSquirrel = new RabidSquirrel();
  RabidSquirrel classesSquirrel = new RabidSquirrel();
  RabidSquirrel eastCampusSquirrel = new RabidSquirrel();

  // method for creating buttons and displaing on panel
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

    // Athletics and Sports 
    sports = new JButton ("Sports");
    sports.setBounds (30, 200, 100, 25);
    a.add(sports);
    a.setLayout (null);
    a.setVisible(true);
    sports.addActionListener(this);

    // Language Houses
    languageHouses = new JButton ("Language Houses");
    languageHouses.setBounds (200, 20, 150, 25);
    a.add(languageHouses);
    a.setLayout (null);
    a.setVisible(true);
    languageHouses.addActionListener(this);

    // West Campus 
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
    a.setBackground(new Color(59, 89, 182));
    a.setForeground(Color.BLUE);
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

  // method for when buttons are clicked
  @Override
  public void actionPerformed(ActionEvent e){
    mathySquirrel.setAction("jumps towards your face"); //assigning actions to the different squirrels
    wornerSquirrel.setAction("looks violently hungry");
    sportsSquirrel.setAction("sprints towards you");
    languageHousesSquirrel.setAction("look threatening");
    westCampusSquirrel.setAction("want to go into loomis");
    musicAndTheatreSquirrel.setAction("are acting crazy");
    tuttLibrarySquirrel.setAction("tearing books apart");
    armstrongSquirrel.setAction("are peaking at the armstrong windows");
    southHallSquirrel.setAction("are taking over the volleyball court");
    edRobsonSquirrel.setAction("are throwing hockey pucks at you");
    shoveSquirrel.setAction("look like they need some help");
    classesSquirrel.setAction("look interested in you (weird)");
    eastCampusSquirrel.setAction("are trying to take over hybl");
    healthDisplay.setText("Health: " + String.valueOf(healthScore));
    JButton userClicked = (JButton) e.getSource();
 //the if statements allow us to track what button was clicked and what shoud happen next 
    if(userClicked == sports) {
      String sp = JOptionPane.showInputDialog("A rabid squirrel " + sportsSquirrel.getAction() + "\n1. Run as fast as you can (runner track-star type run) or \n2. Play soccer with the cute (but rabid) squirrels \nEnter 1 or 2");
      // take scanner input
      if(sp.equals("1")){
        healthScore += 0;
        // print the clue here
        JOptionPane.showMessageDialog(null, "There is a recently abandoned guitar on the track; maybe I should head to the theater department.", "Clue", JOptionPane.PLAIN_MESSAGE); //change "testing purposes to the clues"
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      } else {
        JOptionPane.showMessageDialog(null, "You were bit by a rabid squirrel, you lost 20 health.", "Oops!", JOptionPane.PLAIN_MESSAGE);
        healthScore -= 20;
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      }
    }

    if(userClicked == languageHouses){
      String lh = JOptionPane.showInputDialog("The squirrels " + languageHousesSquirrel.getAction() + "\n1. Let the squirrels teach you squirrel-talk, yesss! or \n2. No thanks, I can go without learning \nEnter 1 or 2");
      if(lh.equals("2")){
        healthScore += 0;
        // print the clue here
        JOptionPane.showMessageDialog(null, "Found an abandoned gold card; it belonged to a former student athlete.", "Clue", JOptionPane.PLAIN_MESSAGE); //this will dsplay the message but removes the health score
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      } else {
        JOptionPane.showMessageDialog(null, "You were bit by a rabid squirrel, you lost 20 health.", "Oops!", JOptionPane.PLAIN_MESSAGE);
        healthScore -= 20;
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      }
    }

    if(userClicked == westCampus){
      String wc = JOptionPane.showInputDialog("The zombie-looking squirrels " + westCampusSquirrel.getAction() + "\n1. Give the squirrels a tour of lovely Loomis  or \n2. The squirrels can get lost \nEnter 1 or 2");
      if(wc.equals("2")){
        healthScore += 0;
        //print clue here
        JOptionPane.showMessageDialog(null, "The squirrels seem nicer at the language houses.", "Clue", JOptionPane.PLAIN_MESSAGE);
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      } else {
        JOptionPane.showMessageDialog(null, "You were bit by a rabid squirrel, you lost 20 health.", "Oops!", JOptionPane.PLAIN_MESSAGE);
        healthScore -= 20;
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      }
    }

    if(userClicked == worner){
      String wo = JOptionPane.showInputDialog("The squirrel at the entrance looks " + wornerSquirrel.getAction() + "\n1. Sorry, but I was told to NOT feed the squirrels or \n2. Aww, feed them some tasty rasties!! \nEnter 1 or 2");
      if(wo.equals("1")){
        healthScore += 0;
        //print clue here
        JOptionPane.showMessageDialog(null, "The squirrels really like West Campus.", "Clue", JOptionPane.PLAIN_MESSAGE);
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      } else {
        JOptionPane.showMessageDialog(null, "You were bit by a rabid squirrel, you lost 20 health.", "Oops!", JOptionPane.PLAIN_MESSAGE);
        healthScore -= 20;
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      }
    }

    if(userClicked == musicAndTheatre){
      String mth = JOptionPane.showInputDialog("The squirrels "  + musicAndTheatreSquirrel.getAction() + "\n1. Show off my amazing theatre skills to these squirrels or \n2. Lock them up backstage \nEnter 1 or 2");
      if(mth.equals("2")){
        healthScore += 0;
        //print clue here
        JOptionPane.showMessageDialog(null, "Someone left an unreturned book on the counter.", "Clue", JOptionPane.PLAIN_MESSAGE);
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      } else {
        JOptionPane.showMessageDialog(null, "You were bit by a rabid squirrel, you lost 20 health.", "Oops!", JOptionPane.PLAIN_MESSAGE);
        healthScore -= 20;
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      }
    }

    if(userClicked == tuttLibrary){
      String ttl = JOptionPane.showInputDialog("There are a bunch of rabid squirrels" + tuttLibrarySquirrel.getAction() + "\n1. Reading can wait to be honest or \n2. Storytime with the squrrels!!! \nEnter 1 or 2");
      if(ttl.equals("1")){
        healthScore += 0;
        //print clue here
        JOptionPane.showMessageDialog(null, "There is a poster with \" help \" written on it. Their location is Armstrong.", "Clue", JOptionPane.PLAIN_MESSAGE);
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      } else {
        JOptionPane.showMessageDialog(null, "You were bit by a rabid squirrel, you lost 20 health.", "Oops!", JOptionPane.PLAIN_MESSAGE);
        healthScore -= 20;
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      }
    }

    if(userClicked == armstrong){
      String arm = JOptionPane.showInputDialog("You are about to enter armstrong but the squirrels " + armstrongSquirrel.getAction() + "\n1. I don't even like Armstrong, easy pass or \n2. Quick Armstrong tour sounds fun \nEnter 1 or 2");
      if(arm.equals("1")){
        healthScore += 0;
        //print clue here
        JOptionPane.showMessageDialog(null, "Nobody is here, but I found another gold card belonging to a South resident.", "Clue", JOptionPane.PLAIN_MESSAGE);
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      } else {
        JOptionPane.showMessageDialog(null, "You were bit by a rabid squirrel, you lost 20 health.", "Oops!", JOptionPane.PLAIN_MESSAGE);
        healthScore -= 20;
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      }
    }

    if(userClicked == southHall){
      String sh = JOptionPane.showInputDialog("Take a peak into south and the squirrels " + southHallSquirrel.getAction() + "\n1. Play a quick volleyball game with them in the South court!  or \n2. No time to lose now, even though South is really nice \nEnter 1 or 2");
      if(sh.equals("2")){
        healthScore += 0;
        //print clue here
        JOptionPane.showMessageDialog(null, "This person was obviously a hockey player.", "Clue", JOptionPane.PLAIN_MESSAGE);
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      } else {
        JOptionPane.showMessageDialog(null, "You were bit by a rabid squirrel, you lost 20 health.", "Oops!", JOptionPane.PLAIN_MESSAGE);
        healthScore -= 20;
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      }
    }

    if(userClicked == edRobson){
      String ed = JOptionPane.showInputDialog("Oh no, the squirrels " + edRobsonSquirrel.getAction() + "\n1. I'll just watch the next game  or \n2. Take the squirrels to the game!  \nEnter 1 or 2");
      if(ed.equals("1")){
        healthScore += 0;
        //print clue here
        JOptionPane.showMessageDialog(null, "The squirrels couldn't have infilitrated Shove?", "Clue", JOptionPane.PLAIN_MESSAGE);
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      } else {
        JOptionPane.showMessageDialog(null, "You were bit by a rabid squirrel, you lost 20 health.", "Oops!", JOptionPane.PLAIN_MESSAGE);
        healthScore -= 20;
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      }
    }

    if(userClicked == shove){
      String shv = JOptionPane.showInputDialog("These squirrels are crazy, they " + shoveSquirrel.getAction() + "1. Moment of meditation with the squirrels. That might cure them, no?  or \n2. I choose my own peace away from them, byeee! \nEnter 1 or 2");
      if(shv.equals("2")){
        healthScore += 0;
        //print clue here
        JOptionPane.showMessageDialog(null, "Well, that was terrible. I need to check if they also infilitrated the classrooms.", "Clue", JOptionPane.PLAIN_MESSAGE);
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      } else {
        JOptionPane.showMessageDialog(null, "You were bit by a rabid squirrel, you lost 20 health.", "Oops!", JOptionPane.PLAIN_MESSAGE);
        healthScore -= 20;
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      }
    }

    if(userClicked == classes){
      String cls = JOptionPane.showInputDialog("As you walk to class, the squirrels " + classesSquirrel.getAction() + "\n1. Take them to class with me as my pet? or \n2. I can afford to skip class for just today \nEnter 1 or 2");
      if(cls.equals("2")){
        healthScore += 0;
        //print clue here
        JOptionPane.showMessageDialog(null, "There is another CC ID here and it belongs to an employee. There's only one place left to check.", "Clue", JOptionPane.PLAIN_MESSAGE);
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      } else {
        JOptionPane.showMessageDialog(null, "You were bit by a rabid squirrel, you lost 20 health.", "Oops!", JOptionPane.PLAIN_MESSAGE);

        healthScore -= 20;
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      }
    }

    if(userClicked == mathias){ //edit this since we said the elixir will be here
      String math = JOptionPane.showInputDialog("1. I saw we all stop for snacks at the C-Store or \n2. I have to sneak in the C-Store without them! \nEnter 1 or 2");
      if(math.equals("2")){
        healthScore += 0;
        //print message of elixir found here
        JOptionPane.showMessageDialog(null, "The elixir is in the C-Store!! Defeat the last rabid squirrel to get it!", "ELIXIR FOUND", JOptionPane.PLAIN_MESSAGE);
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
        String math2 = JOptionPane.showInputDialog("The last extreme, rabid squirrel " + mathySquirrel.getAction() +  "\n1. I'm so scared I cannot move or \n2. Grab the tree branch and hit it away! \nEnter 1 or 2");
        if(math2.equals("2")){
          healthScore += 0;
          JOptionPane.showMessageDialog(null, "You got the elixir and saved CC!! Congrats!", "ELIXIR OBTAINED", JOptionPane.PLAIN_MESSAGE);
          healthDisplay.setText("Health: " + String.valueOf(healthScore));
        }
        else{
          JOptionPane.showMessageDialog(null, "You were bit by a rabid squirrel, you lost 20 health.", "Oops!", JOptionPane.PLAIN_MESSAGE);
          healthScore -= 20;
          healthDisplay.setText("Health: " + String.valueOf(healthScore));
        }
        //maybe do a final question in order to be able to buy the elixir??
      } else {
        JOptionPane.showMessageDialog(null, "You were bit by a rabid squirrel, you lost 20 health.", "Oops!", JOptionPane.PLAIN_MESSAGE);
        healthScore -= 20;
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      }
    }

    if(userClicked == eastCampus){
      String ec = JOptionPane.showInputDialog("Squirrels " + eastCampusSquirrel.getAction() + "\n1. Keep running, the nice apartments will still be there later or \n2. Party with them outside the apartments! \nEnter 1 or 2");
      if(ec.equals("1")){
        healthScore += 0;
        //print clue here
        JOptionPane.showMessageDialog(null, "C-Store is the last place this elixir could possible be.", "Clue", JOptionPane.PLAIN_MESSAGE);
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      } else {
        healthScore -= 20;
        JOptionPane.showMessageDialog(null, "You were bit by a rabid squirrel, you lost 20 health.", "Oops!", JOptionPane.PLAIN_MESSAGE);
        healthDisplay.setText("Health: " + String.valueOf(healthScore));
      }
    }
    if(healthScore == 0){
      JOptionPane.showMessageDialog(null, "Uh oh, you got squirrel rabies; better luck next time!", "No Health", JOptionPane.PLAIN_MESSAGE);
      System.exit(0);
    }
    healthDisplay.setText("Health: " + String.valueOf(healthScore));
  }
}

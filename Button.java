
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

    healthDisplay = new JLabel(String.valueOf(healthScore));
    healthDisplay.setBounds(8, 5, 75, 25);
    a.add(healthDisplay);

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
    JButton userClicked = (JButton) e.getSource();
    //Scanner console = new Scanner(System.in);
    // System.out.println(userClicked);
    String meow = JOptionPane.showInputDialog("Enter 1 or 2:");

    if(userClicked == sports) {
      // print something
      System.out.println("enter 1 or 2");
      // take scanner input
      if(meow.equals("1")){
        healthScore += 0;
        System.out.println("Your health is now: " + healthScore);
       //how do we get it to exit the if statement without closing game??
      } else {
        healthScore -= 20;
        System.out.println("Your health is now: " + healthScore);
      }
      //console.close();
    }
    if(userClicked == languageHouses){
      System.out.println("enter 1 or 2");
      if(meow.equals("1")){
        healthScore += 0;
        System.out.println("Your health is now: " + healthScore);
       //how do we get it to exit the if statement without closing game??

      } else {
        healthScore -= 20;
        System.out.println("Your health is now: " + healthScore);
      }
      //console.close();
    }
    if(userClicked == westCampus){
      System.out.println("enter 1 or 2");
      if(meow.equals("1")){
        healthScore += 0;
        System.out.println("Your health is now: " + healthScore);
       //how do we get it to exit the if statement without closing game??

      } else {
        healthScore -= 20;
        System.out.println("Your health is now: " + healthScore);
      }
      //console.close();
    }
    if(userClicked == worner){
      System.out.println("enter 1 or 2");
      if(meow.equals("1")){
        healthScore += 0;
        System.out.println("Your health is now: " + healthScore);
       //how do we get it to exit the if statement without closing game??

      } else {
        healthScore -= 20;
        System.out.println("Your health is now: " + healthScore);
      }
      //console.close();
    }
    if(userClicked == musicAndTheatre){
      System.out.println("enter 1 or 2");
      if(meow.equals("1")){
        healthScore += 0;
        System.out.println("Your health is now: " + healthScore);
       //how do we get it to exit the if statement without closing game??

      } else {
        healthScore -= 20;
        System.out.println("Your health is now: " + healthScore);
      }
      //console.close();
    }
    if(userClicked == tuttLibrary){
      System.out.println("enter 1 or 2");
      if(meow.equals("1")){
        healthScore += 0;
        System.out.println("Your health is now: " + healthScore);
       //how do we get it to exit the if statement without closing game??

      } else {
        healthScore -= 20;
        System.out.println("Your health is now: " + healthScore);
      }
      //console.close();
    }
    if(userClicked == armstrong){
      System.out.println("enter 1 or 2");
      if(meow.equals("1")){
        healthScore += 0;
        System.out.println("Your health is now: " + healthScore);
       //how do we get it to exit the if statement without closing game??

      } else {
        healthScore -= 20;
        System.out.println("Your health is now: " + healthScore);
      }
      //console.close();
    }
    if(userClicked == southHall){
      System.out.println("enter 1 or 2");
      if(meow.equals("1")){
        healthScore += 0;
        System.out.println("Your health is now: " + healthScore);
       //how do we get it to exit the if statement without closing game??

      } else {
        healthScore -= 20;
        System.out.println("Your health is now: " + healthScore);
      }
      //console.close();
    }
    if(userClicked == edRobson){
      System.out.println("enter 1 or 2");
      if(meow.equals("1")){
        healthScore += 0;
        System.out.println("Your health is now: " + healthScore);
       //how do we get it to exit the if statement without closing game??

      } else {
        healthScore -= 20;
        System.out.println("Your health is now: " + healthScore);
      }
      //console.close();
    }
    if(userClicked == shove){
      System.out.println("enter 1 or 2");
      if(meow.equals("1")){
        healthScore += 0;
        System.out.println("Your health is now: " + healthScore);
       //how do we get it to exit the if statement without closing game??

      } else {
        healthScore -= 20;
        System.out.println("Your health is now: " + healthScore);
      }
      //console.close();
    }
    if(userClicked == classes){
      System.out.println("enter 1 or 2");
      if(meow.equals("1")){
        healthScore += 0;
        System.out.println("Your health is now: " + healthScore);
       //how do we get it to exit the if statement without closing game??

      } else {
        healthScore -= 20;
        System.out.println("Your health is now: " + healthScore);
      }
    }
    if(userClicked == mathias){
      System.out.println("enter 1 or 2");
      if(meow.equals("1")){
        healthScore += 0;
        System.out.println("Your health is now: " + healthScore);
       //how do we get it to exit the if statement without closing game??

      } else {
        healthScore -= 20;
        System.out.println("Your health is now: " + healthScore);
      }
    }
    if(userClicked == eastCampus){
      System.out.println("enter 1 or 2");
      if(meow.equals("1")){
        healthScore += 0;
        System.out.println("Your health is now: " + healthScore);
       //how do we get it to exit the if statement without closing game??

      } else {
        healthScore -= 20;
        System.out.println("Your health is now: " + healthScore);
      }
    }
    healthDisplay.setText(String.valueOf(healthScore));
    //console.close();
  }

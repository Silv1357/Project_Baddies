
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//this abstract class serves to assign an action to a squirrel then retrieve the action when we call the getAction method 
public abstract class Squirrel{
  private String action;

  public String squirrelAction(String action){
    return this.action = action;
  }
  public String getAction(){ //gets the product name
    return action;
  }

}

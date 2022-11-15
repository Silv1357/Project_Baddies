
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//this class inherits from Squirrels and by saying super.SquirrelAction we assign the different actions to the squirrel later used in the Button class 
public class RabidSquirrel extends Squirrel{
  public void setAction(String action){
    super.squirrelAction(action);
  }
  public String toString(){
    return getAction();
  }
}

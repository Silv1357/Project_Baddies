
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RabidSquirrel extends Squirrel{
  public void setAction(String action){
    super.squirrelAction(action);
  }
  public String toString(){
    return getAction();
  }
}

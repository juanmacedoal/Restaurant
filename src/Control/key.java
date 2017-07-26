/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author LOMAC
 */
public class key implements KeyListener{
      
    @Override
    public void keyPressed(KeyEvent e) {
     if(e.getKeyCode()==KeyEvent.VK_ENTER){
         Robot Tecla = null;
         try {
          Tecla = new Robot();
         } catch (AWTException e1) {
             e1.printStackTrace();
           }
         Tecla.keyPress(KeyEvent.VK_TAB);
     }
}
   public void keyReleased(KeyEvent arg0) {}
   public void keyTyped(KeyEvent arg0) {}

}
    


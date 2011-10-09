/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Launch;


import Vista.Principal;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;

/**
 *
 * @author Ivan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        Principal Ot = new Principal();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        //presentation.launch();
    }

}

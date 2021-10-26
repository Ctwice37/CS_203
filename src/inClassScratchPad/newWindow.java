/*
 * Created by JFormDesigner on Mon Oct 25 13:58:54 CDT 2021
 */

package inClassScratchPad;

import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author unknown
 */
public class newWindow extends JFrame {
    public newWindow() {
        initComponents();
    }

    private void thisMouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown

        //======== this ========
        setTitle("New Window");
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                thisMouseClicked(e);
            }
        });
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3,align center center",
            // columns
            "[]",
            // rows
            "[]"));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}

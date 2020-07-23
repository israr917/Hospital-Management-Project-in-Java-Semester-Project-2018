/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcenter;

import java.awt.FlowLayout;
import javax.swing.JFrame;

/**
 *
 * @author Moiz Ahmad
 */
class MedicalDoctor  extends Doctors{
        
public void createDoctorGUI(){
JFrame f1 = new JFrame("Doctor Frame!");
f1.setLayout(new FlowLayout());
f1.setSize(600,600);
f1.setVisible(true);
f1.setDefaultCloseOperation(f1.DISPOSE_ON_CLOSE);

}
public void prescribeMedicine(){}
public void suggestBloodTest(){}
public void suggestXray(){}
}

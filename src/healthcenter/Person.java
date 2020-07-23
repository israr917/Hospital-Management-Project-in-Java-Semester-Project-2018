/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcenter;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Moiz Ahmad
 */
public abstract class Person{
protected JLabel NameLabel;// name
protected JTextField NameField;
protected JLabel GenderLabel;
protected JComboBox GenderField;
protected JLabel AddressLabel;
protected JTextArea AddressField;
protected JLabel IdLabel;
protected JTextField IdField;
protected JLabel AgeLabel;
protected JTextField AgeField;
// setter() and getters();
public void setPerson(String Name,String Gender,String Address,int Id){

}
void showPerson(String Name){

}

}

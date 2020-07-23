/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcenter;
import java.io.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Moiz Ahmad
 */
class Example extends Thread{

    public void run(){
    
        try{
            for(int i=0;i<10;i++){
                System.out.println(i);
                Thread.sleep(2000);
            }
        }
        catch(Exception e){
        }
    }
}
public class Patient extends Person{
protected int RegistrationFee;
protected int DoctorFee;
protected int MedicineFee;
JFrame PatientGUI;
JFrame PatientReport;
JButton PatientButton;
JLabel FatherNameLabel;
JLabel ContactNoLabel;
JLabel EmailIdLabel;
JLabel BloodGroupLabel;
JLabel InformationLabel;
JTextField FatherNameField;
JTextField ContactNoField;
JTextField EmailIdField;
JComboBox BloodGroupField;
JTextArea InformationField,RemarksField;
JLabel PatientTypeLabel;
JComboBox PatientTypeField;
JButton Admit,CalculateBill,GetData,ReportOK,ReportPrint,ShowAll;
JLabel DiseaseLabel,AdmitDateLabel,
       RoomNoLabel,DoctorIdLabel,DoctorNameLabel,
       RemarksLabel,DateFormatLabel;

JTextField DiseaseField,AdmitDateField,RoomNoField,
           DoctorIdField,DoctorNameField;
String BloodGroup[]={"A+","A-","AB+","AB-","O+","O-"};
String patienttype[]={"Free Patient","Entitle Patient","Private Patient"};
public void calculateBill(){
}
public void createPatientGUI(JButton PatientButton){
    PatientGUI = new JFrame("Patient GUI");
    PatientGUI.setLayout(null);
    PatientGUI.setSize(900,600);
    PatientGUI.setVisible(true);
    PatientGUI.setDefaultCloseOperation(PatientGUI.DISPOSE_ON_CLOSE);
    PatientGUI.getContentPane().setBackground(Color.darkGray);
    this.PatientButton = PatientButton;
    this.IdLabel = new JLabel("Patient ID:");
    this.IdField = new JTextField();
    this.NameLabel = new JLabel("Patient Name:");
    this.NameField = new JTextField();
    this.GenderLabel = new JLabel("Gender:");
    this.AddressLabel = new JLabel("Address:");
    this.AddressField = new JTextArea(20,20);
    this.FatherNameLabel = new JLabel("Father Name:");
    this.FatherNameField = new JTextField();
    this.ContactNoLabel = new JLabel("Contact No:");
    this.ContactNoField = new JTextField();
    this.EmailIdLabel = new JLabel("Email ID:");
    this.EmailIdField = new JTextField();
    this.AgeLabel = new JLabel("Age:");
    this.AgeField = new JTextField();
    this.PatientTypeLabel = new JLabel("Patient Type:");
    this.PatientTypeField = new JComboBox(patienttype);
    this.GenderLabel = new JLabel("Gender:");
    this.GenderField = new JComboBox();
    GenderField.addItem("Male");
    GenderField.addItem("Female");
    this.InformationLabel = new JLabel("Information:");
    this.InformationField = new JTextArea(20,20);
    this.Admit = new JButton("Admit Patient");
    this.CalculateBill = new JButton("Calculate Bill");
    this.GetData = new JButton("Get Report");
    IdLabel.setBounds(30,30,80,40);
    NameLabel.setBounds(30,60,120,40);
    FatherNameLabel.setBounds(30,90,120,40);
    PatientTypeLabel.setBounds(30,120,120,40);
    AddressLabel.setBounds(30,120+40,80,40);
    ContactNoLabel.setBounds(30,150+90,80,40);
    EmailIdLabel.setBounds(30,180+90,80,40);
    AgeLabel.setBounds(30,210+90,80,40);
    GenderLabel.setBounds(30,240+90,80,40);
    InformationLabel.setBounds(30,300+90,80,40);
    
    IdField.setBounds(150,41,70,20);
    NameField.setBounds(150,71,150,20);
    FatherNameField.setBounds(150,101,150,20);
    PatientTypeField.setBounds(150,131,100,20);
    AddressField.setBounds(150,131+30,150,70);
    ContactNoField.setBounds(150,161+90,150,20);
    EmailIdField.setBounds(150,191+90,150,20);
    AgeField.setBounds(150,221+90,70,20);
    GenderField.setBounds(150,251+90,100,20);
   
    InformationField.setBounds(150,311+90,150,70);
    Admit.setBounds(700,100,120,30);
    CalculateBill.setBounds(700,140,120,30);
    GetData.setBounds(700,180,120,30);
    
    BloodGroupLabel = new JLabel("Patient Blood Group:");
    DiseaseLabel = new JLabel("Disease");
    AdmitDateLabel = new JLabel("Admission Date");
    RoomNoLabel = new JLabel("Room No");
    DoctorIdLabel = new JLabel("Doctor ID");
    DoctorNameLabel = new JLabel("Doctor Name");
    RemarksLabel = new JLabel("Remarks");
    DateFormatLabel = new JLabel("DD/MM/YYYY");
    BloodGroupField = new JComboBox(BloodGroup);
    RemarksField = new JTextArea();
    DiseaseField = new JTextField();
    AdmitDateField = new JTextField();
    RoomNoField = new JTextField();
    DoctorIdField = new JTextField();
    DoctorNameField = new JTextField();
    
    BloodGroupLabel.setBounds(340,40,160,20);
    DiseaseLabel.setBounds(340,70,130,20);
    AdmitDateLabel.setBounds(340,100,130,20);
    RoomNoLabel.setBounds(340,130,130,20);
    DoctorIdLabel.setBounds(340,160,130,20);
    DoctorNameLabel.setBounds(340,190,130,20);
    RemarksLabel.setBounds(340,220,130,20);
            
    BloodGroupField.setBounds(510,41,70,20);
    DiseaseField.setBounds(510,71,150,20);
    AdmitDateField.setBounds(510,101,150,20);
    DateFormatLabel.setBounds(510,131,120,20);
    RoomNoField.setBounds(510,131,150,20);
    DoctorIdField.setBounds(510,161,70,20);
    DoctorNameField.setBounds(510,191,150,20);
    RemarksField.setBounds(510,221,150,70);
    
    
    
    IdLabel.setForeground(Color.lightGray);
    NameLabel.setForeground(Color.lightGray);
    NameLabel.setForeground(Color.lightGray);
    FatherNameLabel.setForeground(Color.lightGray);
    PatientTypeLabel.setForeground(Color.lightGray);
    AddressLabel.setForeground(Color.lightGray);
    ContactNoLabel.setForeground(Color.lightGray);
    EmailIdLabel.setForeground(Color.lightGray);
    AgeLabel.setForeground(Color.lightGray);
    GenderLabel.setForeground(Color.lightGray);
    InformationLabel.setForeground(Color.lightGray);
    BloodGroupLabel.setForeground(Color.lightGray);
    DiseaseLabel.setForeground(Color.lightGray);
    AdmitDateLabel.setForeground(Color.lightGray);
    RoomNoLabel.setForeground(Color.lightGray);
    DoctorIdLabel.setForeground(Color.lightGray);
    DoctorNameLabel.setForeground(Color.lightGray);
    RemarksLabel.setForeground(Color.lightGray);
    Admit.setBackground(Color.darkGray);
    CalculateBill.setBackground(Color.darkGray);
    GetData.setBackground(Color.darkGray);
    Admit.setForeground(Color.white);
    CalculateBill.setForeground(Color.white);
    GetData.setForeground(Color.white);
    
    // setting up font here //
    IdLabel.setFont(new Font("Arial",Font.PLAIN,15));
    NameLabel.setFont(new Font("Arial",Font.PLAIN,15));
    FatherNameLabel.setFont(new Font("Arial",Font.PLAIN,15));
    PatientTypeLabel.setFont(new Font("Arial",Font.PLAIN,15));
    AddressLabel.setFont(new Font("Arial",Font.PLAIN,15));
    EmailIdLabel.setFont(new Font("Arial",Font.PLAIN,15));
    ContactNoLabel.setFont(new Font("Arial",Font.PLAIN,15));
    AgeLabel.setFont(new Font("Arial",Font.PLAIN,15));
    GenderLabel.setFont(new Font("Arial",Font.PLAIN,15));
    InformationLabel.setFont(new Font("Arial",Font.PLAIN,15));
    BloodGroupLabel.setFont(new Font("Arial",Font.PLAIN,15));
    DiseaseLabel.setFont(new Font("Arial",Font.PLAIN,15));
    AdmitDateLabel.setFont(new Font("Arial",Font.PLAIN,15));
    RoomNoLabel.setFont(new Font("Arial",Font.PLAIN,15));
    DoctorIdLabel.setFont(new Font("Arial",Font.PLAIN,15));
    DoctorNameLabel.setFont(new Font("Arial",Font.PLAIN,15));
    RemarksLabel.setFont(new Font("Arial",Font.PLAIN,15));
    
    
    PatientGUI.add(IdLabel);
    PatientGUI.add(NameLabel);
    PatientGUI.add(FatherNameLabel);
    PatientGUI.add(PatientTypeLabel);
    PatientGUI.add(AddressLabel);
    PatientGUI.add(ContactNoLabel);
    PatientGUI.add(EmailIdLabel);
    PatientGUI.add(AgeLabel);
    PatientGUI.add(GenderLabel);
    
    PatientGUI.add(InformationLabel);
    PatientGUI.add(IdField);
    PatientGUI.add(NameField);
    PatientGUI.add(FatherNameField);
    PatientGUI.add(PatientTypeField);
    PatientGUI.add(AddressField);
    PatientGUI.add(ContactNoField);
    PatientGUI.add(EmailIdField);
    PatientGUI.add(AgeField);
    PatientGUI.add(GenderField);
    PatientGUI.add(InformationField);
    PatientGUI.add(Admit);
    PatientGUI.add(CalculateBill);
    PatientGUI.add(GetData);
    PatientGUI.add(BloodGroupLabel);
    PatientGUI.add(BloodGroupField);
    PatientGUI.add(DiseaseLabel);
    PatientGUI.add(DiseaseField);
    PatientGUI.add(AdmitDateLabel);
    PatientGUI.add(AdmitDateField);
    PatientGUI.add(RoomNoLabel);
    PatientGUI.add(RoomNoField);
    PatientGUI.add(DoctorIdLabel);
    PatientGUI.add(DoctorIdField);
    PatientGUI.add(DoctorNameLabel);
    PatientGUI.add(DoctorNameField);
    PatientGUI.add(RemarksLabel);
    PatientGUI.add(RemarksField);
    ShowAll = new JButton("ShowAll");
    ShowAll.setBounds(700,220,120,30);
    ShowAll.addActionListener(new AdmitClass());
    PatientGUI.add(ShowAll);
    
    PatientGUI.addWindowListener(new MyWindowListener());
    Admit.addActionListener(new AdmitClass());
    CalculateBill.addActionListener(new AdmitClass());
    GetData.addActionListener(new AdmitClass());
    ShowAll.addActionListener(new AdmitClass());
}


public void getPatientDetails(){
String PatientId;
PatientId= JOptionPane.showInputDialog("Please Enter Patient ID: ");
try{
if(PatientId.equals(""))
return;
String Query = "Select * from patient where patient_id = "+PatientId+"";
Class.forName("java.sql.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://"
        + "localhost:3306/hospital","root","");
Statement st = con.createStatement();
ResultSet rs = st.executeQuery(Query);
rs.next();
if(!rs.getString(1).equals(PatientId))
return;
JButton Print;
JButton OK;
    PatientReport = new JFrame("Patient Report Card");
    PatientReport.setLayout(null);
    PatientReport.setSize(900,600);
    PatientReport.setVisible(true);
    PatientReport.getContentPane().setBackground(Color.darkGray);
   
    
    
    this.IdLabel = new JLabel("Patient ID:");
    this.IdField = new JTextField();
    this.NameLabel = new JLabel("Patient Name:");
    this.NameField = new JTextField();
    this.GenderLabel = new JLabel("Gender:");
    this.AddressLabel = new JLabel("Address:");
    this.AddressField = new JTextArea(20,20);
    this.FatherNameLabel = new JLabel("Father Name:");
    this.FatherNameField = new JTextField();
    this.ContactNoLabel = new JLabel("Contact No:");
    this.ContactNoField = new JTextField();
    this.EmailIdLabel = new JLabel("Email ID:");
    this.EmailIdField = new JTextField();
    this.AgeLabel = new JLabel("Age:");
    
    this.AgeField = new JTextField();
    this.PatientTypeLabel = new JLabel("Patient Type:");
    this.PatientTypeField = new JComboBox(patienttype);
    this.GenderLabel = new JLabel("Gender:");
    this.GenderField = new JComboBox();
    GenderField.addItem("Male");
    GenderField.addItem("Female");
    this.InformationLabel = new JLabel("Information:");
    this.InformationField = new JTextArea(20,20);
    
    IdLabel.setBounds(30,30,80,40);
    NameLabel.setBounds(30,60,120,40);
    FatherNameLabel.setBounds(30,90,120,40);
    PatientTypeLabel.setBounds(30,120,120,40);
    AddressLabel.setBounds(30,120+40,80,40);
    ContactNoLabel.setBounds(30,150+90,80,40);
    EmailIdLabel.setBounds(30,180+90,80,40);
    AgeLabel.setBounds(30,210+90,80,40);
    GenderLabel.setBounds(30,240+90,80,40);
    InformationLabel.setBounds(30,300+90,80,40);
    
    IdField.setBounds(150,41,70,20);
    NameField.setBounds(150,71,150,20);
    FatherNameField.setBounds(150,101,150,20);
    PatientTypeField.setBounds(150,131,100,20);
    AddressField.setBounds(150,131+30,150,70);
    ContactNoField.setBounds(150,161+90,150,20);
    EmailIdField.setBounds(150,191+90,150,20);
    AgeField.setBounds(150,221+90,70,20);
    GenderField.setBounds(150,251+90,100,20);
   
    InformationField.setBounds(150,311+90,150,70);
    
    
   
    BloodGroupLabel = new JLabel("Patient Blood Group:");
    DiseaseLabel = new JLabel("Disease");
    AdmitDateLabel = new JLabel("Admission Date");
    RoomNoLabel = new JLabel("Room No");
    DoctorIdLabel = new JLabel("Doctor ID");
    DoctorNameLabel = new JLabel("Doctor Name");
    RemarksLabel = new JLabel("Remarks");
    DateFormatLabel = new JLabel("DD/MM/YYYY");
    BloodGroupField = new JComboBox(BloodGroup);
    RemarksField = new JTextArea();
    DiseaseField = new JTextField();
    AdmitDateField = new JTextField();
    RoomNoField = new JTextField();
    DoctorIdField = new JTextField();
    DoctorNameField = new JTextField();
    
    BloodGroupLabel.setBounds(340,40,160,20);
    DiseaseLabel.setBounds(340,70,130,20);
    AdmitDateLabel.setBounds(340,100,130,20);
    RoomNoLabel.setBounds(340,130,130,20);
    DoctorIdLabel.setBounds(340,160,130,20);
    DoctorNameLabel.setBounds(340,190,130,20);
    RemarksLabel.setBounds(340,220,130,20);
            
    BloodGroupField.setBounds(510,41,70,20);
    DiseaseField.setBounds(510,71,150,20);
    AdmitDateField.setBounds(510,101,150,20);
    DateFormatLabel.setBounds(510,131,120,20);
    RoomNoField.setBounds(510,131,150,20);
    DoctorIdField.setBounds(510,161,70,20);
    DoctorNameField.setBounds(510,191,150,20);
    RemarksField.setBounds(510,221,150,70);
    
    
    
    IdLabel.setForeground(Color.lightGray);
    NameLabel.setForeground(Color.lightGray);
    NameLabel.setForeground(Color.lightGray);
    FatherNameLabel.setForeground(Color.lightGray);
    PatientTypeLabel.setForeground(Color.lightGray);
    AddressLabel.setForeground(Color.lightGray);
    ContactNoLabel.setForeground(Color.lightGray);
    EmailIdLabel.setForeground(Color.lightGray);
    AgeLabel.setForeground(Color.lightGray);
    GenderLabel.setForeground(Color.lightGray);
    InformationLabel.setForeground(Color.lightGray);
    BloodGroupLabel.setForeground(Color.lightGray);
    DiseaseLabel.setForeground(Color.lightGray);
    AdmitDateLabel.setForeground(Color.lightGray);
    RoomNoLabel.setForeground(Color.lightGray);
    DoctorIdLabel.setForeground(Color.lightGray);
    DoctorNameLabel.setForeground(Color.lightGray);
    RemarksLabel.setForeground(Color.lightGray);
    
    
    // setting up font here //
    IdLabel.setFont(new Font("Arial",Font.PLAIN,15));
    NameLabel.setFont(new Font("Arial",Font.PLAIN,15));
    FatherNameLabel.setFont(new Font("Arial",Font.PLAIN,15));
    PatientTypeLabel.setFont(new Font("Arial",Font.PLAIN,15));
    AddressLabel.setFont(new Font("Arial",Font.PLAIN,15));
    EmailIdLabel.setFont(new Font("Arial",Font.PLAIN,15));
    ContactNoLabel.setFont(new Font("Arial",Font.PLAIN,15));
    AgeLabel.setFont(new Font("Arial",Font.PLAIN,15));
    GenderLabel.setFont(new Font("Arial",Font.PLAIN,15));
    InformationLabel.setFont(new Font("Arial",Font.PLAIN,15));
    BloodGroupLabel.setFont(new Font("Arial",Font.PLAIN,15));
    DiseaseLabel.setFont(new Font("Arial",Font.PLAIN,15));
    AdmitDateLabel.setFont(new Font("Arial",Font.PLAIN,15));
    RoomNoLabel.setFont(new Font("Arial",Font.PLAIN,15));
    DoctorIdLabel.setFont(new Font("Arial",Font.PLAIN,15));
    DoctorNameLabel.setFont(new Font("Arial",Font.PLAIN,15));
    RemarksLabel.setFont(new Font("Arial",Font.PLAIN,15));
    
    
    PatientReport.add(IdLabel);
    PatientReport.add(NameLabel);
    PatientReport.add(FatherNameLabel);
    PatientReport.add(PatientTypeLabel);
    PatientReport.add(AddressLabel);
    PatientReport.add(ContactNoLabel);
    PatientReport.add(EmailIdLabel);
    PatientReport.add(AgeLabel);
    PatientReport.add(GenderLabel);
    
    PatientReport.add(InformationLabel);
    PatientReport.add(IdField);
    PatientReport.add(NameField);
    PatientReport.add(FatherNameField);
    PatientReport.add(PatientTypeField);
    PatientReport.add(AddressField);
    PatientReport.add(ContactNoField);
    PatientReport.add(EmailIdField);
    PatientReport.add(AgeField);
    PatientReport.add(GenderField);
    PatientReport.add(InformationField);
    
    PatientReport.add(BloodGroupLabel);
    PatientReport.add(BloodGroupField);
    PatientReport.add(DiseaseLabel);
    PatientReport.add(DiseaseField);
    PatientReport.add(AdmitDateLabel);
    PatientReport.add(AdmitDateField);
    PatientReport.add(RoomNoLabel);
    PatientReport.add(RoomNoField);
    PatientReport.add(DoctorIdLabel);
    PatientReport.add(DoctorIdField);
    PatientReport.add(DoctorNameLabel);
    PatientReport.add(DoctorNameField);
    PatientReport.add(RemarksLabel);
    PatientReport.add(RemarksField);
    ReportPrint  = new JButton("Print");
    ReportOK = new JButton("OK");
   
    ReportPrint.setBounds(600,500,100,40);
    ReportOK.setBounds(720,500,100,40);
    ReportPrint.setBackground(Color.darkGray);
    ReportPrint.setForeground(Color.lightGray);
    ReportOK.setBackground(Color.darkGray);
    ReportOK.setForeground(Color.lightGray);
    //ReportOK.addActionListener(new MyClass());
    //ReportPrint.addActionListener(new MyClass());
    PatientReport.add(ReportPrint);
    PatientReport.add(ReportOK);
    
    
    IdField.setText(rs.getString(1));
    IdField.setEnabled(false);
    IdField.setDisabledTextColor(Color.black);
    
    NameField.setText(rs.getString(2));
    NameField.setEnabled(false);
    NameField.setDisabledTextColor(Color.black);
    
    FatherNameField.setText(rs.getString(3));
    FatherNameField.setEnabled(false);
    FatherNameField.setDisabledTextColor(Color.black);
    
    
    
    PatientTypeField.setSelectedItem(rs.getString(4));
    PatientTypeField.setEnabled(false);
    
    
    AddressField.setText(rs.getString(5));
    AddressField.setEnabled(false);
    AddressField.setDisabledTextColor(Color.black);
    
    
    ContactNoField.setText(rs.getString(6));
    ContactNoField.setEnabled(false);
    ContactNoField.setDisabledTextColor(Color.black);
    
    EmailIdField.setText(rs.getString(7));
    EmailIdField.setEnabled(false);
    EmailIdField.setDisabledTextColor(Color.black);
    
    
    AgeField.setText(rs.getString(8));
    AgeField.setEnabled(false);
    AgeField.setDisabledTextColor(Color.black);
    
    GenderField.setSelectedItem(rs.getString(9));
    GenderField.setEnabled(false);
    
    
    
    InformationField.setText(rs.getString(10));
    InformationField.setEnabled(false);
    InformationField.setDisabledTextColor(Color.black);
    
    BloodGroupField.setSelectedItem(rs.getString(11));
    BloodGroupField.setEnabled(false);
    
    
    DiseaseField.setText(rs.getString(12));
    DiseaseField.setEnabled(false);
    DiseaseField.setDisabledTextColor(Color.black);
    
    
    AdmitDateField.setText(rs.getString(13));
    AdmitDateField.setEnabled(false);
    AdmitDateField.setDisabledTextColor(Color.black);
    
    
    RoomNoField.setText(rs.getString(14));
    RoomNoField.setEnabled(false);
    RoomNoField.setDisabledTextColor(Color.black);
    
    DoctorIdField.setText(rs.getString(15));
    DoctorIdField.setEnabled(false);
    DoctorIdField.setDisabledTextColor(Color.black);
    
    DoctorNameField.setText(rs.getString(16));
    DoctorNameField.setEnabled(false);
    DoctorNameField.setDisabledTextColor(Color.black);
    
    RemarksField.setText(rs.getString(17));
    RemarksField.setEnabled(false);
    RemarksField.setDisabledTextColor(Color.black);
    
    
    con.close();
}
catch(Exception e){
if(e.getCause()==null){ 
JOptionPane.showMessageDialog(null,"No Record Selected! ");
}

}


}


public boolean isEmptyFields(){
   
if(IdField.getText().length() == 0 ||
   NameField.getText().length()==0 ||
   FatherNameField.getText().length()==0 ||
   AddressField.getText().length()==0 ||
   ContactNoField.getText().length() == 0 ||
   EmailIdField.getText().length() == 0 ||
   AgeField.getText().length() ==0 ||
   InformationField.getText().length()==0)
{
       return true;
}
else{
    return false;
}

       
    
    
}
class MyWindowListener extends WindowAdapter{

        

        
        public void windowClosing(WindowEvent e) {
           
            PatientButton.setEnabled(true);
            
            
        }



}

class AdmitClass implements ActionListener{

    public void actionPerformed(ActionEvent e){
    if(e.getSource() == Admit){
        
     try{ 
     FileWriter f1 = new FileWriter("E:\\New\\test.txt");   
     BufferedWriter f2 = new BufferedWriter(f1);
     String result = IdField.getText()+NameField.getText()+FatherNameField.getText();
     f2.write(result);
     f2.newLine();
     f2.close();
     }catch(Exception ee){
           System.out.println(ee);
       }
    if(isEmptyFields()){
    JOptionPane.showMessageDialog(null,"Please Fill All The Fields! ");
    }
    else{
    // storing record in files //
    try{
    
        
    Class.forName("java.sql.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
    String query = " insert into patient(patient_id, patient_name,"
            + "father_name,patient_type,address,"
            + "contact_no,email_id,age,gender,information,blood_group,"
            + "disease,admission_date,room_no,doctor_id,doctor_name,remarks)"
        + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, "
            + "?, ?, ?, ?, ?, ?, ?, ?)";

      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = conn.prepareStatement(query);
      preparedStmt.setString(1,IdField.getText());
      preparedStmt.setString(2,NameField.getText());
      preparedStmt.setString(3,FatherNameField.getText());
      preparedStmt.setString(4,PatientTypeField.getSelectedItem().toString());
      preparedStmt.setString(5,AddressField.getText());
      preparedStmt.setString(6,ContactNoField.getText());
      preparedStmt.setString(7,EmailIdField.getText());
      preparedStmt.setString(8,AgeField.getText());
      preparedStmt.setString(9,GenderField.getSelectedItem().toString());
      preparedStmt.setString(10,InformationField.getText());
      preparedStmt.setString(11,BloodGroupField.getSelectedItem().toString());
      preparedStmt.setString(12,DiseaseField.getText());
      preparedStmt.setString(13,AdmitDateField.getText());
      preparedStmt.setString(14,RoomNoField.getText());
      preparedStmt.setString(15,DoctorIdField.getText());
      preparedStmt.setString(16,DoctorNameField.getText());
      preparedStmt.setString(17,RemarksField.getText());
      // execute the preparedstatement
      preparedStmt.execute();
      JOptionPane.showMessageDialog(null,"Record Stored Successfully! ");     
    }
    catch (Exception updateException)
    {
      JOptionPane.showMessageDialog(null,"Got an exception!"+updateException);
      System.err.println(updateException.getMessage());
    }
    
    
    
    
    }

    }
  
    else if(e.getSource() == CalculateBill){
        
    String PatientId =  JOptionPane.showInputDialog("Enter Patient ID:");
    
try{
if(PatientId.equals(""))
return;
String Query = "Select * from patient where patient_id = "+PatientId+"";
Class.forName("java.sql.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://"
        + "localhost:3306/hospital","root","");
Statement st = con.createStatement();
ResultSet rs = st.executeQuery(Query);
if(!rs.next()){
    JOptionPane.showMessageDialog(null,"No Record Found! ");
    return;
}
if(rs.getString(4).equals("Private Patient")){
JOptionPane.showMessageDialog(null,"Patient ID: "+rs.getString(1)+"\n"
        + "Patient Name: "+rs.getString(2)+"\n"
        + "Patient Father Name: "+rs.getString(3)+"\n"
        + "Total Charges = 500 ");
}
else if(rs.getString(4).equals("Free Patient")){
JOptionPane.showMessageDialog(null,"Patient ID: "+rs.getString(1)+"\n"
        + "Patient Name: "+rs.getString(2)+"\n"
        + "Patient Father Name: "+rs.getString(3)+"\n"
        + "Total Charges = 0 ");
}
else{
JOptionPane.showMessageDialog(null,"Patient ID: "+rs.getString(1)+"\n"
        + "Patient Name: "+rs.getString(2)+"\n"
        + "Patient Father Name: "+rs.getString(3)+"\n"
        + "Total Charges = 200 ");
}
    
}
catch(Exception CalculateBill){
if(CalculateBill.getCause()==null){ 
JOptionPane.showMessageDialog(null,"No Patient Selected! ");
}
    
    
    // close
}

    } 
    else if(e.getSource() == GetData){
    new Patient().getPatientDetails();
    }
    else if(e.getSource() == ShowAll){
        
        Example e1 = new Example();
        e1.start();
        
    }
    
    
    } 
    
} // end of admit class 

} // patient class end here.


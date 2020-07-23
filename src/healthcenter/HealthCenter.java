package healthcenter;
import java.awt.*;
import java.awt.event.*;
import javafx.scene.layout.Border;
import javax.swing.*;
import javax.swing.event.*;
import java.sql.*;
import javax.swing.UIManager.*;
public class HealthCenter{

JFrame MainFrame;
public JButton PatientButton;
JButton DoctorButton;
JButton NurseButton;
JButton LabTechnicanButton;
JButton ReceptionistButton;
JButton PharmacistButton;
JButton RadiologistButton;
JButton AboutButton;
JButton ExitButton;
JButton ContactButton;
JLabel WelcomeMessage;
JLabel FooterMessage;
public HealthCenter(){
    MainFrame = new JFrame("HealthCare");
    MainFrame.getContentPane().setBackground(Color.darkGray);
    WelcomeMessage = new JLabel("Welcome to CureLink Health Care! ");
    WelcomeMessage.setForeground(Color.white);
    FooterMessage = new JLabel("Design and Developed by Israr Afridi");
    FooterMessage.setForeground(Color.white);
    PatientButton = new JButton("Patient");
    DoctorButton = new JButton("Doctor");
    NurseButton = new JButton("Nurse");
    LabTechnicanButton = new JButton("Technican");
    ReceptionistButton = new JButton("Receptionist");
    PharmacistButton = new JButton("Pharmacist");
    RadiologistButton = new JButton("Radiologist");
    AboutButton = new JButton("About");
    ContactButton = new JButton("Contact");
    // setting up buttons color //
    PatientButton.setBackground(Color.darkGray);
    PatientButton.setForeground(Color.lightGray);
    DoctorButton.setBackground(Color.darkGray);
    DoctorButton.setForeground(Color.lightGray);
    NurseButton.setBackground(Color.darkGray);
    NurseButton.setForeground(Color.lightGray);
    RadiologistButton.setBackground(Color.darkGray);
    RadiologistButton.setForeground(Color.lightGray);
    PharmacistButton.setBackground(Color.darkGray);
    PharmacistButton.setForeground(Color.lightGray);
    LabTechnicanButton.setBackground(Color.darkGray);
    LabTechnicanButton.setForeground(Color.lightGray);
    AboutButton.setBackground(Color.darkGray);
    AboutButton.setForeground(Color.lightGray);
    ContactButton.setBackground(Color.darkGray);
    ContactButton.setForeground(Color.lightGray);
    WelcomeMessage.setForeground(Color.lightGray);
    FooterMessage.setForeground(Color.lightGray);
   
    PatientButton.setFont(new Font("Sans Serif",Font.PLAIN,14));
    DoctorButton.setFont(new Font("Sans Serif",Font.PLAIN,14));
    NurseButton.setFont(new Font("Sans Serif",Font.PLAIN,14));
    PharmacistButton.setFont(new Font("Sans Serif",Font.PLAIN,14));
    RadiologistButton.setFont(new Font("Sans Serif",Font.PLAIN,14));
    LabTechnicanButton.setFont(new Font("Sans Serif",Font.PLAIN,14));
    AboutButton.setFont(new Font("Sans Serif",Font.PLAIN,14));
    ContactButton.setFont(new Font("Sans Serif",Font.PLAIN,14));
    
    ExitButton = new JButton("Exit");
    WelcomeMessage.setBounds(80,20,600,40);
    FooterMessage.setBounds(200,530,350,30);
    WelcomeMessage.setFont(new Font("Arial",Font.BOLD,30));
    PatientButton.setBounds(100,170,120,50);
    DoctorButton.setBounds(250,170,120,50);
    NurseButton.setBounds(400,170,120,50);
    PharmacistButton.setBounds(100,250,120,50);
    LabTechnicanButton.setBounds(250,250,120,50);
    RadiologistButton.setBounds(400,250,120,50);
    AboutButton.setBounds(470,500,90,30);
    ContactButton.setBounds(570,500,90,30);
    
    
    
    
    MainFrame.add(WelcomeMessage);       
    MainFrame.add(FooterMessage);
    MainFrame.add(PatientButton);
    MainFrame.add(NurseButton);
    MainFrame.add(DoctorButton);
    MainFrame.add(PharmacistButton);
    MainFrame.add(LabTechnicanButton);
    MainFrame.add(RadiologistButton);
    MainFrame.add(AboutButton);
    MainFrame.add(ContactButton);
    MainFrame.setSize(700,600);
    MainFrame.setLayout(null);
    // registering for event functions //
    PatientButton.addActionListener(new MyActionListener());
    PatientButton.addMouseListener(new MyMouseListener());    
    DoctorButton.addActionListener(new MyActionListener());
    AboutButton.addActionListener( new MyActionListener());
    NurseButton.addActionListener(new MyActionListener());
    PharmacistButton.addActionListener(new MyActionListener());
    LabTechnicanButton.addActionListener(new MyActionListener());
    RadiologistButton.addActionListener(new MyActionListener());
    MainFrame.setDefaultCloseOperation(this.MainFrame.EXIT_ON_CLOSE);
    MainFrame.setVisible(true);
    
}

public static void main(String[] args) {
new HealthCenter();
}

class MyMouseListener extends MouseAdapter{

public void mouseEntered(MouseEvent e) {
}

      
        public void mouseExited(MouseEvent e) {
           
        }

}




class MyActionListener implements ActionListener{

      
public void actionPerformed(ActionEvent e) {
    if(e.getSource()==PatientButton){
        Patient p1 = new Patient();
        PatientButton.setEnabled(false);
        p1.createPatientGUI(PatientButton);
        
    }        
    else if(e.getSource() == DoctorButton){
       DoctorFrame d1;
 d1 = new DoctorFrame();
 d1.setVisible(true);
 d1.getContentPane().setBackground(Color.DARK_GRAY);
    //MedicalDoctor d1 = new MedicalDoctor();
    //d1.createDoctorGUI();
    }
    else if(e.getSource() == NurseButton){
     NurseFrame nf1 = new NurseFrame();
     nf1.getContentPane().setBackground(Color.DARK_GRAY);
     nf1.setVisible(true);
    }
    else if(e.getSource() == LabTechnicanButton){
        LabTechnicanFrame f1 = new LabTechnicanFrame();
        f1.setVisible(true);
        f1.getContentPane().setBackground(Color.DARK_GRAY);
        
        
    
    }
    else if(e.getSource()== PharmacistButton){
        PharmacistFarm mf1 = new PharmacistFarm();
        mf1.setVisible(true);
        mf1.getContentPane().setBackground(Color.DARK_GRAY);
        
    }
    else if(e.getSource() == RadiologistButton){
    RadiologistFrame rf1 = new RadiologistFrame();
    rf1.setVisible(true);
    rf1.getContentPane().setBackground(Color.DARK_GRAY);
    }
    else if(e.getSource() == AboutButton){
       
        final JFrame frame = new JFrame("About Us");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        final JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        JTextArea textArea = new JTextArea(
                "Established in 2017, Cure Link Health Care Hospital Rawalpindi is a project of Abdul Waheed Trust, and is affiliated with Rawalpindi Medical College. For the past 30 years, Aadil Hospital has been privileged to serve the health care needs, and improve the quality of life, for the local community in Lahore. \n" +
"\n" +
"Aadil Hospital provides high-quality health services to patients from all socio-economic backgrounds. Our team of dedicated nurses and physicians have advanced skills in modern medicine. Aadil Hospital has state of the art electro-medical diagnostic and treatment equipment, as well as highly reputable Emergency Response Services. \n" +
"\n" +
"After decades in operation, Aadil Hospital is a prominent name in the local community, as well as among various multi-national corporations, known for meeting the health care needs of the entire community through incomparable patient-centered care.", 
                20, 
                40);
        textArea.setForeground(Color.lightGray);
        textArea.setFont(new Font("Arial", Font.PLAIN, 16));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setOpaque(false);
        textArea.setEditable(false);
        
        
        panel.add(textArea);
        
        frame.add(panel);
        
        frame.pack();
        frame.setVisible(true);
        
    }

}

}
    


}

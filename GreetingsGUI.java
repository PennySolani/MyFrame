
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class GreetingsGUI extends JFrame{
    
    //Panels
    private JPanel namePnl;
    private JPanel surNamePnl;
    private JPanel nameAndSurnamePnl;
    private JPanel greetingsAreaPnl;
    private JPanel btnsPnl;
    private JPanel mainPnl;
    private JPanel headingPnl;
    
    //Lables
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    
    //TextFields
    private JTextField nameTxtFld;
    private JTextField surnameTxtFld;
    
    //TextArea
    private JTextArea greetingsTxtArea;
    
    //Buttons
    public JButton greenBtn;
    public JButton clearBtn;
    public JButton exitBtn;
    
    //Default Constructor
    public GreetingsGUI()
    {
      //Configure GUI
        setLayout(new BorderLayout());
        setTitle("Greetings GUI");            //adapted
        setSize(500, 550);
        setBackground(Color.yellow);
        
      //create the panels
      namePnl = new JPanel(new FlowLayout());
      surNamePnl = new JPanel(new FlowLayout());
      
      nameAndSurnamePnl = new JPanel(new GridLayout(2,1));
      greetingsAreaPnl = new JPanel(new BorderLayout()); //replaced
      
      btnsPnl = new JPanel(new FlowLayout());
      mainPnl = new JPanel(new BorderLayout());
      
      headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
      headingPnl.setBorder(new BevelBorder(BevelBorder.RAISED));
      
      //create the labels
      headingLbl = new JLabel("Greetings App");
      nameLbl = new JLabel("Name: ");
      surnameLbl = new JLabel("Surname:");
      
      //create the fields
      nameTxtFld = new JTextField(20);
      surnameTxtFld = new JTextField(20);
      
      //create the text 
      greetingsTxtArea = new JTextArea(25, 40);
      greetingsTxtArea.setEditable(false);
      greetingsTxtArea.setText("Hello : [name] [surname] ");
      
      //create the button
      greenBtn = new JButton("Greet");
      clearBtn = new JButton("Clear");
      exitBtn = new JButton("Exit");
      
      //add name label textfield to the name panel
      namePnl.add(nameLbl);
      namePnl.add(nameTxtFld);
      
      //add surname label + textfields to surname panel
      surNamePnl.add(surnameLbl);
      surNamePnl.add(surnameTxtFld);
      
      //add name and surname pnl to the collective pnl
      nameAndSurnamePnl.add(namePnl); //cancel adding of panel
      nameAndSurnamePnl.add(surNamePnl); // add all 4 components here!
      
      //add the greetings area to its panel
      greetingsAreaPnl.add(greetingsTxtArea);
      greetingsAreaPnl.setBorder(new TitledBorder(new LineBorder(Color.yellow, 1)));
      
      //add buttons to their panel
      btnsPnl.add(greenBtn);
      btnsPnl.add(clearBtn);
      btnsPnl.add(exitBtn);
      
      headingPnl.add(headingLbl);
      
      //add all the panels to the main pnl
      mainPnl.add(nameAndSurnamePnl , BorderLayout.NORTH);
      mainPnl.add(greetingsAreaPnl , BorderLayout.CENTER);
      mainPnl.add(btnsPnl , BorderLayout.SOUTH);
      
      //add the main pnl to the frame's pnl
      add(headingPnl , BorderLayout.NORTH);
      add(mainPnl , BorderLayout.CENTER);
      
      //make the frame visible
      setVisible(true);
      
    }
}

package javaNanoSerenade;

import java.applet.*; 
import java.awt.event.*; 
 
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JTextField;
 
 
public class Ldc extends Applet implements ActionListener{ 
 
	public void init() 
    { 
    super.init(); 
    Box match1=Box.createHorizontalBox(); 
    BoutonClub bClub11=new BoutonClub("Glasgow Rangers"); 
    JTextField tClub11=new JTextField(String.valueOf(bClub11.getClickCount())); 
 
    BoutonClub bClub12=new BoutonClub("Inter Milão"); 
    JTextField tClub12=new JTextField(String.valueOf(bClub12.getClickCount())); 
 
    JLabel separateur=new JLabel(":"); 
 
    match1.add(bClub11); 
    match1.add(bClub12); 
    match1.add(tClub11); 
    match1.add(separateur); 
    match1.add(tClub12); 
    add(match1); 
    
    
    bClub11.addActionListener(this);
    bClub12.addActionListener(this);
 
    
    bClub11.associerJTextField(tClub11);
    bClub12.associerJTextField(tClub12);
    } 
 
 
  public void actionPerformed(ActionEvent e) 
     {      
      if(e.getSource() instanceof BoutonClub) // juste par sécurité 
        { 
         ((BoutonClub)e.getSource()).incClickCount(); 
         } 
      }
 
  }
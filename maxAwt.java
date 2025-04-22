import java.awt.*; 
import java.awt.event.*; 

class maxAwt extends Frame  
{ 
    TextField t1, t2, t3, t4; 
    Label la1, la2, la3, la4; 
    Button b1, b2; 
    
    maxAwt() 
    { 
        setTitle("Maximum of 3 Numbers");            
        t1 = new TextField(); t1.setBounds(100,45,145,20); 
        la1 = new Label("Enter 1st No:"); la1.setBounds(100,75,145,20); 

        t2 = new TextField(); t2.setBounds(100,145,145,20); 
        la2 = new Label("Enter 2nd No:"); la2.setBounds(100,110,145,20); 
        
        t3 = new TextField(); t3.setBounds(100, 200, 145, 20); 
        la3 = new Label("Enter 3rd NO:"); la3.setBounds(100,170, 145, 20); 
        
        t4 = new TextField(); la4 = new Label(""); t4.setBounds(100,240,135,20); 
        la4.setBounds(100,240,145,20); 
        
        b1 = new Button("Max"); b1.setBounds(105,278,70,40); 
        b2 = new Button("Exit"); b2.setBounds(195,278,70,40); 

        add(b1); add(b2); 
        add(la1); add(t1); 
        add(la2); add(t2); 
        add(la3); add(t3); 
        add(la4); add(t4); 
        
        setSize(400,400); 
        setVisible(true); 
        
        b1.addActionListener(new ActionListener() 
        { 
            public void actionPerformed(ActionEvent e)  
            { 
                int a = Integer.parseInt(t1.getText()); 
                int b = Integer.parseInt(t2.getText()); 
                int c = Integer.parseInt(t3.getText()); 

                if (a > b && a > c) 
                { 
                    la4.setText("MAXIMUM = " + String.valueOf(a)); 
                } 
                else if (b > c) 
                { 
                    la4.setText("MAXIMUM = " + String.valueOf(b)); 
                } 
                else 
                { 
                    la4.setText("MAXIMUM = " + String.valueOf(c)); 
                } 
            } 
        }); 
        
        b2.addActionListener(new ActionListener() 
        { 
            public void actionPerformed(ActionEvent e)  
            { 
                System.exit(0); 
            } 
        }); 
    } 
    
    public static void main(String[] args)  
    { 
        new maxAwt(); 
    } 
}
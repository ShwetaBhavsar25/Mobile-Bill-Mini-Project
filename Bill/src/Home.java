import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Home extends JFrame implements ActionListener {

  int count =1 ;
       int j=2;
    JButton jb1;
    JButton jb2;
      JButton jb3;
    JLabel l1;
    private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
     int i=0;

    Home() {

        l1 = new JLabel("Mobile Shop");
        l1.setBounds(10, 10, 500, 50);
        l1.setFont(new Font("Serif", Font.PLAIN, 26));

        add(l1);

        jb1 = new JButton("Home");
        jb1.setBounds(10, 80, 180, 30);
        add(jb1);

        jb2 = new JButton("Bill History");
        jb2.setBounds(200, 80, 180, 30);
        add(jb2);

        jb1.addActionListener(this);
        jb2.addActionListener(this);

	
		JLabel l1 = new JLabel("Enter Mobile Company Name : ");
		l1.setBounds(20, 140, 209, 14);
		add(l1);

     
     	t1 = new JTextField();
		t1.setBounds(20, 160, 200, 30);
		add(t1);
		t1.setColumns(10);


        JLabel l2 = new JLabel("Enter Mobile Model No : ");
		l2.setBounds(20, 200, 200, 14);
		add(l2);

     
     	t2 = new JTextField();
		t2.setBounds(20, 220, 200, 30);
		add(t2);
		t2.setColumns(10);


        JLabel l3 = new JLabel("Enter Battery Number");
		l3.setBounds(20, 260, 200, 14);
		add(l3);

     
     	t3 = new JTextField();
		t3.setBounds(20, 280, 200, 30);
		add(t3);
		t3.setColumns(10);


        JLabel l4 = new JLabel("Total Price");
		l4.setBounds(20, 320,200, 14);
		add(l4);

     
     	t4 = new JTextField();
		t4.setBounds(20, 340, 200, 30);
		add(t4);
		t4.setColumns(10);
    
        jb3 = new JButton("Submit");

        jb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mcompany=t1.getText();
				String model=t2.getText();
				String battery=t3.getText();
				String price=t4.getText();
				try
				{
				my_update obj=new my_update();
				obj.my_db_update(mcompany, model, battery, price);
				JOptionPane.showMessageDialog(jb3,"Bill is successfully submited.\n Thank you!");
				
				}
				catch(Exception ea){
				JOptionPane.showMessageDialog(jb3, "Sorry!");
				}
				}
		});

        jb3.setBounds(25, 390, 180, 30);
        add(jb3);
     
        setLayout(null);
        setSize(500, 600);
        setVisible(true);
    }


   


    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(jb2)) {
            this.dispose();
            BillHistory hh = new BillHistory();
            hh.setVisible(true);

        }
    }




    public static void main(String args[]) {
        Home t = new Home();

    }

   
}


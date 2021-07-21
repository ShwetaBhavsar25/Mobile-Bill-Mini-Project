import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class BillHistory extends JFrame implements ActionListener {

    JButton jb1;
    JButton jb2;
    JLabel l1;
  
	private javax.swing.JTable jt1;
    BillHistory() {

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

	
		JLabel l1 = new JLabel("Bill History");
		l1.setBounds(10, 120, 209, 30);
		add(l1);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 150, 450, 107);
        add(scrollPane);

        setLayout(null);
        setSize(500, 600);
        setVisible(true);

        my_mysql obj=new my_mysql();
        
        String[] column= {"ID","Company Name","Model","Battery No.","Price"};
        
        jt1 = new javax.swing.JTable(obj.my_db_select(),column);
        scrollPane.setViewportView(jt1);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(jb1)) {
            this.dispose();
            Home hh = new Home();
            hh.setVisible(true);

        }
    }




    public static void main(String args[]) {
        
	    EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
                    BillHistory bh = new BillHistory();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }

   
}


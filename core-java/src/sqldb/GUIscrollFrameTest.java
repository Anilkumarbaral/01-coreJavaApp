package sqldb;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUIscrollFrameTest extends JFrame implements ActionListener ,WindowListener{
	private static final String student_query = "select sno,sname,sadd,savg from student";
	JLabel lsno, lsname, lsaddrs, lsavg;
	JTextField tsno, tsname, tsadd, tsavg;
	JButton b1first, b2next, b3previous, b4last;
	private ResultSet rs;
	private PreparedStatement ps;
	private Connection con;

	GUIscrollFrameTest() {
		System.out.println("GUIscrollFrame-0 param(start)");
		setTitle("GUIscrollFramTest");
		setSize(300, 300);
		setLayout(new FlowLayout());

		// add components

		lsno = new JLabel("sno");
		add(lsno);
		tsno = new JTextField(10);
		add(tsno);

		lsname = new JLabel("sname");
		add(lsname);
		tsname = new JTextField(10);
		add(tsname);

		lsaddrs = new JLabel("sadd");
		add(lsaddrs);
		tsadd = new JTextField(10);
		add(tsadd);

		lsavg = new JLabel("student avag");
		add(lsavg);
		tsavg = new JTextField(10);
		add(tsavg);

		b1first = new JButton("First");
		b2next = new JButton("Next");
		b3previous = new JButton("Previous");
		b4last = new JButton("Last");

		add(b1first);
		add(b2next);
		add(b3previous);
		add(b4last);

		// register and Activate ActionListener for the all buttons
		b1first.addActionListener(this);
		b2next.addActionListener(this);
		b3previous.addActionListener(this);
		b4last.addActionListener(this);
		//add window listener to framea
		this.addWindowListener(this);
		
		//disable the edit button
		tsno.setEditable(false);
		tsname.setEditable(false);
		tsadd.setEditable(false);
		tsavg.setEditable(false);

		setVisible(true);
		intializingJDBC();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// the closing of frame window will terminate
		System.out.println("GUIscrollFrame-0 param(end)");

	}

	private void intializingJDBC() {

		try {
			// create connection
			 con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");
			// create prepared objecjet
			 ps = con.prepareStatement(student_query, ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			// prepare rs object
			rs = ps.executeQuery();

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}// initializingJDBC

	public static void main(String[] args) {
		System.out.println("GUIscrollFrame-0 main(start)");
		new GUIscrollFrameTest();// anonymous object
		System.out.println("GUIscrollFrame-0 main(end)");

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		boolean flag = false;
		if (ae.getSource() == b1first) {
			try {
				rs.first();
				flag = true;
				System.out.println("First button is clicked.");
			} catch (SQLException e) {

				e.printStackTrace();
			}

		}//if
		else if (ae.getSource() == b2next) {
			System.out.println("next button is clicked");
			try {
				if (!rs.isLast()) {
					rs.next();
					flag = true;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		else if (ae.getSource() == b3previous) {
			System.out.println("previous button is clicked");
			try {
				if (!rs.isFirst()) {
					rs.previous();
					flag = true;
				}
			} catch (SQLException e) {

				e.printStackTrace();
			}
		} else {
			try {
				rs.last();
				flag = true;
				System.out.println("last button is clicked.");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(flag==true) {
			  try {
				    tsno.setText(rs.getString(1));				 
				    tsname.setText(rs.getString(2));
				    tsadd.setText(rs.getString(3));
				    tsavg.setText(rs.getString(4));
			  }catch(SQLException se) {
				  se.printStackTrace();
			  }
		}

	}//action performed

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
	System.out.println("window closing..");
	
		try {
			if(rs!=null)
				rs.close();
		}catch(SQLException se) {
			se.printStackTrace();
		}
		try {
			if(ps!=null)
				ps.close();
		}catch(SQLException se) {
			se.printStackTrace();
		}try {
			if(con!=null)
				con.close();
				
		} catch(SQLException se) {
			se.printStackTrace();
		}
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}

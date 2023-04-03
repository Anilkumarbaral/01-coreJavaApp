package sqldb;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUIBuilderScrollFrameTest2 {
    private static final String student_query="SELECT SNO,SNAME,SADD,SAVG FROM STUDENT";
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIBuilderScrollFrameTest2 window = new GUIBuilderScrollFrameTest2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIBuilderScrollFrameTest2() {
		initialize();
		intializejdbc();
	}

	private void intializejdbc() {
		  try {
			    con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
			    ps=con.prepareStatement(student_query,rs.TYPE_SCROLL_SENSITIVE,rs.CONCUR_READ_ONLY);
			    rs=ps.executeQuery();
		  }catch(SQLException se) {
			  se.printStackTrace();
		  }catch(Exception e) {
			  e.printStackTrace();
		  }
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("window close");
				try {
					  if(con!=null)
						  con.close();
				}catch(SQLException se) {
					se.printStackTrace();
				}catch(Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		frame.setBounds(100, 100, 537, 402);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SNO::");
		lblNewLabel.setBounds(49, 31, 45, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SNAME");
		lblNewLabel_1.setBounds(49, 78, 45, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("SADD");
		lblNewLabel_2.setBounds(49, 118, 45, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("SAVG");
		lblNewLabel_3.setBounds(49, 171, 45, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(199, 28, 96, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(199, 75, 96, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(199, 115, 96, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(199, 168, 96, 19);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("FIRST");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				      	rs.first();
					     textField.setText(rs.getString(1));
					     textField_1.setText(rs.getString(2));
					     textField_2.setText(rs.getString(3));
					     textField_3.setText(rs.getString(4));
				}catch(SQLException se) {
					se.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(29, 230, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("NEXT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
			      	if(!rs.isLast()) {
			      		rs.next();
				     textField.setText(rs.getString(1));
				     textField_1.setText(rs.getString(2));
				     textField_2.setText(rs.getString(3));
				     textField_3.setText(rs.getString(4));
			      	}
			}catch(SQLException se) {
				se.printStackTrace();
			}
			}
		});
		btnNewButton_1.setBounds(149, 230, 85, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("PREVIOUS");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
			      if(!rs.isFirst()) {
			    	  rs.previous();
				     textField.setText(rs.getString(1));
				     textField_1.setText(rs.getString(2));
				     textField_2.setText(rs.getString(3));
				     textField_3.setText(rs.getString(4));
			      }
			}catch(SQLException se) {
				se.printStackTrace();
			}
			}
		});
		btnNewButton_2.setBounds(271, 230, 85, 21);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("LAST");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
			          rs.last();
				     textField.setText(rs.getString(1));
				     textField_1.setText(rs.getString(2));
				     textField_2.setText(rs.getString(3));
				     textField_3.setText(rs.getString(4));
			}catch(SQLException se) {
				se.printStackTrace();
			}
			}
		});
		btnNewButton_3.setBounds(389, 230, 85, 21);
		frame.getContentPane().add(btnNewButton_3);
	}

}

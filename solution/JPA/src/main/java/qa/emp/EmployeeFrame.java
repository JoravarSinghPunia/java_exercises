package qa.emp;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

public class EmployeeFrame {

	private JFrame frmEmployeeApp;
	private JTextField firstnameAddTf;
	private JTextField lastnameAddTf;
	private JTextField ageAddTf;
	private JTextField firstnameRemoveTf;
	private JTextField lastnameRemoveTf;
	private JTextArea messagesTa;
	
	private EmployeeController controller;
	private JTextArea outputTextArea;
	
	

	public void setController(EmployeeController controller) {
		this.controller = controller;
	}

	/**
	 * Launch the application.
	 */
	public void launch() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeFrame.this.frmEmployeeApp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EmployeeFrame(EmployeeController controller) {
		setController(controller);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEmployeeApp = new JFrame();
		frmEmployeeApp.setTitle("Employee App");
		BorderLayout borderLayout = (BorderLayout) frmEmployeeApp
				.getContentPane().getLayout();
		borderLayout.setVgap(10);
		borderLayout.setHgap(10);
		frmEmployeeApp.setBounds(100, 100, 714, 577);
		frmEmployeeApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEmployeeApp.addWindowListener(new WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
            	controller.close();
                System.exit(0);
            }
        });

		JPanel panel_7 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_7.getLayout();
		flowLayout_1.setVgap(10);
		flowLayout_1.setHgap(10);
		frmEmployeeApp.getContentPane().add(panel_7, BorderLayout.NORTH);

		JLabel lblEmployeeApplication = new JLabel("Employee Application");
		panel_7.add(lblEmployeeApplication);
		lblEmployeeApplication.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmployeeApplication.setHorizontalAlignment(SwingConstants.CENTER);

		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		FlowLayout flowLayout = (FlowLayout) panel_6.getLayout();
		flowLayout.setVgap(10);
		flowLayout.setHgap(10);
		frmEmployeeApp.getContentPane().add(panel_6, BorderLayout.SOUTH);
		
		JButton btnNewButton_2 = new JButton("Refresh");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				refresh();
			}
		});
		panel_6.add(btnNewButton_2);

		messagesTa = new JTextArea();
		messagesTa.setRows(4);
		panel_6.add(messagesTa);
		messagesTa.setColumns(40);

		JPanel panel = new JPanel();
		panel.setBorder(null);
		frmEmployeeApp.getContentPane().add(panel, BorderLayout.WEST);
		panel.setLayout(new GridLayout(2, 1, 10, 10));

		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.add(panel_8);

		JPanel panel_1 = new JPanel();
		panel_8.add(panel_1);
		panel_1.setBorder(null);
		panel_1.setLayout(new GridLayout(4, 2, 10, 10));

		JLabel lblNewLabel = new JLabel("First name:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblNewLabel);

		firstnameAddTf = new JTextField();
		panel_1.add(firstnameAddTf);
		firstnameAddTf.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Last name:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblNewLabel_1);

		lastnameAddTf = new JTextField();
		panel_1.add(lastnameAddTf);
		lastnameAddTf.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Age:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblNewLabel_2);

		ageAddTf = new JTextField();
		panel_1.add(ageAddTf);
		ageAddTf.setColumns(10);

		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);

		JPanel panel_10 = new JPanel();
		panel_1.add(panel_10);
		panel_10.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));

		JButton btnNewButton = new JButton("Add Employee");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addEmployee();
			}
		});
		btnNewButton.setPreferredSize(new Dimension(140, 23));
		btnNewButton.setMinimumSize(new Dimension(140, 23));
		btnNewButton.setMaximumSize(new Dimension(140, 23));
		panel_10.add(btnNewButton);

		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.add(panel_9);

		JPanel panel_3 = new JPanel();
		panel_9.add(panel_3);
		panel_3.setBorder(null);
		panel_3.setLayout(new GridLayout(4, 2, 10, 10));

		JLabel lblNewLabel_3 = new JLabel("First Name:");
		panel_3.add(lblNewLabel_3);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);

		firstnameRemoveTf = new JTextField();
		panel_3.add(firstnameRemoveTf);
		firstnameRemoveTf.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Last name:");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_3.add(lblNewLabel_4);

		lastnameRemoveTf = new JTextField();
		panel_3.add(lastnameRemoveTf);
		lastnameRemoveTf.setColumns(10);

		JPanel panel_4 = new JPanel();
		panel_3.add(panel_4);

		JPanel panel_11 = new JPanel();
		panel_3.add(panel_11);
		panel_11.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));

		JButton btnNewButton_1 = new JButton("Remove Employee");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				removeEmployee();
			}
		});
		btnNewButton_1.setPreferredSize(new Dimension(140, 23));
		btnNewButton_1.setMinimumSize(new Dimension(140, 23));
		btnNewButton_1.setMaximumSize(new Dimension(140, 23));
		panel_11.add(btnNewButton_1);

		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		frmEmployeeApp.getContentPane().add(panel_5, BorderLayout.CENTER);

		outputTextArea = new JTextArea(18,30);
		
		refresh();

		JScrollPane scrollPane = new JScrollPane(outputTextArea);
		panel_5.add(scrollPane);

	}
	
	private void addEmployee() {
		String firstname = firstnameAddTf.getText();
		String lastname = lastnameAddTf.getText();
		String ageStr = ageAddTf.getText();
		messagesTa.setText("");
		
		boolean valid = true;
		if (firstname.length()==0) {
			messagesTa.append("First name must not be empty.\n");
			valid = false;
		}
		if (lastname.length()==0) {
			messagesTa.append("Last name must not be empty.\n");
			valid = false;
		}
		int age = 18;
		try {
			age = Integer.parseInt(ageStr);
			if (age < 18) {
				messagesTa.append("Age must be 18 or above.\n");
				valid = false;
			}
		} catch (NumberFormatException e) {
			messagesTa.append("Age must be a number.\n");
			valid = false;
		}
		if (valid) {
			boolean success = controller.createEmployee(firstname, lastname, age);
			if (success) {
				messagesTa.append("Employee successfully created.\n");
			} else {
				messagesTa.append("There was a problem creating employee.\n");
			}
		}
		outputTextArea.setText(controller.getAllEmployees());
	}
	
	private void removeEmployee() {
		String firstname = firstnameRemoveTf.getText();
		String lastname = lastnameRemoveTf.getText();
		messagesTa.setText("");
		boolean valid = true;
		if (firstname.length()==0) {
			messagesTa.append("First name must not be empty.\n");
			valid = false;
		}
		if (lastname.length()==0) {
			messagesTa.append("Last name must not be empty.\n");
			valid = false;
		}
		
		if (valid) {
			boolean success = controller.deleteEmployee(firstname, lastname);
			if (success) {
				messagesTa.append("Employee successfully removed.\n");
			} else {
				messagesTa.append("There was a problem removing employee.\n");
			}
		}
		outputTextArea.setText(controller.getAllEmployees());
	}
	
	private void refresh() {
		messagesTa.setText("");
		outputTextArea.setText(controller.getAllEmployees());
	}

}

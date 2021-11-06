package SwingJava;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Scrollbar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Bt2_Tax extends JFrame  {

	private JPanel contentPane;
	private JTextField hoten;
	private JTextField ngaysinh;
	private JTextField truonghoc;
	
	public interface payTax {
		public double calcTax(double income,int start_time,int end_time);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bt2_Tax frame = new Bt2_Tax();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public Bt2_Tax()  {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 867, 500);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("MENU");
		menuBar.add(mnNewMenu);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ho ten:");
		lblNewLabel.setBounds(22, 60, 84, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ngay Sinh(dd/mm/yyyy):");
		lblNewLabel_1.setBounds(22, 138, 100, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Gioi tinh:");
		lblNewLabel_2.setBounds(22, 203, 84, 25);
		contentPane.add(lblNewLabel_2);
		
		hoten = new JTextField();
		hoten.setBounds(93, 63, 312, 19);
		contentPane.add(hoten);
		hoten.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Nam", "Nu", "Khac"}));
		comboBox.setMaximumRowCount(3);
		comboBox.setToolTipText("");
		comboBox.setBounds(131, 205, 68, 21);
		contentPane.add(comboBox);
		
		ngaysinh = new JTextField();
		ngaysinh.setBounds(132, 141, 273, 19);
		contentPane.add(ngaysinh);
		ngaysinh.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Truong Hoc:");
		lblNewLabel_3.setBounds(22, 264, 84, 25);
		contentPane.add(lblNewLabel_3);
		
		truonghoc = new JTextField();
		truonghoc.setBounds(131, 267, 274, 19);
		contentPane.add(truonghoc);
		truonghoc.setColumns(10);
		
		JButton btnNewButton = new JButton("Xong");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(131, 332, 108, 25);
		contentPane.add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(461, 60, 333, 297);
		contentPane.add(textArea);
		
		JLabel lblNewLabel_4 = new JLabel("Ket qua:");
		lblNewLabel_4.setBounds(461, 36, 68, 25);
		contentPane.add(lblNewLabel_4);
	}
}
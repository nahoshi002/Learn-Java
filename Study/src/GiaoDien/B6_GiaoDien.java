package GiaoDien;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JToolBar;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JYearChooser;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;

public class B6_GiaoDien extends JFrame {

	protected static final Date Date = null;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	protected Object txtHoten;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					B6_GiaoDien frame = new B6_GiaoDien();
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
	public B6_GiaoDien() {
		setForeground(UIManager.getColor("textHighlight"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 573);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("H\u1ECD t\u00EAn");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 25, 88, 25);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setBounds(130, 23, 260, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Ng\u00E0y sinh");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 80, 88, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Gi\u1EDBi t\u00EDnh");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 135, 88, 25);
		contentPane.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(Color.BLUE);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Nam", "N\u1EEF", "Kh\u00E1c"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setBounds(130, 132, 88, 30);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("Tr\u01B0\u1EDDng h\u1ECDc");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(10, 181, 88, 25);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(130, 185, 260, 30);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(130, 80, 260, 30);
		contentPane.add(dateChooser);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(458, 55, 300, 264);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("Nh\u1EADp");
		btnNewButton.setForeground(UIManager.getColor("PasswordField.selectionBackground"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Student sv = new Student(getTitle(), getTitle(), getDefaultCloseOperation(), null);
				sv.setHoten(textField.getText());
				sv.setTruonghoc(textField_1.getText());
				sv.setGioitinh(comboBox.getSelectedIndex());
				sv.setNgaysinh(dateChooser.getDate());
				SimpleDateFormat df = new SimpleDateFormat ("dd-MM-yyyy", Locale.ENGLISH);
				String output = sv.getHoten() + "; " + df.format(sv.getNgaysinh()) + 
						"; Giới tính: " + comboBox.getSelectedItem().toString() + "; Trường: "
						+ sv.getTruonghoc() + "\n";
				textArea.append(output);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(188, 293, 125, 30);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("Kết quả vừa nhập:");
		lblNewLabel_4.setForeground(Color.MAGENTA);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(458, 25, 142, 21);
		contentPane.add(lblNewLabel_4);
		setSize(800, 1000);
	}
}
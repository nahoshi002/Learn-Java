package GiaoDien;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.TextArea;
import javax.swing.BoxLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.Font;
 
public class JFile_Test extends JFrame implements ActionListener{
    private JButton btOpenFile = new JButton("Mở Tệp");
    private JButton btSaveFile = new JButton("Lưu Tệp");
    private final TextArea textArea = new TextArea();
    private final JMenuBar menuBar = new JMenuBar();
    private final JMenu mnMenu = new JMenu("MENU");
    private final JMenu mnMenu2 = new JMenu("Tiện Ích");
    private final JMenu mnMenu3 = new JMenu("Công cụ");
    private final JMenu mnMenu4 = new JMenu("Cài Đặt");
    private final JLabel lblNewLabel = new JLabel("Đang cập nhật...");
    private final JLabel lblNewLabel_1 = new JLabel("Đang cập nhật...");
    private final JButton btnNewButton = new JButton("Trang Chủ");
    private final JButton btnNewButton_1 = new JButton("Hệ Thống");
    private final JButton btnNewButton_2 = new JButton("Giao Diện");
    private final JButton btnNewButton_3 = new JButton("Âm thanh");
     
    public JFile_Test(){
    	 super("Thanh Công Cụ");
    	 
    	 setJMenuBar(menuBar);
    	 
    	 menuBar.add(mnMenu);
    	 
    	 menuBar.add(mnMenu2);
    	 lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
    	 
    	 mnMenu2.add(lblNewLabel);
    	 
    	 menuBar.add(mnMenu3);
    	 lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
    	 
    	 mnMenu3.add(lblNewLabel_1);
    	 
    	 menuBar.add(mnMenu4);
    	 
    	 mnMenu4.add(btnNewButton);
    	 
    	 mnMenu4.add(btnNewButton_1);
    	 
    	 mnMenu4.add(btnNewButton_2);
    	 
    	 mnMenu4.add(btnNewButton_3);
        initComponents();
    }
     
    public void initComponents(){
        JPanel panelControl = new JPanel();
        panelControl.setLayout(new BoxLayout(panelControl, BoxLayout.X_AXIS));
 
        getContentPane().setLayout(new BorderLayout());
        this.setSize(500, 400);
        getContentPane().add(panelControl, BorderLayout.WEST);
        
        getContentPane().add(textArea, BorderLayout.CENTER);
        this.setVisible(true);
        mnMenu.add(btOpenFile);
        mnMenu.add(btSaveFile);
        btSaveFile.addActionListener(this);
         
        btOpenFile.addActionListener(this);
    }
     
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btOpenFile){
            JFileChooser chooser = new JFileChooser();
            chooser.setSize(500, 400);
            int value = chooser.showOpenDialog(this);
            if(value == JFileChooser.OPEN_DIALOG){
                File file = chooser.getSelectedFile();
                String s = MyFile.readFile(file);
                textArea.setText(s);
            }
        }
         
        if(e.getSource() == btSaveFile){
            JFileChooser chooser = new JFileChooser();
            int value = chooser.showSaveDialog(this);
            if(value == JFileChooser.APPROVE_OPTION){
 
                File file = chooser.getSelectedFile(); // Khởi tạo file (nếu chưa có thì tạo file mới)
                 
                if( ! MyFile.writeFile(file, textArea.getText().toString())){
                    JOptionPane.showMessageDialog(null, "Lỗi lưu file", "Thông báo", JOptionPane.CLOSED_OPTION);
                }
            }
        }
    }
    public static void main(String[] args) {
        new JFile_Test();
    }
    class MyFile{
        
        public static boolean createFile(String url){
            try {
                new File(url).createNewFile();
                return true;
            } catch (IOException e) {
                e.printStackTrace();
            }
            return false;
        }
         
        public static File openFile(String url){
            File file = new File(url);
            // Nếu đường dẫn không tồn tại
            if(! file.exists() || ! file.isFile()){
                return null;
            }       
            return file;
        }
         
        public static String readFile(File file){
            FileInputStream inputStream = null;
            try {
                inputStream = new FileInputStream(file);
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            String s = new String();
            try {
                while(dataInputStream.available() > 0){
                    s += dataInputStream.readChar();
                }
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
             
            return s;
        }
         
        public static boolean writeFile(File file, String s){
            FileOutputStream fileOutputStream;
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return false;
            }
            DataOutputStream outputStream = new DataOutputStream(fileOutputStream);
             
            try {
                outputStream.writeChars(s);
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
             
            return true;
        }
    }
}
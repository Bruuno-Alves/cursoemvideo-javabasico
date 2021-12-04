package cursoemvideo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.awt.event.ActionEvent;

public class TelaIdioma extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaIdioma frame = new TelaIdioma();
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
	public TelaIdioma() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 396, 210);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\bruno\\Documents\\Curso Programa\u00E7\u00E3o\\Java Basico\\Eclipse\\05-IdiomaSwing\\src\\imagens\\129645.png"));
		lblNewLabel.setBounds(10, 23, 128, 128);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Idioma do Sistema:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(170, 23, 174, 25);
		contentPane.add(lblNewLabel_1);
		
		final JLabel lblIdioma = new JLabel("Clique no Bot\u00E3o");
		lblIdioma.setForeground(Color.RED);
		lblIdioma.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblIdioma.setBounds(170, 59, 254, 25);
		contentPane.add(lblIdioma);
		
		JButton btnIdioma = new JButton("Clique Aqui!!");
		btnIdioma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Locale loc = Locale.getDefault();
				
				lblIdioma.setText(loc.getDisplayLanguage());
			
			}
		});
		btnIdioma.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnIdioma.setBounds(170, 95, 147, 33);
		contentPane.add(btnIdioma);
	}

}

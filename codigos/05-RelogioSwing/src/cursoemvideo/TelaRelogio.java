package cursoemvideo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;

public class TelaRelogio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaRelogio frame = new TelaRelogio();
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
	public TelaRelogio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 316);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\bruno\\Documents\\Curso Programa\u00E7\u00E3o\\Java Basico\\Eclipse\\05-RelogioSwing\\src\\imagens\\calendar.png"));
		lblNewLabel.setBounds(10, 11, 256, 250);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Data e Hora do Sistema");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel_1.setBounds(276, 11, 296, 34);
		contentPane.add(lblNewLabel_1);
		
		final JLabel lblHora = new JLabel("Clique no Bot\u00E3o");
		lblHora.setForeground(Color.RED);
		lblHora.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblHora.setBounds(276, 56, 332, 34);
		contentPane.add(lblHora);
		
		JButton btnHora = new JButton("Clique Aqui");
		btnHora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Date relogio = new Date();
				lblHora.setText(relogio.toString());
			}
		});
		btnHora.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnHora.setBounds(331, 121, 186, 56);
		contentPane.add(btnHora);
	}

}

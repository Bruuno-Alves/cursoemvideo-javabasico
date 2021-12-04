package cursoemvideo.olamundo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class OlaMundoJava extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OlaMundoJava frame = new OlaMundoJava();
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
	public OlaMundoJava() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 256);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JLabel lblMensagem = new JLabel("Aqui vai aparecer a mensagem");
		lblMensagem.setForeground(Color.RED);
		lblMensagem.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblMensagem.setBounds(34, 27, 370, 53);
		contentPane.add(lblMensagem);
		
		JButton btnClick = new JButton("Clique em mim!");
		btnClick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMensagem.setText("Olá Mundo");
			}
		});
		btnClick.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnClick.setBounds(122, 124, 173, 39);
		contentPane.add(btnClick);
	}
}

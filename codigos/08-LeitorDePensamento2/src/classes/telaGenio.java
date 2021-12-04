package classes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class telaGenio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaGenio frame = new telaGenio();
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
	public telaGenio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 518, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JLabel lblFala = new JLabel("texto");
		lblFala.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFala.setHorizontalAlignment(SwingConstants.CENTER);
		lblFala.setBounds(28, 32, 196, 129);
		contentPane.add(lblFala);
		lblFala.setText("<html>Estou pensando em um número de 1 a 5. Tente adivinhar que valor é este.</html>");
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\bruno\\Documents\\Curso Programa\u00E7\u00E3o\\Java Basico\\Eclipse\\08-LeitorDePensamento\\src\\imagens\\696791af6e726c7d8d7e8bc375151d8d-caixa-de-discurso-turquesa.png"));
		lblNewLabel.setBounds(0, 11, 256, 199);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\bruno\\Documents\\Curso Programa\u00E7\u00E3o\\Java Basico\\Eclipse\\08-LeitorDePensamento\\src\\imagens\\apresentacao-de-genio-dos-desenhos-animados_29190-4294.jpg"));
		lblNewLabel_1.setBounds(236, 11, 256, 381);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Valor");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(85, 259, 42, 19);
		contentPane.add(lblNewLabel_3);
		
		final JSpinner txtPalpite = new JSpinner();
		txtPalpite.setModel(new SpinnerNumberModel(1, 1, 5, 1));
		txtPalpite.setBounds(137, 260, 42, 20);
		contentPane.add(txtPalpite);
		
		JButton btnPalpite = new JButton("Palpite");
		btnPalpite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n = 1 + Math.random() * (6-1);
				int valor = (int) n;
				
				int palpite = Integer.parseInt(txtPalpite.getValue().toString());
				
				String fala1 = "ACERTOU!";
				String fala2 = "<html>ERROU! Eu pensei no número " + valor + "</html>";
				
				String res = (valor == palpite) ? fala1 : fala2;
				
				lblFala.setFont(new Font("Arial Black", Font.PLAIN, 16));
				
				lblFala.setText(res);
				
			}
		});
		btnPalpite.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPalpite.setBounds(77, 291, 89, 34);
		contentPane.add(btnPalpite);
	}
}

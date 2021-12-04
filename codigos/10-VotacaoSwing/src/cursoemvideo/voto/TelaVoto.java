package cursoemvideo.voto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class TelaVoto extends JFrame {

	private JPanel contentPane;
	private JTextField txtAno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVoto frame = new TelaVoto();
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
	public TelaVoto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 236, 186);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ano de Nascimento");
		lblNewLabel.setBounds(10, 11, 100, 14);
		contentPane.add(lblNewLabel);
		
		txtAno = new JTextField();
		txtAno.setBounds(120, 8, 86, 20);
		contentPane.add(txtAno);
		txtAno.setColumns(10);
		
		final JLabel lblR = new JLabel("Resultado");
		lblR.setHorizontalAlignment(SwingConstants.CENTER);
		lblR.setBounds(39, 122, 127, 14);
		contentPane.add(lblR);
		
		final JLabel lblIdade = new JLabel("Idade");
		lblIdade.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdade.setBounds(39, 97, 127, 14);
		contentPane.add(lblIdade);
		
		JButton btnVoto = new JButton("Posso Votar?");
		btnVoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int ano = Integer.parseInt(txtAno.getText());
				int idade = 2021 - ano;
				
				lblIdade.setText("Você tem " + idade + " anos.");
				
				if (idade < 16) {
					lblR.setText("NÃO VOTA");
				} else if ((idade >= 16 && idade < 18) || (idade > 70)) {
					lblR.setText("OPCIONAL");
				} else {
					lblR.setText("OBRIGATÓRIO");
				}
			}
		});
		btnVoto.setBounds(39, 63, 114, 23);
		contentPane.add(btnVoto);
		
	}
}

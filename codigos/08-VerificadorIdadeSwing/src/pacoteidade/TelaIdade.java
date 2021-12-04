package pacoteidade;

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

public class TelaIdade extends JFrame {

	private JPanel contentPane;
	private JTextField txtAno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaIdade frame = new TelaIdade();
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
	public TelaIdade() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 214, 199);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ano Nascimento");
		lblNewLabel.setBounds(10, 11, 77, 14);
		contentPane.add(lblNewLabel);
		
		txtAno = new JTextField();
		txtAno.setBounds(97, 8, 86, 20);
		contentPane.add(txtAno);
		txtAno.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Idade");
		lblNewLabel_1.setBounds(10, 93, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Situa\u00E7\u00E3o");
		lblNewLabel_2.setBounds(10, 118, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		final JLabel lblIdade = new JLabel("0");
		lblIdade.setBounds(97, 93, 46, 14);
		contentPane.add(lblIdade);
		
		final JLabel lblSituacao = new JLabel("<vazio>");
		lblSituacao.setBounds(97, 118, 101, 14);
		contentPane.add(lblSituacao);
		
		JButton btnCalc = new JButton("Calcular Idade");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int ano = Integer.parseInt(txtAno.getText());
				int idade = 2021 - ano;
				lblIdade.setText(Integer.toString(idade));
				String sit = ((idade >= 16 && idade < 18) || (idade > 70)) ? "OPCIONAL" : "NÃO É OPCIONAL";
				lblSituacao.setText(sit);
				
			}
		});
		btnCalc.setBounds(45, 59, 125, 23);
		contentPane.add(btnCalc);
	}
}

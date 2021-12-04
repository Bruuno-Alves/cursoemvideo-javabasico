package telaequacao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import java.awt.Font;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class TelaEquacao extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEquacao frame = new TelaEquacao();
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
	public TelaEquacao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 377, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html>x<sup>2</sup>+</html>");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(110, 31, 26, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("x+");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(196, 34, 19, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("=0");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(275, 34, 19, 24);
		contentPane.add(lblNewLabel_2);
						
		JLabel lblNewLabel_3 = new JLabel("<html>&Delta; =</html>");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_3.setBounds(28, 77, 40, 33);
		contentPane.add(lblNewLabel_3);
		
		final JLabel lblB = new JLabel("B");
		lblB.setForeground(Color.RED);
		lblB.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblB.setBounds(78, 77, 40, 33);
		contentPane.add(lblB);
		
		JLabel lblNewLabel_5 = new JLabel("<html><sup>2</sup> - 4 .</html>");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_5.setBounds(128, 71, 65, 33);
		contentPane.add(lblNewLabel_5);
		
		final JLabel lblA = new JLabel("A");
		lblA.setForeground(Color.RED);
		lblA.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblA.setBounds(203, 77, 52, 33);
		contentPane.add(lblA);
		
		JLabel lblNewLabel_7 = new JLabel(".");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_7.setBounds(260, 77, 7, 33);
		contentPane.add(lblNewLabel_7);
		
		final JLabel lblC = new JLabel("C");
		lblC.setForeground(Color.RED);
		lblC.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblC.setBounds(277, 77, 40, 33);
		contentPane.add(lblC);
		
		final JSpinner txtA = new JSpinner();
		txtA.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblA.setText(txtA.getValue().toString());
			}
		});
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtA.setBounds(60, 31, 40, 27);
		contentPane.add(txtA);
		
		final JSpinner txtB = new JSpinner();
		txtB.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblB.setText(txtB.getValue().toString());
			}
		});
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtB.setBounds(146, 33, 40, 27);
		contentPane.add(txtB);

		final JSpinner txtC = new JSpinner();
		txtC.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblC.setText(txtC.getValue().toString());
			}
		});
		txtC.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtC.setBounds(225, 33, 40, 27);
		contentPane.add(txtC);
		
		final JPanel panResultado = new JPanel();
		panResultado.setBounds(10, 169, 341, 81);
		contentPane.add(panResultado);
		panResultado.setLayout(null);
		panResultado.setVisible(false);
		
		JLabel lblNewLabel_4 = new JLabel("<html>Valor de &Delta</html>");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(10, 11, 114, 22);
		panResultado.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("Tipo de Ra\u00EDzes");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(10, 44, 114, 22);
		panResultado.add(lblNewLabel_6);
		
		final JLabel lblDelta = new JLabel("0");
		lblDelta.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDelta.setForeground(Color.BLUE);
		lblDelta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDelta.setBounds(134, 11, 197, 22);
		panResultado.add(lblDelta);
		
		final JLabel lblRaiz = new JLabel("0");
		lblRaiz.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRaiz.setForeground(Color.BLUE);
		lblRaiz.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRaiz.setBounds(134, 44, 197, 22);
		panResultado.add(lblRaiz);
		
		JButton btnCalc = new JButton("<html>Calcular &Delta</html>");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panResultado.setVisible(true);
				
				int a = Integer.parseInt(txtA.getValue().toString());
				int b = Integer.parseInt(txtB.getValue().toString());
				int c = Integer.parseInt(txtC.getValue().toString());
				
				double d = Math.pow(b, 2) - 4 * a * c;
				lblDelta.setText(String.format("%.1f", d));
				
				if (d < 0) {
					lblRaiz.setText("Não existem raízes Reais");
				} else {
					lblRaiz.setText("Existem Raízes Reais.");
				}
			}
		});
		btnCalc.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCalc.setBounds(136, 121, 119, 37);
		contentPane.add(btnCalc);
	}
}

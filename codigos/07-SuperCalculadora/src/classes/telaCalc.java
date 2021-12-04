package classes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSplitPane;

public class telaCalc extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaCalc frame = new telaCalc();
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
	public telaCalc() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite um Valor");
		lblNewLabel.setBounds(22, 36, 102, 20);
		contentPane.add(lblNewLabel);
		
		final JSpinner txtValor = new JSpinner();
		txtValor.setBounds(134, 36, 57, 20);
		contentPane.add(txtValor);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\bruno\\Documents\\Curso Programa\u00E7\u00E3o\\Java Basico\\Eclipse\\07-SuperCalculadora\\src\\imagens\\unnamed.jpg"));
		lblNewLabel_11.setBounds(264, 112, 256, 256);
		contentPane.add(lblNewLabel_11);
		
		final JPanel panCalc = new JPanel();
		panCalc.setBounds(10, 112, 244, 159);
		contentPane.add(panCalc);
		panCalc.setLayout(null);
		panCalc.setVisible(false);
		
		JLabel lblNewLabel_1 = new JLabel("Resto da Divis\u00E3o por 2");
		lblNewLabel_1.setBounds(10, 11, 125, 14);
		panCalc.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Elevado ao Cubo");
		lblNewLabel_2.setBounds(10, 36, 125, 14);
		panCalc.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Raiz Quadrada");
		lblNewLabel_3.setBounds(10, 61, 125, 14);
		panCalc.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Raiz C\u00FAbica");
		lblNewLabel_4.setBounds(10, 86, 125, 14);
		panCalc.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Valor Absoluto");
		lblNewLabel_5.setBounds(10, 111, 125, 14);
		panCalc.add(lblNewLabel_5);
		
		final JLabel lblDiv = new JLabel("0");
		lblDiv.setBounds(145, 6, 109, 20);
		panCalc.add(lblDiv);
		lblDiv.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDiv.setForeground(Color.RED);
		
		final JLabel lblCubo = new JLabel("0");
		lblCubo.setBounds(145, 31, 109, 20);
		panCalc.add(lblCubo);
		lblCubo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCubo.setForeground(Color.RED);
		
		final JLabel lblQuad = new JLabel("0");
		lblQuad.setBounds(145, 56, 109, 20);
		panCalc.add(lblQuad);
		lblQuad.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblQuad.setForeground(Color.RED);
		
		final JLabel lblCub = new JLabel("0");
		lblCub.setBounds(145, 81, 109, 20);
		panCalc.add(lblCub);
		lblCub.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCub.setForeground(Color.RED);
		
		final JLabel lblAbs = new JLabel("0");
		lblAbs.setBounds(145, 106, 109, 20);
		panCalc.add(lblAbs);
		lblAbs.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAbs.setForeground(Color.RED);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panCalc.setVisible(true);
				
				int valor = Integer.parseInt(txtValor.getValue().toString());
				
				int div = valor % 2;
				lblDiv.setText(Integer.toString(div));
				
				float cubo = (float) Math.pow(valor, 3);
				lblCubo.setText(Float.toString(cubo));
				
				float quad = (float) Math.sqrt(valor);
				lblQuad.setText(String.format("%.2f", quad));
				
				float cub = (float) Math.cbrt(valor);
				lblCub.setText(String.format("%.2f", cub));
				
				int abs = Math.abs(valor);
				lblAbs.setText(Integer.toString(abs));
				
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\bruno\\Documents\\Curso Programa\u00E7\u00E3o\\Java Basico\\Eclipse\\07-SuperCalculadora\\src\\imagens\\icon_64x64_0613bc37486b71a7598879ff3a6b2000.png"));
		btnNewButton.setBounds(217, 7, 216, 73);
		contentPane.add(btnNewButton);
	}
}

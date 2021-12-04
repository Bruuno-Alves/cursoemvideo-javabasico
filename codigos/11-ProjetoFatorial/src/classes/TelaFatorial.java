package classes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SpinnerNumberModel;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class TelaFatorial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFatorial frame = new TelaFatorial();
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
	public TelaFatorial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 617, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\bruno\\Documents\\Curso Programa\u00E7\u00E3o\\Java Basico\\Eclipse\\11-ProjetoFatorial\\src\\imagens\\images.jpg"));
		
		final JLabel lblResultado = new JLabel("1");
		lblResultado.setForeground(Color.RED);
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JLabel lblNewLabel_2 = new JLabel("! =");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		final JLabel lblFormula = new JLabel(" ");
		lblFormula.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		final JSpinner txtN = new JSpinner();
		txtN.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				int n = Integer.parseInt(txtN.getValue().toString());
				int f = 1;
				int c = n;
				String formula = "";
				
				while (c >= 1) {
					f *= c;
					if (c >1) {
						formula += c + " x ";
					} else {
						formula += c + " =";
					}
					c--;
				}
				
				lblResultado.setText(Integer.toString(f));
				lblFormula.setText(formula);
				
			}
		});
		txtN.setModel(new SpinnerNumberModel(0, 0, 12, 1));
		txtN.setFont(new Font("Tahoma", Font.PLAIN, 24));
	
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblResultado)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(txtN, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_2)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblFormula)))
					.addContainerGap(409, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(185, Short.MAX_VALUE)
					.addComponent(lblNewLabel)
					.addGap(177))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2)
						.addComponent(lblFormula))
					.addGap(18)
					.addComponent(lblResultado)
					.addGap(50))
		);
		contentPane.setLayout(gl_contentPane);
	}
}

package classes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class TelaTriangulo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaTriangulo frame = new TelaTriangulo();
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
	public TelaTriangulo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 313);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Segmento A");
		
		JLabel lblNewLabel_1 = new JLabel("Segmento B");
		
		JLabel lblNewLabel_2 = new JLabel("Segmento C");
		lblNewLabel_2.setToolTipText("");
		
		final JLabel lblA = new JLabel("0");
		lblA.setForeground(Color.LIGHT_GRAY);
		lblA.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		final JLabel lblB = new JLabel("0");
		lblB.setForeground(Color.LIGHT_GRAY);
		lblB.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		final JLabel lblC = new JLabel("0");
		lblC.setForeground(Color.LIGHT_GRAY);
		lblC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		final JPanel panResposta = new JPanel();
		panResposta.setVisible(false);
		
		final JSlider sliA = new JSlider();
		sliA.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblA.setText(Integer.toString(sliA.getValue()));
			}
		});
		sliA.setValue(0);
		sliA.setMaximum(20);
		
		final JSlider sliB = new JSlider();
		sliB.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblB.setText(Integer.toString(sliB.getValue()));
			}
		});
		sliB.setValue(0);
		sliB.setMaximum(20);
		
		final JSlider sliC = new JSlider();
		sliC.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblC.setText(Integer.toString(sliC.getValue()));
			}
		});
		sliC.setValue(0);
		sliC.setMaximum(20);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\bruno\\Documents\\Curso Programa\u00E7\u00E3o\\Java Basico\\Eclipse\\10-ProjetoTriangulo\\src\\imagens\\4-3.jpg"));
		
		final JLabel lblStatus = new JLabel("Forma ou N\u00E3o?");
		lblStatus.setForeground(new Color(102, 204, 255));
		lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
		
		final JLabel lblTipo = new JLabel("Tipo de Triangulo");
		lblTipo.setForeground(new Color(255, 153, 204));
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTipo.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnVerificar = new JButton("VERIFICAR");
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a = sliA.getValue();
				int b = sliB.getValue();
				int c = sliC.getValue();
				
				if (a < c + c && b < a + c && c < a + b) {
					lblStatus.setText("Formam um triângulo!");
					if (a==b && b==c) {
						lblTipo.setText("Equilátero");
					} else if (a!=b && b!=c && a!=c){
						lblTipo.setText("Escaleno");
					} else {
						lblTipo.setText("Isósceles");
					}
				} else {
					lblStatus.setText("Não formam um triângulo!");
					lblTipo.setText("- - -");
				}
				
				panResposta.setVisible(true);
				
			}
		});
		btnVerificar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(panResposta, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel_2))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(sliC, 0, 0, Short.MAX_VALUE)
										.addComponent(sliB, 0, 0, Short.MAX_VALUE)
										.addComponent(sliA, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblC, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
										.addComponent(lblB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblA, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
								.addComponent(btnVerificar))
							.addGap(18)
							.addComponent(lblNewLabel_8)))
					.addContainerGap(256, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblA)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblB)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblC))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel)
								.addComponent(sliA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_1)
								.addComponent(sliB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_2)
								.addComponent(sliC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addComponent(btnVerificar))
						.addComponent(lblNewLabel_8))
					.addGap(18)
					.addComponent(panResposta, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(109, Short.MAX_VALUE))
		);

		GroupLayout gl_panResposta = new GroupLayout(panResposta);
		gl_panResposta.setHorizontalGroup(
			gl_panResposta.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panResposta.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panResposta.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblStatus, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
						.addComponent(lblTipo, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panResposta.setVerticalGroup(
			gl_panResposta.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panResposta.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblStatus)
					.addGap(18)
					.addComponent(lblTipo)
					.addContainerGap(77, Short.MAX_VALUE))
		);
		panResposta.setLayout(gl_panResposta);
		contentPane.setLayout(gl_contentPane);
	}

}

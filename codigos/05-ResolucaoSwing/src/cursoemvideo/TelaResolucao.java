package cursoemvideo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaResolucao extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaResolucao frame = new TelaResolucao();
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
	public TelaResolucao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\bruno\\Documents\\Curso Programa\u00E7\u00E3o\\Java Basico\\Eclipse\\05-ResolucaoSwing\\src\\imagens\\download.jpg"));
		lblNewLabel.setBounds(10, 11, 225, 225);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Resolu\u00E7\u00E3o da tela:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(245, 11, 165, 33);
		contentPane.add(lblNewLabel_1);
		
		final JLabel lblRes = new JLabel("Clique no bot\u00E3o!");
		lblRes.setForeground(Color.RED);
		lblRes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRes.setBounds(245, 48, 225, 33);
		contentPane.add(lblRes);
		
		JButton btnRes = new JButton("Me clique!!");
		btnRes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Toolkit tk = Toolkit.getDefaultToolkit();
				Dimension d = tk.getScreenSize();
				lblRes.setText(d.width + " x " + d.height);
				
			}
		});
		btnRes.setForeground(Color.RED);
		btnRes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRes.setBounds(245, 103, 153, 33);
		contentPane.add(btnRes);
	}

}

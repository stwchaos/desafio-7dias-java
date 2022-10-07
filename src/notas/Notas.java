package notas;

/**
 * 
 * @author Sam Pfleger Mendes
 * 
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class Notas extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtNota2;
	private JTextField txtNota1;
	private JTextField txtNota3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Notas frame = new Notas();
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
	public Notas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 279, 327);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 31, 62));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNome = new JTextField();
		txtNome.setBounds(132, 21, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.setBounds(132, 133, 86, 20);
		contentPane.add(txtNota2);
		txtNota2.setColumns(10);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(132, 77, 86, 20);
		contentPane.add(txtNota1);
		txtNota1.setColumns(10);
		
		txtNota3 = new JTextField();
		txtNota3.setBounds(132, 188, 86, 20);
		contentPane.add(txtNota3);
		txtNota3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Source Serif Pro", Font.PLAIN, 14));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(40, 24, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nota 1:");
		lblNewLabel_1.setFont(new Font("Source Serif Pro", Font.PLAIN, 14));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(40, 80, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nota 2:");
		lblNewLabel_2.setFont(new Font("Source Serif Pro", Font.PLAIN, 14));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(40, 136, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nota 3:");
		lblNewLabel_3.setFont(new Font("Source Serif Pro", Font.PLAIN, 14));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(40, 191, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnCalcular = new JButton("Calcular média do aluno");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				String nota1 = txtNota1.getText();
				String nota2 = txtNota2.getText();
				String nota3 = txtNota3.getText();
				if(!nota1.isEmpty() && !nota2.isEmpty() && !nota3.isEmpty()) {
					Double n1 = Double.valueOf(nota1);
					Double n2 = Double.valueOf(nota2);
					Double n3 = Double.valueOf(nota3);
					Double calc = (n1+n2+n3)/3;
					JOptionPane.showMessageDialog(null, calc);
				}
				
				
			}
		});
		btnCalcular.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		btnCalcular.setBackground(new Color(255, 255, 255));
		btnCalcular.setBounds(45, 245, 173, 33);
		contentPane.add(btnCalcular);
	}
}
package triangulo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Color;

public class Triangulo extends JFrame {

	private JPanel contentPane;
	private JTextField ladoA;
	private JTextField ladoB;
	private JTextField ladoC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Triangulo frame = new Triangulo();
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
	public Triangulo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 285, 281);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(32, 11, 130));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		ladoA = new JTextField();
		ladoA.setBounds(123, 26, 86, 20);
		contentPane.add(ladoA);
		ladoA.setColumns(10);

		ladoB = new JTextField();
		ladoB.setBounds(123, 74, 86, 20);
		contentPane.add(ladoB);
		ladoB.setColumns(10);

		ladoC = new JTextField();
		ladoC.setBounds(123, 127, 86, 20);
		contentPane.add(ladoC);
		ladoC.setColumns(10);

		JButton comparacao = new JButton("Compare os n lados");
		comparacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nLadoA = ladoA.getText();
				String nLadoB = ladoB.getText();
				String nLadoC = ladoC.getText();
				
					Integer num1 = Integer.valueOf(nLadoA);
					Integer num2 = Integer.valueOf(nLadoB);
					Integer num3 = Integer.valueOf(nLadoC);
					if (num1 == num2 && num1 == num3 && num2 == num3 ) {
						JOptionPane.showMessageDialog(null, "Triângulo equilátero");
					}
					else if (num1 == num2 || num3 == num2 || num1 == num3) {
						JOptionPane.showMessageDialog(null, "Triângulo isósceles");
					}
					else if (num1 != num2 && num3 != num2 && num1 != num3) {
						JOptionPane.showMessageDialog(null, "Triângulo escaleno");
					}
				}
		
		});
		comparacao.setBounds(67, 190, 152, 23);
		contentPane.add(comparacao);
		
		JLabel lblNewLabel = new JLabel("Lado A:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(67, 29, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblLadoB = new JLabel("Lado B:");
		lblLadoB.setForeground(new Color(255, 255, 255));
		lblLadoB.setBounds(67, 77, 46, 14);
		contentPane.add(lblLadoB);
		
		JLabel lblLadoC = new JLabel("Lado C:");
		lblLadoC.setForeground(new Color(255, 255, 255));
		lblLadoC.setBounds(67, 130, 46, 14);
		contentPane.add(lblLadoC);
	}
}

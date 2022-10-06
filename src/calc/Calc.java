package calc;

/**
 * @author Sam Pfleger Mendes
 * @date 06/10/2002
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;

public class Calc extends JFrame {

	private JPanel contentPane;
	private JTextField num1;
	private JTextField num2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc frame = new Calc();
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
	
public Calc() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 418);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(49, 7, 105));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		num1 = new JTextField();
		num1.setBounds(239, 29, 86, 20);
		contentPane.add(num1);
		num1.setColumns(10);

		num2 = new JTextField();
		num2.setBounds(239, 66, 86, 20);
		contentPane.add(num2);
		num2.setColumns(10);

		JButton btnNewButton = new JButton("+");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto1 = num1.getText();
				String texto2 = num2.getText();

				Integer n1 = Integer.valueOf(texto1);
				Integer n2 = Integer.valueOf(texto2);
				int adc = n1 + n2;
				JOptionPane.showMessageDialog(null, "A SOMA dos valores digitados é: " + adc);

			}
		});
		btnNewButton.setBounds(101, 201, 89, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("x");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto1 = num1.getText();
				String texto2 = num2.getText();

				Integer n1 = Integer.valueOf(texto1);
				Integer n2 = Integer.valueOf(texto2);
				int mul = n1 * n2;
				JOptionPane.showMessageDialog(null, "A MULTIPLICAÇÃO dos valores digitados é : " + mul);
			}
		});
		btnNewButton_1.setBounds(101, 283, 89, 23);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("-");
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto1 = num1.getText();
				String texto2 = num2.getText();

				Integer n1 = Integer.valueOf(texto1);
				Integer n2 = Integer.valueOf(texto2);
				int sub = n1 - n2;
				JOptionPane.showMessageDialog(null, "A SUBTRAÇÃO dos valores digitados é: " + sub);
			}
		});
		btnNewButton_2.setBounds(296, 201, 89, 23);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("÷");
		btnNewButton_3.setBackground(new Color(255, 255, 255));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto1 = num1.getText();
				String texto2 = num2.getText();

				Integer n1 = Integer.valueOf(texto1);
				Integer n2 = Integer.valueOf(texto2);
				int div = n1 / n2;
				JOptionPane.showMessageDialog(null, "A DIVISÃO dos valores digitados é: " + div);
			}

		});
		btnNewButton_3.setBounds(296, 283, 89, 23);
		contentPane.add(btnNewButton_3);

		JLabel lblNewLabel = new JLabel("Digite o primeiro número:");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(47, 32, 182, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Digite o segundo número:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(48, 69, 181, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Selecione o operador a ser utilizado");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setBounds(157, 158, 248, 14);
		contentPane.add(lblNewLabel_2);
	}
}

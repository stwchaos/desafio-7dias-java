package maiorMenor;

/**
 * @author Sam Pfleger Mendes
 * @date 09/10/2022
 * 
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

public class MaiorMenor extends JFrame {

	private JPanel nEntrada;
	private JTextField textField_1;
	private JTextField txtEntrada;
	private JTextField txtMaior;
	private JTextField txtMenor;
	ArrayList<Double> cadastro = new ArrayList();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaiorMenor frame = new MaiorMenor();
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
	public MaiorMenor() {
		setBackground(new Color(81, 66, 201));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 326);
		nEntrada = new JPanel();
		nEntrada.setBackground(new Color(255, 255, 255));
		nEntrada.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(nEntrada);
		nEntrada.setLayout(null);

		txtEntrada = new JTextField();
		txtEntrada.setHorizontalAlignment(SwingConstants.CENTER);
		txtEntrada.setForeground(new Color(153, 193, 241));
		txtEntrada.setBackground(new Color(0, 0, 0));
		txtEntrada.setBounds(80, 43, 114, 19);
		nEntrada.add(txtEntrada);
		txtEntrada.setColumns(10);

		JButton btnExibir = new JButton("EXIBIR");
		btnExibir.setForeground(new Color(255, 255, 255));
		btnExibir.setBackground(new Color(81, 66, 201));
		btnExibir.setFont(new Font("URW Palladio L", Font.BOLD, 16));
		btnExibir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double maior = Double.MIN_VALUE;
				Double menor = Double.MAX_VALUE;

				for (int i = 0; i < cadastro.size(); i++) {
					if (maior < cadastro.get(i)) {
						maior = cadastro.get(i);
						txtMaior.setText(String.valueOf(maior));
					} else if (menor > cadastro.get(i)) {
						menor = cadastro.get(i);
						txtMenor.setText(String.valueOf(menor));
					}
				}
			}
		});
		btnExibir.setBounds(194, 218, 108, 25);
		nEntrada.add(btnExibir);

		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.setForeground(new Color(255, 255, 255));
		btnCadastrar.setBackground(new Color(81, 66, 201));
		btnCadastrar.setFont(new Font("URW Palladio L", Font.BOLD, 16));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cadastro.add(Double.valueOf(txtEntrada.getText()));
			}
		});
		btnCadastrar.setBounds(229, 39, 150, 25);
		nEntrada.add(btnCadastrar);

		JLabel lblInfoTwo = new JLabel("Maior");
		lblInfoTwo.setFont(new Font("Nimbus Mono L", Font.BOLD, 16));
		lblInfoTwo.setBounds(107, 156, 70, 15);
		nEntrada.add(lblInfoTwo);

		JLabel lblInfoThree = new JLabel("Menor");
		lblInfoThree.setFont(new Font("Nimbus Mono L", Font.BOLD, 16));
		lblInfoThree.setBounds(335, 156, 70, 15);
		nEntrada.add(lblInfoThree);

		txtMaior = new JTextField();
		txtMaior.setHorizontalAlignment(SwingConstants.CENTER);
		txtMaior.setForeground(new Color(153, 193, 241));
		txtMaior.setBackground(new Color(0, 0, 0));
		lblInfoTwo.setLabelFor(txtMaior);
		txtMaior.setEditable(false);
		txtMaior.setColumns(10);
		txtMaior.setBounds(80, 183, 114, 19);
		nEntrada.add(txtMaior);

		txtMenor = new JTextField();
		txtMenor.setHorizontalAlignment(SwingConstants.CENTER);
		txtMenor.setForeground(new Color(153, 193, 241));
		txtMenor.setBackground(new Color(0, 0, 0));
		lblInfoThree.setLabelFor(txtMenor);
		txtMenor.setEditable(false);
		txtMenor.setColumns(10);
		txtMenor.setBounds(305, 183, 114, 19);
		nEntrada.add(txtMenor);

		JLabel lblInfoOne = new JLabel("Cadastre diversos números: ");
		lblInfoOne.setLabelFor(txtEntrada);
		lblInfoOne.setFont(new Font("Nimbus Mono L", Font.BOLD, 16));
		lblInfoOne.setBounds(112, 12, 325, 15);
		nEntrada.add(lblInfoOne);

		JLabel lblCatIcon = new JLabel("");
		lblCatIcon.setIcon(new ImageIcon(MaiorMenor.class.getResource("/maiorMenor/catIcon.png")));
		lblCatIcon.setBounds(78, 12, 359, 280);
		nEntrada.add(lblCatIcon);
	}
}
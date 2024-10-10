package atividadesPDS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gasolina extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textDinheiro;
	private JTextField textCusto;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gasolina frame = new Gasolina();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Gasolina() {
		setTitle("Valor da Gasolina");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblDinheiro = new JLabel("Dinheiro: ");
		lblDinheiro.setFont(new Font("Tahoma", Font.ITALIC, 11));
		
		JLabel lblCusto = new JLabel("Custo da gasolina: ");
		lblCusto.setFont(new Font("Tahoma", Font.ITALIC, 11));
		
		textDinheiro = new JTextField();
		textDinheiro.setColumns(10);
		
		textCusto = new JTextField();
		textCusto.setColumns(10);
		
		JLabel lblResposta = new JLabel("");
		
		JButton btnLitros = new JButton("Rende?");
		btnLitros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double dinheiro = Double.parseDouble(textDinheiro.getText());
				double custo =  Double.parseDouble(textCusto.getText());
				lblResposta.setText("isso rende: " + dinheiro/custo + "L de gasolina");
				
			}
		});
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(63)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblDinheiro)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textDinheiro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblCusto)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(textCusto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(10)
									.addComponent(lblResposta))
								.addComponent(btnLitros))))
					.addContainerGap(225, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(44)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDinheiro)
						.addComponent(textDinheiro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCusto)
						.addComponent(textCusto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnLitros)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblResposta)
					.addContainerGap(112, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}

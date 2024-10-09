package atividadesPDS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Nome extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textNome;
	private JTextField textSobrenome;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nome frame = new Nome();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Nome() {
		setTitle("nome");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textNome = new JTextField();
		textNome.setColumns(10);
		
		JLabel lblNome = new JLabel("Primeiro nome");
		lblNome.setFont(new Font("Tahoma", Font.ITALIC, 11));
		
		JLabel lblSobrenome = new JLabel("Sobrenome");
		lblSobrenome.setFont(new Font("Tahoma", Font.ITALIC, 11));
		
		textSobrenome = new JTextField();
		textSobrenome.setColumns(10);
		
		JLabel lblNcompleto = new JLabel("");
		lblNcompleto.setFont(new Font("Tahoma", Font.ITALIC, 11));
		
		JButton btnUnir = new JButton("Okay");
		btnUnir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = textNome.getText();
				String sobrenome = textSobrenome.getText();
				
				if (nome.isEmpty() || sobrenome.isEmpty()) {
					lblNcompleto.setText("Por favor insira todas suas informações");
					return;
				} else {
					lblNcompleto.setText(nome + " " + sobrenome); 
				}
			}
		});
		btnUnir.setFont(new Font("Tahoma", Font.ITALIC, 11));
		
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(158)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblSobrenome)
								.addComponent(lblNome)
								.addComponent(textSobrenome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnUnir)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(179)
							.addComponent(lblNcompleto)))
					.addContainerGap(349, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(48)
					.addComponent(lblNome)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblSobrenome)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textSobrenome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNcompleto)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnUnir)
					.addContainerGap(77, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}

}

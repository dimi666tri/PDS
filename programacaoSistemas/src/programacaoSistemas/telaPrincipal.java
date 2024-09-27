package programacaoSistemas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class telaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaPrincipal frame = new telaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public telaPrincipal() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("Fechar");
		btnNewButton.setBounds(298, 205, 99, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		getContentPane().setLayout(null);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("olá mundo");
		lblNewLabel.setBounds(181, 104, 66, 14);
		getContentPane().add(lblNewLabel);
		
		JButton btnteste1 = new JButton("teste1");
		btnteste1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showConfirmDialog(null, "bom dia amigos");}
		});
		btnteste1.setBounds(35, 205, 89, 23);
		getContentPane().add(btnteste1);
		
		JButton btnteste2 = new JButton("teste2");
		btnteste2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int resposta =  JOptionPane.showConfirmDialog(null, "você está gostando de programar?", "Confirmação",
						JOptionPane.YES_NO_OPTION);
				System.out.println(resposta);
				if (resposta == 0) {
					JOptionPane.showMessageDialog(null, "fico feliz", "RESPOSTA SIM!", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "fico triste", "RESPOSTA NÃO!", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnteste2.setBounds(134, 205, 89, 23);
		getContentPane().add(btnteste2);
		
		JButton btnteste3 = new JButton("teste 3");
		btnteste3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = JOptionPane.showInputDialog(null, "Qual seu nome?","entrada de nome",JOptionPane.QUESTION_MESSAGE);
				JOptionPane.showMessageDialog(null,"o nome digitado foi: " + nome);
			}
		});
		btnteste3.setBounds(82, 171, 89, 23);
		getContentPane().add(btnteste3);

	}
}

package programacaoSistemas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class validarIdade extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtNOME;
	private JTextField txtIDADE;
	private JLabel lblresposta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					validarIdade frame = new validarIdade();
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
	public validarIdade() {
		setTitle("validador");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblnome = new JLabel("Nome:");
		lblnome.setBounds(74, 55, 46, 14);
		getContentPane().add(lblnome);
		
		JLabel lblidade = new JLabel("Idade:");
		lblidade.setBounds(74, 98, 46, 14);
		getContentPane().add(lblidade);
		
		txtNOME = new JTextField();
		txtNOME.setBounds(125, 52, 131, 20);
		getContentPane().add(txtNOME);
		txtNOME.setColumns(10);
		
		txtIDADE = new JTextField();
		txtIDADE.setBounds(125, 95, 46, 20);
		getContentPane().add(txtIDADE);
		txtIDADE.setColumns(10);
		
		JLabel lblresposta = new JLabel("");
		lblresposta.setBounds(53, 176, 331, 36);
		getContentPane().add(lblresposta);
	
		
		JButton btnValidar = new JButton("Validar");
		btnValidar.setBounds(163, 145, 89, 23);
		getContentPane().add(btnValidar);
		
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//mostrarResultado ();
				String nome = txtNOME.getText();
				String idadeStr = txtIDADE.getText();
				
				if (nome.isEmpty()) {
					lblresposta.setText("insira o nome, por favor");
					return;
				}
				if (idadeStr.isEmpty()) {
					lblresposta.setText("insira a idade, por favor");
					return;
				}
				
				try {
				int idade = Integer.parseInt(idadeStr);
				if (idade < 1) {
					lblresposta.setText("idade invalida");
					return;
				}
				String mensagem = "Nome: " + nome + " Idade: " + idade;
				if (idade < 18 ) {
					mensagem += "(Menor de idade)";
				} else {
					mensagem += "(Maior de idade)";
				}
				
				lblresposta.setText(mensagem); } catch (NumberFormatException ex) {
					lblresposta.setText("Por favor, insira uma idade valida");
				}
			}  
		
	});
//	private void mostrarResultado () { }
	
} }

package atividadesPDS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fomelandia extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textPesoP;
	private JTextField textValor;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fomelandia frame = new Fomelandia();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	public Fomelandia() {
		setFont(new Font("Candara Light", Font.ITALIC, 12));
		setTitle("fomelandia");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblpesoP = new JLabel("Peso do prato: ");
		lblpesoP.setFont(new Font("Tahoma", Font.ITALIC, 11));
		
		JLabel lblValor = new JLabel("Valor do kg:");
		lblValor.setFont(new Font("Tahoma", Font.ITALIC, 11));
		
		textPesoP = new JTextField();
		textPesoP.setColumns(10);
		
		textValor = new JTextField();
		textValor.setColumns(10);
		
		JLabel lblResposta = new JLabel("");
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pesoPStr = textPesoP.getText();
				String valorStr = textValor.getText();
				if (pesoPStr.isEmpty() || valorStr.isEmpty()) {
					lblResposta.setText("Por favor insira as informações");
					return;
				} 
				double pesoP = Double.parseDouble(pesoPStr);
				double valor = Double.parseDouble(valorStr);
				lblResposta.setText("o valor do prato é :" + pesoP*valor);
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.ITALIC, 11));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(50)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblpesoP)
						.addComponent(lblValor))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addComponent(lblResposta))
						.addComponent(btnCalcular)
						.addComponent(textValor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textPesoP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(235, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(52)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblpesoP)
						.addComponent(textPesoP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblValor)
						.addComponent(textValor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnCalcular)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblResposta)
					.addContainerGap(104, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}

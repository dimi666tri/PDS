package atividadesPDS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Matematica extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textBase;
	private JTextField textAltura;
	private JLabel lblperimetro;
	private JLabel lblArea;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Matematica frame = new Matematica();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Matematica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblBase = new JLabel("Base: ");
		
		JLabel lblAltura = new JLabel("Altura: ");
		
		textBase = new JTextField();
		textBase.setColumns(10);
		
		textAltura = new JTextField();
		textAltura.setColumns(10);
		
		lblperimetro = new JLabel("");
		lblArea = new JLabel("");
		
		JButton btnCalcular = new JButton("Carcular!");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculo();
			}
			
			private void calculo () {
				double base = Double.parseDouble(textBase.getText());
				double altura = Double.parseDouble(textAltura.getText());
				Retangulo reg = new Retangulo();
				reg.valores(base, altura);
				double perimetro = reg.perimetro();
				double area = reg.area();
				lblArea.setText("Area: " + area);
				lblperimetro.setText("Perimetro: " + perimetro);
			}
			
		});
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblBase)
						.addComponent(lblAltura))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnCalcular)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(textAltura, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblArea))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(textBase, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblperimetro)))
					.addContainerGap(232, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBase)
						.addComponent(textBase, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblperimetro))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAltura)
						.addComponent(textAltura, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblArea))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnCalcular)
					.addContainerGap(172, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}

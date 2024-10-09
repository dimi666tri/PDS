package atividadesPDS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Conversão extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFarenheit;
	private JLabel lblResposta;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversão frame = new Conversão();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Conversão() {
		setBackground(new Color(255, 255, 255));
		setTitle("Conversão");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblFarenheit = new JLabel("Farenheit:");
		lblFarenheit.setFont(new Font("Courier New", Font.ITALIC, 11));
		
		textFarenheit = new JTextField();
		textFarenheit.setColumns(10);
		
		lblResposta = new JLabel("");
		lblResposta.setHorizontalAlignment(SwingConstants.CENTER);
		lblResposta.setFont(new Font("Courier New", Font.ITALIC, 11));
		
		JButton btnConverta = new JButton("Converter!");
		btnConverta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fireStr = textFarenheit.getText();
				
				if ( fireStr.isEmpty()) {
					lblResposta.setText("Por favor preencha as temperaturas!");
					return;
				} 
				int fire = Integer.parseInt(fireStr);
				int resposta = (fire-32)*5/9;
				lblResposta.setText("Celcius:" + resposta);
			}
		});
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(151)
							.addComponent(btnConverta))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(171)
							.addComponent(lblResposta))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(80)
							.addComponent(lblFarenheit)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textFarenheit, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(262, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(55)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFarenheit)
						.addComponent(textFarenheit, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(lblResposta)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnConverta)
					.addContainerGap(124, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		
		
	}

}

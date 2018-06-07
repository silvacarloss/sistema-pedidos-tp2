package br.edu.ifsp.btv.Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CheckPayment extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtBankId;
	private JButton btnConfirm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckPayment frame = new CheckPayment();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public boolean validateFields() {
		Integer valids = 0;
		if(!this.txtName.getText().equals("")) {
			valids++;
		}
		if(!this.txtBankId.getText().equals("")) {
			valids++;
		}
		return valids == 2;
	}

	/**
	 * Create the frame.
	 */
	public CheckPayment() {
		setTitle("Dados do cheque");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNameOwner = new JLabel("Nome do proprietário");
		
		txtName = new JTextField();
		txtName.setColumns(10);
		
		JLabel lblBankId = new JLabel("Id do banco");
		
		txtBankId = new JTextField();
		txtBankId.setColumns(10);
		
		btnConfirm = new JButton("Confirmar");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(validateFields()) {
					JOptionPane.showMessageDialog(null, 
							"Parabéns pela sua aquisição, suas compras serão entregues em breve.", 
							"Compra efetuada com sucesso", JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, 
							"Preencha todos os campos", 
							"Erro ao prosseguir", 
							JOptionPane.ERROR_MESSAGE);					
				}
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(30)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnConfirm)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblBankId, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
								.addGap(36)
								.addComponent(txtBankId, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblNameOwner)
								.addGap(36)
								.addComponent(txtName, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(24)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNameOwner)
						.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(12)
							.addComponent(lblBankId))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addComponent(txtBankId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
					.addComponent(btnConfirm)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}

}

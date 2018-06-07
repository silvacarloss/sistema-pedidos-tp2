package br.edu.ifsp.btv.Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.edu.ifsp.btv.SispedidosApplication;
import br.edu.ifsp.btv.Controllers.Check;

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
	private JLabel lblClient;

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
					Check paymentCheck = new Check();
					try {
						paymentCheck.setBankID(Integer.parseInt(txtBankId.getText().toString()));
						paymentCheck.setName(txtName.getText().toString());
						Utils.savePaymentMethod(paymentCheck);
						
						OrderDetails shippingOrderDetails = new OrderDetails();
						shippingOrderDetails.show();
						hide();
					}catch(Exception ex) {
						JOptionPane.showMessageDialog(null, 
								"Digite somente números no campo bank id", 
								"Erro ao prosseguir", 
								JOptionPane.ERROR_MESSAGE);
					}
					
				}else {
					JOptionPane.showMessageDialog(null, 
							"Preencha todos os campos", 
							"Erro ao prosseguir", 
							JOptionPane.ERROR_MESSAGE);					
				}
			}
		});
		
		lblClient = new JLabel("Cliente");
		lblClient.setText("Cliente: " + SispedidosApplication.getInstance().getCustomer().getName());
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(267)
					.addComponent(btnConfirm))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(28, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblBankId, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
							.addGap(36)
							.addComponent(txtBankId, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNameOwner)
							.addGap(36)
							.addComponent(txtName, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(29)
					.addComponent(lblClient)
					.addContainerGap(291, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblClient)
					.addPreferredGap(ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
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
					.addGap(34)
					.addComponent(btnConfirm)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}

}

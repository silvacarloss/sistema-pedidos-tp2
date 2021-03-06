package br.edu.ifsp.btv.Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.edu.ifsp.btv.SispedidosApplication;
import br.edu.ifsp.btv.Controllers.Credit;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;

public class CreditPayment extends JFrame {

	private JPanel contentPane;
	private JTextField txtCreditNumber;
	private JTextField txtType;
	private JTextField txtData;
	private JButton btnConfirm;
	private JLabel lblClient;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreditPayment frame = new CreditPayment();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public boolean validateFields() {
		Integer valids = 0;
		if(!this.txtCreditNumber.getText().equals("")) {
			valids++;
		}
		if(!this.txtType.getText().equals("")) {
			valids++;
		}
		if(!this.txtData.getText().equals("")) {
			valids++;
		}
		return valids == 3;
	}

	/**
	 * Create the frame.
	 */
	public CreditPayment() {
		setTitle("Dados do cartão");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 220);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNumber = new JLabel("Número do cartão:");
		
		JLabel lblType = new JLabel("Tipo");
		
		JLabel lblDataDeExpirao = new JLabel("Data de expiração");
		
		txtCreditNumber = new JTextField();
		txtCreditNumber.setColumns(10);
		
		txtType = new JTextField();
		txtType.setColumns(10);
		
		txtData = new JTextField();
		txtData.setColumns(10);	
		
		btnConfirm = new JButton("Confirmar");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(validateFields()) {
					Credit creditPayment = new Credit();
					try {
						creditPayment.setExpDate(new Date(txtData.getText().toString()));
						creditPayment.setNumber(txtCreditNumber.getText().toString());
						creditPayment.setType(true);
						
						SispedidosApplication.getInstance().setPaymentMethod(creditPayment);
						
						OrderDetails shippingOrderDetails = new OrderDetails();
						shippingOrderDetails.show();
						hide();
					}catch(Exception ex) {
						JOptionPane.showMessageDialog(null, 
								"Formato do campo data incorreto", 
								"Erro ao coletar data digitada", 
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
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(325, Short.MAX_VALUE)
					.addComponent(btnConfirm)
					.addContainerGap())
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblType, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
							.addComponent(lblDataDeExpirao, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNumber, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)))
					.addGap(62)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtType, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCreditNumber, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtData, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(27, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblClient)
					.addContainerGap(348, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblClient)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNumber)
						.addComponent(txtCreditNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(14)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblType)
						.addComponent(txtType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDataDeExpirao, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtData, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnConfirm)
					.addContainerGap(14, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}

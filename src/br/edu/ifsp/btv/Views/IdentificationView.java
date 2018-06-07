package br.edu.ifsp.btv.Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.edu.ifsp.btv.Controllers.Customer;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;

public class IdentificationView extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtStreet;
	private JTextField txtCity;
	private JTextField txtNeighborhood;
	private JTextField txtNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IdentificationView frame = new IdentificationView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public boolean validateFields() {		
		Integer valids = 0;
		if(!this.txtStreet.getText().equals("")) {
			valids++;
		}
		if(!this.txtNumber.getText().equals("")) {
			valids++;
		}
		if(!this.txtName.getText().equals("")) {
			valids++;
		}
		if(!this.txtCity.getText().equals("")) {
			valids++;
		}
		if(!this.txtNeighborhood.getText().equals("")) {
			valids++;
		}
		return valids == 5;
	}

	/**
	 * Create the frame.
	 */
	public IdentificationView() {
		setTitle("Loja online");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNext = new JButton("Seguinte");
		btnNext.setHorizontalAlignment(SwingConstants.RIGHT);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(validateFields()) {
					String name = txtName.getText().toString();
					String address = txtStreet.getText().toString() + ", " + 
							txtNumber.getText().toString() + " " +
							txtNeighborhood.getText().toString() + " " +
							txtCity.getText().toString();
					
					Customer customer = new Customer();
					customer.setAddress(address);
					customer.setName(name);
					
					ShoppingView shopping = new ShoppingView();
					shopping.show();
				}else {
					JOptionPane.showMessageDialog(null, 
							"Preencha todos os campos", 
							"Erro ao prosseguir", 
							JOptionPane.ERROR_MESSAGE);					
				}
			}
		});
		
		JLabel lblIdentification = new JLabel("Identificação");
		lblIdentification.setFont(new Font("Dialog", Font.BOLD, 14));
		
		JLabel lblNome = new JLabel("Nome:");
		
		txtName = new JTextField();
		txtName.setColumns(10);
		
		JLabel lblAddres = new JLabel("Endereço");
		lblAddres.setFont(new Font("Dialog", Font.BOLD, 14));
		
		JLabel lblRua = new JLabel("Rua:");
		
		JLabel lblCidade = new JLabel("Cidade:");
		
		JLabel lblBairro = new JLabel("Bairro:");
		
		txtStreet = new JTextField();
		txtStreet.setColumns(10);
		
		txtCity = new JTextField();
		txtCity.setColumns(10);
		
		txtNeighborhood = new JTextField();
		txtNeighborhood.setColumns(10);
		
		JLabel lblNumber = new JLabel("Número:");
		
		txtNumber = new JTextField();
		txtNumber.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(430, Short.MAX_VALUE)
					.addComponent(btnNext)
					.addGap(62))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblAddres, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblBairro)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(txtNeighborhood))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblCidade)
										.addComponent(lblRua))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(txtCity)
										.addComponent(txtStreet, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE))))
							.addGap(30)
							.addComponent(lblNumber)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtNumber, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNome)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtName, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblIdentification, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(118, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblIdentification)
					.addGap(22)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(lblAddres, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblRua)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(txtStreet, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNumber)
							.addComponent(txtNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(16)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCidade)
						.addComponent(txtCity, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBairro)
						.addComponent(txtNeighborhood, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addComponent(btnNext)
					.addGap(50))
		);
		contentPane.setLayout(gl_contentPane);
	}
}

package br.edu.ifsp.btv.Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.edu.ifsp.btv.SispedidosApplication;
import br.edu.ifsp.btv.Controllers.Item;

import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Panel;
import java.awt.Label;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShoppingView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShoppingView frame = new ShoppingView();
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
	public ShoppingView() {
		setTitle("Confirmação de pedido");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblFormasDePagamento = new JLabel("Formas de pagamento");
		
		JComboBox paymentMethod = new JComboBox();
		paymentMethod.setModel(new DefaultComboBoxModel(new String[] {"-- Selecione --", "Crédito", "Cheque", "Dinheiro"}));
		
		JPanel itemsPanel = new JPanel();
		
		JLabel lblListaDeItens = new JLabel("Lista de itens selecionados");
		
		JLabel lblPriceText = new JLabel("Valor total da compra:");
		
		JLabel lblPrice = new JLabel("0");
		
		float totalPrice = 0;
		
		for(Item item : Utils.generateListItems()) {
			JLabel lblNewItem = new JLabel("Descrição: " + item.getDescription() + " Preço: " + item.getPrice());
			totalPrice += item.getPrice();
			itemsPanel.add(lblNewItem);
		}
		
		lblPrice.setText(Float.toString(totalPrice));
		
		JButton confirmShipping = new JButton("Comprar");
		confirmShipping.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				if(paymentMethod.getModel().getSelectedItem().equals("Crédito")) {
					CreditPayment credit = new CreditPayment();
					credit.show();
				}else if(paymentMethod.getModel().getSelectedItem().equals("Dinheiro")){
					JOptionPane.showMessageDialog(null, 
							"Parabéns pela sua aquisição, suas compras serão entregues em breve.", 
							"Compra efetuada com sucesso", JOptionPane.INFORMATION_MESSAGE);
					System.exit(1);
				}else if(paymentMethod.getModel().getSelectedItem().equals("Cheque")) {
					CheckPayment check = new CheckPayment();
					check.show();
				}else {
					JOptionPane.showMessageDialog(null, 
							"Selecione corretamente a forma de pagamento", 
							"Erro ao prosseguir", JOptionPane.ERROR_MESSAGE);
				}
			}
		});	
		
		
		JLabel lblClient = new JLabel("Cliente");
		lblClient.setText("Sr (a): " + SispedidosApplication.getInstance().getCustomer().getName() + "\n"
				+ " confirme seu pedido e selecione o tipo de pagamento");
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblClient)
							.addContainerGap())
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblListaDeItens)
								.addContainerGap())
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(itemsPanel, GroupLayout.PREFERRED_SIZE, 395, GroupLayout.PREFERRED_SIZE)
									.addContainerGap())
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(lblFormasDePagamento)
										.addContainerGap())
									.addComponent(paymentMethod, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(lblPriceText, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(lblPrice)
										.addGap(156)
										.addComponent(confirmShipping)
										.addGap(21)))))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblClient)
					.addPreferredGap(ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
					.addComponent(lblListaDeItens)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(itemsPanel, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblFormasDePagamento)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(paymentMethod, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPriceText)
								.addComponent(lblPrice))
							.addGap(25))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(confirmShipping)
							.addGap(28))))
		);
		contentPane.setLayout(gl_contentPane);
	}
}

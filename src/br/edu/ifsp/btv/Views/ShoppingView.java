package br.edu.ifsp.btv.Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 350);
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
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(paymentMethod, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblListaDeItens)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(lblPriceText, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblFormasDePagamento, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(18)
							.addComponent(lblPrice))
						.addComponent(itemsPanel, GroupLayout.PREFERRED_SIZE, 395, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(73, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(359, Short.MAX_VALUE)
					.addComponent(confirmShipping)
					.addGap(27))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblListaDeItens)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(itemsPanel, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblFormasDePagamento)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(paymentMethod, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPriceText)
						.addComponent(lblPrice))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(confirmShipping)
					.addContainerGap(21, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}

package br.edu.ifsp.btv.Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.edu.ifsp.btv.SispedidosApplication;
import br.edu.ifsp.btv.Controllers.Item;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class OrderDetails extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderDetails frame = new OrderDetails();
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
	public OrderDetails() {
		setTitle("Detalhes do pedido");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblQuantidadeDeItens = new JLabel("Quantidade de itens:");
		
		JLabel lblQuantity = new JLabel("");
		lblQuantity.setText(Integer.toString(SispedidosApplication.getInstance().getChartItems().size()));
		
		JLabel lblSubtotal = new JLabel("Subtotal:");
		JLabel lblThanks = new JLabel("Obrigado por comprar conosco!");	
		JLabel lblSentMessage = new JLabel("Seu pedido será entregue em breve.");		
		JLabel lblTotalWeightTxt = new JLabel("Peso total da compra:");
		
		float total = 0;
		float weight = 0;
		
		for(Item item : SispedidosApplication.getInstance().getChartItems()) {
			total += item.getPrice();
			weight += item.getWeight();
		}
		
		lblThanks.setText("Obrigado por comprar conosco, " + 
		SispedidosApplication.getInstance().getCustomer().getName());
		
		JLabel labelSubtotal = new JLabel("0");
		labelSubtotal.setText(Float.toString(total));
		
		JLabel labelWeight = new JLabel("0");
		labelWeight.setText(Float.toString(weight));
	
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSentMessage)
						.addComponent(lblThanks)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblTotalWeightTxt)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(labelWeight))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblQuantidadeDeItens)
								.addComponent(lblSubtotal, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(labelSubtotal)
								.addComponent(lblQuantity))))
					.addContainerGap(123, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblQuantidadeDeItens)
						.addComponent(lblQuantity))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblSubtotal)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTotalWeightTxt)
								.addComponent(labelWeight)))
						.addComponent(labelSubtotal))
					.addGap(24)
					.addComponent(lblThanks)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblSentMessage)
					.addContainerGap(68, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}

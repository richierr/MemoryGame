package app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Window extends JFrame {
	Deck deck;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window frame = new Window();
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
	public Window() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 723, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel JpanelZaTabelu = new JPanel();

		
		
		//-------------------------------------START DUGME
		JButton btnStartGame = new JButton("Start game");
		btnStartGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				deck=new Deck();
				
				
				for(Card c:deck.getCards()) {
					System.out.println(c.getAdress()+" " +c.getValue());
				}
				
				
				
				
			}
		});
		
		JLabel lblTimeStatic = new JLabel("Time:");
		
		JLabel lblTime = new JLabel("");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(57)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnStartGame)
						.addComponent(lblTimeStatic)
						.addComponent(lblTime))
					.addGap(86)
					.addComponent(JpanelZaTabelu, GroupLayout.PREFERRED_SIZE, 468, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(JpanelZaTabelu, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(143)
					.addComponent(lblTimeStatic)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblTime)
					.addPreferredGap(ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
					.addComponent(btnStartGame)
					.addGap(46))
		);
		JpanelZaTabelu.setLayout(new GridLayout(3, 1, 0, 0));
		
		JButton btnNewButton = new JButton("");
		JpanelZaTabelu.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		JpanelZaTabelu.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		JpanelZaTabelu.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		JpanelZaTabelu.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		JpanelZaTabelu.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		JpanelZaTabelu.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		JpanelZaTabelu.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("");
		JpanelZaTabelu.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("");
		JpanelZaTabelu.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("");
		JpanelZaTabelu.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("");
		JpanelZaTabelu.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("");
		JpanelZaTabelu.add(btnNewButton_11);
		contentPane.setLayout(gl_contentPane);
	}
}

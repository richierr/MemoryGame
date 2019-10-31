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
import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingWorker;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class Window extends JFrame {
	Deck deck;
	private Boolean gameIsOn = false;

	private JPanel contentPane;
	private JLabel lblStopwatch;
	

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

		lblStopwatch = new JLabel("");

		// -------------------------------------START DUGME
		JButton btnStartGame = new JButton("Start game");

		btnStartGame.addActionListener(new ActionListener() {
			StopWatchClass stopwatch;

			public void actionPerformed(ActionEvent arg0) {

				if (gameIsOn == false) {
					deck = new Deck();
					stopwatch = new StopWatchClass(lblStopwatch);
					gameIsOn = true;

					stopwatch.execute();
					// btnStartGame.setText("Stop game");
					// System.out.println("Ovde sam jer je gameison false bio");
				} else {
					gameIsOn = false;
					stopwatch.cancel(true);
					System.out.println(stopwatch.isCancelled());
					btnStartGame.setText("Start game");
					// System.out.println("ovde sam jer je bio true");
				}

//				StopWatch stopwatch=new StopWatch();
//				if (gameIsOn==false) {
//					gameIsOn=true;
//					deck=new Deck();
//					
//					//UtillityClass.stopWatch( lblStopwatch);
//					
//					stopwatch.startStopwatch(lblStopwatch);
//					
//				}else {
//					gameIsOn=false;
//					stopwatch.stopStopwatch();
//				}

			}
		});

		JLabel lblTimeStatic = new JLabel("Time:");

		JLabel lblTime = new JLabel("");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(57)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(btnStartGame)
								.addGroup(gl_contentPane.createSequentialGroup().addComponent(lblTimeStatic)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(lblStopwatch))
								.addComponent(lblTime))
						.addGap(84)
						.addComponent(JpanelZaTabelu, GroupLayout.PREFERRED_SIZE, 468, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addComponent(JpanelZaTabelu, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(143)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblTimeStatic)
								.addComponent(lblStopwatch))
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(lblTime)
						.addPreferredGap(ComponentPlacement.RELATED, 231, Short.MAX_VALUE).addComponent(btnStartGame)
						.addGap(46)));
		JpanelZaTabelu.setLayout(new GridLayout(3, 1, 0, 0));

		// ----------------------------------------------------BUTTONS----------------------------------------
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Icon icon1 = new ImageIcon(deck.cards.get(0).getAdress());

				btnNewButton.setIcon(icon1);

			}
		});
		JpanelZaTabelu.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Icon icon1 = new ImageIcon(deck.cards.get(1).getAdress());

				btnNewButton_1.setIcon(icon1);

			}
		});

		JpanelZaTabelu.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Icon icon1 = new ImageIcon(deck.cards.get(2).getAdress());

				btnNewButton_2.setIcon(icon1);

			}
		});
		JpanelZaTabelu.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Icon icon1 = new ImageIcon(deck.cards.get(3).getAdress());

				btnNewButton_3.setIcon(icon1);

			}
		});
		JpanelZaTabelu.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Icon icon1 = new ImageIcon(deck.cards.get(4).getAdress());

				btnNewButton_4.setIcon(icon1);

			}
		});
		JpanelZaTabelu.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Icon icon1 = new ImageIcon(deck.cards.get(5).getAdress());

				btnNewButton_5.setIcon(icon1);

			}
		});
		JpanelZaTabelu.add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Icon icon1 = new ImageIcon(deck.cards.get(6).getAdress());
				System.out.println(deck.cards.get(6).getValue());
				btnNewButton_6.setIcon(icon1);

			}
		});
		JpanelZaTabelu.add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Icon icon1 = new ImageIcon(deck.cards.get(7).getAdress());
				System.out.println(deck.cards.get(7).getValue());
				btnNewButton_7.setIcon(icon1);

			}
		});
		JpanelZaTabelu.add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Icon icon1 = new ImageIcon(deck.cards.get(8).getAdress());
				System.out.println(deck.cards.get(8).getValue());
				btnNewButton_8.setIcon(icon1);

			}
		});
		JpanelZaTabelu.add(btnNewButton_8);

		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Icon icon1 = new ImageIcon(deck.cards.get(9).getAdress());
				System.out.println(deck.cards.get(9).getValue());
				btnNewButton_9.setIcon(icon1);

			}
		});
		JpanelZaTabelu.add(btnNewButton_9);

		JButton btnNewButton_10 = new JButton("");
		btnNewButton_10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Icon icon1 = new ImageIcon(deck.cards.get(10).getAdress());
				System.out.println(deck.cards.get(10).getValue());
				btnNewButton_10.setIcon(icon1);

			}
		});
		JpanelZaTabelu.add(btnNewButton_10);

		JButton btnNewButton_11 = new JButton("");
		btnNewButton_11.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Icon icon1 = new ImageIcon(deck.cards.get(11).getAdress());
				System.out.println(deck.cards.get(11).getValue());

				btnNewButton_11.setIcon(icon1);

			}
		});
		JpanelZaTabelu.add(btnNewButton_11);
		contentPane.setLayout(gl_contentPane);
	}
}

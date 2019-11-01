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
import java.util.regex.Matcher;
import java.awt.event.ActionEvent;

public class Window extends JFrame {
	private JPanel contentPane;
	private JLabel lblStopwatch;
	private GameMatch match=new GameMatch(false ,this);
	private JPanel JpanelZaTabelu;
	private StopWatchClass stopwatch;
	private ArrayList<Player> topLista=new ArrayList<Player>();
	private JButton btnStartGame;
	
	
	
	
	
	
	
	public ArrayList<Player> getTopLista() {
		return topLista;
	}

	public void setTopLista(ArrayList<Player> topLista) {
		this.topLista = topLista;
	}

	public StopWatchClass getStopwatch() {
		return stopwatch;
	}

	public void setStopwatch(StopWatchClass stopwatch) {
		this.stopwatch = stopwatch;
	}

	public JPanel getJpanelZaTabelu() {
		return JpanelZaTabelu;
	}

	public void setJpanelZaTabelu(JPanel jpanelZaTabelu) {
		JpanelZaTabelu = jpanelZaTabelu;
	}
	
	

	public JButton getBtnStartGame() {
		return btnStartGame;
	}

	public void setBtnStartGame(JButton btnStartGame) {
		this.btnStartGame = btnStartGame;
	}

	
	
	
	
	
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
		topLista=new ArrayList<Player>();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 723, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JpanelZaTabelu = new JPanel();

		lblStopwatch = new JLabel("");


		// -------------------------------------START DUGME
		btnStartGame = new JButton("Start game");

		btnStartGame.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent arg0) {
//Ako je zaustavljena igra
				if (match.isGameOn() == false) {
					

					match=new GameMatch(Window.this);
					match.setGameOn(true);
					stopwatch = new StopWatchClass(lblStopwatch,match.getScore());
					stopwatch.execute();
					btnStartGame.setText("Stop game");
//Ako je pocela igra					
				} else {
					match.setGameOn(false);
					match.removeButtons();
					stopwatch.cancel(true);
					
					btnStartGame.setText("Start game");
					
				}



			}
		});

		JLabel lblTimeStatic = new JLabel("Time:");
		
		
		
//Top lista dugme		
		JButton btnShowTopList = new JButton("Show toplist");
		btnShowTopList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JDialogTopLista topListaDialog=new JDialogTopLista(topLista);
				topListaDialog.setVisible(true);
				
				
				
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(57)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnStartGame)
						.addComponent(lblTimeStatic)
						.addComponent(lblStopwatch)
						.addComponent(btnShowTopList))
					.addGap(80)
					.addComponent(JpanelZaTabelu, GroupLayout.PREFERRED_SIZE, 468, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(JpanelZaTabelu, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(143)
					.addComponent(lblTimeStatic)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblStopwatch)
					.addPreferredGap(ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
					.addComponent(btnShowTopList)
					.addGap(52)
					.addComponent(btnStartGame)
					.addGap(46))
		);
		JpanelZaTabelu.setLayout(new GridLayout(3, 1, 0, 0));


		contentPane.setLayout(gl_contentPane);
	}
}

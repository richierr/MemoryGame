package app;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JDialogTopLista extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JButton okButton;
	DefaultListModel dlm=new DefaultListModel();
	private JList list = new JList();


	
	


	/**
	 * Create the dialog.
	 */
	public JDialogTopLista(ArrayList<Player> topList) {
		
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		list.setModel(dlm);
		Collections.sort(topList, new MyComparatorForScore());
		
		for(int i=0;i<topList.size();i++) {
			dlm.add(i, (i+1)+". "+topList.get(i).getName()+" "+topList.get(i).getScore());
		}
		contentPanel.setLayout(new GridLayout(0, 1, 0, 0));
		{
			JScrollPane scrollPane = new JScrollPane();
			contentPanel.add(scrollPane);
			{
				
				scrollPane.setViewportView(list);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JDialogTopLista.this.dispose();
					}
				});
				okButton.setActionCommand("OK");
				getRootPane().setDefaultButton(okButton);
			}
			GroupLayout gl_buttonPane = new GroupLayout(buttonPane);
			gl_buttonPane.setHorizontalGroup(
				gl_buttonPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_buttonPane.createSequentialGroup()
						.addGap(188)
						.addComponent(okButton)
						.addContainerGap(199, Short.MAX_VALUE))
			);
			gl_buttonPane.setVerticalGroup(
				gl_buttonPane.createParallelGroup(Alignment.LEADING)
					.addGroup(Alignment.TRAILING, gl_buttonPane.createSequentialGroup()
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(okButton))
			);
			buttonPane.setLayout(gl_buttonPane);
			
		}
	}

}

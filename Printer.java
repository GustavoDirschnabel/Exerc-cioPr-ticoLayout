import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class Printer extends JFrame {
	private JPanel centralPanel, radioPanel,checkPanel,eastPanel,southPanel,whitePanel1,whitePanel2,whitePanel3;
	private JCheckBox check1,check2,check3,checkSouth;
	private JRadioButton radio1,radio2,radio3;
	private ButtonGroup radioGroup;
	private JLabel labelSouth, labelNorth;
	private JButton button1,button2,button3,button4;
	private JComboBox comboBox;
	private static final String[] comboNames = {"High","Medium","Low"};
	private GridBagConstraints constraints;
	
	
	public Printer() {
		super("Printer");
		this.setBackground(Color.LIGHT_GRAY);
		
		eastPanel = new JPanel();
		eastPanel.setLayout(new GridLayout(4,1,10,10));
		
		button1 = new JButton("OK");
		button2 = new JButton("Cancel");
		button3 = new JButton("Setup...");
		button4 = new JButton("Help");
		
		eastPanel.add(button1);
		eastPanel.add(button2);
		eastPanel.add(button3);
		eastPanel.add(button4);
		
		this.add(eastPanel,BorderLayout.EAST);
		
		
		southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(1,3,10,10));
		
		labelSouth = new JLabel("Print Quality: ");
		checkSouth = new JCheckBox("Print to File");
		comboBox = new JComboBox(comboNames);
		
		southPanel.add(labelSouth);
		southPanel.add(comboBox);
		southPanel.add(checkSouth);
		
		this.add(southPanel, BorderLayout.SOUTH);
		
		
		this.centralPanel = new JPanel();
		this.centralPanel.setLayout(new GridBagLayout());
		
		this.checkPanel = new JPanel();
		this.checkPanel.setLayout(new GridLayout(3,1,5,5));
		
		check1 = new JCheckBox("Image");
		check2 = new JCheckBox("Text");
		check3 = new JCheckBox("Code");
		
		checkPanel.add(check1);
		checkPanel.add(check2);
		checkPanel.add(check3);
		
		this.radioPanel = new JPanel();
		this.radioPanel.setLayout(new GridLayout(3,1,5,5));
		
		radio1 = new JRadioButton("Selection");
		radio2 = new JRadioButton("All");
		radio3 = new JRadioButton("Applet");
		
		radioPanel.add(radio1);
		radioPanel.add(radio2);
		radioPanel.add(radio3);
		
		radioGroup = new ButtonGroup();
		radioGroup.add(radio1);
		radioGroup.add(radio2);
		radioGroup.add(radio3);
		
		whitePanel1 = new JPanel();
		whitePanel1.setBackground(Color.WHITE);
		whitePanel1.setSize(new Dimension(50,50));
		
		whitePanel2 = new JPanel();
		whitePanel2.setBackground(Color.WHITE);
		whitePanel2.setSize(new Dimension(50,50));
		
		whitePanel3 = new JPanel();
		whitePanel3.setBackground(Color.WHITE);
		whitePanel3.setSize(new Dimension(50,50));
		
		constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.HORIZONTAL;
		addComponentToGridBag(whitePanel1,centralPanel,1,1,1,GridBagConstraints.REMAINDER);
		addComponentToGridBag(whitePanel2,centralPanel,1,3,1,GridBagConstraints.REMAINDER);
		addComponentToGridBag(whitePanel3,centralPanel,1,5,1,GridBagConstraints.REMAINDER);
		addComponentToGridBag(checkPanel,centralPanel,1,2,1,GridBagConstraints.REMAINDER);
		addComponentToGridBag(radioPanel,centralPanel,1,4,1,GridBagConstraints.REMAINDER);
		
		this.add(centralPanel, BorderLayout.CENTER);
		
		
		labelNorth = new JLabel("Printer: My Printer");
		this.add(labelNorth, BorderLayout.NORTH);
		
	}
	
	public void addComponentToGridBag(Component addedComponent,JPanel receiver,int row, int column, int width, int height) {
		constraints.gridx = row;
		constraints.gridy = column;
		constraints.gridwidth = width;
		constraints.gridheight = height;
		receiver.add(addedComponent);
	}

	public static void main(String[] args) {
		Printer print = new Printer();
		print.setDefaultCloseOperation(EXIT_ON_CLOSE);
		print.setSize(400,200);
		print.setVisible(true);
	}

}

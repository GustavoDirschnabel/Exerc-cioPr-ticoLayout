import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.*;
import java.math.*;
public class Calculadora extends JFrame  {


	

	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton button0;
	private JButton buttonEquals;
	private JButton buttonDivided;
	private JButton buttonTimes;
	private JButton buttonMinus;
	private JButton buttonPlus;
	private JButton buttonDot;
	private JButton buttonFactorial;
	private JButton buttonEuler;
	private JButton buttonSqR;
	private JButton buttonCbR;
	private JButton buttonRoot;
	private JButton buttonPi;
	private JButton buttonC;
	private JButton buttonPercent;
	private JButton buttonSq;
	private JButton buttonCb;
	private JButton buttonPower;
	private JButton buttonParent1;
	private JButton buttonParent2;
	
	private JTextArea textA;
	
	private GridBagLayout layout; 
	private GridBagConstraints constraints;
	 
	
	public Calculadora() {
		super("Calculadora");
		layout = new GridBagLayout();
		setLayout(layout);
		constraints = new GridBagConstraints();
		constraints.insets = new Insets(1,1,1,1);
		
		textA = new JTextArea(1,25);
		constraints.fill = GridBagConstraints.HORIZONTAL;
		addComponent( textA, 0, 0, 7, 1 );
		
		
		button1 = new JButton("1");
		constraints.fill = GridBagConstraints.BOTH;
		addComponent(button1,3,3,1,1);
		
		button2 = new JButton("2");
		addComponent(button2,3,4,1,1);
		
		button3 = new JButton("3");
		addComponent(button3,3,5,1,1);
		
		button4 = new JButton("4");
		addComponent(button4,2,3,1,1);
		
		button5 = new JButton("5");
		addComponent(button5,2,4,1,1);
		
		button6 = new JButton("6");
		addComponent(button6,2,5,1,1);
		
		button7 = new JButton("7");
		addComponent(button7,1,3,1,1);
		
		button8 = new JButton("8");
		addComponent(button8,1,4,1,1);
		
		button9 = new JButton("9");
		addComponent(button9,1,5,1,1);
		
		button0 = new JButton("0");
		addComponent(button0,4,3,1,1);
		
		buttonDivided = new JButton("/");
		addComponent(buttonDivided,1,6,1,1);
		
		buttonTimes = new JButton("*");
		addComponent(buttonTimes,2,6,1,1);
		
		buttonMinus = new JButton("-");
		addComponent(buttonMinus,3,6,1,1);
		
		buttonDot = new JButton(".");
		addComponent(buttonDot,4,4,1,1);
		
		buttonEquals = new JButton("=");
		addComponent(buttonEquals,4,5,1,1);
		
		buttonPlus = new JButton("+");
		addComponent(buttonPlus,4,6,1,1);
		
		buttonFactorial = new JButton("x!");
		addComponent(buttonFactorial,1,0,1,1);
		
		buttonEuler = new JButton("e^x");
		addComponent(buttonEuler,1,1,1,1);
		
		buttonSqR = new JButton("Raiz 2");
		addComponent(buttonSqR,1,2,1,1);
		
		buttonCbR = new JButton("Raiz 3");
		addComponent(buttonCbR,2,0,1,1);
		
		buttonPercent = new JButton("%");
		addComponent(buttonPercent,2,1,1,1);
		
		buttonSq = new JButton("x²");
		addComponent(buttonSq,2,2,1,1);
		
		buttonCb = new JButton("x³");
		addComponent(buttonCb,3,0,1,1);
		
		buttonPower = new JButton("x^y");
		addComponent(buttonPower,3,1,1,1);

		buttonPi = new JButton("Pi");
		addComponent(buttonPi,3,2,1,1);
		
		buttonC = new JButton("C");
		addComponent(buttonC,4,0,1,1);
		
		buttonParent1 = new JButton("(");
		addComponent(buttonParent1,4,1,1,1);
		
		buttonParent2 = new JButton(")");
		addComponent(buttonParent2,4,2,1,1);
		
		ButtonHandler handler = new ButtonHandler();
		button0.addActionListener(handler);
		button1.addActionListener(handler);
		button2.addActionListener(handler);
		button3.addActionListener(handler);
		button4.addActionListener(handler);
		button5.addActionListener(handler);
		button6.addActionListener(handler);
		button7.addActionListener(handler);
		button8.addActionListener(handler);
		button9.addActionListener(handler);
		buttonPlus.addActionListener(handler);
		buttonMinus.addActionListener(handler);
		buttonTimes.addActionListener(handler);
		buttonDivided.addActionListener(handler);
		buttonParent1.addActionListener(handler);
		buttonParent2.addActionListener(handler);
		buttonDot.addActionListener(handler);
		buttonC.addActionListener(handler);
		buttonPi.addActionListener(handler);
		buttonPercent.addActionListener(handler);
		buttonFactorial.addActionListener(handler);
		buttonSq.addActionListener(handler);
		buttonCb.addActionListener(handler);
		buttonSqR.addActionListener(handler);
		buttonCbR.addActionListener(handler);
		buttonEuler.addActionListener(handler);
		buttonPower.addActionListener(handler);
		buttonEquals.addActionListener(handler);
		
		
	}
	
	
	public Double igual(String exp) {
		ArrayList<String> expression = new ArrayList<String>(Arrays.asList(exp.split(" ")));
		for(String i:expression) {
			System.out.println(i);
		}
		return null;
	} 
	
	
	private class ButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button0) {
				textA.append("0");
			} else if(e.getSource() == button1) {
				textA.append("1");
			} else if(e.getSource() == button2) {
				textA.append("2");
			} else if(e.getSource() == button3) {
				textA.append("3");
			} else if(e.getSource() == button4) {
				textA.append("4");
			} else if(e.getSource() == button5) {
				textA.append("5");
			} else if(e.getSource() == button6) {
				textA.append("6");
			} else if(e.getSource() == button7) {
				textA.append("7");
			} else if(e.getSource() == button8) {
				textA.append("8");
			} else if(e.getSource() == button9) {
				textA.append("9");
			} else if(e.getSource() == buttonPlus) {
				textA.append(" + ");
			} else if(e.getSource() == buttonMinus) {
				textA.append(" - ");
			} else if(e.getSource() == buttonDot) {
				textA.append(".");
			} else if(e.getSource() == buttonDivided) {
				textA.append(" / ");
			} else if(e.getSource() == buttonTimes) {
				textA.append(" * ");
			} else if(e.getSource() == buttonC) {
				textA.setText(null);
			} else if(e.getSource() == buttonParent1) {
				textA.append("( ");
			} else if(e.getSource() == buttonParent2) {
				textA.append(" )");
			} else if(e.getSource() == buttonPi) {
				textA.append("3.14");
			} else if(e.getSource() == buttonPercent) {
				Double n = Double.parseDouble(textA.getText());
				n = n/100;
				textA.setText(n.toString());
			} else if(e.getSource() == buttonFactorial) {
				Integer f = Integer.parseInt(textA.getText());
				for(Integer i = f-1; i > 0; i--) {
					f = i*f;
				}
				textA.setText(f.toString());
			} else if (e.getSource() == buttonSqR) {
				Double n = Double.parseDouble(textA.getText());
				n = Math.sqrt(n);
				textA.setText(n.toString());
				
			} else if (e.getSource() == buttonCbR) {
				Double n = Double.parseDouble(textA.getText());
				n = Math.cbrt(n);
				textA.setText(n.toString());
				
			} else if (e.getSource() == buttonSq) {
				Double n = Double.parseDouble(textA.getText());
				n = Math.pow(n, 2);
				textA.setText(n.toString());
				
			} else if (e.getSource() == buttonCb) {
				Double n = Double.parseDouble(textA.getText());
				n = Math.pow(n, 3);
				textA.setText(n.toString());
				
			} else if (e.getSource() == buttonEuler) {
				Double n = Double.parseDouble(textA.getText());
				n = Math.exp(n);
				textA.setText(n.toString());
				
			} else if(e.getSource() == buttonEquals) {
				igual(textA.getText());
				
			} else if (e.getSource() == buttonPower) {
				textA.append(" ^ ");
				
			}
		}
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calc = new Calculadora();
		calc.setDefaultCloseOperation(EXIT_ON_CLOSE);
		calc.setSize(400, 130);
		calc.setVisible(true);
	}

	private void addComponent( Component component,
		      int row, int column, int width, int height )
		   {
		      constraints.gridx = column; // set gridx
		      constraints.gridy = row; // set gridy
		      constraints.gridwidth = width; // set gridwidth
		      constraints.gridheight = height; // set gridheight
		      layout.setConstraints( component, constraints ); // set constraints
		      add( component ); // add component
		   } // end method addComponent
	
}

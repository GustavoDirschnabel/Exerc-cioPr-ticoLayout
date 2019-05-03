import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSelect extends JFrame {
	private JFrame frame;
	private JButton ok,cancelar,cor;
	private Color backColor = Color.LIGHT_GRAY;
	private JPanel colorSelectPanel;
	
	public ColorSelect () {
		super("ColorSelect");
		this.setLayout(new BorderLayout());
		this.getContentPane().setBackground(backColor);
		
		this.colorSelectPanel = new JPanel();
		this.colorSelectPanel.setLayout(new GridLayout(3,1,5,5));
		
		this.cor = new JButton("Cor");
		this.cor.addActionListener(
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent event) {
						backColor = JColorChooser.showDialog(ColorSelect.this, "Escolha uma Cor", backColor);
						
						if(backColor == null) {
							backColor = Color.LIGHT_GRAY;
						}
					} 
					
					
				}
			);
		this.colorSelectPanel.add(cor);
		
		this.ok = new JButton("OK");
		this.ok.addActionListener(
			new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent event) {
					ColorSelect.this.getContentPane().setBackground(backColor);
				} 
					
				
			}
		);
		this.colorSelectPanel.add(ok);
		
		this.cancelar = new JButton("Cancelar");
		this.cancelar.addActionListener(
			new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent event) {
					ColorSelect.this.getContentPane().setBackground(Color.LIGHT_GRAY);					
				} 
					
				
			}
		);
		this.colorSelectPanel.add(cancelar);
		
		this.add(colorSelectPanel,BorderLayout.WEST);
		
	}

	public static void main(String[] args) {
		ColorSelect colorFrame = new ColorSelect();
		colorFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		colorFrame.setSize(800,600);
		colorFrame.setVisible(true);
	}

}

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class ColorSelect extends JFrame {
	private JFrame frame;
	private JButton ok,cancelar,cor;
	private Color backColor = Color.LIGHT_GRAY;
	private JPanel colorSelectPanel;
	private Point[] points = new Point[10000];
	private int pointCount = 0;
	private PaintPanel panel = new PaintPanel();
	
	public ColorSelect () {
		super("ColorSelect");
		this.setLayout(new BorderLayout());
		this.getContentPane().setBackground(backColor);
		
		this.colorSelectPanel = new JPanel();
		this.colorSelectPanel.setBackground(Color.LIGHT_GRAY);
		this.colorSelectPanel.setLayout(new GridLayout(3,1,20,20));
		
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
					colorSelectPanel.setBackground(backColor);
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
					colorSelectPanel.setBackground(Color.LIGHT_GRAY);
				} 
					
				
			}
		);
		this.colorSelectPanel.add(cancelar);
		
		this.add(colorSelectPanel,BorderLayout.WEST);
		
		this.add(panel, BorderLayout.CENTER);
		
		
		
	}

	public static void main(String[] args) {
		ColorSelect colorFrame = new ColorSelect();
		colorFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		colorFrame.setSize(800,600);
		colorFrame.setVisible(true);
	}

}

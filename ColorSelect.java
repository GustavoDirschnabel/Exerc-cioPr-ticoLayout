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
	private JButton ok,cancelar,cor,aumentarLapis,diminuirLapis,limpar;
	private Color backColor = Color.LIGHT_GRAY;
	private JPanel colorSelectPanel,pencilEditPanel;
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
					panel.setCurrentColor(backColor);
					colorSelectPanel.setBackground(backColor);
					pencilEditPanel.setBackground(backColor);
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
					panel.setCurrentColor(Color.LIGHT_GRAY);
					colorSelectPanel.setBackground(Color.LIGHT_GRAY);
					pencilEditPanel.setBackground(Color.LIGHT_GRAY);
				} 
					
				
			}
		);
		this.colorSelectPanel.add(cancelar);
		
		
		this.pencilEditPanel = new JPanel();
		this.pencilEditPanel.setBackground(Color.LIGHT_GRAY);
		this.pencilEditPanel.setLayout(new GridLayout(1,3,20,20));
		
		
		this.aumentarLapis = new JButton("Aumentar Lápis");
		this.aumentarLapis.addActionListener(
			new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent event) {
					panel.setPencilRadius(panel.getPencilRadius() + 1);
				} 
				
			}
		);
		
		
		this.pencilEditPanel.add(aumentarLapis);
		
		this.diminuirLapis = new JButton("Diminuir Lápis");
		this.diminuirLapis.addActionListener(
			new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent event) {
					panel.setPencilRadius(panel.getPencilRadius() - 1);
				} 
					
				
			}
		);
		this.pencilEditPanel.add(diminuirLapis);
		
		this.limpar = new JButton("Limpar");
		this.limpar.addActionListener(
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent event) {
						panel.setPointCount(0);
					} 
				}
				);
		
		this.pencilEditPanel.add(limpar);
		
		this.add(colorSelectPanel,BorderLayout.WEST);
		this.add(pencilEditPanel, BorderLayout.NORTH);
		
		this.add(panel, BorderLayout.CENTER);
		
		
	}

	public static void main(String[] args) {
		ColorSelect colorFrame = new ColorSelect();
		colorFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		colorFrame.setSize(800,600);
		colorFrame.setVisible(true);
	}

}

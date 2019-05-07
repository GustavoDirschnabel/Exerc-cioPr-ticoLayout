

import java.awt.BorderLayout;

import java.awt.Color;

import java.awt.Graphics;

import java.awt.Point;

import java.awt.event.MouseEvent;

import java.awt.event.MouseMotionAdapter;

import java.awt.event.MouseMotionListener;

import javax.swing.*;

public class PaintPanel extends JPanel {

	private int pointCount = 0, pencilRadius = 10; // número de contagem de pontos

	private Point[] points = new Point[10000]; // array de 10000 referencias ons.awt.Point
	
	private Color currentColor = Color.LIGHT_GRAY;

	public PaintPanel() { // configura GUI e registra handler de evento

		// trata evento de movimento do mouse do frame

		addMouseMotionListener(

				new MouseMotionAdapter() { // classe interna anônima

					public void mouseDragged(MouseEvent event) { // armazena coordenadas de arrastar e repinta

						if (pointCount < points.length) {

							points[pointCount] = event.getPoint(); // localiza o ponto

							pointCount++; // incrementa o número de pontos em array

							repaint(); // repinta JFrame

						}

					}

				}// fim classe interna

		);// fim chamada addMouseMotionListener

	}// fim construtor PaintPainel

	// desenha ovais em um quadro delimitador de 4 por 4 nas localizações
	// especificadas na janela

	public void paintComponent(Graphics g) {

		super.paintComponent(g); // limpa area de desenho

		// desenha todos os pontos no array

		for (int i = 0; i < pointCount; i++) {

			g.setColor(this.currentColor);

			g.fillArc(points[i].x,points[i].y, pencilRadius, pencilRadius, 0, 360);

		}
		

	}
	
	public void setPointCount(int newPointCount) {
		this.pointCount = newPointCount;
		repaint();
	}
	
	public void setCurrentColor(Color newColor) {
		this.currentColor = newColor;
	}
	
	public void setPencilRadius(int newPencilRadius) {
		this.pencilRadius = newPencilRadius;
		repaint();
	}
	
	public int getPencilRadius() {
		return this.pencilRadius;
	}

	public static void main(String[] args) {

		// cria Jframe

		JFrame application = new JFrame("Um programa de pintar simples");

		PaintPanel paintPanel = new PaintPanel(); // cria painel de pintura

		application.add(paintPanel, BorderLayout.CENTER); // no centro

		application.add(new JLabel("Move o mouse para desenhar"), BorderLayout.SOUTH);

		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		application.setSize(400, 200);

		application.setVisible(true);

	}

}
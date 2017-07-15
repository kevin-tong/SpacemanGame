package com.spiderart.spaceman;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SpacemanGame extends Canvas {
	private BufferStrategy strategy;

	public SpacemanGame(){
		
		JFrame container = new JFrame("Space Invaders version 1.0");
		
		JPanel panel = (JPanel) container.getContentPane();
		panel.setPreferredSize(new Dimension(800,600));
		panel.setLayout(null);
		
		setBounds(0,0,800,600);
		panel.add(this);
		
		container.pack();
		container.setResizable(false);
		container.setVisible(true);
		
	}

	public void initialize() {
		this.createBufferStrategy(2);
		strategy = this.getBufferStrategy();
		Graphics2D g = (Graphics2D) strategy.getDrawGraphics();
		g.setColor(Color.black);
		System.out.println("black");
		g.fillRect(0, 0, 800, 600);
		
		strategy.show();
	
	}
}

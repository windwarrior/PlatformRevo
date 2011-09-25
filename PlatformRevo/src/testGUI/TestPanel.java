package testGUI;

import gamestructure.Level;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import material.Material;

public class TestPanel extends JPanel{
	
	private Level lev;
	public TestPanel(Level lev){
		this.lev = lev;
		this.setPreferredSize(new Dimension(512,512));
	}
	@Override
	public void paint(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		for(int x = 0; x < lev.getLevelArray().length; x++){
			for(int y = 0; y < lev.getLevelArray()[x].length; y++){
				Material mat = lev.getLevelArray()[x][y];
				Color col = mat != null? mat.getColor() : null;
				g2d.setColor(col);
				g2d.fillRect(x*16,y*16,16,16);
			}
		}


	}
}

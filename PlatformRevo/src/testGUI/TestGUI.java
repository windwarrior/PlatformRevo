package testGUI;

import gamestructure.Level;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import loader.LevelLoader;
import material.Material;

public class TestGUI extends JFrame{
	private BufferedImage img;
	private Level lev;

	public TestGUI(Level lev){
		this.lev = lev;
		makeGUI();
		try {
			img = ImageIO.read(new File("image.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void makeGUI(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(new TestPanel(lev));
		this.repaint();
		this.pack();
		this.setVisible(true);
	}
	

	
	public static void main(String[] args){
		Level lev = LevelLoader.loadLevel("image.png");
		new TestGUI(lev);
		
		System.out.println(lev.toString());
	}
}

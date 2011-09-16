package gui;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class GButton extends JComponent{
    int xPos = 0;
    int yPos = 0;
	int xSize = 0;
	int ySize = 0;
	/**
     * 
     */
    private static final long serialVersionUID = 852080627837438254L;

    public GButton(int xSize, int ySize, int xPos, int yPos){
		this.xSize = xSize;
		this.ySize = ySize;
		this.xPos = xPos;
		this.yPos = yPos;
	}
    
    @Override
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawRect(xPos, yPos, xSize, ySize);
       
    }

}

package loader;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import material.Material;
import gamestructure.Level;

public class LevelLoader {
	public static Level loadLevel(String location){
		BufferedImage img;
		try {
			img = ImageIO.read(new File(location));
			
		} catch (IOException e) {
			System.out.println(
					"Could not load levelfile" +
					"Affected file: " + location);
			return null;
		}
		Material[][] levelarray = new Material[img.getWidth()][img.getHeight()];
		for(int x = 0; x < img.getWidth(); x++){
			for(int y = 0; y < img.getHeight(); y++){
				Color tempColor = new Color(img.getRGB(x, y));
				Material mat = Material.getMaterial(tempColor);
				levelarray[x][y] = mat;
			}
			
		}		
		return new Level(levelarray);		
	}
}

package gamestructure;

import java.awt.Color;

import material.Material;

public class Level {
    private Material[][] levelarray;

	public Level(Material[][] levelarray){
    	this.levelarray = levelarray;
    }
	
	
	public Material[][] getLevelArray(){
		return levelarray;
	}
	
	public Material getLocationMaterial(int x, int y){
		return levelarray[x][y];
	}
	
	public String toString(){
		String s = "";
		for(int y = 0; y < levelarray.length; y++){
			for(int x = 0; x < levelarray[y].length; x++){
				s += levelarray[x][y];
			}
			s += "\n";
		}
		return s;
	}
	
}

package material;

import java.awt.Color;

public enum Material {
	
	STEEL((byte) 5, new Color(105, 105, 105), 'I'),
	WOOD((byte) 3, new Color( 139,   69,   19), 'W'),
	DIRT((byte) 3, new Color( 86,  34,  0), 'D'),
	STONE((byte) 4, new Color( 128,  128,  128), 'S'),
	GRASS((byte) 3, new Color( 182,  255,  0), 'G'),
	AIR((byte) 1, new Color( 255,  255,  255), ' '),
	LEAVES((byte) 2, new Color( 76,  255,  0), 'L'),
	TNT((byte) 1, new Color(255,0,0), 'T');
	
	
	private final byte strength;
	private final Color color;
	private final char c;
	
	Material(byte strength, Color color, char c){
		this.c = c;
		this.strength = strength;
		this.color = color;
	}
	
	public int getStrenght(){
		return strength;
	}
	
	public Color getColor(){
		return color;
	}
	
	public String toString(){
		return "[" + c + "]";
	}
	
	public static Material getMaterial(Color col){
		for(Material m: Material.values()){
			if(m.getColor().equals(col)){
				return m;
			}
		}
		return null;
	}
}

package material;

import gamestructure.Level;

public class LinearCharge implements Explosive {

	public int getBlastRange(){
		return 37;
	}
	
	public int getBeamWidth(){
		return 3;
	}
	
	
	
	public Level applyExplotion(int xloc, int yloc, Level lev){
		int range = this.getBlastRange();
		Material mat = lev.getLocationMaterial(xloc, yloc);
		range = range - mat.getStrenght();
		
		
		return lev;
		
	}

}

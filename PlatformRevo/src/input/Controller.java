package input;

public class Controller implements Runnable {
    private boolean stopped = false;
	@Override
	public void run() {
		while(!stopped){
			
		}
	}
 
	
	public void stop(){
		this.stopped = true;
	}
}

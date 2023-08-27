package taller3.televisores;

public class Control {
	
	TV tv;
	
	public void turnOn() {
		
		this.tv.turnOn();
	}
	
	public void turnOff() {
		
		this.tv.turnOff();
	}
	
	public void canalUp() {
		
		this.tv.canalUp();
	}
	
	
	public void canalDown() {
		
		this.tv.canalDown();
		
		
	}
	
	public void volumenUp() {
		
		this.tv.volumenUp();
	}
	
	public void volumenDown() {
		
		this.tv.volumenDown();
	}
	
	public void setCanal(int canal) {
		
		if(canal >= 0 && canal <= 120) {
			
			this.tv.setCanal(canal);
		}
		else {
			return;
		}
	}
	
	public void setVolumen(int volumen) {
		
		if (volumen >= 0 && volumen <= 7) {
			
			this.tv.setVolumen(volumen);
		}
		else {
			return;
		}
	}
		
	public void enlazar(TV tv) {
		
		this.tv = tv;
		tv.setControl(this);
		
	}
	
	public void setTv(TV tv) {
		
		this.tv = tv;
		
	}
	
	public TV getTv() {
		
		return this.tv;
	}
	
		
		
		
	
		
		 
		
	
	
	
		
		

}

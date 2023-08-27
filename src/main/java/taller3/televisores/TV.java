package taller3.televisores;

public class TV {
	
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	static int numTV = 0;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		this.canal = 1;
		this.volumen = 1;
		this.precio = 500;
		numTV++;
		
	}

	public Marca getMarca() {
		return this.marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		
		if(canal >= 1 && canal <= 120) {
		
		this.canal = canal;
		}
		else {
			return;
		}
		
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		
		if (volumen >= 0 && volumen <= 7) {
			this.volumen = volumen;
		}
		else {
			return;
		}
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}
	
	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	
	}
	
	public static int getNumTV() {
		return TV.numTV;
	}
	
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public boolean getEstado() {
		return this.estado;
	}
	
public void canalUp() {
		
		if (this.getEstado()) {
			
			if (this.getCanal() == 120) {
				
				return;
			}
			else {
				this.setCanal(this.getCanal() + 1);
			}
		}
		
	}
	
	
	public void canalDown() {
		
		if (this.getEstado()) {
			
			if (this.getCanal() == 1) {
				
				return;
			}
			else {
				this.setCanal(this.getCanal() - 1);
			}
		}
		
		
		
	}
	
	public void volumenUp() {
		
		if(this.getEstado()) {
			
			if(this.getVolumen() == 7) {
				
				return;
			}
			else {
				this.setVolumen(this.getVolumen() + 1);
			}
		}
		
	}
	
	public void volumenDown() {
		
		if(this.getEstado()) {
			
			if(this.getVolumen() == 0) {
				
				return;
			}
			else {
				this.setVolumen(this.getVolumen() - 1);
			}
		}
		
	}
	
	
	

}

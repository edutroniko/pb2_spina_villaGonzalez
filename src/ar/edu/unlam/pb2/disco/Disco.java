package ar.edu.unlam.pb2.disco;

public class Disco {
	private Double radioInterior = 0.0;
	private Double radioExterior = 0.0;
	
	public Disco(Double radioInterior, Double radioExterior) {
		this.radioInterior = radioInterior;
		this.radioExterior = radioExterior;
	}
	
	
	
	public Double perimetroInterior() {
		Double perimetro = 0.0;
		perimetro = 2 * Math.PI * this.radioInterior;
		return perimetro;
	}
	
	public Double perimetroExterior() {
		Double perimetro = 0.0;
		perimetro = 2 * Math.PI * this.radioExterior;
		return perimetro;
	}
	
	public Double superficie() {
		Double sup = 0.0;
		sup = Math.PI * Math.pow(this.radioExterior, 2) - Math.PI * Math.pow(this.radioInterior, 2);
		return sup;
	}
	
	public Boolean cambiarRadioInterior(Double nuevoRadioInterior){
		if(nuevoRadioInterior < this.radioExterior){
			this.radioInterior  = nuevoRadioInterior;
			return true;
		}
		else{
			return false;
		}
	}
	
	public Boolean cambiarRadioExterior(Double nuevoRadioExterior){
		if(nuevoRadioExterior > this.radioInterior){
			this.radioExterior = nuevoRadioExterior;
			return true;
		}
		else{
			return false;
		}
	}
	
	public Double getRadioInterior() {
		return radioInterior;
	}

	public Double getRadioExterior() {
		return radioExterior;
	}



	public void setRadioInterior(Double radioInterior) {
		this.radioInterior = radioInterior;
	}



	public void setRadioExterior(Double radioExterior) {
		this.radioExterior = radioExterior;
	}

	
}

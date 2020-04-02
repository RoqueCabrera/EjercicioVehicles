package com.vehicles.project;

public class Wheel {//Creamos una clase pública llamada "Wheel".
	private String brand;//Declaramos un String llamado "brand".
	private double diameter;//Declaramos un double privado llamada "diameter".

	public Wheel(String brand, double diameter) {//Creamos una clase pública llamada "Wheel".
		
		try{
			setDiameter(diameter);
		} catch (Exception e){
			System.out.println("Try setting diameter between 0.4 and 4.");
		}
		this.brand = brand;//utilizamos el método "this" para referirnos a la "brand" solicitada en el main.
		this.diameter = diameter;//utilizamos el método "this" para referirnos al "diameter" instanciado más arriba.
	}

	
	
	
	
	@Override
	public String toString() {
		return "Wheel [brand=" + brand + ", diameter=" + diameter + "]";
	}




	@Override
	public boolean equals (Object obj){
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wheel other = (Wheel) obj;
		if (brand == null){
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (Double.doubleToLongBits(diameter) != Double.doubleToLongBits(other.diameter))
				return false;
		return true;
	}
	

	public void setDiameter(double diameter) throws Exception {
		if (!(diameter>0.4 && diameter<4)){
				this.diameter = diameter;
		}
	}
	
	
}

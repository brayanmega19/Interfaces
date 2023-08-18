package Interfaces;

public class Empleado extends Persona{
	
	private String carrera;
	private String puesto;
	private String salario;
	
	public Empleado(String carrera, String puesto, String salario) {
		this.carrera = carrera;
		this.puesto = puesto;
		this.salario = salario;
	}
	
	public String getCarrera() {
		return this.carrera;
	}
	
	public String getPuesto() {
		return this.puesto;
	}
	
	public String getSalario() {
		return this.salario;
	}
	
	public void setCarrera(String carrera) {
		this.carrera = carrera;	
	}
	
	public void setPuesto(String puesto) {
		this.puesto = puesto;	
	}
	
	public void setSalario(String salario) {
		this.salario = salario;	
	}
	
	public void presentarse() {
		System.out.println("Este es es puesto "+this.puesto+" para acceder a el se estudia "+this.carrera
				+" y el salario promedio ronda los "+this.salario);
	}

	@Override
	public String decirNombre() {
		
		return "Que tal, me llamo...";
	}
}

package Interfaces;

public class Jefe extends Empleado implements Tareas {
	
	private String departamento;
	
	public Jefe(String carrera, String puesto, String salario, String departamento) {
		super(carrera, puesto, salario);
		this.departamento = departamento;
	}
	
	public String getDepartamento() {
		return this.departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public void presentarDepartamento() {
		System.out.println("El departamento es: "+this.departamento);
	}
	
	public String entregarReporte() {
		return "El gerente del departamento ha entregado el reporte";
	}

}

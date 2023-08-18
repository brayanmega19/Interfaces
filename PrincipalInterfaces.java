package Interfaces;

public class PrincipalInterfaces {

	public static void main(String[] args) {
		
		Empleado mi_trabajador = new Empleado("Ingeniero", "Calidad", "15500");
		Empleado mi_jefe = new Jefe("Ingeniero", "Analista encargado", "27500", "Analisis de riesgo");
		Empleado mi_jefe2 = new Jefe("Licenciado", "Gestor", "28000", "Organizacion corporativa");
		
		Jefe mi_jefe_casted = (Jefe)(mi_jefe);
		Jefe mi_jefe2_casted = (Jefe)(mi_jefe2);
		
		mi_jefe_casted.presentarDepartamento();
		mi_jefe2_casted.presentarDepartamento();
		
		System.out.println(mi_jefe.decirNombre());
		System.out.println(mi_jefe_casted.decirNombre());
		
		System.out.println(mi_jefe_casted.entregarReporte());
		
	}

}

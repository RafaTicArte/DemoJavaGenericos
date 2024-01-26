package DemoJavaGenericos;

public class Main {

	public static void main(String[] args) {
		ControlPresencia<Alumno> r1 = new ControlPresencia<>(1,new Alumno("Pedro","1DAM"),true);
		ControlPresencia<Alumno> r2 = new ControlPresencia<>(2,new Alumno("Ana","1DAM"),true);
		ControlPresencia<Alumno> r3 = new ControlPresencia<>(3,new Alumno("Marta","1DAM"),false);
		ControlPresencia<Profesor> r4 = new ControlPresencia<>(4,new Profesor("Rafa","Informática"),true);
		ControlPresencia<Profesor> r5 = new ControlPresencia<>(5,new Profesor("Carlos","Informática"),false);
		// No se podría definir el siguiente objeto porque "String" no implementa el interfaz IControlPresencia
		//ControlPresencia<String> r6 = new ControlPresencia<>(5, "Ejemplo", false);
		
		Curso programacion = new Curso();
		programacion.addRegistro(r5);
		programacion.addRegistro(r4);
		programacion.addRegistro(r3);
		programacion.addRegistro(r2);
		programacion.addRegistro(r1);

		System.out.println("Asistencias:");
		System.out.println(programacion.getAsistencias());

		System.out.println("Ausencias:");
		System.out.println(programacion.getAusencias());

		System.out.println("Presencia stática:");
		ControlPresencia.printPresencia(new ControlPresencia<>(3,new Alumno("Marta","1DAM"),false));
	}
}
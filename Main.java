package DemoJavaGenericos;

public class Main {

	public static void main(String[] args) {
		ControlPresencia<Alumno> r1 = new ControlPresencia<>(1,new Alumno("Pedro","1DAM"),true);
		ControlPresencia<Alumno> r2 = new ControlPresencia<>(2,new Alumno("Ana","1DAM"),true);
		ControlPresencia<Alumno> r3 = new ControlPresencia<>(3,new Alumno("Marta","1DAM"),false);
		ControlPresencia<Profesor> r4 = new ControlPresencia<>(4,new Profesor("Rafa","Informática"),true);
		ControlPresencia<Profesor> r5 = new ControlPresencia<>(5,new Profesor("Carlos","Informática"),false);
		
		Curso programacion = new Curso();
		programacion.addRegistro(r5);
		programacion.addRegistro(r4);
		programacion.addRegistro(r3);
		programacion.addRegistro(r2);
		programacion.addRegistro(r1);
		
		System.out.println(programacion.getAsistencias());
	}
}
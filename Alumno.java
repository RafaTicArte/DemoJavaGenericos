package DemoJavaGenericos;

public class Alumno {
	private String nombre;
	private String curso;
	
	public Alumno(String nombre, String curso) {
		this.nombre = nombre;
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Alumno(nombre=" + nombre + "|curso=" + curso + ")";
	}
}
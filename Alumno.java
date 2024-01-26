package DemoJavaGenericos;

public class Alumno implements IControlPresencia {
	private String nombre;
	private String curso;
	
	public Alumno(String nombre, String curso) {
		this.nombre = nombre;
		this.curso = curso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Alumno(" + nombre + " - " + curso + ")";
	}
}
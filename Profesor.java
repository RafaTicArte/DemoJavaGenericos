package DemoJavaGenericos;

public class Profesor {
	private String nombre;
	private String dpto;

	public Profesor(String nombre, String dpto) {
		this.nombre = nombre;
		this.dpto = dpto;
	}

	@Override
	public String toString() {
		return "Profesor(nombre=" + nombre +"|dpto=" + dpto + ")";
	}
}
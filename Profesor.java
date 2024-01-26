package DemoJavaGenericos;

public class Profesor implements IControlPresencia {
	private String nombre;
	private String dpto;

	public Profesor(String nombre, String dpto) {
		this.nombre = nombre;
		this.dpto = dpto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDpto() {
		return dpto;
	}

	public void setDpto(String dpto) {
		this.dpto = dpto;
	}

	@Override
	public String toString() {
		return "Profesor(" + nombre +" - " + dpto + ")";
	}
}
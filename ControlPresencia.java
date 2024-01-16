package DemoJavaGenericos;

public class ControlPresencia<T> {
	private int codigo;
	private T persona;
	private boolean asiste;

	public ControlPresencia(int codigo, T persona, boolean asiste) {
		this.codigo = codigo;
		this.persona = persona;
		this.asiste = asiste;
	}
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public T getPersona() {
		return persona;
	}

	public void setPersona(T persona) {
		this.persona = persona;
	}

	public boolean getAsiste() {
		return asiste;
	}

	public void setAsiste(boolean asiste) {
		this.asiste = asiste;
	}

	@Override
	public String toString() {
		return "Asistencia [codigo=" + codigo + ", persona=" + persona + ", asiste=" + asiste + "]\n";
	}
}
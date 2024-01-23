package DemoJavaGenericos;

import java.util.ArrayList;

public class Curso {
	private ArrayList<ControlPresencia> registros;
	
	public Curso() {
		registros = new ArrayList();
	}
	
	public boolean addRegistro(ControlPresencia registro) {
		return registros.add(registro);
	}

	public ArrayList<ControlPresencia> getAsistencias(){
		ArrayList<ControlPresencia> asistencias = new ArrayList();
		for(ControlPresencia registro: registros) {
			if(registro.getAsiste()) {
				asistencias.add(registro);
			}
		}
		return asistencias;
	}

	public ArrayList<ControlPresencia> getAusencias(){
		ArrayList<ControlPresencia> ausencias = new ArrayList();
		for(ControlPresencia registro: registros) {
			if(!registro.getAsiste()) {
				ausencias.add(registro);
			}
		}
		return ausencias;
	}
}

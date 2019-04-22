package com.daniel.belmonte.Modulo1Actividad13;

public class Pronostico {
	private String partido;
	private String[] pronostico;
	
	public Pronostico() {
		pronostico = new String[3];
	}
	
	public String getPartido() {
		return partido;
	}
	
	public String getPronostico(int i) {
		if((i >= 0) && (i < 3)) return pronostico[i];
		
		return "";
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}
	
	public void setPronostico(int pos, String pronostico) {
		this.pronostico[pos] = pronostico;
	}
}

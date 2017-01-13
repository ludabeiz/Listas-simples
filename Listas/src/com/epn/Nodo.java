package com.epn;

public class Nodo {
	
	//componentes del nodo
	private String wvqc_INFO;
	private Nodo wvqc_LIGA;
	
	//Constructor con 2 parametros informacion y liga
	public Nodo(String informacion, Nodo liga) {
	super();
	this.wvqc_INFO = informacion;//lista con elementos 
	this.wvqc_LIGA = wvqc_LIGA;
	}
	
	//constrcutor con parametro informacion
	public Nodo(String informacion) {
	super();
	this.wvqc_INFO = informacion;//primer nodo
	this.wvqc_LIGA = null;
	}
	
	//constructor vacio 
	public Nodo() {
		super();
	}

	//get and set
	public String getINFO() {
	return wvqc_INFO;
	}
	public void setINFO(String informacion) {
	wvqc_INFO = informacion;
	}
	public Nodo getLIGA() {
	return wvqc_LIGA;
	}
	public void setLIGA(Nodo liga) {
	wvqc_LIGA = liga;
	}


}

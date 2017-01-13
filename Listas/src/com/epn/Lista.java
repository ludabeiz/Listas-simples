package com.epn;

import javax.swing.JOptionPane;

public class Lista {

	private Nodo P; //creacion del nodo
	
	//constructor vacio
	public Lista() {
	super();
	}
	//metodo para crear la lista 
	public void crearListaInicio() {
	this.P = new Nodo();//crear nodo
	this.P.setINFO(JOptionPane.showInputDialog("Ingrese el nombre del primer nodo"));//ingresar datos 
	this.P.setLIGA(null);//nodo primero
	int opcion = JOptionPane.showConfirmDialog(null,"Desea ingresar mas nodos?");//Crear mas nodos
	while (opcion == JOptionPane.YES_OPTION) {
	Nodo Q = new Nodo();//crear nuevo nodos
	Q.setINFO(JOptionPane.showInputDialog("Ingrese el nombre del	siguiente nodo"));
	Q.setLIGA(P);
	this.P = Q;
	opcion = JOptionPane.showConfirmDialog(null,"Desea ingresar mas nodos?");
	}
	}
	//metodo para crear lista al final 
	public void crearListaFinal() {
	this.P = new Nodo();//crear nuevo nodo
	this.P.setINFO(JOptionPane.showInputDialog("Ingrese el nombre del primer nodo"));
	this.P.setLIGA(null);//crear nodo al final 
	Nodo T;//crear nodo al final 
	T = this.P;//crear nodo al final 
	int opcion = JOptionPane.showConfirmDialog(null,"Desea ingresar mas nodos?");
	while (opcion == JOptionPane.YES_OPTION) {
	Nodo Q = new Nodo();
	Q.setINFO(JOptionPane.showInputDialog("Ingrese el nombre del siguiente nodo"));
	Q.setLIGA(null);//enlazar el null al final de la lista 
	T.setLIGA(Q);
	T = Q;
	opcion = JOptionPane.showConfirmDialog(null,"Desea ingresar mas nodos?");
	}
	}
	//metodo para recorrer la lista
	public void recorrer() {
	Nodo Q;
	Q = this.P;
	while (Q != null) {//mientras aiga elementos en la lista 
	JOptionPane.showMessageDialog(null, Q.getINFO());
	Q = Q.getLIGA();
	}
	}
	//insertar un nodo 
	public void insertarNodoInicio() {
	Nodo Q = new Nodo();
	Q.setINFO(JOptionPane.showInputDialog("Ingrese el nombre del nodo"));
	Q.setLIGA(this.P);//enlazar el nuvo nodo
	this.P = Q;
	}
	//insertar un nodo
	public void insertarNodoFinal() {
	Nodo T = new Nodo();
	T = this.P;
	while (T.getLIGA() != null) {
	T = T.getLIGA();
	}
	Nodo Q = new Nodo();
	Q.setINFO(JOptionPane.showInputDialog("Ingrese el nombre del nodo"));
	Q.setLIGA(null);
	T.setLIGA(Q);
	}
	//salida de datos 
	public String toString() {
	Nodo aux;
	String salida = "";
	aux = this.P;
	while (aux != null) {
	salida += aux.getINFO().toString() + "\n";
	aux = aux.getLIGA();
	}
	return salida;
	}
}

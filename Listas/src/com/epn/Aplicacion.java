package com.epn;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion;
		Lista list = new Lista(); //instanciamos la clase lista 
		
		do {
	    //salida de datos 
		opcion = Integer.parseInt(JOptionPane.showInputDialog(null,	"Elegir la operacion a realizar \n1.-Crear Lista al Inicio\n2.-Crear Lista al final\n3.- Recorrido Iterado de la ultima Lista \n4.-Insertar un nodo al Inicio de la	Lista\n5.-Inserta un nodo al Final de la Lista\n6.-Ver Lista Actual\n7.- Salir", "MENU",JOptionPane.INFORMATION_MESSAGE));
		
		//lista de procedimientos 
		switch (opcion) {
		case 1:
		list.crearListaInicio();
		JOptionPane.showMessageDialog(null,	"LISTA CREADA POR EL INICIO\n" +list);
		break;
		case 2:
		list.crearListaFinal();
		JOptionPane.showMessageDialog(null,"LISTA CREADA POR EL FINAL\n" + list);
		break;
		case 3:
		list.recorrer();
		break;
		case 4:
		list.insertarNodoInicio();
		JOptionPane.showMessageDialog(null, "NUEVA LISTA\n"	+ list);
		break;
		case 5:
		list.insertarNodoFinal();
		JOptionPane.showMessageDialog(null, "NUEVA LISTA\n"
		+ list);
		break;
		case 6:
		JOptionPane.showMessageDialog(null, "LISTA ACTUAL\n" + list);
		break;
		case 7:
		opcion = 7;
		break;
		default:
		break;
		}
		
		} while (opcion != 7);
		}
	}

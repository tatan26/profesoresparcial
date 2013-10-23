package NODOS;

public class profesor {
String nombre;
String apellido;
//falta meter materia dentro de profesor por que al ser otra clase toca crear clase enlazada a clase

profesor sig;
profesor ant;


public profesor(String Uno, String dos){
	
	
	nombre=Uno;
	apellido=dos;
	sig= null;
	ant=null;
	
	
}
}

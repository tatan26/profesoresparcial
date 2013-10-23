package NODOS;

public class materia {
	String titulo;
	String horario;




	profesor sig;
	profesor ant;


	materia(String ref,String hora){
		titulo=ref;
		horario=hora;
		
		sig= null;
		ant=null;
		
		
	}
}

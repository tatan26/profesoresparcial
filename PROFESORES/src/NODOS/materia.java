package NODOS;


public class materia {
	int dicta;
	String titulo;
	String horario;
	String dia;
	materia siguiente;
	materia anterior;
	
	public materia(){}
	
	public materia(int prof,String ref,String date,String hora){
		titulo=ref;
		horario=hora;
		dia=date;
		dicta=prof;
		siguiente=null;
		anterior=null;
		
	}
}
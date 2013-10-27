package NODOS;

public class profesor {
int codigo;
String nombre;
String apellido;
String perfil;
materia mat,cabeza,aux2;

profesor sig;
profesor ant;

public profesor(){}
public profesor(int code,String Uno, String dos,String tres){
	
	nombre=Uno;
	apellido=dos;
	codigo=code;
	perfil=tres;

cabeza=null;
mat=null;
aux2=null;
	
}

}

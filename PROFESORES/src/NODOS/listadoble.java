package NODOS;

import javax.swing.JOptionPane;

public class listadoble {

profesor cab;
profesor fin;

	public listadoble(){
		cab=null;
		fin=null;
	}
		
	public boolean vacia(){
		boolean vacia=false;
		if(cab==null){vacia=true;}
		return vacia;
	}

	public void insertarinicial(String uno,String dos){
		if (vacia()){
		cab=new profesor(uno,dos);

		
		}
	
	}
	public void nuevo(String Uno,String dos){


	
if(cab.sig==null){
		fin=new profesor(Uno,dos);	
		fin.ant=cab;

		
		}
	else{
	profesor aux;
	aux= new profesor(Uno,dos);
	aux.sig=fin;
	aux.ant=cab;
	cab.sig=aux;
	fin.ant=aux;


		
	}

}
	
	public void mostrar(){
		
		
		
	}
	
}

/*
	private void enlazar(profesor A, profesor B){	
		A.sig=B;
		B.ant=A;		
	}
	
	public void mostrar(){
		profesor recorre=cab;
		while(recorre!=null){
			System.out.print(recorre.nombre +" ->");
		}
	}
*/
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
//import operaciones.*;

//import operaciones.palabras;

import java.io.*;
import NODOS.*;
public class Principal extends JFrame  implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JMenuBar b1;// BARRA DE MENU
	JMenu m1,m2,m3,m4;// MENUS DESPLEGABLES
	JMenuItem mi1,mi2,mi3,mi4,mi5,mi6,m31,mi41;// MENUS ITEMS QUE SE SELECCIONAN PARA GENERAR LA VENTANA
	JButton perfil;
	listadoble ld;
	profesor pf;
	
	Principal pl;//declaro un objeto "pl" de la clase "palabras"
	
	
	int opc=0,error=0,correcto=0,pos=0,error1=0,cor=0,tam=0,fin=0;
	int calificacion;

	
	public Principal(){// constructor
		
		b1=new JMenuBar();
		
		m1=new JMenu("herramientas");
		m2=new JMenu("Creditos");
		m4=new JMenu("Archivo");
		
		
		mi1=new JMenuItem("Ver profesores");
		mi2=new JMenuItem("Ver materias");
		mi3=new JMenuItem("Ver horarios");
		mi4=new JMenuItem("Desarrolladores");
		mi41=new JMenuItem("Salir");
		
		perfil=new JButton("ver perfil");
		
		mi1.addActionListener(this);
		mi2.addActionListener(this);
		mi3.addActionListener(this);
		mi4.addActionListener(this);
		mi41.addActionListener(this);
		perfil.addActionListener(this);
		
        m1.add(mi1);		
		m1.add(mi2);
		m1.add(mi3);

		//AGREGANDO COMPONENTES AL MENU m2 Creditos
        m2.add(mi4);

      //AGREGANDO COMPONENTES AL MENU m4 Reglas
        m4.add(mi41);
        
        
      //AGREGANDO COMPONENTES AL LA BARRA DE MENU b1
        b1.add(m4);
        b1.add(m1);
		b1.add(m2);
		//b1.add(perfil);
		
		
		//AGREGANDO COMPONENTES A LA VENTANA JFrame
		setJMenuBar(b1);
	
		// Me deshabilita componentes
		//m1.setEnabled(false);
		//mi2.setEnabled(false);

	
	}
	
	public void actionPerformed(ActionEvent e){
		JMenuItem a=(JMenuItem)e.getSource();
		ld=new listadoble();
		
		
		
		
		if(a==mi1){ //si escoge profesores
			
			
			ld.insertarinicial("duván", "ordoñez");
			ld.nuevo("no se", "sotelo");
			ld.nuevo("oscar","bachiller" );
			ld.nuevo("fernando","botero" );
		}
		
		
		
	}
	
	public void funcion(String palabra[]){
		
		
		repaint();// llamar paint
	}
	
	public void paint(Graphics g){
		super.paint(g);
		

if(error==0){
ImageIcon fondo = new ImageIcon(getClass().getResource("imagen.jpg"));
g.drawImage(fondo.getImage(),50,100,500,300, null);

}	
	
	}
	
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Principal ob=new Principal();// OBJETO PRINCIPAL
    	ob.setDefaultCloseOperation(EXIT_ON_CLOSE);// FUNCION PARA TERMINAR EL PROCESO CUANDO SE CIERRA LA VENTANA
    	ob.setBounds(0,0,600,600);// TAMAÑO DE LA VENTANA
    	ob.setVisible(true);// QUE EL JFRAME SEA VISIBLE
    	ob.getContentPane().setBackground(Color.BLACK);// FONDO NEGRO
	}

}



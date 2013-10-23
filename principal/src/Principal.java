import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

//import operaciones.*;

//import operaciones.palabras;


import NODOS.*;
public class Principal extends JFrame  implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JMenuBar b1;
	JMenu m1,m2,m3,m4;
	JMenuItem mi1,mi2,mi3,mi4,mi5,mi6,m31,mi41;
	JButton perfil;
	listadoble ld;
	profesor pf;

	
	JLabel labnom[],labape[],labmats[];
	
	int opc=0,error=0,n, m=21;;
	JPanel container,container2,containertit,containermat;
	BoxLayout layout,layout2,layouttit,layoutmat;
	
	public Principal(){
		
		container = new JPanel();
	    layout = new BoxLayout(container, BoxLayout.Y_AXIS);
	    container.setLayout(layout);
		
	    container2 = new JPanel();
	    layout2 = new BoxLayout(container2, BoxLayout.Y_AXIS);
	    container2.setLayout(layout2);

	    containertit = new JPanel();
	    layouttit = new BoxLayout(containertit, BoxLayout.Y_AXIS);
	    containertit.setLayout(layouttit);
	    
	    containermat = new JPanel();
	    layoutmat = new BoxLayout(containermat, BoxLayout.Y_AXIS);
	    containermat.setLayout(layoutmat);
	    
	    
	    b1=new JMenuBar();
		
		m1=new JMenu("herramientas");
		m2=new JMenu("Creditos");
		m4=new JMenu("Archivo");
		
		
		mi1=new JMenuItem("Ver profesores");
		mi2=new JMenuItem("Ver materias (en construcción)");
		mi3=new JMenuItem("Ver horarios (en construcción)");
		mi4=new JMenuItem("Desarrolladores (en construcción)");
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
		ld=new listadoble();
	 
		
	

		//..... verdaderos		
		
		ld.nuevoprofe(1,"Carlos ", " Vargas","Caracteristicas físicas");
		ld.nuevoprofe(2,"Eva "       , " Vasquez","Características Físicas: Delgada, bajita, cabello negro");
		ld.nuevoprofe(3,"joel "    , " velasquez","Características Físicas: estatura promedio, cabello corto y mono, ojos azules");
		ld.nuevoprofe(4,"Pedro "     , " Melendez","Características Físicas: estatura promedio, cabello negro");
		ld.nuevoprofe(5,"Jorge "     , " Reyes","Características Físicas: ");
		ld.nuevoprofe(6,"Jose "     , " ojeda","Características Físicas:");
		ld.nuevoprofe(7,"Joaquín "     , " Ariza","Características Físicas:");
		ld.nuevoprofe(8,"Wilson "     , " Gordillo","Características Físicas:");
		ld.nuevoprofe(9,"Fernando "     , " Sotelo","Características Físicas:");
		ld.nuevoprofe(10,"Esaú "     , " Paloma","Características Físicas:");
		ld.nuevoprofe(11,"Esperanza "     , " Merchan","Características Físicas:");
		ld.nuevoprofe(12,"Oscar "     , " Bachiller","Características Físicas:");
		ld.nuevoprofe(13,"Pedro "     , " Melendez","Características Físicas:");
		ld.nuevoprofe(14,"Marcia "     , " Pulido","Características Físicas:");
		ld.nuevoprofe(15,"Gustavo "     , " Castillo","Características Físicas:");
		
		ld.profesormateria(1,"Fundamentos de ingeniería","Lunes","9am-12pm");
		ld.profesormateria(1,"comunicación de datos I","Martes","7 am - 9 am");
		ld.profesormateria(2,"Lógica y algoritmia","Martes","7am-9am");
		ld.profesormateria(2,"TGS","Viernes","9am-12 m");
		ld.profesormateria(3,"Matemáticas discretas","Viernes","12pm- 3pm");
		ld.profesormateria(4,"Fundamentos de Lógica","Miercoles","2pm - 4 pm");
		ld.profesormateria(5,"Seminario de ingeniería","Lunes","9am - 12 pm");
		ld.profesormateria(6,"Fundamentos de Programación","martes","8 am - 10 am");
		ld.profesormateria(6,"Sistemas de información","Martes","2pm - 4 pm");
		ld.profesormateria(6,"Ingeniería de software","Miercoles","11 am - 1pm");
		ld.profesormateria(7,"Elementos de Computadores","Martes","7 am-10 am");
		ld.profesormateria(7,"Microprocesadores","Jueves","10 am - 12 pm");
		ld.profesormateria(8,"Programación I","Lunes","9 am - 11 am");
		ld.profesormateria(8,"Sistemas operativos","Lunes","2 pm - 4 pm");
		ld.profesormateria(9,"Estructuras de información","jueves","9 am- 11 am");
		ld.profesormateria(9,"Programación I","Lunes","8am -10am");
		ld.profesormateria(9,"Programación II","Lunes","11 am - 1 pm");
		ld.profesormateria(9,"Base de datos I","Miercoles","7 am - 9 am");
		ld.profesormateria(10,"Teoría de Control","Lunes","11am - 1pm");
		ld.profesormateria(10,"Computación Gráfica","Lunes","7 am - 9  am");
		ld.profesormateria(11,"Bases de Datos II","lunes","7 am - 9 am");	
		
	
		
	
		labnom=new JLabel[15];
		labape=new JLabel[15];
		labmats=new JLabel[21];	
		
		
}

public void actionPerformed(ActionEvent e){
		JMenuItem a=(JMenuItem)e.getSource();
	
		//--------------------------- escoge nombre y apellido de profesor
		if(a==mi1){
			
			n=15;
			String aux="";
			
			labnom[0]=new JLabel("\n ");
			
			for(int i=0; i<n;i++){
				aux= ld.muestra_nombre(i);
				labnom[i]=new JLabel("  "+aux);
				
			}

			for(int i=0; i<n;i++){
				container.add(labnom[i]);	
			}

			labape[0]=new JLabel("\n ");
			for(int i=0; i<n;i++){
				aux= ld.muestra_apell(i);
				labape[i]=new JLabel("  "+aux);
			}


			for(int i=0; i<n;i++){
				container2.add(labape[i]);
			}
			

	JLabel titulos=new JLabel(" Nombre           Apellido");
	containertit.add(titulos);
	add(container, BorderLayout.WEST);
	add(container2, BorderLayout.CENTER);
	add(containertit, BorderLayout.NORTH);
	
			resize(900,601);

		}//fin ver profesores
		
		
		
		if(a==mi2){
			
			m=ld.cuenta();
			int contador=0;
			String aux2="";
			
			labnom[0]=new JLabel("\n");
			for(int j=0; j<11;j++){
				
			while (aux2!="ya"){
				
				aux2= ld.muestra_materia(j);
				
				if(aux2!="ya"){
				labmats[j]=new JLabel("  "+aux2);
				contador++;
				}
	
			}
			aux2="";
}
			//JOptionPane.showMessageDialog(null,""+contador);

			for(int i=0; i<9;i++){
				containermat.add(labmats[i]);
			}
				
			remove(container);
			remove(container2);
			remove(containertit);
			
			add(container, BorderLayout.WEST);
			add(container2, BorderLayout.CENTER);
			add(containertit, BorderLayout.NORTH);
			add(containermat, BorderLayout.EAST);

	
			resize(900,605);

		}//fin mi2
		
	}//fin boolean

	

	public void paint(Graphics g){
		super.paint(g);
if(error==0){
ImageIcon fondo = new ImageIcon(getClass().getResource("imagen.png"));
g.drawImage(fondo.getImage(),700,70,120,150, null);

}	
	}
	
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Principal ob=new Principal();// OBJETO PRINCIPAL
    	ob.setDefaultCloseOperation(EXIT_ON_CLOSE);// FUNCION PARA TERMINAR EL PROCESO CUANDO SE CIERRA LA VENTANA
    	ob.setBounds(0,0,900,600);// TAMAÑO DE LA VENTANA
    	ob.setVisible(true);// QUE EL JFRAME SEA VISIBLE
    	ob.getContentPane().setBackground(Color.GRAY);// FONDO NEGRO
	}
}



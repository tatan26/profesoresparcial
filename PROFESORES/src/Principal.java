import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

import NODOS.*;
public class Principal extends JFrame  implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JMenuBar b1;
	JMenu m1,m2,m3,m4;
	JMenuItem mi1,mi2,mi3,mi4,mi5,mi6,m31,mi41,mi3_1;
	JButton perfil[],volver;
	listadoble ld;
	profesor pf;

	
	JLabel labnom[],labape[],labmats[],labday[],labhour[];
	
	int opc=0,error=0,n, m=21,flag=0,flag2=0,flag3=0,flag4=0;
	JPanel container,container2,containertit,containermat,containerday,containerhour,containerperfil;
	BoxLayout layout,layout2,layouttit,layoutmat,layoutday,layouthour,layoutperf;
	
	public Principal(){
		//----contenedores
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
	    
		containerday = new JPanel();
	    layoutday = new BoxLayout(containerday, BoxLayout.Y_AXIS);
	    containerday.setLayout(layoutday);
	    
	    
		containerhour = new JPanel();
	    layouthour = new BoxLayout(containerhour, BoxLayout.Y_AXIS);
	    containerhour.setLayout(layouthour);
	    
	    containerperfil = new JPanel();
	    layoutperf = new BoxLayout(containerperfil, BoxLayout.Y_AXIS);
	    containerperfil.setLayout(layoutperf);
	    
	    //------menú

	    b1=new JMenuBar();
		
		m1=new JMenu("herramientas");
		m2=new JMenu("Creditos");
		m4=new JMenu("Archivo");
		
		
		mi1=new JMenuItem("Ver profesores");
		mi2=new JMenuItem("Ver materias");
		mi3=new JMenuItem("Ver días");
		mi3_1=new JMenuItem("Ver horarios");
		mi4=new JMenuItem("ariel ballesteros.  jonathan garcia");
		mi41=new JMenuItem("Salir");
		
		mi1.addActionListener(this);
		mi2.addActionListener(this);
		mi3.addActionListener(this);
		mi3_1.addActionListener(this);
		mi4.addActionListener(this);
		mi41.addActionListener(this);		
		
        m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		m1.add(mi3_1);
		
        m2.add(mi4);

        m4.add(mi41);
        
        b1.add(m4);
        b1.add(m1);
		b1.add(m2);

		setJMenuBar(b1);
	
//se crea la lista
		ld=new listadoble();
//se crea el boton
		perfil=new JButton[15];
	

		//..... verdaderos		
		
		ld.nuevoprofe(1,"Carlos ", " Vargas","Caracteristicas físicas: no lo conozco");
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
		
	
		
	volver= new JButton("volver");
	volver.addActionListener(this);
	volver.setBounds(1,1,2,2);
		labnom=new JLabel[17];
		labape=new JLabel[17];
		labmats=new JLabel[30];
		labday=new JLabel[30];	
		labhour=new JLabel[30];
		
}

public void actionPerformed(ActionEvent e){
		
		if (e.getSource()==mi41) {
            
			System.exit(0);
        }
		//--------------------------------
		if (e.getSource()==perfil[0]) {
			String h="";
			h=ld.muestra_perfil(0);
			JLabel nuevo= new JLabel(""+h);
			containerperfil.add(nuevo);

			remove(container);
			remove(container2);
			remove(containerday);
			remove(containermat);
			remove(containerhour);
			
			add(containerperfil);
			add(volver,BorderLayout.SOUTH);
			resize(1200,455);
		
		}
		//----------------------------------
		if (e.getSource()==volver) {
			remove(container);
			remove(container2);
			remove(containerday);
			remove(containermat);
			remove(containerhour);
			remove(containerperfil);
			remove(volver);
			add(container);
			add(container2);
			resize(1200,456);
		//fin ver profesores
		}
		
		
		//--------------------------- escoge nombre y apellido de profesor
		if(e.getSource()==mi1){
			remove(container);
			remove(container2);
			remove(containerday);
			remove(containermat);
			remove(containerhour);
			
			if(flag==0){
			n=15;
			String aux="";

			labnom[0]=new JLabel("\n Nombre " );
			container.add(labnom[0]);
			
			container.setLayout(new GridLayout(16,2,0,0));
			for(int i=0; i<n;i++){
				aux= ld.muestra_nombre(i);
				labnom[i+1]=new JLabel("  "+aux);
		
				//perfil[i].addActionListener(this);
				container.add(labnom[i+1]);
			}

			labape[0]=new JLabel("\n Apellidos\n ");
			labape[1]=new JLabel(" ");
			container2.add(labape[0]);
			container2.add(labape[1]);
			container2.setLayout(new GridLayout(16,2,0,0));
			for(int i=0; i<n;i++){
				aux= ld.muestra_apell(i);
				labape[i+2]=new JLabel("  "+aux);
		
				container2.add(labape[i+2]);
				perfil[i]=new JButton("perfil");
				perfil[i].setBounds(5, 5, 9, 9);
				perfil[i].addActionListener(this);
				container2.add(perfil[i]);
		}
flag=1;
			}
	setLayout(new GridLayout(1,2,4,4));
	add(container);
	add(container2);
		resize(1200,451);
		}//fin ver profesores
		
		
		//--------------------------- escoge nombre y apellido de profesor y materias		
		if(e.getSource()==mi2){
			
		if(flag2==0){
			String aux2=" ";
			
			labmats[0]=new JLabel("\n Nombre de materia \n");
			containermat.add(labmats[0]);
			containermat.setLayout(new GridLayout(21,1,0,0));
	for(int j=0; j<11;j++){
				
			while (aux2!="ya"){
				
				aux2= ld.muestra_materia(j);
				
				if(aux2!="ya"){
				labmats[j+1]=new JLabel(" "+aux2);
				containermat.add(labmats[j+1]);
			}}
			aux2="";}
	flag2=1;}
				
		remove(container);
		remove(container2);
		remove(containermat);
		remove(containerday);
		remove(containerhour);
		setLayout(new GridLayout(1,5,4,4));
		add(container);
		add(container2);
		add(containermat);
		
		resize(1200,452);

		}//fin mi2

		//--------------------------- escoge fecha
		if(e.getSource()==mi3){			
			if(flag3==0){
				String aux2=" ";
				
				labday[0]=new JLabel("\n Fecha \n");
				containerday.add(labday[0]);
				containerday.setLayout(new GridLayout(21,1,0,0));	
				
		for(int j=0; j<11;j++){
					
				while (aux2!="ya"){
					
					aux2= ld.muestra_fecha(j);
					
					if(aux2!="ya"){
					labday[j+1]=new JLabel(" "+aux2);
					containerday.add(labday[j+1]);
				}}
				aux2="";}
		flag3=1;}
				
			remove(container);
			remove(container2);
			remove(containermat);
			remove(containerday);
			remove(containerhour);
			
			setLayout(new GridLayout(1,4,4,4));
			add(container);
			add(container2);
			add(containermat);
			add(containerday);
			
			resize(1200,453);
		}//-----------fin escoge hora
// escoge hora
		if(e.getSource()==mi3_1){	
	

			if(flag4==0){
				String aux2=" ";
				
				labhour[0]=new JLabel("\n Hora \n");
				
				containerhour.add(labhour[0]);
				
		for(int j=0; j<11;j++){
					
				while (aux2!="ya"){
					
					aux2= ld.muestra_hora(j);
					
					if(aux2!="ya"){
					labhour[j+1]=new JLabel(" "+aux2);
					containerhour.add(labhour[j+1]);
				}}
				aux2="";}
		flag4=1;}
				
			remove(container);
			remove(container2);
			remove(containermat);
			remove(containerday);
			remove(containerhour);
			
			setLayout(new GridLayout(1,6,4,4));
			add(container);
			add(container2);
			add(containermat);
			add(containerday);
			add(containerhour);
			resize(1200,454);
		}



}//fin boolean


	public void paint(Graphics g){
		super.paint(g);
/*if(error==0){
ImageIcon fondo = new ImageIcon(getClass().getResource("imagen.png"));
g.drawImage(fondo.getImage(),700,70,120,150, null);

}*/}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Principal ob=new Principal();// OBJETO PRINCIPAL
    	ob.setDefaultCloseOperation(EXIT_ON_CLOSE);// FUNCION PARA TERMINAR EL PROCESO CUANDO SE CIERRA LA VENTANA
    	ob.setBounds(0,0,1200,450);// TAMAÑO DE LA VENTANA
    	ob.setVisible(true);// QUE EL JFRAME SEA VISIBLE
    	ob.getContentPane().setBackground(Color.GRAY);// FONDO NEGRO
	}
}



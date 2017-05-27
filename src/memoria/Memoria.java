import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.crypto.spec.PSource;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Memoria extends javax.swing.JFrame implements MouseListener{

    private javax.swing.JLabel etiImagen1;
    private javax.swing.JLabel etiImagen10;
    private javax.swing.JLabel etiImagen11;
    private javax.swing.JLabel etiImagen12;
    private javax.swing.JLabel etiImagen2;
    private javax.swing.JLabel etiImagen3;
    private javax.swing.JLabel etiImagen4;
    private javax.swing.JLabel etiImagen5;
    private javax.swing.JLabel etiImagen6;
    private javax.swing.JLabel etiImagen7;
    private javax.swing.JLabel etiImagen8;
    private javax.swing.JLabel etiImagen9;
    private javax.swing.JLabel etiquetaAbajo;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel lblPuntaje;
    private javax.swing.JLabel lblPuntos;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelImagenes;
    private javax.swing.JPanel panelInferior;
    private javax.swing.JPanel panelInfo;
    private javax.swing.JPanel panelSuperior;
    private JButton botonInicia;      
    
    int arregloNumeroImagenes[]=new int[12];
    JLabel arregloLabelImagenes[]=new JLabel[12];
    int arregloControlRepeticiones[]=new int[6];
    int arregloControlParejas[]=new int[12];
    int arregloCantClic[]=new int[12];
	
    int clic=0;
    int vista1,vista2;
    int puntaje=0;
    

    public Memoria() {
    	
        initComponents();
        inicializarArreglos();
        setSize(574, 517);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }

  
	@SuppressWarnings("unchecked")                        
    private void initComponents() {

        etiquetaTitulo = new JLabel();
        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 35)); 
        etiquetaTitulo.setText("MEMORIA");
        etiquetaTitulo.addMouseListener(this);
        etiquetaTitulo.setVisible(true);
        
        etiquetaAbajo = new JLabel();
        etiquetaAbajo.setFont(new java.awt.Font("Chiller", 0, 22)); 
        etiquetaAbajo.setText("POO UNAL");
        
        botonInicia=new JButton();
        botonInicia.setFont(new java.awt.Font("Tahoma", 0, 36)); 
        botonInicia.setText("Reinicia");
        botonInicia.setBounds(10, 310, 230, 80);
        botonInicia.addMouseListener(this);
        
        lblPuntaje = new JLabel();
        lblPuntaje.setFont(new java.awt.Font("Tahoma", 0, 48)); 
        lblPuntaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntaje.setText("Puntaje");
        lblPuntaje.setBounds(50, 0, 170, 120);
        
        lblPuntos = new JLabel();
        lblPuntos.setFont(new java.awt.Font("Tahoma", 0, 120)); 
        lblPuntos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntos.setText("0");
        
        lblPuntos.setBounds(40, 120, 170, 130);

        etiImagen1 = new JLabel();
        etiImagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abrir.jpg"))); 
        etiImagen1.setBounds(5, 0, 100, 100);
       
        etiImagen2 = new JLabel();
        etiImagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abrir.jpg"))); 
        etiImagen2.setBounds(113, 0, 100, 100);

        etiImagen3 = new JLabel();
        etiImagen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abrir.jpg"))); 
        etiImagen3.setBounds(220, 0, 100, 100);

        etiImagen4 = new JLabel();
        etiImagen4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abrir.jpg"))); 
        etiImagen4.setBounds(5, 100, 100, 100);

        etiImagen5 = new JLabel();
        etiImagen5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abrir.jpg"))); 
        etiImagen5.setBounds(113, 100, 100, 100);

        etiImagen6 = new JLabel();
        etiImagen6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abrir.jpg"))); 
        etiImagen6.setBounds(220, 100, 100, 100);

        etiImagen7 = new JLabel();
        etiImagen7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abrir.jpg"))); 
        etiImagen7.setBounds(5, 200, 100, 100);

        etiImagen8 = new JLabel();
        etiImagen8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abrir.jpg"))); 
        etiImagen8.setBounds(113, 200, 100, 100);

        etiImagen9 = new JLabel();
        etiImagen9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abrir.jpg"))); 
        etiImagen9.setBounds(220, 200, 100, 100);

        etiImagen10 = new JLabel();
        etiImagen10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abrir.jpg"))); 
        etiImagen10.setBounds(5, 300, 100, 100);

        etiImagen11 = new JLabel();
        etiImagen11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abrir.jpg"))); 
        etiImagen11.setBounds(113, 300, 100, 100);
        
        etiImagen12 = new JLabel();
        etiImagen12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abrir.jpg"))); 
        etiImagen12.setBounds(220, 300, 100, 100);

        panelImagenes = new JPanel();
        panelImagenes.setBackground(new java.awt.Color(255, 204, 0));
        panelImagenes.setLayout(null);
        panelImagenes.setBounds(0, 0, 320, 465);
        panelImagenes.add(etiImagen1);
        panelImagenes.add(etiImagen2);
        panelImagenes.add(etiImagen3);
        panelImagenes.add(etiImagen4);
        panelImagenes.add(etiImagen5);
        panelImagenes.add(etiImagen6);
        panelImagenes.add(etiImagen7);
        panelImagenes.add(etiImagen8);
        panelImagenes.add(etiImagen9);
        panelImagenes.add(etiImagen10);
        panelImagenes.add(etiImagen11);
        panelImagenes.add(etiImagen12);
        
        panelSuperior = new JPanel();
        panelSuperior.setBackground(new java.awt.Color(204, 204, 0));
        panelSuperior.add(etiquetaTitulo);
        
        panelInfo = new JPanel();
        panelInfo.setBackground(new java.awt.Color(102, 153, 0));
        panelInfo.setLayout(null);
        panelInfo.setBounds(320, 0, 260, 420);
        panelInfo.add(botonInicia);
        panelInfo.add(lblPuntaje);
        panelInfo.add(lblPuntos);
        
        panelCentral = new JPanel();
        panelCentral.setBackground(new java.awt.Color(102, 102, 0));
        panelCentral.setLayout(null);
        panelCentral.add(panelImagenes);
        panelCentral.add(panelInfo);
        
        panelInferior = new JPanel();
        panelInferior.setBackground(new java.awt.Color(204, 204, 0));
        FlowLayout miLayout=new FlowLayout(FlowLayout.RIGHT);
        panelInferior.setLayout(miLayout);
        panelInferior.add(etiquetaAbajo);

        add(panelCentral, java.awt.BorderLayout.CENTER);
        add(panelInferior, java.awt.BorderLayout.PAGE_END);
        add(panelSuperior, java.awt.BorderLayout.PAGE_START);

        pack();
    }  
	
    
		private void inicializarArreglos() {
			
			inicializaArregloImagenes();
			
			
			llenaArreglosConCeros(arregloControlRepeticiones);
			llenaArreglosConCeros(arregloNumeroImagenes);
			llenaArreglosConCeros(arregloControlParejas);
			llenaArreglosConCeros(arregloCantClic);
						
			 Random r=new Random();
			 int posicionImagen;
			  for (int i = 0; i < 12; i++) {
				
				 posicionImagen=r.nextInt(6);
	            if(arregloControlRepeticiones[posicionImagen]<2){
	                arregloNumeroImagenes[i]=posicionImagen+1;
	                System.out.print(arregloNumeroImagenes[i]+" , ");
	            	arregloControlRepeticiones[posicionImagen]++;
	            }else{
	                i--;
	            }
			}
			 
		}
		
		 
		private void inicializaArregloImagenes() {
			arregloLabelImagenes[0]=etiImagen1;  arregloLabelImagenes[1]=etiImagen2;   arregloLabelImagenes[2]=etiImagen3;
			arregloLabelImagenes[3]=etiImagen4;  arregloLabelImagenes[4]=etiImagen5;   arregloLabelImagenes[5]=etiImagen6;
			arregloLabelImagenes[6]=etiImagen7;  arregloLabelImagenes[7]=etiImagen8;   arregloLabelImagenes[8]=etiImagen9;
			arregloLabelImagenes[9]=etiImagen10; arregloLabelImagenes[10]=etiImagen11; arregloLabelImagenes[11]=etiImagen12;
			
			for (int i = 0; i < 12; i++) {
				 arregloLabelImagenes[i].setIcon(new ImageIcon(getClass().getResource("/imagenes/abrir.jpg")));
				 arregloLabelImagenes[i].addMouseListener(this);
			 }
		}

	    /**
	     * @param arreglo
	     */
	    private void llenaArreglosConCeros(int[] arreglo) {
			for (int i = 0; i < arreglo.length; i++) {
				arreglo[i]=0;
			}
		}


	/**
	 * @param vista1
	 * @param vista2
	 * @param i
	 */
	private void validaParejas(int vista1, int vista2, int i) {
		if (arregloNumeroImagenes[vista1]==arregloNumeroImagenes[vista2]) {
                                puntaje+=10;
				lblPuntos.setText(puntaje+"");
				arregloControlParejas[vista1]=1;
				arregloControlParejas[vista2]=1;	
		}else{
			arregloLabelImagenes[vista1].setIcon(new ImageIcon(getClass().getResource("/imagenes/abrir.jpg")));
			arregloLabelImagenes[vista2].setIcon(new ImageIcon(getClass().getResource("/imagenes/abrir.jpg")));
			arregloCantClic[vista1]=0;
			arregloCantClic[vista2]=0;
		}
	}

	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		if (e.getSource()==botonInicia) {
	        inicializarArreglos();
	        clic=0;
	        puntaje=0;
	        lblPuntos.setText("0");
		}
		
		
		for (int i = 0; i < 12; i++) {
			
			if (e.getSource()==arregloLabelImagenes[i] && verificaParejasEncontradas(i)) {
				arregloCantClic[i]++;
				if (arregloCantClic[i]<2) {
					
					clic++;
					arregloLabelImagenes[i].setIcon(new ImageIcon(getClass().getResource("/imagenes/"+arregloNumeroImagenes[i]+".jpg")));
					if (clic==1) {
						vista1=i;
					}else{
						 vista2=i;	
						}
					}
				}
							
			}
		}
	
	/**
	 * @param i
	 * @return
	 */
	private boolean verificaParejasEncontradas(int i) {
		
		if (arregloControlParejas[i]!=1) {
			return true;
		}else{
			return false;	
		}
	}
	
	
	@Override
	public void mouseExited(MouseEvent e) {
		for (int i = 0; i < 12; i++) {
			if (e.getSource()==arregloLabelImagenes[i]) {
				if (clic==2) {
					validaParejas(vista1,vista2,i);
					clic=0;
				}				
			}
		}
	}
	
	@Override
	public void mouseEntered(MouseEvent arg0) { }

	@Override
	public void mousePressed(MouseEvent arg0) { }

	@Override
	public void mouseReleased(MouseEvent arg0) { }
}


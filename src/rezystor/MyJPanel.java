package rezystor;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

public class MyJPanel extends JPanel{
	
	//Ró¿ne zmienne
	Color BROWN = new Color(102,51,0);
	Color GOLD = new Color(255, 204, 51);
	Color SILVER = new Color(204, 204, 204);
	Color currentColor1=Color.BLACK;
	Color currentColor2=Color.BLACK;
	Color currentColor3=Color.BLACK;
	Color currentColor4=Color.BLACK;
	Color currentColor5=BROWN;
	Color currentColor6=BROWN;
	boolean pasek3=false;
	boolean pasek6=false;

	//Settery do ustawiania kolorów pasków
public void setPasek3(boolean x) {
	pasek3=x;
	repaint();
}

public void setPasek6(boolean x) {
	pasek6=x;
	repaint();
}

public void setColor1(Color x) {
	currentColor1=x;
	repaint();
}
public void setColor2(Color x) {
	currentColor2=x;
	repaint();
}
public void setColor3(Color x) {
	currentColor3=x;
	repaint();
}
public void setColor4(Color x) {
	currentColor4=x;
	repaint();
}
public void setColor5(Color x) {
	currentColor5=x;
	repaint();
}
public void setColor6(Color x) {
	currentColor6=x;
	repaint();
}

	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(801,401);
	}


	
	
	
	//Rysowanie rezystora
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
			Graphics2D g2d=(Graphics2D)g;
			g2d.setColor(Color.BLACK);
		    g2d.drawLine(0,0,100,0);
		    g2d.drawLine(100,0,100,50);
		    g2d.drawLine(100,50,700,50);
		    g2d.drawLine(700,50,700,0);
		    g2d.drawLine(700,0,800,0);
		    g2d.drawLine(800,0,800,400);
		    g2d.drawLine(800,400,700,400);
		    g2d.drawLine(700,400,700,350);
		    g2d.drawLine(700,350,100,350);
		    g2d.drawLine(100,350,100,400);
		    g2d.drawLine(100,400,0,400);
		    g2d.drawLine(0,400,0,0);
		    
		    g2d.setColor(currentColor1);
		    g2d.fillRect(100,51,50,299);
		    g2d.setColor(currentColor2);
		    g2d.fillRect(250,51,50,299);
		    if(pasek3==true) {
		    g2d.setColor(currentColor3);
		    g2d.fillRect(350,51,50,299);
		    }
		    g2d.setColor(currentColor4);
		    g2d.fillRect(450,51,50,299);
		    g2d.setColor(currentColor5);
		    g2d.fillRect(550,51,50,299);
		    if(pasek6==true) {
		    g2d.setColor(currentColor6);
		    g2d.fillRect(650,51,50,299);
		    }
		    g2d.setColor(Color.BLACK);
		    g2d.drawLine(100,50,100,350);
		    g2d.drawLine(150,50,150,350);
		    g2d.drawLine(250,50,250,350);
		    g2d.drawLine(300,50,300,350);
		    if(pasek3==true) {
		    g2d.drawLine(350,50,350,350);
		    g2d.drawLine(400,50,400,350);
		    }
		    g2d.drawLine(450,50,450,350);
		    g2d.drawLine(500,50,500,350);
		    g2d.drawLine(550,50,550,350);
		    g2d.drawLine(600,50,600,350);
		    if(pasek6==true) {
		    g2d.drawLine(650,50,650,350);
		    g2d.drawLine(700,50,700,350);
		    }
		    
		    
		    
		
			
	}
}



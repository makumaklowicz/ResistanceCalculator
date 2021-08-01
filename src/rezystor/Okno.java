package rezystor;


import javax.swing.event.ListSelectionListener;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.JCheckBox;
import javax.swing.JList;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Okno extends JFrame {
	 
	Okno() {
		Color BROWN = new Color(102,51,0);
		Color GOLD = new Color(255, 204, 51);
		Color SILVER = new Color(204, 204, 204);
		liczenieRez rez=new liczenieRez();
		//Deklaracja Kontenera
		Container c = this.getContentPane();
		c.setLayout(new BorderLayout());
		this.setTitle("Rezystory"); //Tytu³
		//Panel z narysowanym rezystorem
		MyJPanel p = new MyJPanel();
		p.setBackground(Color.WHITE);
		JPanel xp= new JPanel(new BorderLayout());
		xp.add(BorderLayout.NORTH,p);
		//Deklaracje buttonów
		JButton czterypaski=new JButton("Cztery paski");
		JButton piecpaskow=new JButton("Piêæ pasków");
		JButton szescpaskow=new JButton("Szeœæ pasków");
		czterypaski.setBackground(Color.GRAY);
		piecpaskow.setBackground(Color.WHITE);
		szescpaskow.setBackground(Color.WHITE);
		JPanel butony= new JPanel();
		JPanel komboboksy= new JPanel();
		JPanel boksy= new JPanel(new BorderLayout());
		
		//Tablice z zapisanymi nazwami kolorów w takiej kolejnosci jak w comboboxach
		String[] strings = {"Czarny", "Br¹zowy", "Czerwony","Pomarañczowy","¯ó³ty","Zielony","Niebieski","Fioletowy","Szary","Bia³y"};
		String[] strings1 = {"Czarny", "Br¹zowy", "Czerwony","Pomarañczowy","¯ó³ty","Zielony","Niebieski","Fioletowy","Szary","Bia³y","Z³oty","Srebrny"};
		String[] strings2 = {"Br¹zowy", "Czerwony","Zielony","Niebieski","Fioletowy","Szary","Z³oty","Srebrny"};
		String[] strings3 = {"Br¹zowy", "Czerwony","Pomarañczowy","¯ó³ty","Niebieski","Fioletowy"};
		//Tablice z zapisanymi kolorami w takiej kolejnosci jak w comboboxach
		Color[] colors = {Color.BLACK, BROWN, Color.RED, Color.ORANGE,Color.YELLOW,Color.GREEN,Color.BLUE,Color.MAGENTA,Color.GRAY,Color.WHITE};
		Color[] colors1 = {Color.BLACK, BROWN, Color.RED, Color.ORANGE,Color.YELLOW,Color.GREEN,Color.BLUE,Color.MAGENTA,Color.GRAY,Color.WHITE, GOLD, SILVER};
		Color[] colors2 = {BROWN, Color.RED,Color.GREEN,Color.BLUE,Color.MAGENTA,Color.GRAY, GOLD, SILVER};
		Color[] colors3 = {BROWN, Color.RED,Color.ORANGE,Color.YELLOW,Color.BLUE,Color.MAGENTA};
		
		//Deklaracja i konfiguracja comboboxów
		JComboBox cb1 = new JComboBox(strings);
		JComboBox cb2 = new JComboBox(strings);
		JComboBox cb3 = new JComboBox(strings);
		JComboBox cb4 = new JComboBox(strings1);
		JComboBox cb5 = new JComboBox(strings2);
		JComboBox cb6 = new JComboBox(strings3);
		
        ComboBoxRenderer renderer1 = new ComboBoxRenderer(cb1);
        renderer1.setStrings(strings);
        cb1.setRenderer(renderer1);
        
        ComboBoxRenderer renderer2 = new ComboBoxRenderer(cb2);
        renderer2.setStrings(strings);
        cb2.setRenderer(renderer2);
        
        ComboBoxRenderer renderer3 = new ComboBoxRenderer(cb3); 
        renderer3.setStrings(strings);
        cb3.setRenderer(renderer1);
        
        ComboBoxRenderer renderer4 = new ComboBoxRenderer(cb4);
        renderer4.setStrings(strings1);
        cb4.setRenderer(renderer4);
        
        ComboBoxRenderer renderer5 = new ComboBoxRenderer(cb5);
        renderer5.setStrings(strings2);
        cb5.setRenderer(renderer5);
        
        ComboBoxRenderer renderer6 = new ComboBoxRenderer(cb6);
        renderer6.setStrings(strings3);
        cb6.setRenderer(renderer6);
        cb3.setEnabled(false);
        cb6.setEnabled(false);
        cb1.setBackground(Color.BLACK);
        cb2.setBackground(Color.BLACK);
        cb3.setBackground(Color.BLACK);
        cb4.setBackground(Color.BLACK);
        cb5.setBackground(BROWN);
        cb6.setBackground(BROWN);
        cb1.setForeground(Color.WHITE);
        cb2.setForeground(Color.WHITE);
        cb3.setForeground(Color.WHITE);
        cb4.setForeground(Color.WHITE);
        cb5.setForeground(Color.WHITE);
        cb6.setForeground(Color.WHITE);
        
        //Deklaracja i konfiguracja listy
        DefaultListModel listModel = new DefaultListModel();
        JList list = new JList(listModel);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setSelectedIndex(0);
        list.setVisibleRowCount(5);
        JScrollPane listScroller = new JScrollPane(list);
        listScroller.setPreferredSize(new Dimension(250, 400));
        
		JButton b1 = new JButton("Zapamiêtaj");
		b1.setBackground(Color.WHITE);
		JButton b2 = new JButton("Oblicz");
		b2.setBackground(Color.WHITE);
		
		//Dodawanie wszystkiego na swoje miejsce
		butony.add(czterypaski);
		butony.add(piecpaskow);
		butony.add(szescpaskow);
		komboboksy.add(BorderLayout.SOUTH,listScroller);
		komboboksy.add(b1);
		komboboksy.add(b2);
		komboboksy.add(cb1);
		komboboksy.add(cb2);
		komboboksy.add(cb3);
		komboboksy.add(cb4);
		komboboksy.add(cb5);
		komboboksy.add(cb6);
		JLabel l1=new JLabel("Rezystancja:          ");
		JLabel l2=new JLabel("Tolerancja:           ");
		JLabel l3=new JLabel("PPM:");
		JPanel labelki=new JPanel();
		labelki.add(l1);
		labelki.add(l2);
		labelki.add(l3);
		l3.setVisible(false);
		JPanel temper=new JPanel(new BorderLayout());
		temper.add(BorderLayout.NORTH,labelki);
		l1.setFont(new Font("Serif", Font.PLAIN, 26));
		l2.setFont(new Font("Serif", Font.PLAIN, 26));
		l3.setFont(new Font("Serif", Font.PLAIN, 26));
		xp.add(BorderLayout.CENTER,temper);
		JPanel temp=new JPanel(new BorderLayout());
		temp.add(BorderLayout.WEST,butony);
	    boksy.add(BorderLayout.NORTH,temp);
	    boksy.add(BorderLayout.CENTER,komboboksy);
        JPanel all=new JPanel(new BorderLayout());
        p.setPreferredSize(new Dimension (810,410));
		all.add(BorderLayout.EAST,xp);
		all.add(BorderLayout.WEST,boksy);
		c.add(BorderLayout.CENTER,all);
		c.setBackground(Color.WHITE);
		
		
		
		//Obs³uga przycisków zapamiêtaj i oblicz
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)  {
				String sel1 = (String) strings[cb1.getSelectedIndex()];
				String sel2 = (String) strings[cb2.getSelectedIndex()];
				String sel3 = (String) strings[cb3.getSelectedIndex()];
				String sel4 = (String) strings1[cb4.getSelectedIndex()];
				String sel5 = (String) strings2[cb5.getSelectedIndex()];
				String sel6 = (String) strings3[cb6.getSelectedIndex()];
				if(czterypaski.getBackground()==Color.GRAY) {
					listModel.addElement(sel1+" "+sel2+" "+sel4+" "+sel5);
				}
				if(piecpaskow.getBackground()==Color.GRAY) {
					listModel.addElement(sel1+" "+sel2+" "+sel3+" "+sel4+" "+sel5);
				}
				if(szescpaskow.getBackground()==Color.GRAY) {
				listModel.addElement(sel1+" "+sel2+" "+sel3+" "+sel4+" "+sel5+" "+sel6);
				}
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)  {
				l1.setText("Rezystancja: "+rez.getRezystancja()+"   ");
		        l1.repaint();
		        l2.setText("Tolerancja: "+rez.getTolerancja()+"   ");
		        l2.repaint();
		        l3.setText("PPM: "+rez.getPPM()+" ppm");
		        l3.repaint();
			
			}
		});
		
		
		//Obs³uga comboboxów
		cb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)  {
				 Color selectedColor = (Color) colors[cb1.getSelectedIndex()];
			        cb1.setBackground(selectedColor);
			        p.setColor1(selectedColor);
			        cb1.transferFocusUpCycle();
			        cb1.setForeground(Color.WHITE);
			        if(selectedColor==Color.WHITE) {
			        	cb1.setForeground(Color.BLACK);
			        }
			        rez.setPasek1(cb1.getSelectedIndex());
			}
		});
		
		cb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)  {
				 Color selectedColor = (Color) colors[cb2.getSelectedIndex()];
			        cb2.setBackground(selectedColor);
			        p.setColor2(selectedColor);
			        cb2.transferFocusUpCycle();
			        cb2.setForeground(Color.WHITE);
			        if(selectedColor==Color.WHITE) {
			        	cb2.setForeground(Color.BLACK);
			        }
			        rez.setPasek2(cb2.getSelectedIndex());
			}
		});
		
		cb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)  {
				 Color selectedColor = (Color) colors[cb3.getSelectedIndex()];
			        cb3.setBackground(selectedColor);
			        p.setColor3(selectedColor);
			        cb3.transferFocusUpCycle();
			        cb3.setForeground(Color.WHITE);
			        if(selectedColor==Color.WHITE) {
			        	cb3.setForeground(Color.BLACK);
			        }
			        rez.setPasek3(cb3.getSelectedIndex());
			        
			}
		});
		
		cb4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)  {
				 Color selectedColor = (Color) colors1[cb4.getSelectedIndex()];
			        cb4.setBackground(selectedColor);
			        p.setColor4(selectedColor);
			        cb4.transferFocusUpCycle();
			        cb4.setForeground(Color.WHITE);
			        if(selectedColor==Color.WHITE) {
			        	cb4.setForeground(Color.BLACK);
			        }
			        rez.setPasek4(cb4.getSelectedIndex());
			}
		});
		
		cb5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)  {
				 Color selectedColor = (Color) colors2[cb5.getSelectedIndex()];
			        cb5.setBackground(selectedColor);
			        p.setColor5(selectedColor);
			        cb5.transferFocusUpCycle();
			        cb5.setForeground(Color.WHITE);
			        if(selectedColor==Color.WHITE) {
			        	cb5.setForeground(Color.BLACK);
			        }
			        rez.setPasek5(cb5.getSelectedIndex());
			}
		});
		
		cb6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)  {
				 Color selectedColor = (Color) colors3[cb6.getSelectedIndex()];
			        cb6.setBackground(selectedColor);
			        p.setColor6(selectedColor);
			        cb6.transferFocusUpCycle();
			        cb6.setForeground(Color.WHITE);
			        if(selectedColor==Color.WHITE) {
			        	cb6.setForeground(Color.BLACK);
			        }
			        rez.setPasek6(cb6.getSelectedIndex());
			}
		});
		
		
		//Obs³uga przycisków od wyboru iloœci pasków
		czterypaski.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)  { 
                
                     cb3.setEnabled(false);
                     cb6.setEnabled(false);
                     p.setPasek3(false);
                     p.setPasek6(false);
                     czterypaski.setBackground(Color.GRAY);
                     piecpaskow.setBackground(Color.WHITE);
                     szescpaskow.setBackground(Color.WHITE);
                     l3.setVisible(false);
                    l1.setText("Rezystancja:          ");
     		        l1.repaint();
     		        l2.setText("Tolerancja:          ");
     		        l2.repaint();
     		        l3.setText("PPM: ");
     		        l3.repaint();   
            }
         });
		
		
		piecpaskow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)  { 
               
            	   cb3.setEnabled(true);
            	   cb6.setEnabled(false);
            	   p.setPasek3(true);
            	   p.setPasek6(false);
            	   czterypaski.setBackground(Color.WHITE);
                   piecpaskow.setBackground(Color.GRAY);
                   szescpaskow.setBackground(Color.WHITE);
                   l3.setVisible(false);
                l1.setText("Rezystancja:          ");
   		        l1.repaint();
   		        l2.setText("Tolerancja:          ");
   		        l2.repaint();
   		        l3.setText("PPM: ");
   		        l3.repaint();
            }
         });
		
		
		szescpaskow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)  { 
               
            	   cb3.setEnabled(true);
                   cb6.setEnabled(true);
                   p.setPasek3(true);
                   p.setPasek6(true);
                   czterypaski.setBackground(Color.WHITE);
                   piecpaskow.setBackground(Color.WHITE);
                   szescpaskow.setBackground(Color.GRAY);
                   l3.setVisible(true);
               l1.setText("Rezystancja:          ");
   		        l1.repaint();
   		        l2.setText("Tolerancja:          ");
   		        l2.repaint();
   		        l3.setText("PPM: ");
   		        l3.repaint();  
            }
         });
		
		
		//Obs³uga podwójnego klikniêcia na element listy
		list.addMouseListener(new MouseAdapter() {
		    public void mouseClicked(MouseEvent evt) { 
		    	if (evt.getClickCount() == 2) {
		        	String s = (String) list.getSelectedValue();
		        	String[] sx=s.split(" ");
		        	listaUst temp=new listaUst();
		        	temp.setList(sx);
		        	if(sx.length==4) {
		        		cb1.setSelectedIndex(temp.getCB1());
			        	cb2.setSelectedIndex(temp.getCB2());
			        	cb4.setSelectedIndex(temp.getCB4());
			        	cb5.setSelectedIndex(temp.getCB5());
			        	czterypaski.doClick();
		        	}
		        	if(sx.length==5) {
		        		cb1.setSelectedIndex(temp.getCB1());
			        	cb2.setSelectedIndex(temp.getCB2());
			        	cb3.setSelectedIndex(temp.getCB3());
			        	cb4.setSelectedIndex(temp.getCB4());
			        	cb5.setSelectedIndex(temp.getCB5());
			        	piecpaskow.doClick();
		        	}
		        	if(sx.length==6) {
		        	cb1.setSelectedIndex(temp.getCB1());
		        	cb2.setSelectedIndex(temp.getCB2());
		        	cb3.setSelectedIndex(temp.getCB3());
		        	cb4.setSelectedIndex(temp.getCB4());
		        	cb5.setSelectedIndex(temp.getCB5());
		        	cb6.setSelectedIndex(temp.getCB6());
		        	szescpaskow.doClick();
		        	}
		        	b2.doClick();
		        	 }	
		    }
		    
		});

		c.setPreferredSize( new Dimension(2000, 1000));
		setVisible(true);
		pack();
		
	}
}



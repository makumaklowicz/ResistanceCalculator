package rezystor;
import java.awt.Color;
import java.awt.Component;
import javax.swing.*;


//Klasa s³u¿¹ca do konfiguracji renderowania comboboxów (wyœwietlanie kolorów)
class ComboBoxRenderer extends JPanel implements ListCellRenderer
{
	Color GOLD = new Color(255, 204, 51);
	Color SILVER = new Color(204, 204, 204);
	Color BROWN = new Color(102,51,0);
    private static final long serialVersionUID = -1L;
    private Color[] colors;
    private String[] strings;
    JPanel textPanel;
    JLabel text;

    public ComboBoxRenderer(JComboBox combo) {

        textPanel = new JPanel();
        textPanel.add(this);
        text = new JLabel();
        text.setOpaque(true);
        text.setFont(combo.getFont());
        textPanel.add(text);
           
        
        
    }

    public void setColors(Color[] col)
    {
        colors = col;
    }

    public void setStrings(String[] str)
    {
        strings = str;
    }

    public Color[] getColors()
    {
        return colors;
    }

    public String[] getStrings()
    {
        return strings;
    }

    @Override
    public Component getListCellRendererComponent(JList list, Object value,
            int index, boolean isSelected, boolean cellHasFocus) {
        text.setText(value.toString());
        if (index>-1) {
            text.setForeground(Color.WHITE);
        }
       
        if(value.toString()=="Czarny") {
        	text.setBackground(Color.BLACK);
        }
        if(value.toString()=="Br¹zowy") {
        	text.setBackground(BROWN);
        }
        if(value.toString()=="Czerwony") {
        	text.setBackground(Color.RED);
        }
        if(value.toString()=="Pomarañczowy") {
        	text.setBackground(Color.ORANGE);
        }
        if(value.toString()=="¯ó³ty") {
        	text.setBackground(Color.YELLOW);
        }
        if(value.toString()=="Zielony") {
        	text.setBackground(Color.GREEN);
        }
        if(value.toString()=="Niebieski") {
        	text.setBackground(Color.BLUE);
        }
        if(value.toString()=="Fioletowy") {
        	text.setBackground(Color.MAGENTA);
        }
        if(value.toString()=="Szary") {
        	text.setBackground(Color.GRAY);
        }
        if(value.toString()=="Srebrny") {
        	text.setBackground(SILVER);
        }
        if(value.toString()=="Z³oty") {
        	text.setBackground(GOLD);
        }
        if(value.toString()=="Bia³y") {
        	text.setBackground(Color.WHITE);
        	text.setForeground(Color.BLACK);
        }
        if(isSelected) {
        	text.setBackground(Color.GRAY);
        }
       
        return text;
    }
}
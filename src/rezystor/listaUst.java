package rezystor;



//Klasa podaj�ca odpowiedni index odpowiadaj�cy nazwie koloru zawartego w elemencie listy (u�ywane przy wczytywaniu elementu z list)
public class listaUst {
	String[] sx;
	
	public void setList(String[] newList)
	{
		sx=newList;
	}
	
	public int getCB1() {
		int index=0;
		if(sx[0].contains("Czarny")) {
			index=0;
		}
		else if(sx[0].contains("Br�zowy")) {
			index=1;
		}
		else if(sx[0].contains("Czerwony")) {
			index=2;
		}
		else if(sx[0].contains("Pomara�czowy")) {
			index=3;
		}
		else if(sx[0].contains("��ty")) {
			index=4;
		}
		else if(sx[0].contains("Zielony")) {
			index=5;
		}
		else if(sx[0].contains("Niebieski")) {
			index=6;
		}
		else if(sx[0].contains("Fioletowy")) {
			index=7;
		}
		else if(sx[0].contains("Szary")) {
			index=8;
		}
		else if(sx[0].contains("Bia�y")) {
			index=9;
		}
		return index;
	}
	public int getCB2() {
		int index=0;
		if(sx[1].contains("Czarny")) {
			index=0;
		}
		else if(sx[1].contains("Br�zowy")) {
			index=1;
		}
		else if(sx[1].contains("Czerwony")) {
			index=2;
		}
		else if(sx[1].contains("Pomara�czowy")) {
			index=3;
		}
		else if(sx[1].contains("��ty")) {
			index=4;
		}
		else if(sx[1].contains("Zielony")) {
			index=5;
		}
		else if(sx[1].contains("Niebieski")) {
			index=6;
		}
		else if(sx[1].contains("Fioletowy")) {
			index=7;
		}
		else if(sx[1].contains("Szary")) {
			index=8;
		}
		else if(sx[1].contains("Bia�y")) {
			index=9;
		}
		return index;
	}
	public int getCB3() {
		int index=0;
		if(sx[2].contains("Czarny")) {
			index=0;
		}
		else if(sx[2].contains("Br�zowy")) {
			index=1;
		}
		else if(sx[2].contains("Czerwony")) {
			index=2;
		}
		else if(sx[2].contains("Pomara�czowy")) {
			index=3;
		}
		else if(sx[2].contains("��ty")) {
			index=4;
		}
		else if(sx[2].contains("Zielony")) {
			index=5;
		}
		else if(sx[2].contains("Niebieski")) {
			index=6;
		}
		else if(sx[2].contains("Fioletowy")) {
			index=7;
		}
		else if(sx[2].contains("Szary")) {
			index=8;
		}
		else if(sx[2].contains("Bia�y")) {
			index=9;
		}
		return index;
	}
	public int getCB4() {
		int index=0;
		int temp=3;
		if (sx.length==4) {
		temp=2;	
		}
		if(sx[temp].contains("Czarny")) {
			index=0;
		}
		if(sx[temp].contains("Br�zowy")) {
			index=1;
		}
		if(sx[temp].contains("Czerwony")) {
			index=2;
		}
		if(sx[temp].contains("Pomara�czowy")) {
			index=3;
		}
		if(sx[temp].contains("��ty")) {
			index=4;
		}
		if(sx[temp].contains("Zielony")) {
			index=5;
		}
		if(sx[temp].contains("Niebieski")) {
			index=6;;
		}
		if(sx[temp].contains("Fioletowy")) {
			index=7;
		}
		if(sx[temp].contains("Szary")) {
			index=8;
		}
		if(sx[temp].contains("Bia�y")) {
			index=9;
		}
		if(sx[temp].contains("Z�oty")) {
			index=10;
		}
		if(sx[temp].contains("Srebrny")) {
			index=11;
		}
return index;
	}
	
	public int getCB5(){
		int index=0;
		int temp=4;
		if (sx.length==4) {
		temp=3;	
		}
		if(sx[temp].contains("Br�zowy")) {
			index=0;
		}
		if(sx[temp].contains("Czerwony")) {
			index=1;
		}
		if(sx[temp].contains("Zielony")) {
			index=2;
		}
		if(sx[temp].contains("Niebieski")) {
			index=3;
		}
		if(sx[temp].contains("Fioletowy")) {
			index=4;
		}
		if(sx[temp].contains("Szary")) {
			index=5;
		}
		if(sx[temp].contains("Z�oty")) {
			index=6;
		}
		if(sx[temp].contains("Srebrny")) {
			index=7;
		}
		
		return index;
	}
	
	public int getCB6() {
		int index=0;
		if(sx[5].contains("Br�zowy")) {
			index=0;
		}
		if(sx[5].contains("Czerwony")) {
			index=1;
		}
		if(sx[5].contains("Pomara�czowy")) {
			index=2;
		}
		if(sx[5].contains("��ty")) {
			index=3;
		}
		if(sx[5].contains("Niebieski")) {
			index=4;
		}
		if(sx[5].contains("Fioletowy")) {
			index=5;
		}

		
		return index;
	}

}








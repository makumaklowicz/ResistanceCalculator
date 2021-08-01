package rezystor;


//Klasa przeliczaj¹ca rezystancjê na podstawie wybranych kolorów pasków
public class liczenieRez {
int pasek1;
int pasek2;
int pasek3;
int pasek4;
int pasek5;
int pasek6;

public void setPasek1(int x) {
	pasek1=x;
}
public void setPasek2(int x) {
	pasek2=x;
}
public void setPasek3(int x) {
	pasek3=x;
}
public void setPasek4(int x) {
	pasek4=x;
}
public void setPasek5(int x) {
	pasek5=x;
}
public void setPasek6(int x) {
	pasek6=x;
}
public String getRezystancja() {
	String temp;
	if(pasek1==0&pasek2==0) {
	temp=Integer.toString(pasek3);
	}
	else if(pasek1==0) {
	temp=Integer.toString(pasek2)+Integer.toString(pasek3);
	}
	else {
		temp=Integer.toString(pasek1)+Integer.toString(pasek2)+Integer.toString(pasek3);
	}
	double rez=Double.parseDouble(temp); 
	if(pasek4==1) {
		rez=rez*10;
	}
	else if(pasek4==2) {
		rez=rez*100;
	}
	else if(pasek4==3) {
		rez=rez*1000;
	}
	else if(pasek4==4) {
		rez=rez*10000;
	}
	else if(pasek4==5) {
		rez=rez*100000;
	}
	else if(pasek4==6) {
		rez=rez*1000000;
	}
	else if(pasek4==7) {
		rez=rez*10000000;
	}
	else if(pasek4==8) {
		rez=rez*100000000;
	}
	else if(pasek4==9) {
		rez=rez*1000000000;
	}
	else if(pasek4==10) {
		rez=rez*0.1;
	}
	else if(pasek4==11) {
		rez=rez*0.01;
	}
	if(rez<1000) {
	temp=Double.toString(rez)+" Ohm";
	}
	if(rez>=1000&rez<1000000) {
		temp=Double.toString(rez/1000)+"k Ohm";
		}
	if(rez>=1000000&rez<1000000000) {
		temp=Double.toString(rez/1000000)+"M Ohm";
		}
	if(rez>=1000000000) {
		temp=Double.toString(rez/1000000000)+"G Ohm";
		}
		
	
	return temp;
}
public String getTolerancja() {
	String temp="0";
	if(pasek5==0)
	{
		temp="± 1%";
	}
	if(pasek5==1)
	{
		temp="± 2%";
	}
	if(pasek5==2)
	{
		temp="± 0.5%";
	}
	if(pasek5==3)
	{
		temp="± 0.25%";
	}
	if(pasek5==4)
	{
		temp="± 0.1%";
	}
	if(pasek5==5)
	{
		temp="± 0.05%";
	}
	if(pasek5==6)
	{
		temp="± 5%";
	}
	if(pasek5==7)
	{
		temp="± 10%";
	}

	return temp;
}
public String getPPM() {
	String temp="0";
	if(pasek6==0)
	{
		temp="100";
	}
	if(pasek6==1)
	{
		temp="50";
	}
	if(pasek6==2)
	{
		temp="15";
	}
	if(pasek6==3)
	{
		temp="25";
	}
	if(pasek6==4)
	{
		temp="10";
	}
	if(pasek6==5)
	{
		temp="5";
	}
	return temp;
}
	
	
}

class Electronics{
public static void main(String args[]){
      int numberOfElectronics[]= new int[10];
    numberOfElectronics[0]=30;	  
	numberOfElectronics[1]=45;
	numberOfElectronics[2]=62;
	numberOfElectronics[3]=55;
	numberOfElectronics[4]=37;
	numberOfElectronics[5]=28;
	numberOfElectronics[6]=90;
	numberOfElectronics[7]=42;
	numberOfElectronics[8]=76;
	numberOfElectronics[9]=100;
	
System.out.println("Number of Electronics:"+numberOfElectronics.length);
for(int i=0;i<numberOfElectronics.length;i++)
{
  System.out.println("Number of Electronics:"+numberOfElectronics[i]);	
}
      String colourOfElectronics[]= new String[10];
	colourOfElectronics[0]="Black";
	colourOfElectronics[1]="Blue";
	colourOfElectronics[2]="Red";
	colourOfElectronics[3]="Yellow";
	colourOfElectronics[4]="Pink";
	colourOfElectronics[5]="Orange";
	colourOfElectronics[6]="Green";
	colourOfElectronics[7]="Grey";
	colourOfElectronics[8]="White";
	colourOfElectronics[9]="Purple";
	
System.out.println("Colour of Electronics:"+colourOfElectronics.length);
for(int i=0;i<colourOfElectronics.length;i++)
{
	System.out.println("Colour of Electronics:"+colourOfElectronics[i]);
}

}
}
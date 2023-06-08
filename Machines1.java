class Machines1{
static String type;
static byte bad;
static short good;
static int workers;
static long wasted;
static float avg;
static double products;
static boolean useful;
static char ch;
public static void main(String a[]){
	System.out.println("Machine type before assigning the values:"+Machines1.type);
	System.out.println("No. of machines in bad condition before assigning the values:"+Machines1.bad);
	System.out.println("No. of machines in good condition before assigning the values:"+Machines1.good);
	System.out.println("No. of workers working on the machines before assigning the values:"+Machines1.workers);
	System.out.println("Products wasted by the machines before assigning the values:"+Machines1.wasted);
	System.out.println("Average products manufactured in one day before assigning the values:"+Machines1.avg);
	System.out.println("Products manufactured by the machines before assigning the values:"+Machines1.products);
	System.out.println("machines are useful before assigning the values:"+Machines1.useful);
	System.out.println("P or F before assigning the values:"+Machines1.ch);
Machines1.type="Power35";	
Machines1.bad=45;
Machines1.good=135;
Machines1.workers=1000;
Machines1.wasted=2500;
Machines1.avg=380;
Machines1.products=10000;
Machines1.useful=true;
Machines1.ch='P';
System.out.println("Machine type after assigning the values:"+Machines1.type);
	System.out.println("No. of machines in bad condition after assigning the values:"+Machines1.bad);
	System.out.println("No. of machines in good condition after assigning the values:"+Machines1.good);
	System.out.println("No. of workers working on the machines after assigning the values:"+Machines1.workers);
	System.out.println("Products wasted by the machines after assigning the values:"+Machines1.wasted);
	System.out.println("Average products manufactured in one day after assigning the values:"+Machines1.avg);
	System.out.println("Products manufactured by the machines after assigning the values:"+Machines1.products);
	System.out.println("machines are useful after assigning the values:"+Machines1.useful);
	System.out.println("P or F after assigning the values:"+Machines1.ch);

}
}
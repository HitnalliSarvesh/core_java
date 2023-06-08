class Movies1{
static String type;
static byte num;
static short theatres;
static int count;
static long contact;
static float rating;
static double budget;
static boolean hit;
static char rated;
public static void main(String a[]){

System.out.println("Movie type before assigning values:"+Movies1.type);
System.out.println("Number of movies released in this year before assigning values:"+Movies1.num);
System.out.println("Number of Theatres before assigning values:"+Movies1.theatres);
System.out.println("price before assigning values:"+Movies1.count);
System.out.println("Contact Number before assigning values:"+Movies1.contact);
System.out.println("Movie Rating before assigning values:"+Movies1.rating);
System.out.println("Total film budget before assigning values:"+Movies1.budget);
System.out.println("Film was hit before assigning values:"+Movies1.hit);
System.out.println("Film Rated before assigning values:"+Movies1.rated);	
Movies1.type="Action";
Movies1.num=80;
Movies1.theatres=200;
Movies1.count=250;
Movies1.contact=99002364;
Movies1.rating=4.5f;
Movies1.budget=400000000;
Movies1.hit=true;
Movies1.rated='U';
System.out.println("Movie type after assigning values:"+Movies1.type);
System.out.println("Number of movies released in this year after assigning values:"+Movies1.num);
System.out.println("Number of Theatres after assigning values:"+Movies1.theatres);
System.out.println("price after assigning values:"+Movies1.count);
System.out.println("Contact Number before assigning values:"+Movies1.contact);
System.out.println("Movie Rating after assigning values:"+Movies1.rating);
System.out.println("Total film budget after assigning values:"+Movies1.budget);
System.out.println("Film was hit after assigning values:"+Movies1.hit);
System.out.println("Film Rated after assigning values:"+Movies1.rated);	
	
}	
}
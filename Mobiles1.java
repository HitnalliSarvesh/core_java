class Mobiles1{
static String version;
static byte cam;
static int year;
static long battery;
static float size;
static double price;
static boolean last;
static char name;
public static void main(String a[]){
System.out.println("Mobile version before assigning the values:"+Mobiles1.version);
System.out.println("Camera version before assigning the values:"+Mobiles1.cam);
System.out.println("Launched year before assigning the values:"+Mobiles1.year);
System.out.println("Battery capacity before assigning the values:"+Mobiles1.battery);
System.out.println("Size of the phone before assigning the values:"+Mobiles1.size);
System.out.println("Price of the phone before assigning the values:"+Mobiles1.price);
System.out.println("Battery long lasting:"+Mobiles1.last);
System.out.println("Series name before assigning the values:"+Mobiles1.name);

Mobiles1.version="14.4v";
Mobiles1.cam=64;
Mobiles1.year=2022;
Mobiles1.battery=5000;
Mobiles1.size=6.4f;
Mobiles1.price=35000;
Mobiles1.last=true;
Mobiles1.name='S';
System.out.println("Mobile version after assigning the values:"+Mobiles1.version);
System.out.println("Camera version after assigning the values:"+Mobiles1.cam);
System.out.println("Launched year after assigning the values:"+Mobiles1.year);
System.out.println("Battery capacity after assigning the values:"+Mobiles1.battery);
System.out.println("Size of the phone after assigning the values:"+Mobiles1.size);
System.out.println("Price of the phone after assigning the values:"+Mobiles1.price);
System.out.println("Battery long lasting:"+Mobiles1.last);
System.out.println("Series name after assigning the values:"+Mobiles1.name);

}
}
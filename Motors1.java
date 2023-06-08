class Motors1{
static String version;
static byte hz;
static short volt;
static int hp;
static long speed;
static float torque;
static double price;
static boolean good;
static char name;
public static void main(String a[]){
System.out.println("Motor version before assigning the values:"+Motors1.version);
System.out.println(" Voltage before assigning the values:"+Motors1.hz);
System.out.println("Capacity before assigning the values:"+Motors1.volt);
System.out.println("Horsepower before assigning the values:"+Motors1.hp);
System.out.println("Speed before assigning the values:"+Motors1.speed);
System.out.println("Torque before assigning the values:"+Motors1.torque);
System.out.println("Price before assigning the values:"+Motors1.price);
System.out.println("Good Efficiency:"+Motors1.good);
System.out.println("Motor name before assigning the values:"+Motors1.name);

Motors1.version="144.5k";
Motors1.hz=115;
Motors1.volt=550;
Motors1.hp=746;
Motors1.speed=3600;
Motors1.torque=18.3f;
Motors1.price=25000;
Motors1.good=true;
Motors1.name='M';
System.out.println("Motor version after assigning the values:"+Motors1.version);
System.out.println(" Voltage after assigning the values:"+Motors1.hz);
System.out.println("Capacity after assigning the values:"+Motors1.volt);
System.out.println("Horsepower after assigning the values:"+Motors1.hp);
System.out.println("Speed after assigning the values:"+Motors1.speed);
System.out.println("Torque after assigning the values:"+Motors1.torque);
System.out.println("Price after assigning the values:"+Motors1.price);
System.out.println("Good Efficiency:"+Motors1.good);
System.out.println("Motor name after assigning the values:"+Motors1.name);

}
}
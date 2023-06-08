class Population1{
static String census;
static byte above;
static short group;
static int count;
static long teens;
static float literacy;
static double total;
static boolean agri;
static char name;
public static void main(String a[]){

System.out.println("Census before assigning the values:"+Population1.census);
System.out.println("People aged above 80 before assigning the values:"+Population1.above);
System.out.println("People aged between 50-80 before assigning the values:"+Population1.group);
System.out.println("People aged between 30-50 before assigning the values:"+Population1.count);
System.out.println("People aged between 10-30 before assigning the values:"+Population1.teens);
System.out.println("Literacy percentage before assigning the values:"+Population1.literacy);
System.out.println("Total population before assigning the values:"+Population1.total);
System.out.println("Good in Agriculture before assigning the values:"+Population1.agri);
System.out.println("Name of the Village before assigning the values:"+Population1.name);
Population1.census="2011 Population Census";
Population1.above=120;
Population1.group=1200;
Population1.count=5000;
Population1.teens=2500;
Population1.literacy=55.6f;
Population1.total=10000;
Population1.agri=true;
Population1.name='V';
System.out.println("Census after assigning the values:"+Population1.census);
System.out.println("People aged above 80 after assigning the values:"+Population1.above);
System.out.println("People aged between 50-80 after assigning the values:"+Population1.group);
System.out.println("People aged between 30-50 after assigning the values:"+Population1.count);
System.out.println("People aged between 10-30 after assigning the values:"+Population1.teens);
System.out.println("Literacy percentage after assigning the values:"+Population1.literacy);
System.out.println("Total population after assigning the values:"+Population1.total);
System.out.println("Good in Agriculture after assigning the values:"+Population1.agri);
System.out.println("Name of the Village after assigning the values:"+Population1.name);
}
}
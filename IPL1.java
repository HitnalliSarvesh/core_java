class IPL1{
static String league;
static byte teams;
static short seasons;
static int mi;
static long sixes;
static float avg;
static double runs;
static boolean entertain;
static char best;
public static void main(String a[]){
System.out.println("Type of league before assigning the values:"+IPL1.league);
System.out.println("Number of teams before assigning the values:"+IPL1.teams);
System.out.println("Number of seasons before assigning the values:"+IPL1.seasons);
System.out.println("Number of trophies won by MI before assigning the values:"+IPL1.mi);
System.out.println("Total no. of sixes before assigning the values:"+IPL1.sixes);
System.out.println("Avg runs per match before assigning values:"+IPL1.avg);
System.out.println("Total runs in the IPL before assigning the values:"+IPL1.runs);
System.out.println("Most followed T20 league:"+IPL1.entertain);
System.out.println("Best Player in IPL:"+IPL1.best);

IPL1.league="T20";
IPL1.teams=10;
IPL1.seasons=15;
IPL1.mi=5;
IPL1.sixes=10643;
IPL1.avg=180.36f;
IPL1.runs=295811;
IPL1.entertain=true;
IPL1.best='K';
System.out.println("Type of league after assigning the values:"+IPL1.league);
System.out.println("Number of teams after assigning the values:"+IPL1.teams);
System.out.println("Number of seasons after assigning the values:"+IPL1.seasons);
System.out.println("Number of trophies won by MI after assigning the values:"+IPL1.mi);
System.out.println("Total no. of sixes after assigning the values:"+IPL1.sixes);
System.out.println("Avg runs per match after assigning values:"+IPL1.avg);
System.out.println("Total runs in the IPL after assigning the values:"+IPL1.runs);
System.out.println("Most followed T20 league:"+IPL1.entertain);
System.out.println("Best Player in IPL:"+IPL1.best);

}
}
class Water{
public static void drink(){
	bath();
	System.out.println("Print drink");
}
public static void wash(){
	drink();
	System.out.println("Print wash");
}
public static void bath(){
	System.out.println("Print bath");
}
public static void main(String args[]){
	Water.drink();
	Water.wash();
}
}                                    
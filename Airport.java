class Airport{
public static void arrival(){
	checkin();
	System.out.println("Print arrival");
}
public static void departure(){
	arrival();
	System.out.println("Print departure");
}
public static void checkin(){
	System.out.println("Print checkin");
}
public static void main(String args[]){
	Airport.arrival();
	Airport.departure();
}
}
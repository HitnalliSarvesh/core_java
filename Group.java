class Group{

public static void fest(){
	play();
	System.out.println("This is fest method");
}
public static void event(){
	System.out.println("This is event method");
}
public static void play(){
	event();
	System.out.println("This is play method");
}
public static void main(String args[]){
	Group.fest();
	Group.play();
}
}
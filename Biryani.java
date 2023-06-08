class Biryani{
public static void shops(){
	review();
	System.out.println("This is a shop");
}
public static void items(){
	shops();
	System.out.println("Print items");
}
public static void review(){
	System.out.println("Print Review");
}
public static void main(String args[]){
	Biryani.shops();
	Biryani.items();
}
}
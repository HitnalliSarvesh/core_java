class Insta{
public static void chat(){
	upload();
	System.out.println("Print chat");
}
public static void call(){
	chat();
	System.out.println("Print call");
}
public static void upload(){
	System.out.println("Print upload");
}
public static void main(String args[]){
	Insta.call();
	Insta.upload();
}
}
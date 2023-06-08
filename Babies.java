class Babies{
public static void play(){
	eat();
	System.out.println("The baby is playing");
}
public static void cry(){
	play();
	System.out.println("The baby is crying");
}
public static void eat(){
	System.out.println("The baby is eating");
}
public static void main(String args[]){
	Babies.cry();
	Babies.play();
}
}
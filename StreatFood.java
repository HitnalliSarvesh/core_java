class StreatFood{
public static void streatName(String name[])
{
	for(int i=0;i<name.length;i++)
	{
		System.out.println("Streat names are:"+name[i]);
	}
}
public static void foodName(String food, int price)
    {
	  System.out.println("Food name is:"+" "+food+" "+"Price is:"+" "+price);
	}
public static void foodName(String food, int price, String type, boolean available)
    {
	  System.out.println("Food name is:"+" "+food+" "+"Price is:"+" "+price+" "+"Type of food is:"+type+" "+"Available:"+available);
    }
public static void streat(String streatName, String foodName, String area)
    {
	  System.out.println("Streat name is:"+streatName+" "+"Food name is:"+foodName+" "+"Area:"+area);
    }
}

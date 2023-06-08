class Instagram{
	public static void logIn()
	{
		System.out.println("Login name");
	}
    public static void logIn(String name)
	{
		System.out.println(name+" "+"logIn");
	}
	public static void logIn(String name, int noOfPosts)
	{
		System.out.println(name+" "+"logIn"+" "+"Number of Posts:"+" "+noOfPosts);
	}
	public static void logIn(String name,int noOfFollowers,boolean accountStatusActive)
	{
		System.out.println("Number of followers:"+" "+noOfFollowers+" "+"Account is Active:"+" "+accountStatusActive);
	}
	public static void logOut()
	{
		System.out.println("LogOut");
	}
	public static void logOut(String name)
	{
		System.out.println(name+" "+"logOut");
	}
	
}
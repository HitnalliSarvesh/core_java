class Laptops{
public static void main(String args[]){
System.out.println("Size of the array is:"+args.length);
for(int i=0;i<args.length;i++)
    {
     System.out.println("Name of laptops:"+args[i]);
    }
for(int i=args.length-1;i>=0;i--)
{
 System.out.println("Name of laptops:"+args[i]);	
}

}

}
class FreedomFightersRunner{
public static void main(String args[]){
	System.out.println("Number of Fighters are:"+FreedomFighters.names.length);
for(int i=0;i<FreedomFighters.names.length;i++)
{
   
	if(FreedomFighters.names[i]=="Bose"){
	System.out.println("Names of Freedom Fighters:"+FreedomFighters.names[i]);
	break;
	}else{
		System.out.println("Fighter is not found");
	}
}
for(int i=0;i<FreedomFighters.num.length;i++)
{
	if(FreedomFighters.num[i]==4){
		System.out.println("Numbers of Freedom Fighters:"+FreedomFighters.num[i]);
	break;
	}else{
		System.out.println("Number is not found");
	}
}
	
}
}
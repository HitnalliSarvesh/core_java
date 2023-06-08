class SuperMarketRunner{
public static void main(String args[]){
   String item[]={"Snacks","Groceries","Cosmetics","Stationery"};
for(int i=0;i<item.length;i++){
		System.out.println("Item name is:"+item[i]);
}

String items[]={"Snacks","Groceries","Cosmetics","Stationery"};
int price[]={300, 400, 500, 600};
for(int i=0; i<items.length;i++){
	System.out.println("Item name is:"+items[i]+" & "+"Item price is:"+price[i]);
}
String itemName[]={"Snacks","Groceries","Cosmetics","Stationery"};
int prices[]={300, 400, 500, 600};
boolean available[]={true,true,true,true};
for(int i=0;i<itemName.length;i++){
	System.out.println("Item name is:"+itemName[i]+" & "+"Item Price is:"+prices[i]+" & "+"Item available or not:"+available[i]);
}
String nameOfItem[]={"Snacks","Groceries","Cosmetics","Stationery"};
String company[]={"Nestle","MTR","Loreal","Doms"};
for(int i=0;i<nameOfItem.length;i++){
	System.out.println("Item name is:"+nameOfItem[i]+" & "+"Company name is:"+company[i]);
}
}
}
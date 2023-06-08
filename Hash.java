class Hash{
public static void main(String args[]){
	int i,j,k;
	for(i=3;i>=1;i--){
		for(j=i;j<3;j++){
			System.out.print(" ");
		}
	for(k=1;k<=(2*i-1);k++){
		if(k==1||i==3||k==(2*i-1)){
			System.out.print("# ");
		}else{
			System.out.print("");
		}
	}
	}
	System.out.println("\n");
}
}
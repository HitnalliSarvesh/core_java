class CalculatorRunner{
public static void main(String args[]){
	int sumOfTwoNumbers=Calculator.add(45,35);
	System.out.println("Sum is:"+sumOfTwoNumbers);
	int sumOfThreeNumbers=Calculator.add(20,30,50);
	System.out.println("Sum is:"+sumOfThreeNumbers);
	int sumOfFourNumbers=Calculator.add(15,25,45,55);
	System.out.println("Sum is:"+sumOfFourNumbers);
	int diffOfTwoNumbers=Calculator.subtract(50,30);
	System.out.println("Difference is:"+diffOfTwoNumbers);
	int diffOfThreeNumbers=Calculator.subtract(80,30,20);
	System.out.println("Difference is:"+diffOfThreeNumbers);
	int diffOfFourNumbers=Calculator.subtract(150,70,30);
	System.out.println("Difference is:"+diffOfFourNumbers);
	int prodOfTwoNumbers=Calculator.multiplication(10,3);
	System.out.println("Product is:"+prodOfTwoNumbers);
	int prodOfThreeNumbers=Calculator.multiplication(5,4,2);
	System.out.println("Product is:"+prodOfThreeNumbers);
	int prodOfFourNumbers=Calculator.multiplication(4,3,2,5);
	System.out.println("Product is:"+prodOfFourNumbers);
	int quotOfTwoNumbers=Calculator.division(45,3);
	System.out.println("Quotient is:"+quotOfTwoNumbers);
	int quotOfThreeNumbers=Calculator.division(120,6,2);
	System.out.println("Quotient is:"+quotOfThreeNumbers);
	int quotOfFourNumbers=Calculator.division(750, 2, 5, 3);
	System.out.println("Quotient is:"+quotOfFourNumbers);
	
}
}
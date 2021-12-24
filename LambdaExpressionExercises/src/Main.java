import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		//Tech tech= (name)-> (System.out.println("Hello"+name))
		//-> :lambda operatörü
		//(parametreler) -> {komutlar}
		
		MathOperation addition=(int number1,int number2)->number1+number2;
		MathOperation subtraction=(number1,number2)->number1-number2;
		MathOperation multiplication=(number1,number2)->{return number1*number2;};
		MathOperation division=(number1,number2)->(number1/number2);
		
		// number->{}
		
		int mod=findMod(10,3,(a,b)->(a%b));
		
		MathOperation addition2=new MathOperation() {//Without lambda expression
			
			@Override
			public int operation(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
		};
		
		
		
		Addition addition3=new Addition();
		
		
		System.out.println("Multiplication result: "+multiplication.operation(2, 4));
		System.out.println("Addition 1 result: "+addition.operation(12, 24));
		System.out.println("Addition 2 result: "+addition2.operation(7, 9));
		System.out.println("Addition 3 result: "+addition3.operation(16, 3));
		System.out.println("Mod result: "+mod);
		
		GreetingService greeting1=message->{
			System.out.println(message+" :)");
			};
	
		GreetingService greeting2=(message)->{
			System.out.println(message+"...");
		};
		
		greeting1.sayMessage("Hello");
		greeting2.sayMessage("Bye");
		
		
		//***************************************************************
		Product product1=new Product(1,"computer",9000);
		Product product2=new Product(1,"phone",8000);
		Product product3=new Product(1,"television",7000);
		
		List<Product> products=Arrays.asList(product1,product2,product3);
		
		for(Product product:products) {
			if(product.getPrice()>7500) {
				System.out.println(product.getName());
			}
		}
		
		//With Lambda expression
		products.stream().filter(p->p.getPrice()<8000).forEach(p->System.out.println(p.getName()));
		
		//***************************** Runnable *****************
		
		Runnable r1=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hello world");
				
			}
		};
		
			Runnable r2=()->System.out.println("Merhaba Dünya");
			
			r1.run();
			r2.run();
			
			//************ PREDİCATE ***************
			Predicate<Integer> isEvenNumber=(number)->number%2==0;
			Predicate<Integer> isOddNumber=number->number%2==1;
			System.out.println(isEvenNumber.test(20));
			System.out.println(isOddNumber.test(20));
			
			System.out.println(isEvenNumber.negate().test(20)); //gives reverse of result
			
			
	}
	private static int findMod(int number1,int number2, MathOperation mathOperation) {
		return mathOperation.operation(number1,number2);
	}

}

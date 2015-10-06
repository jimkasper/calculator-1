public class Calculator {
	public static void main(String[] args) {
		String command = args[0];
		switch(command) {
			case "--add"  : add(args);
							break;
			case "--sub"  : sub(args);
							break;
			case "--mult" : mult(args);
							break;
			case "--div"  : div(args);
							break;
			case "--pow"  : pow(args);
							break;						
							
			default		  : System.out.println("I don't know what you want to do");
		}
	}
//--- ADDITION ---//
	static void add(String[] args) {
		double sum = 0;
		for(int i = 1; i < args.length; i++) {
			double addend = Double.valueOf(args[i]);
			System.out.print(addend);
			if(i < args.length - 1) {
				System.out.print(" + ");
			}
			sum += addend;
		}
		System.out.println(" = " + sum);
	}
//--- SUBTRACTION ---//
	static void sub(String[] args) {	
		double minuend = Double.valueOf(args[1]);
		double subtrahend = Double.valueOf(args[2]);
		double difference = minuend - subtrahend;
		System.out.println(minuend+" - "+subtrahend+" = "+difference);	
	}
//--- MULTIPLICATION ---//
	static void mult(String[] args) {
		double product = 1;
		for(int i = 1; i < args.length; i++) {
			double multiplicand = Double.valueOf(args[i]);
			System.out.print(multiplicand);
			if(i < args.length - 1) {
				System.out.print(" x ");
			}
		product *= multiplicand;
		}
	System.out.println(" = " + product);
	}
//--- Division ---//
	static void div(String[] args) {	
		double dividend = Double.valueOf(args[1]);
		double divisior = Double.valueOf(args[2]);
		double quotient = dividend / divisior;
		System.out.println(dividend+" / "+divisior+" = "+quotient);	
	}
//--- Exponentiation ---//
	static void pow(String[] args) {	
	
	
		double base = Double.valueOf(args[1]);
		double power = 1;
		double exp = Double.valueOf(args[2]);
		if((exp%1 != 0) ||(base%1 != 0)){
			System.out.println("Error: Fractional exponents are not allowed");
		}		
		if(base%1 == 0 && exp%1 == 0){
			for(double exponent = Double.valueOf(args[2]); exponent >0; exponent--){
				power = power * base;		
			}
			System.out.println(base+" raised to the power of "+exp+" = "+power);	
		}
	}
}
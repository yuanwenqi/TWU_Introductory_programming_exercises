import java.util.*;
class FizzBuzz_Exercise {
	public static void FizzBuzz(int n){
		if (n%3==0 && n%5==0){
			System.out.println("FizzBuzz");
		}else if (n%3==0){
			System.out.println("Fizz");
		}else if (n%5==0){
			System.out.println("Buzz");
		}else{
			System.out.println(n);	
		}
	}
	public static void main(String[] args) {
//		Scanner keyboard = new Scanner(System.in);
//		int n = keyboard.nextInt();
	    int n = 100;
		for (int i = 1; i <= n; i++) {
			FizzBuzz(i);
		}
	}
}
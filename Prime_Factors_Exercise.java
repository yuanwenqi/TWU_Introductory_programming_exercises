import java.util.*;
class Prime_Factors_Exercise {
	public static ArrayList<Integer> generate(int n){
		ArrayList<Integer> rs = new ArrayList<>();
		ArrayList<Boolean> primes= new ArrayList<>();
		for (int i = 0; i < n+1; i++) {
			primes.add(true);
		}
		primes.set(0, false);
		primes.set(1, false);
		for (int i = 2; i < n+1; i++) {
			if (primes.get(i)){
				for (int j = i*2; j < n+1; j += i ) {
					primes.set(j, false);
				}
			}
		}
//		for (Boolean e:primes) {
//			System.out.println(e);
//		}
		for (int i = 2; i < primes.size(); i++) {
			if (primes.get(i) & n%i==0){
				rs.add(i);
			}
		}
		
		return rs;
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		ArrayList<Integer> rs = generate(n);
		for (Integer e:rs) {
			System.out.println(e);
		}
	}
}
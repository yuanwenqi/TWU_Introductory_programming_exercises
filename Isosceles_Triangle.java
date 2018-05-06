import java.util.*;
class Isosceles_Triangle {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		for (int i = 0; i < n; i++) {
			String s = "";
			for (int j = 0; j < n-i-1; j++) {
				s += " ";
			}
			for (int j = 0;j <i*2+1;j++){
				s += "*";
			}
			System.out.println(s);
		}
	}
}
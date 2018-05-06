import java.util.*;
class Diamond_with_Name {
	public static void main(String[] args) {
			Scanner keyboard = new Scanner(System.in);
			int n = keyboard.nextInt();
			for (int i = 0; i < n-1; i++) {
				String s = "";
				for (int j = 0; j < n-i-1; j++) {
					s += " ";
				}
				for (int j = 0;j <i*2+1;j++){
					s += "*";
				}
			System.out.println(s);
		}
		System.out.println("Bill");
		for (int i = 0; i < n-1; i++) {
			String s ="";
			for (int j = 0; j < i+1; j++) {
				s += " ";
			}
			for (int j = (n-i-2)*2+1;j>0;j--){
				s += "*";
			}
			System.out.println(s);
		}
	}
}
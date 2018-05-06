import java.util.*;
class Draw_a_right_triangle {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		for (int i = 0; i < n; i++) {
			String s = "";
			for (int j = 0; j <= i; j++) {
				s += "*";
			}
			System.out.println(s);
		}
	}
}
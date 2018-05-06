import java.util.*;
class Draw_a_horizontal_line {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		String rs = "";
		for (int i = 0; i < n; i++) {
			rs += "*";
		}
		System.out.println(rs);
	}
}
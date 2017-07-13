import java.util.*;

public class c239 {

	private static void playThreeGame (int n){
		int[] op = {0, -1, 1};
		while (n!= 1){
			System.out.println(n + " " + op[n%3]);
			n = (n + op[n%3])/3;
		}
		System.out.print(n);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		playThreeGame(sc.nextInt());
		sc.close();
	}

}

import java.util.*;

public class c315 {

	private static int xorMultiplyer (int a, int b){
		int div, op;
		//Selecting the smaller one to be the one iterating over
		if(a<b){
			div = a;
			op = b;
		}
		else{
			div = b;
			op = a;
		}
		int res = 0;
		
		//Iterating over the bits of div, and applying the xor
		while(div > 0){
			res ^= op * (div%2);
			div /= 2;
			op *= 2;
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = xorMultiplyer(a,b);
			System.out.println(a + "@" + b + "=" + c);	
		}
		sc.close();
	}

}

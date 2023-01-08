package loop;

import java.util.Scanner;

public class B25304 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int X = input.nextInt(); //영수증에 적힌 총 금액
		int N = input.nextInt(); //종류의 수
		int sum = 0;
		
		for(int i = 0; i<N; i++) {
			int a = input.nextInt(); //각 물건의 가격
			int b = input.nextInt(); //각 물건의 개수
			
			sum += a*b; 
		}
		
		if(sum == X) 
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}

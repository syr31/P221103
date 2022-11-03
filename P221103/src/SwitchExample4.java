import java.util.Scanner;

public class SwitchExample4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		sc.close();
		//
		// 90~99 / 10 = 9
		// 80~89 / 10 = 8
		//
		switch(score / 10) {
		case 10 :
		case 9 :
			System.out.println("A");
		case 8 :
			System.out.println("B");
		case 7 :
			System.out.println("C");
		}

	}

}

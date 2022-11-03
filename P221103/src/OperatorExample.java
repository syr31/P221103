
public class OperatorExample {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0)
				continue;       // 짝수 일때만 출력되는 코드 if , for 참고

			System.out.println(i);
		}

	}

}

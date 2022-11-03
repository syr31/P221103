
public class BreakExample {

	public static void main(String[] args) {
		int i = 1;

		while (true) {
			System.out.println(i);

			if (i == 6)
				break; // if문에 맞아떨어지면 break로 빠져나감

			i = i + 1;
		}

	}

}

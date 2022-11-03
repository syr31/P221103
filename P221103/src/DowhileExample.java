
public class DowhileExample {

	public static void main(String[] args) {
		int i = 1;

		do {
			System.out.println(i++);
		} while (i <= 5);      // ex) (i <= 0) 일 경우 int i 값이 do 로 들어가서 while과 맞지않아서 빠져나옴 
	}
}


public class MathRandom {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 99) + 1;

		double f = (Math.random());  // Math.random 은 double 타입이라 타입캐스팅을 안해줘도 된다.

		System.out.println(num);
		System.out.printf("%.2f", f);

	}

}

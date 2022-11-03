
public class SwitchExample {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 6) + 1;  //math.random = 0.0 - 1.0 난수값으로 표현 

		switch (num) {                              // 랜덤으로 발생된 1-6case 중 안에 있는 시스템이 실행된다.
		case 1:										// break 문이 없다면 ex) case 1번이 출력된 경우 break 없이 2,3,4,5,6 전부 실행 후 종료
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		case 6:
			System.out.println("6번이 나왔습니다.");
			break;
		}

	}

}

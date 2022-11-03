
public class SwitchExample2 {

	public static void main(String[] args) {
		int time = (int) (Math.random() * 4) + 8;
		System.out.println("현재시간 : " + time);

		switch (time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("업무를 합니다.");
		default:										// 지정되지 않은 숫자 ex)11 이면 default 등 지정되지 않은 곳으로 점프하여 실행한다.
			System.out.println("외근을 나갑니다.");
		}

	}

}

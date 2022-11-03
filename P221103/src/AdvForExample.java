
public class AdvForExample {

	public static void main(String[] args) {
		int[] scores = {9, 7, 8, 9, 8};                   //int 배열 - 20byte
		
		int sum = 0;
//		for(int s : scores) {
//			sum += s;									// 9 , 7, 8 ,9 8 순서대로 sum에 들어가 서로 더한다.
			
		
		for (int s=0;s<5;s++) {								// int s 를 0으로 초기화 , s<5 는 위 97898 갯수 입력 , s++
			sum += scores[s];
			
			System.out.println("sum : " + sum);              // ** 배열 매우 중요
		}
	}

}

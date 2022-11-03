
public class ForSumExample {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1;i<=10;i++) {	// 
			sum += i;				//sum += i; = sum=sum+i for(int i=1;i<=10;i++);에서 더해진 숫자가  
		}							// ↑ 으로 계속 초기화되서 그 전 값이랑 더해진다.

		System.out.println("sum + " + sum);
	}

}

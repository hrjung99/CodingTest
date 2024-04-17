package programers.basic.day04;

// 공배수
//정수 number와 n, m이 주어집니다. number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.
public class CommonMultiple {
	
    public static int solution(int number, int n, int m) {
        int answer = 0;
        
            if (number%n==0 && number%m==0){ //num
        answer = 1;
    } else {
        answer = 0;
    }
        
        return answer;
    }   

	public static void main(String[] args) {
		int answer = solution(60, 2, 3);
		System.out.println("공배수 일 경우 : " + answer);
		
		answer = solution(55, 10, 5);
		System.out.println("공배수가 아닐 경우 : " + answer);
	}

}

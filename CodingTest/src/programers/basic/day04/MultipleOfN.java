 package programers.basic.day04;

//n의 배수 
 //정수 num과 n이 매개 변수로 주어질 때, num이 n의 배수이면 1을 return n의 배수가 아니라면 0을 return하도록 solution 함수를 완성해주세요.
public class MultipleOfN {
    public static int solution(int num, int n) {
        //n이 num 의 배수 = num/n 했을 때 나머지가 0
        int answer = 0;
        
        if(num%n == 0) { //num/n 했을 때 나머지가 0일 경우 
            answer = 1; //answer 에 1을 넣는다.
        } else { // 아니면 = 나머지가 0이 아니다 = 배수가 아니다
            answer = 0; // answer에 0을 넣는다
        }
        
        return answer;
    }
    
	public static void main(String[] args) {
		int answer = solution(10, 2);
		System.out.println(answer);
	}

}

package programers.basic.day04;

//홀짝에 따라 다른 값 반환하기
//양의 정수 n이 매개변수로 주어질 때, n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고 n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.
public class Sniffling {
	
	    public static int solution(int n) {
	        int answer = 0;

	        //2. 짝수일 경우
	        if(n%2 == 0){
	            //n이하의 모든 짝수를 더할 것
	            for(int i=1; i<= n; i++){ //n이하의 정수 i가
	                if (i%2 == 0){ //짝수일 경우 
	                	System.out.println(answer + " + " + i + " = ");
	                    answer = answer + (int)Math.pow(i, 2); //더한다
	                    System.out.print(answer);
	                }
	            }
	        }
	        
	        //3. 홀수일 경우
	        else {
	            for(int i=1; i<= n; i++){ //n이하의 정수 i가
                	System.out.println(answer + " + " + i + " = " + (answer+i));
	                if (i%2 != 0){ //홀 수 일 경우
	                    answer = answer + i; //더한다
	                }
	            }    
	        }
	        
	        
	        return answer;
	    }


	public static void main(String[] args) {
		int answer = solution(9);
		System.out.println(answer);

	}

}

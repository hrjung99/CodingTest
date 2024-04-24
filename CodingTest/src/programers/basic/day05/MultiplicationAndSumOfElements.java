package programers.basic.day05;

//원소들의 곱과 합
//정수가 담긴 리스트 num_list가 주어질 때, 
//모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.
public class MultiplicationAndSumOfElements {

	public static int solution(int[] num_list) {
        int answer = 0;
        int multi = 1;
        int sum =0;
        
        for (int i=0; i<num_list.length; i++) {
        	multi = multi*num_list[i];
        	sum = sum + num_list[i];       	        	
        }

        
        System.out.println("원소들의 곱 = " + multi);
        System.out.println("원소들의 합의 제곱 = " + (int)Math.pow(sum, 2));        
        if (multi < (int)Math.pow(sum, 2)) {
        	answer = 1;
        } else if (multi > (int)Math.pow(sum, 2)) {
        	answer = 0;
        } else {
        	System.out.println("error");
        }
        
        return answer;
    }

	public static void main(String[] args) {
		int [] num_list1 = {3, 4, 5, 2, 1}; //1
		int answer1 = solution(num_list1);
		System.out.println(answer1);
		
		int [] num_list2 = {5, 7, 8, 3}; //0
		int answer2 = solution(num_list2);
		System.out.println(answer2);
	}

}

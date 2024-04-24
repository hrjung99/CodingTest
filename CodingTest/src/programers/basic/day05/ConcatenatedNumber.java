package programers.basic.day05;

//이어 붙인 수
//정수가 담긴 리스트 num_list가 주어집니다. 
//num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.
public class ConcatenatedNumber {
	
    public static int solution(int[] num_list) {
        int answer = 0;
        String even = "";
        String odd = "";
        
        for(int i=0; i<num_list.length; i++) {
        	if(num_list[i]%2 == 0) { //num_list[i] 가 짝수 일 경우
        		System.out.println("num_list[i] = "+num_list[i]);
        		even = even + (num_list[i]+""); //even더하고
        		System.out.println("even = " + even);
        	} else if(num_list[i]%2 == 1) { //num_list[i] 가 홀수 일 경우
        		System.out.println("num_list[i] = "+num_list[i]);
        		odd = odd + (num_list[i]+"");
        		System.out.println("odd = " + odd);

        	}
        }
        
        answer = Integer.parseInt(even)+Integer.parseInt(odd);
        
        return answer;
    }

	public static void main(String[] args) {
		int [] num_list1 = {3, 4, 5, 2, 1};
		int answer1 = solution(num_list1);
		System.out.println(answer1);
		
		int [] num_list2 = {5, 7, 8, 3};
		int answer2 = solution(num_list2);
		System.out.println(answer2);
	}

}

package programers.basic.day06;


//마지막 두 원소
//정수 리스트 num_list가 주어질 때, 
//마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을 
//마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.
public class LastTwoElements {
	
	public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];

        
        for(int i=0; i<num_list.length; i++) {
        	answer[i] = num_list[i];
        }
       
        if(num_list[num_list.length-1] > num_list[num_list.length-2]) {
        	answer[num_list.length] = num_list[num_list.length-1] - num_list[num_list.length-2];
        } else if (num_list[num_list.length-1] < num_list[num_list.length-2]) {
        	answer[num_list.length] = (num_list[num_list.length-1] * 2);
        }
        
        return answer;
    }
	

	public static void main(String[] args) {
		int [] num_list1 = {2, 1, 6};
		int [] answer1 = solution(num_list1);
		
		for (int i=0; i<answer1.length; i++) {
		System.out.print(answer1[i] + " ");
		}
		
		System.out.println();
		int [] num_list2 = {5, 2, 1, 7, 5};
		int [] answer2 = solution(num_list2);
		
		for (int i=0; i<answer2.length; i++) {
		System.out.print(answer2[i] + " ");
		}
	}

}

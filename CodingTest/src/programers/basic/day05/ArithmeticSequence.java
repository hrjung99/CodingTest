package programers.basic.day05;

//등차수열의 특정 항만 더하기
//두 정수 a, d와 길이가 n인 boolean 배열 included가 주어집니다. 
//첫째항이 a, 공차가 d인 등차수열에서 included[i]가 i + 1항을 의미할 때, 
//이 등차수열의 1항부터 n항까지 included가 true인 항들만 더한 값을 return 하는 solution 함수를 작성해 주세요.
public class ArithmeticSequence {

	public static int solution(int a, int d, boolean[] included) {
		int answer = 0;
		int n = included.length; //길이가 n인 included 배열

		for (int i = 0; i < n; i++) { 
			System.out.println(included[i]); //included[i]는
			System.out.println((i+1)+"항 =" +(a+(i*d))); //i+1항을 의미 -> a +((i+1)-1)d = a+i*d
			if (included[i]) {
				answer = answer+(a + (i*d));
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		int a = 3;
		int d = 4;
		boolean[] included = {true, false, false, true, true};
		int answer = solution(a, d, included);
		System.out.println(answer);
	}

}

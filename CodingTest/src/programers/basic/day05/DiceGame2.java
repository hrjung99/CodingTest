package programers.basic.day05;

//주사위 게임2
//1부터 6까지 숫자가 적힌 주사위가 세 개 있습니다. 세 주사위를 굴렸을 때 나온 숫자를 각각 a, b, c라고 했을 때 얻는 점수는 다음과 같습니다.
//
//세 숫자가 모두 다르다면 a + b + c 점을 얻습니다.
//세 숫자 중 어느 두 숫자는 같고 나머지 다른 숫자는 다르다면 (a + b + c) × (a2 + b2 + c2 )점을 얻습니다.
//세 숫자가 모두 같다면 (a + b + c) × (a2 + b2 + c2 ) × (a3 + b3 + c3 )점을 얻습니다.
//세 정수 a, b, c가 매개변수로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
//a2, b2, c2 는 제곱을 의미 / a3, b3, c3 는 세제곱을 의미
public class DiceGame2 {

    public static int solution(int a, int b, int c) {
        int answer = 0;
        
        if(a!=b && a!=c && b!=c ) { //세 숫자가 모두 다르면,
        	answer = a+b+c;
        	
        } else if((a==b && b!=c) || (a==c && b!=c) || (b==c && a!=b)) { //두 숫자만 같을 경우
        	answer = (a+b+c)*((int)Math.pow(a,2) + (int)Math.pow(b,2) + (int)Math.pow(c,2)); //Math.pow()는 항상 double을 return하기 때문에 형변환 필요
        	
        }else if(a==b && b==c) {//세 숫자가 모두 같으면,
        	answer = (a+b+c)*((int)Math.pow(a,2) + (int)Math.pow(b,2) + (int)Math.pow(c,2))*((int)Math.pow(a,3) + (int)Math.pow(b,3) + (int)Math.pow(c,3));
        }
        
        return answer;
    }
    

	public static void main(String[] args) {
		int answer = solution(2, 6, 1); //9
		System.out.println(answer);
		
		answer = solution(5, 3, 3); //473
		System.out.println(answer);

	}

}

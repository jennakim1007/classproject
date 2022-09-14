package chapter03;

public class Operator1 
{
	
	public static void main(String[] args) 
	{
		
		// 대입연산자 : = -> 오른쪽에서 왼쪽 방향으로 연산이 진행 
		// 순서는 가장 마지막
		
		int num1 = 10;
		num1 = 10 + 20;
		
		boolean check = num1-27 > 5; // 비교연산의 결과는 논리값 
		// 연산자의 우선수위 : 비교연산보다 산술연산이 앞선다. 
		
		// 단항연산자 : 오른쪽에서 왼쪽 방향으로 연산이 진행
		int num = 0;
		System.out.println(num);
		
		// 증감연산자 : ++ -- // 앞에 들어갈 떄와 뒤에 들어갈 떄의 처리 순서 차이가 있다.
		++num; // num = num + 1;          num = 0 + 1 ;          num = 1 ;
		System.out.println(num);
		
		num++; // num = num + 1;    ->     num = 1 + 1 ;    ->   num = 2;
		System.out.println(num);
		
		--num; // num = num - 1;    ->     num = 2 - 1 ;    ->   num = 1;
		System.out.println(num);
		
		num--; // num = num - 1;    ->     num = 1 - 1 ;    ->   num = 0;
		System.out.println(num);
		
		// 부호 연산자 
		// +, -
		int num2 = 1;
		num2 = +num2;    
		System.out.println("num2 : " + num2);
		
		num2 = -num2;
		System.out.println("num2 : " + num2);    // num2 * -1 연산과 같음 
		
		// 논리 부정 연산자 : ! => 논리값을 부정(반전)
		// ! 활용법 => 조건이 여러개인데 반대 조건을 잡으면 간단한 경우, 반대 조건을 잡고 논리 부정 연산을 넣으면 편리하다. 
		
		boolean btn = false;
		
		System.out.println("btn : " + btn);
		
		btn = !btn;       
				
		System.out.println("btn : " + btn);
		
		
		
		
		
	}
	
	
	
	
	
}

package chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionsTest {

	public static void main(String[] args) {

		List<Integer> lottoNumber = new ArrayList<>();

		// Random random = new Random(System.nanoTime()); // new Random(시드값);

		for (int i = 0; i < 6; i++) {
			// (random.nextInt(범위가 될 수 있는 값))
			lottoNumber.add(new Random(System.nanoTime()).nextInt(45) + 1);
		}

//		for(int n : lottoNumber) {
//			System.out.println(n);
//		}

		printAll(lottoNumber);

		System.out.println();
		System.out.println("최대값 : " + Collections.max(lottoNumber));
		System.out.println("최소값 : " + Collections.min(lottoNumber));

		// 오름차순 정렬
		Collections.sort(lottoNumber); // 순서가 바뀜
		System.out.println("====정렬====");
		printAll(lottoNumber);

		// 역순으로 정렬
		System.out.println("====역순정렬====");
		Collections.reverse(lottoNumber);
		printAll(lottoNumber);

		// 요소 위치 섞기
		System.out.println("====셔플====");
		Collections.shuffle(lottoNumber);
		printAll(lottoNumber);

		// 
		List<Integer> list1 = Collections.emptyList();
		System.out.println("리스트 요소의 개수 : " + list1.size());

	}

	static void printAll(List<Integer> list) {
		for (int n : list) {
			System.out.println(n);
		}
	}

}

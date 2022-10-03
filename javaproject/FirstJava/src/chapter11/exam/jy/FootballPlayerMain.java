package chapter11.exam.jy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import chapter11.exam.FootballPlayer;

public class FootballPlayerMain {

	public static void main(String[] args) {

		// 축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.
		List<FootballPlayer> players = new ArrayList<>();
		players.add(new FootballPlayer("손흥민", 7, "토트넘", 20));
		players.add(new FootballPlayer("이강인", 25, "토트넘", 19));
		
		System.out.println("===ArrayList===");
		for(FootballPlayer p : players) {
			System.out.println(p);
		}
		
		// 축구선수의 인스턴스가 팀과 이름 그리고 나이가 같으면 같은 선수라 판단하고 입력이 되지 않도록 
		// Set<E> 컬렉션을 이용해서 축구선수 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.
		Set<FootballPlayer> players2 = new HashSet<>();
		players2.add(new FootballPlayer("손흥민", 7, "토트넘", 20));
		players2.add(new FootballPlayer("이강인", 25, "토트넘", 19));
		players2.add(new FootballPlayer("이강인", 25, "토트넘", 19));

		System.out.println("===HashSet===");
		for(FootballPlayer p : players2) {
			System.out.println(p);
		}
		
		// TreeSet<E>을 이용해서 팀 이름순으로 정렬하고, 같은 팀의 선수들은 이름 순으로 정렬하고, 같은 이름의 선수는 번호 순으로 저장하는 프로그램을 만들어 봅시다.
		TreeSet<FootballPlayer> players3 = new TreeSet<>();
		players3.add(new FootballPlayer("손흥민", 7, "토트넘", 20));
		players3.add(new FootballPlayer("루니", 7, "토트넘", 28));
		players3.add(new FootballPlayer("이강인", 25, "토트넘", 19));
		players3.add(new FootballPlayer("이강인", 22, "토트넘", 22));

		System.out.println("===TreeSet===");
		for(FootballPlayer p : players3) {
			System.out.println(p);
		}
		
		// 축구선수의 번호를 key로 하고 축구선수 인스턴스를 저장하는 Map<K,V> 인스턴스를 이용해서 프로그램을 만들어봅시다.
		Map<Integer, FootballPlayer> players4 = new HashMap<>();
		players4.put(7, new FootballPlayer("손흥민", 7, "토트넘", 20));
		players4.put(7, new FootballPlayer("손흥민", 7, "토트넘", 25));
		
		System.out.println("===HashMap===");
		System.out.println(players4.get(7));
		
	}

}

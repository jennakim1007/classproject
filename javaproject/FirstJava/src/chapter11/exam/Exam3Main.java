package chapter11.exam;

import java.util.TreeSet;

public class Exam3Main {

	public static void main(String[] args) {
		// TreeSet<E>을 이용해서 팀 이름순으로 정렬하고,
		// 같은 팀의 선수들은 이름 순으로 정렬하고,
		// 같은 이름의 선수는 번호 순으로 저장하는 프로그램을 만들어 봅시다.

		TreeSet<FootballPlayer> players = new TreeSet<>();

		players.add(new FootballPlayer("손흥민", 7, "토트넘", 20));
		players.add(new FootballPlayer("손흥민", 17, "토트넘", 20));
		players.add(new FootballPlayer("박지성", 7, "멘유", 35));
		players.add(new FootballPlayer("박지성", 10, "멘유", 35));
		players.add(new FootballPlayer("루니", 10, "멘유", 35));
		players.add(new FootballPlayer("루니", 18, "멘유", 35));
		FootballPlayer player = new FootballPlayer("케인", 10, "토트넘", 25);
		players.add(player);

		System.out.println("보유 선수의 수 : " + players.size());

		System.out.println("나의 선수 리스트 =======");
		for (FootballPlayer p : players) {
			System.out.println(p);
		}

	}

}

package collections;

import collections.arraylist.*;

public class App {
	public static void main(String[] args) throws Exception {
		
		E01.solution();
		E02.solution(E01.getColors());
		E03.solution(E01.getColors(), "white");
		E04.solution(E01.getColors(), 1);
		E05.solution(E01.getColors(), 0, "black");
		E06.solution(E01.getColors());
		E07.solution(E01.getColors(), "blue");
		E08.solution(E01.getColors());
		E09.solution(E01.getColors());
		E10.solution(E09.getCopy());
		E11.solution(E09.getCopy());
		E12.solution(E09.getCopy());
		E13.solution(E01.getColors(),	E09.getCopy());
	}
}

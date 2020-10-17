package Vector;
import java.util.*;

class Nation{
	public String country;
	public String capital;
	
	public Nation(String A, String B) {
		this.country = A;
		this.capital = B;
	}
}

public class Game {
	public static void main(String[] args) {
		Vector<Nation> list = new Vector<Nation>();
		Scanner scanner = new Scanner(System.in);
		list.add(new Nation("한국", "서울"));
		list.add(new Nation("그리스", "아테네"));
		list.add(new Nation("독일", "베를린"));
		list.add(new Nation("네덜란드", "암스테르담"));
		list.add(new Nation("멕시코", "멕시코시티"));
		list.add(new Nation("중국", "베이징"));
		list.add(new Nation("영국", "런던"));
		list.add(new Nation("이집트", "카이로"));
		list.add(new Nation("일본", "도쿄"));
		System.out.println("**** 수도 맞추기 게임을 시작합니다.(V) ****");
		while(true) {
			System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
			int menu = scanner.nextInt();
			if(menu == 1) {
				System.out.println("현재 "+list.size()+"개 나라와 수도가 입력되어 있습니다.");
				while(true) {
					System.out.print("나라와 수도 입력"+(list.size()+1)+">> ");
					String cou = scanner.next();
					if(cou.equals("그만"))	break;
					String cap = scanner.next();
					for(int i=0;i<list.size();i++) {
						Nation c = list.get(i);
						if(c.country.equals(cou)) {
							System.out.println(cou+"는 이미 있습니다!");
							break;
						}
						if(i == (list.size()-1)){
							list.add(new Nation(cou, cap));
							break;
						}
					}
				}
			}
			else if(menu == 2) {
				String answer;
				double random;
				int index;
				Nation corr;
				scanner.nextLine();
				while(true) {
					random = Math.random();
					index = (int)(random*list.size());
					corr = list.get(index);
					System.out.print(corr.country+"의 수도는? ");
					answer = scanner.nextLine();
					if(answer.equals("그만"))
						break;
					if(corr.capital.equals(answer))
						System.out.println("정답!!");
					else
						System.out.println("아닙니다!!");
				}
			}
			else if(menu == 3) {
				System.out.print("게임을 종료합니다.");
				break;
			}
		}
		scanner.close();
	}

}

package HashMap;
import java.util.*;

public class Game {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, String> Nation = new HashMap<String, String>();
		Nation.put("한국", "서울");
		Nation.put("그리스", "아테네");
		Nation.put("독일", "베를린");
		Nation.put("네덜란드", "암스테르담");
		Nation.put("멕시코", "멕시코시티");
		Nation.put("중국", "베이징");
		Nation.put("영국", "런던");
		Nation.put("이집트", "카이로");
		Nation.put("일본", "도쿄");
		
		System.out.println("**** 수도 맞추기 게임을 시작합니다.(H) ****");
		while(true) {
			System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
			int menu = scanner.nextInt();
			
			if(menu == 1) {
				System.out.println("현재 "+Nation.size()+"개 나라와 수도가 입력되어 있습니다.");
				while(true) {
					System.out.print("나라와 수도 입력"+(Nation.size()+1)+">> ");
					String cou = scanner.next();
					if(cou.equals("그만"))	break;
					String cap = scanner.next();
					if(Nation.containsKey(cou)) {
						System.out.println(cou+"는 이미 있습니다.");
					}
					else Nation.put(cou, cap);
				}
			}
			
			else if(menu == 2) {
				String input;
				String answer;
				String cou;
				Set<String> keys = Nation.keySet();
				Iterator<String> it = keys.iterator();
				while(true) {
					if(it.hasNext()) {
						cou = it.next();
					}
					else {
						it = keys.iterator();
						cou = it.next();
					}
					System.out.print(cou+"의 수도는? ");
					input = scanner.next();
					if(input.equals("그만"))	break;
					answer = Nation.get(cou);
					if(answer == null || !answer.equals(input)) {
						System.out.println("아닙니다!!");
					}
					else	System.out.println("정답!!");
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

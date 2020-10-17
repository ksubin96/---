package HashMap;
import java.util.*;

public class Game {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, String> Nation = new HashMap<String, String>();
		Nation.put("�ѱ�", "����");
		Nation.put("�׸���", "���׳�");
		Nation.put("����", "������");
		Nation.put("�״�����", "�Ͻ��׸���");
		Nation.put("�߽���", "�߽��ڽ�Ƽ");
		Nation.put("�߱�", "����¡");
		Nation.put("����", "����");
		Nation.put("����Ʈ", "ī�̷�");
		Nation.put("�Ϻ�", "����");
		
		System.out.println("**** ���� ���߱� ������ �����մϴ�.(H) ****");
		while(true) {
			System.out.print("�Է�:1, ����:2, ����:3>> ");
			int menu = scanner.nextInt();
			
			if(menu == 1) {
				System.out.println("���� "+Nation.size()+"�� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
				while(true) {
					System.out.print("����� ���� �Է�"+(Nation.size()+1)+">> ");
					String cou = scanner.next();
					if(cou.equals("�׸�"))	break;
					String cap = scanner.next();
					if(Nation.containsKey(cou)) {
						System.out.println(cou+"�� �̹� �ֽ��ϴ�.");
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
					System.out.print(cou+"�� ������? ");
					input = scanner.next();
					if(input.equals("�׸�"))	break;
					answer = Nation.get(cou);
					if(answer == null || !answer.equals(input)) {
						System.out.println("�ƴմϴ�!!");
					}
					else	System.out.println("����!!");
				}
			}
			
			else if(menu == 3) {
				System.out.print("������ �����մϴ�.");
				break;
			}
		}
		scanner.close();
	}
}

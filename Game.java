package app;
import lib.Person;
import java.util.Random;
import java.util.Scanner;

public class Game extends Person {
	Random random = new Random();
	
	public void create_random() {
		this.random1 = random.nextInt(2)+1;
		this.random2 = random.nextInt(2)+1;
		this.random3 = random.nextInt(2)+1;
	}
	
	public boolean check_win() {
		if((this.random1 == this.random2)&&(this.random1 == this.random3)) {
			System.out.println(this.name+"님이 이겼습니다!");
			return true;
		}
		else {
			System.out.println("아쉽군요!");
			return false;
		}
	}
	
	public void printnum() {
		System.out.print(this.random1+" "+this.random2+" "+this.random3+" ");
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Person player1 = new Game();
		Person player2 = new Game();
		
		System.out.print("1번째 선수 이름>>");
		String name = scanner.nextLine();
		player1.name = name;
		
		System.out.print("2번째 선수 이름>>");
		name = scanner.nextLine();
		player2.name = name;
		
		while(true) {
			System.out.print("["+player1.name+"]:<Enter>");
			scanner.nextLine();
			player1.create_random();
			player1.printnum();
			if(player1.check_win())
				break;
			
			System.out.print("["+player2.name+"]:<Enter>");
			scanner.nextLine();
			player2.create_random();
			player2.printnum();
			if(player2.check_win())
				break;
		}
		scanner.close();
	}
}

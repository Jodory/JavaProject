package Calculator;

import java.util.Scanner;

public class UI {
	DataLoad data = new DataLoad(); // DataLoad클래스에서 처리한 데이터를 UI클래스에서 사용가능하게 객체생성할까? 아니면 DataLoad클래스를 static으로 사용하여
									// 객체생성하지 말고 끌어올까?

	Scanner scan = new Scanner(System.in);

	void startProgram() { // <프로그램 시작> 메소드
		System.out.println(" GraduationRequirementsCalculator Program is ready.");
	}

	int showingMenu() { // <메뉴> 메소드
		while (true) {
			try {
				System.out.println(" ===========================================");
				System.out.println(" [1] Find out about graduation requirements"); // 졸업요건 알아보기
				System.out.println(" [2] Calculate graduation requirements"); // 졸업요건 계산해보기
				System.out.println(" [0] Calculate graduation requirements"); // 종료하기
				System.out.println(" ===========================================");
				System.out.print(" Please enter the menu to select by Number: ");
				int input = scan.nextInt();
				System.out.println();
				if (input >= 0 && input <= 2) // 입력받은 input이 0~2이면 종료
					return input;
				throw new Exception(); // 입력받은 input이 int이지만 0~2가 아닐 시 오류를 일부로 발생시켜 catch문으로 넘어가게 설졍
			} catch (Exception e) {
				errorMessage();
				System.out.println(" Please enter NUMBER(0 ~ 2) to select menu.");
				scan.nextLine();
			}
		}
	}

	void runningMenu(int menu) {
		switch (menu) {
		case 1:
			Calc.graduation_requirements_information(); // 졸업요건 알아보는 메뉴
			break;
		case 2:
			Calc.graduation_requirements_calc(); // 졸업요건 계산하는 메뉴
			break;
		}

	}

	void errorMessage() { // <에러메세지출력> 메소드
		System.out.println(" Input error.");
	}

	void printResult(String result) { // <결과출력> 메소드
		System.out.println(" Result : " + result);
	}

	void closeProgram() {
		System.out.println(" GraduationRequirementsCalculator Program will be closed.");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int menu_num;
		String answer = "n";
		UI ui = new UI();

		while (true) {
			ui.startProgram();
			menu_num = ui.showingMenu();
			if (menu_num == 0) {
				while (true) {
					System.out.print(" Are you sure you want to quit the program? (y/n): ");
					answer = scan.next();
					if (answer.equals("y") || answer.equals("Y")) {
						ui.closeProgram();
						break;
					} else if (answer.equals("n") || answer.equals("N")) {
						break;
					} else {
						System.out.println(" Please press Y or N.");
					}
				}
				if (answer.equals("y") || answer.equals("Y")) {
					break;
				}
			} else {
				ui.runningMenu(menu_num);
			}

		}
	}
}

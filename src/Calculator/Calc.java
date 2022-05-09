package Calculator;

/*
 1. 18학번은 공학인증이 필수이다.
2. 18학번은 공학인증이 필수이기 때문에, '학교졸업사정'과 '공학인증졸업사정'을 동시에 만족해야 한다. (학교졸업사정시트와 공학인증졸업사정시트 둘다 만족해야 함)
3. MSC는 학교에서 요구하는 조건이며 24학점을, BSM은 컴퓨터공학부(공학인증에 필요함)에서 요구하는 조건이며 18학점을 채워야 한다. 아래 과목 참고.
4. 설계과목은 4학년 1학기 이전까지 9학점을 이수해야 하며 4학년 1학기까지 캡스톤을 포함하여 12학점을 채워야 한다.
   부득이하게 4학년 1학기 까지 9점을 이수하지 못해도 캡스톤을 들을수는 있지만 4학년 1학까지 12학점은 무조건 채워야 한다.
5. 진성애중 두개만 수강하면 된다.
6. 이산수학은 전공과목으로 개설되어 학교졸업사정에 따르면 전공이고, 공학인증졸업사정에 따르면 전공이 아니고 BSM으로 계산됨.
 */
public class Calc {
	static void graduation_requirements_information() { // 졸업요건 정보
		System.out.println();
		System.out.println(" 0. 18학번을 위한 졸업요건계산기이다.");
		System.out.println(" 1. 18학번은 공학인증이 필수이다.\r\n"
				+ " 2. 18학번은 공학인증이 필수이기 때문에, '학교졸업사정'과 '공학인증졸업사정'을 동시에 만족해야 한다. (학교졸업사정시트와 공학인증졸업사정시트 둘다 만족해야 함)\r\n"
				+ " 3. MSC는 학교에서 요구하는 조건이며 24학점을, BSM은 컴퓨터공학부(공학인증에 필요함)에서 요구하는 조건이며 18학점을 채워야 한다. 아래 과목 참고.\r\n"
				+ " 4. 설계과목은 4학년 1학기 이전까지 9학점을 이수해야 하며 4학년 1학기까지 캡스톤을 포함하여 12학점을 채워야 한다.\r\n"
				+ "    부득이하게 4학년 1학기 까지 9점을 이수하지 못해도 캡스톤을 들을수는 있지만 4학년 1학까지 12학점은 무조건 채워야 한다.\r\n"
				+ " 5. 진성애중 두개만 수강하면 된다.\r\n"
				+ " 6. 이산수학은 전공과목으로 개설되어 학교졸업사정에 따르면 전공이고, 공학인증졸업사정에 따르면 전공이 아니고 BSM으로 계산됨.");
		System.out.println();
	}

	static void graduation_requirements_calc() { // 졸업요건계산기
		System.out.println("졸업요건 계산기이지만 아직 어느 순서로 계산할지 미지수라 비워 둠");
	}

	boolean EC_condition = false; // Engineering Certificationr(공학인증)
	boolean GR_condition = false; // Graduation Requirement(졸업요건)
	int msc_cnt = 0; // msc수강한 학점
	boolean msc_condition = false; // msc 조건 충족 상태
	int bsm_cnt = 0; // bsm수강한 학점
	boolean bsm_condition = false; // bsm 조건 충족 상태
	int major_cnt = 0; // 전공 수강한 학점
	boolean major_condition = false;// 전공 조건 충족 상태
	int culture_cnt = 0; // 교양 수강한 학점
	boolean culture_condition = false; // 교양 조건 충족 상태
	// 진성애 2개 이상인지 확인하는 메소드 필요
	int design_cnt = 0;// 설계학점
	boolean design_condition = false; // 설계학점 충족상태

	int total_credit = major_cnt + culture_cnt; // 학점(전공+교양)

	void setEC_condition(String data) {
	}

	void setGR_condition(String data) {
	}

	void setMSC_condition(String data) {
	}

	void setBSM_condition(String data) {
	}

	void setMAJOR_condition(String data) {
	}

	void setCULTURE_condition(String data) {
	}
}

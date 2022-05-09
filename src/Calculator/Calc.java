package Calculator;

abstract class Calc_0 {
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
//	학점(전공, 교양)
//	설계학점
//	진성애

	abstract void setEC_condition(String data);

	abstract void setGR_condition(String data);

	abstract void setMSC_condition(String data);

	abstract void setBSM_condition(String data);

	abstract void setMAJOR_condition(String data);

	abstract void setCULTURE_condition(String data);
	
	

}

public class Calc {
	public static void main(String[] args) {

	}

}

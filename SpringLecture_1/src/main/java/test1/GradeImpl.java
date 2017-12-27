package test1;

public class GradeImpl implements Grade {
	GradeVO vo;

	public GradeImpl(GradeVO vo) {
		this.vo = vo;
	}

	@Override
	public int getTot() {
		return vo.getEng() + vo.getKor() + vo.getMath();
	}

	@Override
	public double getAvg() {
		return (double) getTot() / 3;
	}

	@Override
	public String toString() {
		return "이름\t국어\t영어\t수학\t총점\t평균\n"
			 + vo.getName()+"\t"+vo.getKor()+"\t"+vo.getEng()+"\t"+vo.getMath()+"\t"+getTot()+"\t"+getAvg();
	}
}


public class Grading {
	private int passMark;
	public Grading(int passMark) {
		this.passMark = passMark;
	}
	public int getPassMark() {
		return passMark ;
	}
	public void setPassMark(int passMark) {
		this.passMark = passMark;
	}
	public String toLetterGrade(int score) {
		if(score>80&&score<100) {
			return"A";
		}
		if(score>70&&score<80) {
			return"B";
		}
		if(score>60&&score<70) {
			return"C";
		}
		if(score>50&&score<60) {
			return"D";
		}
		if(score>0&&score<50) {
			return"E";
		}
		else {
			return"X";
		}
	}
	public double calculateAvg(int[] grades) {
		int total=0;
		for(int i=0;i<grades.length;i++) {
			total=total+grades[i];
		}
		int Avg=total/grades.length;
		return Avg;
	}
	public String summarizeGrade(int [] grades) {
		String summarizeGrade = "";
		int pass = 0;
		int failed = 0;
		for(int grade:grades) {
			if(grade>passMark) {
				pass++;
			}
			else if(grade<passMark) {
				failed++;
			}
		}
		summarizeGrade = summarizeGrade+String.format("Avg. Score: %.0f",calculateAvg(grades));
		summarizeGrade = summarizeGrade+String.format("\nPass: "+pass+",failed: "+failed);
		return summarizeGrade;
	}
}
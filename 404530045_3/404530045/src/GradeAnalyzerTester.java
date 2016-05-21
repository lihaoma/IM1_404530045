
/**
 * GradeAnalyzer
 * @author �ť���
 */
import javax.swing.*;

/*
 * [A]96�z
 * [TA's Advise]
 * 1. ����ı�o�A���z�L�r���Ҧ��F��s�_�ӦA�h��R, �o�i��|�e�����Ͱ��D, �n�񻡧ڪ��r��O
 *    10 20 90 100 50 -1 ewrewr546545 q
 *    �o�˷|�b�ĤC�ӥX���a? ���ϥΪ̤��|�Y�ɪ��D�ۤv�X��, ��a?
 * */

public class GradeAnalyzerTester {
	/**
	 * Main program. GUI Input the grade and save it and convert it to double.
	 * Print the result.
	 */

	public static void main(String[] args) {
		String input = "";
		GradeAnalyzer Test = new GradeAnalyzer();

		while (true) {
			input += JOptionPane.showInputDialog("Hello") + " ";
			if (input.contains("Q") || input.contains("q")) {
				break;
			} else {
				continue;
			}
		}

		String[] input1 = input.split(" |\\,");

		if (input1.length < 2) {
			System.out.print("You did not enter enough grades to analyze. Please enter at least 2 valid grades");
			System.exit(0);
		}

		double[] Grade = new double[input1.length];

		for (int i = 0; i < input1.length; i++) {
			if (input1[i].equals("Q") || input1[i].equals("q")) {
				break;
			} else {
				// �ҥ~�B�z, -2.
				Grade[i] = Double.parseDouble(input1[i]);
			}
		}

		for (int i = 0; i < Grade.length; i++) {
			GradeAnalyzer.isValidGrade(Grade[i]);
			Test.addGrade(Grade[i]);
		}
		Test.analyzeGrades();
		System.out.printf(Test.toString());
	}
}

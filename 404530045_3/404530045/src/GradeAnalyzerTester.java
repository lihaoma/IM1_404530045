
/**
 * GradeAnalyzer
 * @author 傅仰紹
 */
import javax.swing.*;

/*
 * [A]96ㄋ
 * [TA's Advise]
 * 1. 其實我覺得你先透過字串把所有東西存起來再去剖析, 這可能會容易產生問題, 好比說我的字串是
 *    10 20 90 100 50 -1 ewrewr546545 q
 *    這樣會在第七個出錯吧? 但使用者不會即時知道自己出錯, 對吧?
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
				// 例外處理, -2.
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

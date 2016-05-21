/**
 * GradeAnalyzer
 * 
 * @author ³Å¥õ²Ð
 *
 */
public class GradeAnalyzer {
	/**
	 * To analyzer the grade if it is suitable or not. return a string that is
	 * what the grade correspond to.
	 */
	int countAp, countA, countAm, countBp, countB, countBm, countCp, countC, countCm, countD, countF;
	int total;

	double sum = 0;
	double average = 0;
	double StandardDeviation = 0;
	double SumOfGradeSquare = 0;

	GradeAnalyzer() {
	}

	static boolean isValidGrade(double aGrade) {
		if (aGrade <= 110 && aGrade > 0) {
			return true;
		} else {
			return false;
		}
	}

	void addGrade(double aGrade) {
		if (isValidGrade(aGrade) == true) {
			if (aGrade >= 98) {
				countAp++;
			}
			if (aGrade >= 92 && aGrade < 98) {
				countA++;
			}
			if (aGrade >= 90 && aGrade < 92) {
				countAm++;
			}
			if (aGrade >= 88 && aGrade < 90) {
				countBp++;
			}
			if (aGrade >= 82 && aGrade < 88) {
				countB++;
			}
			if (aGrade >= 80 && aGrade < 82) {
				countBm++;
			}
			if (aGrade >= 78 && aGrade < 80) {
				countCp++;
			}
			if (aGrade >= 72 && aGrade < 78) {
				countC++;
			}
			if (aGrade >= 70 && aGrade < 72) {
				countCm++;
			}
			if (aGrade >= 60 && aGrade < 70) {
				countD++;
			}
			if (aGrade < 60) {
				countF++;
			}
			sum += aGrade;
			SumOfGradeSquare += aGrade * aGrade;
		}

	}

	void analyzeGrades() {
		total = countAp + countA + countAm + countBp + countB + countBm + countCp + countC + countCm + countD + countF;
		average = sum / total;
		// ¤½¦¡¦ü¥G¿ù¤F, -2.
		StandardDeviation = Math.sqrt((SumOfGradeSquare / total) - (average * average));
	}

	public String toString() {
		Count lAp = new Count("A+", countAp);
		Count lA = new Count("A", countA);
		Count lAm = new Count("A-", countAm);
		Count lBp = new Count("B+", countBp);
		Count lB = new Count("B", countB);
		Count lBm = new Count("B-", countBm);
		Count lCp = new Count("C+", countCp);
		Count lC = new Count("C", countC);
		Count lCm = new Count("C-", countCm);
		Count lD = new Count("D", countD);
		Count lF = new Count("F", countF);
		String output1 = "You entered %d valid grades from 0 to 110. Invalid grades are ignored! \nSum:%.1f \nAverage:%.1f \nStandardDeviation:%.1f \n";
		String output2 = "\nThe grade distribution is: \n";
		return String.format(output1, total, sum, average, StandardDeviation) + output2 + lAp.toString() + lA.toString()
				+ lAm.toString() + lBp.toString() + lB.toString() + lBm.toString() + lCp.toString() + lC.toString()
				+ lCm.toString() + lD.toString() + lF.toString();
	}
}

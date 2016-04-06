/*
 * [A]100
 * [TA's Adivse]
 * 1.Good JOB!
 * */

/**
 * Easter Sunday
 * 
 * @author 404530045傅仰紹
 */

public class EasterTester {
	/**
	 * Main program. Call the static method in Easter to calculate the Easter
	 * day of year 2001 and 2012.
	 */
	public static void main(String[] args) {
		/** 當2001年時，呼叫static method calculateEaster */
		System.out.print("In 2001, ");
		System.out.print(Easter.calculateEaster(2001));

		/** 當2012年時，呼叫static method calculateEaster */
		System.out.print("\nIn 2012, ");
		System.out.print(Easter.calculateEaster(2012));
	}

}

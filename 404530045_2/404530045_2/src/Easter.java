/**
 * Easter Sunday
 * 
 * @author 404530045傅仰紹
 */

public class Easter {
	/**
	 * Use "Gauss algorith" to calculate the real date of Easter Sunday. Build a
	 * static method.
	 * 
	 * @param ayear
	 *            year input
	 * @return To return what should we need to print in format of string
	 */

	public static String calculateEaster(int ayear) {
		int a, b, c, M, N, d, e, k, p, q;

		a = ayear % 19;
		b = ayear % 4;
		c = ayear % 7;

		// 不過這樣的轉換或許留給最後比較好, 否則在計算過程中可能會產生一些額外的誤差喔!
		/** floor運算時必須是double，因此將運算出的double轉換成integer以利之後的運算 */

		k = (int) Math.floor(ayear / 100);
		p = (int) Math.floor((13 + 8 * k) / 25);
		q = (int) Math.floor(k / 4);

		M = (15 - p + k - q) % 30;
		N = (4 + k - q) % 7;
		d = (19 * a + M) % 30;
		e = (2 * b + 4 * c + 6 * d + N) % 7;

		/** 如果d是29同時e是6時，復活節會從4/26變成4/19 */
		
		//或許把return 寫在最後會更精簡
		if (d == 29 && e == 6)

		{
			return "Easter Sunday is: month=4 and day=19";
		}

		/** 如果d是28同時e是6同時(11M+11)mod30<19時，復活節會從4/25變成4/18 */

		if (d == 28 && e == 6 && (11 * M + 11) % 30 < 19) {
			return "Easter Sunday is: month=4 and day=18";
		} else {
			/** 如果0<22+d+e<=31時復活節會在三月22+d+e日 */

			if (22 + d + e <= 31 && 0 < 22 + d + e)

			{
				return "Easter Sunday is: month=3 and day=" + (22 + d + e);
			}

			/** 如果0<d+e-9<=3時復活節會在四月d+e-9日 */

			if (d + e - 9 <= 30 && 0 < d + e - 9)

			{
				return "Easter Sunday is: month=4 and day=" + (d + e - 9);
			} else {
				/** 如果以上的if都不符合回傳null避免程式出錯 */

				return null;
			}
		}
	}
}

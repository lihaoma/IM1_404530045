/**
 * Easter Sunday
 * 
 * @author 404530045�ť���
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

		// ���L�o�˪��ഫ�γ\�d���̫����n, �_�h�b�p��L�{���i��|���ͤ@���B�~���~�t��!
		/** floor�B��ɥ����Odouble�A�]���N�B��X��double�ഫ��integer�H�Q���᪺�B�� */

		k = (int) Math.floor(ayear / 100);
		p = (int) Math.floor((13 + 8 * k) / 25);
		q = (int) Math.floor(k / 4);

		M = (15 - p + k - q) % 30;
		N = (4 + k - q) % 7;
		d = (19 * a + M) % 30;
		e = (2 * b + 4 * c + 6 * d + N) % 7;

		/** �p�Gd�O29�P��e�O6�ɡA�_���`�|�q4/26�ܦ�4/19 */
		
		//�γ\��return �g�b�̫�|���²
		if (d == 29 && e == 6)

		{
			return "Easter Sunday is: month=4 and day=19";
		}

		/** �p�Gd�O28�P��e�O6�P��(11M+11)mod30<19�ɡA�_���`�|�q4/25�ܦ�4/18 */

		if (d == 28 && e == 6 && (11 * M + 11) % 30 < 19) {
			return "Easter Sunday is: month=4 and day=18";
		} else {
			/** �p�G0<22+d+e<=31�ɴ_���`�|�b�T��22+d+e�� */

			if (22 + d + e <= 31 && 0 < 22 + d + e)

			{
				return "Easter Sunday is: month=3 and day=" + (22 + d + e);
			}

			/** �p�G0<d+e-9<=3�ɴ_���`�|�b�|��d+e-9�� */

			if (d + e - 9 <= 30 && 0 < d + e - 9)

			{
				return "Easter Sunday is: month=4 and day=" + (d + e - 9);
			} else {
				/** �p�G�H�W��if�����ŦX�^��null�קK�{���X�� */

				return null;
			}
		}
	}
}

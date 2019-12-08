package jfx.yellowsneakers.algorithms;

public final class Formula {
	
	private Formula() {}

	/**
	 * ŷ������㷨
	 * ���������Ǹ�����q ��  q �����Լ������ q ��0�������Լ��Ϊp��
	 * ���ߣ���p ���� q �õ����� r��p ��  q�����Լ����Ϊ q �� r�����
	 * ��Լ����
	 * @param p
	 * @param q
	 * @return
	 */
	public static int gcd(int p, int q) {
		if(q == 0)
			return p;
		int r = p % q;
		return gcd(q, r);
	}
	
	/**
	 * �ж�һ�����Ƿ�������
	 * @param N
	 * @return
	 */
	public static boolean isPrime(int N) {
		if(N < 2)
			return false;
		for(int i = 2; i*i <= N; i++)
			if(N % i == 0)
				return false;
		return true;
	}
}

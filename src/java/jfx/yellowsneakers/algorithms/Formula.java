package jfx.yellowsneakers.algorithms;

public final class Formula {
	
	private Formula() {}

	/**
	 * 欧几里得算法
	 * 计算两个非负整数q 和  q 的最大公约数：若 q 是0，则最大公约数为p。
	 * 否走，将p 除以 q 得到余数 r，p 和  q的最大公约数即为 q 和 r的最大
	 * 公约数。
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
	 * 判定一个数是否是素数
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

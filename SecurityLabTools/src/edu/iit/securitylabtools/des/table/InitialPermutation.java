package edu.iit.securitylabtools.des.table;

/**
 * Source http://en.wikipedia.org/wiki/DES_supplementary_material#
 * Initial_permutation_.28IP.29
 */
public final class InitialPermutation extends Table {

	private static final int[] ip = {
			-1,
			58, 50, 42, 34, 26, 18, 10, 2,
			60, 52, 44, 36, 28, 20, 12, 4,
			62, 54, 46, 38, 30, 22, 14, 6,
			64, 56, 48, 40, 32, 24, 16, 8,
			57, 49, 41, 33, 25, 17, 9, 1,
			59, 51, 43, 35, 27, 19, 11, 3,
			61, 53, 45, 37, 29, 21, 13, 5,
			63, 55, 47, 39, 31, 23, 15, 7,
	};

	public InitialPermutation() {
		super(ip);
	}
}

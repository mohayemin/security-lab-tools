package edu.iit.securitylabtools.des.table;

/**
 * Source:
 * http://en.wikipedia.org/wiki/DES_supplementary_material#
 * Expansion_function_.28E.29
 */
public final class ExpansionPermutation extends Table {

	private static final int[] ep = {
			-1,
			32, 1, 2, 3, 4, 5,
			4, 5, 6, 7, 8, 9,
			8, 9, 10, 11, 12, 13,
			12, 13, 14, 15, 16, 17,
			16, 17, 18, 19, 20, 21,
			20, 21, 22, 23, 24, 25,
			24, 25, 26, 27, 28, 29,
			28, 29, 30, 31, 32, 1
	};

	public ExpansionPermutation() {
		super(ep);
	}

}

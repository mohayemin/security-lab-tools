package edu.iit.securitylabtools.des.table;

/**
 * Source:
 * http://en.wikipedia.org/wiki/DES_supplementary_material#Permuted_choice_2_.28
 * PC-2.29
 * 
 * @author Mohayeminul Islam
 */
public final class PermutationChoice2 extends Table {
	private static final int[] pc2 = {
			-1,
			14, 17, 11, 24, 1, 5, 3, 28,
			15, 6, 21, 10, 23, 19, 12, 4,
			26, 8, 16, 7, 27, 20, 13, 2,
			41, 52, 31, 37, 47, 55, 30, 40,
			51, 45, 33, 48, 44, 49, 39, 56,
			34, 53, 46, 42, 50, 36, 29, 32
	};

	public PermutationChoice2() {
		super(pc2);
	}

}

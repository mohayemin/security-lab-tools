package edu.iit.securitylabtools.des.table;

/**
 * Source:
 * http://en.wikipedia.org/wiki/DES_supplementary_material#Permuted_choice_1_
 * .28PC-1.29
 * 
 * @author Mohayeminul Islam
 */
public class PermutationChoice1Left extends Table {
	private static final int[] pc1l = {
			-1,
			57, 49, 41, 33, 25, 17, 9,
			1, 58, 50, 42, 34, 26, 18,
			10, 2, 59, 51, 43, 35, 27,
			19, 11, 3, 60, 52, 44, 36,
	};

	public PermutationChoice1Left() {
		super(pc1l);
	}

}

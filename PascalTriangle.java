/*
 * Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
 * 
 */

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	public List<List<Integer>> generate(int numRows) {

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> temp = new ArrayList<Integer>();
		List<Integer> temp2 = new ArrayList<Integer>();

		if (numRows == 0) {
			return result;
		}

		for (int i = 0; i < numRows; i++) {

			for (int j = 0; j <= i; j++) {
				if (j == 0) {
					temp.add(1);
				} else if (j == i && j != 0) {
					temp.add(1);
				} else {
					if (temp2 != null) {
						int curr = temp2.get(j - 1) + temp2.get(j);
						temp.add(curr);
					}
				}

				if (j == i) {
					result.add(temp);
					temp2 = new ArrayList<Integer>();
					temp2 = temp;
					temp = new ArrayList<Integer>();
				}
			}
		}
		return result;
	}
}
import java.util.ArrayList;
import java.util.List;

public class SortColumns
{
	private List<Integer> minDeletionSize(String[] A, List<Integer> list)
	{
	
		int x = A[0].length(); // setting equal to length of string
		for (String y : A) //makes sure strings are not equal to length of x
		{
			if (y.length() != x) //checks for error
			{
				return null;
			}
		}

		for (int i = 0; i < A[0].length(); i++) //iterates through every char
		{
			for (int j = 0; j < A.length-1; j++)
			{
				if (A[j].charAt(i) > A[j + 1].charAt(i)) //checks to see if char > char in next string
				{
					list.add(i); //adds index to list
					break;
				}
			}
		}
		
		return list;
	}



	public static void main (String[] args)
	{
		//examples 

		String[] A = {"cba", "daf", "ghi"};
		// String[] A = {"a", "b"};
		// String[] A = {"zyx", "wvu", "tsr"};
		// String[] A = {"Captain","Marvel","saved", "the", "Avengers"};


		List<Integer> list = new ArrayList<>(); //
		SortColumns sort = new SortColumns();
		List<Integer> output = sort.minDeletionSize(A, list);
		if (output == null)
		{
			System.out.println("{-1}"); //changes from null to -1
		}
		else
		{
			System.out.println(output);
		}
	}
}
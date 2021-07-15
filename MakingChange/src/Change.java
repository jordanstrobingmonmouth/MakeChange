import java.util.Scanner;

public class Change {

	private int[][] nums;
	private int count = 0;

	Change(double itemCost, double amountPaid) {
		nums = new int[9][2];
		addChange(5000);
		addChange(2000);
		addChange(1000);
		addChange(500);
		addChange(100);
		addChange(25);
		addChange(10);
		addChange(5);
		addChange(1);

		pay(itemCost, amountPaid);

	}

	private void addChange(int x) {
		nums[count][0] = x;
		count++;
	}

	public void pay(double itemCost, double amountPaid) {

		double temp = (amountPaid - itemCost) * 100;

		int change = (int) temp;

		for(int i = 0; i < 9; i++) {
			if (nums[i][0] <= change) {
				nums[i][1] = change / nums[i][0];
				change = change - (nums[i][1] * nums[i][0]);


			}

		}
	}

	public void printArr() {
		System.out.println("Value: \tAmount:" );
		System.out.println("------ \t-------" );
		for (int i = 0; i < 9; i++) {
			System.out.println((double)nums[i][0]/100+" \t"+ nums[i][1]);
		}
	}


}

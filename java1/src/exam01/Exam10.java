package exam01;

public class Exam10 {

	public static void main(String[] args) {
		int[] nums = new int[5];
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = (i+1)*10;
		}
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}

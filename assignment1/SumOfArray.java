package assignment1;

public class SumOfArray {

	public SumOfArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int[]arr= {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
    System.out.println("sum of elements of an array:"+sum);
	}

}

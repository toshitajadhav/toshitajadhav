package chapter1;

public class Reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] arr=new int[] {1,2,3,4,5};
   System.out.println("original array:");
   for(int i=0;i<arr.length;i++) {
	   System.out.println(arr[i]+"");
   }
   System.out.println();
   System.out.println("Aarray reverse order:");
   for(int i=arr.length-1;i>=0;i--) {
	   System.out.println(arr[i]+"");
   }
	}

}

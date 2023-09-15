package codingblocksrestart;

public class reverse_array_by_swap {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		disp(arr);

		
		 rev1(arr);
		
		disp(arr);
		
	}

	public static void disp(int[] arr) {
		for(int i : arr){
			System.out.print(i + " ");// TODO Auto-generated method stub
		}
		System.out.println();
	}

	public static  void rev1(int[] arr) {
		int L = 0;
		int R = arr.length-1;
		while(L < R){
			int temp  = arr[L];
			arr[L] = arr[R];
			arr[R] = temp;
			L++;
			R--;
			// TODO Auto-generated method stub
		}
		return ;
		
	}
}

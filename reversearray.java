package codingblocksrestart;

public class reversearray {
public static void main(String[] args) {
	int[] arr = {10,20,30,40,50};
	disp(arr);

	
	arr = rev1(arr);
	disp(arr);
	
}

public static void disp(int[] arr) {
	for(int i : arr){
		System.out.print(i + " ");// TODO Auto-generated method stub
	}
	System.out.println();
}

public static int[] rev1(int[] arr) {
	int idx1 = 0;
	int idx2 = arr.length-1;
	int[] rev_arr = new int[arr.length];
	while(idx2 >= 0){
		rev_arr[idx1] = arr[idx2];
		idx1++;
		idx2--;
		// TODO Auto-generated method stub
	}
	return rev_arr;
	
}
}

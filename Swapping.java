package package8;

public class Swapping {
		public static void main(String[] args) {
			int[] a1 = {1,2,3,4};
			int[] a2 = {23,12,14,7};
			System.out.println(a1[0] + ":" + a2[0]);
			swap_in(a1,a2,0);
			System.out.println(a1[0] + ":" + a2[0]);
		}
		public static void swap_in(int[] a, int[] b, int c) {
			int d = a[c];
			 a[c] = b[c];
			 b[c] = d;
		}
		}



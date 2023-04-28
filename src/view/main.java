package view;

import www.kauanpaulino.QuickSort.QuickSort;

public class main {

	public static void main(String[] args) {

		QuickSort q = new QuickSort();
		int[] vt = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
		vt = q.quicksort(vt, 0, vt.length-1);
		for(int valor: vt) {
			System.out.print(valor);
			System.out.print(" ");
		}
	

	}

}

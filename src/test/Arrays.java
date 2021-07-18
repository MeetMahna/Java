package test;

public class Arrays {

	// an array that takes array as an argument and returns an array
	static int[] multiplyBy2(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] *= 2;
		}
		return a;
	}

	static void display(int[][] arr) {
		for (int m[] : arr) {
			for (int n : m) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		// array of strings
		String[] arr = new String[4];
		arr[0] = "one";
		arr[1] = "two";
		arr[2] = "three";
		arr[3] = "four";

		// length of array
		System.out.println(arr.length);

		// for each loop
		for (String i : arr) {
			System.out.println(i);
		}

		int nums[] = multiplyBy2(new int[] { 1, 2, 3, 4 }); // anonymous array
		for (int x : nums)
			System.out.print(x + " ");

		System.out.println("\n-----------");
		// 2D Array
		int[][] array2d = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("2D Array:");
		display(array2d);

		// Jagged Array - array of array with diff numbers of columns
		int[][] jaggedArray = { { 1, 2, }, { 4, 5, 6, 0 }, { 7, 8, 9 } };
		System.out.println("Jagged Array:");
		display(jaggedArray);

		System.out.println("-----------");
		// Copying an array
		char[] arr1 = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		char[] arr2 = new char[5];
		System.arraycopy(arr1, 2, arr2, 0, 5);

		System.out.println(String.valueOf(arr2));

		System.out.println("-----------");

		// Clone array
		int arr_a[] = { 33, 3, 4, 5 };
		System.out.println("Printing original array:");
		for (int i : arr_a)
			System.out.print(i + " ");

		System.out.println();
		System.out.println("Printing clone of the array:");
		int arr_b[] = arr_a.clone();
		for (int i : arr_b)
			System.out.print(i + " ");

		System.out.println();
		System.out.println("Are both equal?");
		System.out.println(arr_a == arr_b);
	}
	
}

/*
 * testSelectionSort.java
 *
* To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

import static org.junit.Assert.assertTrue;
import org.junit.Assert;
import org.junit.Test;

public class testSelectSort {
	public SelectionSort sorted = new SelectionSort();
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

    public testSelectSort() {
    }

    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

        /** add tests to check for this unit test **/
<<<<<<< HEAD
        arr = sorted.basicSelectionSort(arr);
=======
				arr = sorted.basicSelectionSort(arr);
>>>>>>> PosNeg

        for(int i = 0; i < arr.length; ++i) {
        	assertTrue("Not a match!", arr[i] == Sortedarr[i]);
        }
    }

    public void testNegative(){
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;

        /** add tests to check for this unit test **/
<<<<<<< HEAD
        arr = sorted.basicSelectionSort(arr);
=======
				arr = sorted.basicSelectionSort(arr);
>>>>>>> PosNeg

        for(int i = 0; i < arr.length; ++i) {
        	assertTrue("Not a match!", arr[i] == Sortedarr[i]);
        }
    }

    public void testMixed(){
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = 9;
        arr[2] = -7;
        arr[3] = 10;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -8;
        Sortedarr[1] = -7;
        Sortedarr[2] = -2;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

        /** add tests to check for this unit test **/
        arr = sorted.basicSelectionSort(arr);

        for(int i = 0; i < arr.length; ++i) {
        	assertTrue("Not a match!", arr[i] == Sortedarr[i]);
        }
    }

    public void testDuplicates(){
    	int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 8;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 8;
        Sortedarr[4] = 10;

        /** add tests to check for this unit test **/
        arr = sorted.basicSelectionSort(arr);

        for(int i = 0; i < arr.length; ++i) {
        	assertTrue("Not a match!", arr[i] == Sortedarr[i]);
        }
    }
}

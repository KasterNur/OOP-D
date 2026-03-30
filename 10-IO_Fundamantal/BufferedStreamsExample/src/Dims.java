
import java.util.ArrayList;
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Dims {
   public static void main(String[] args) {
//    int [][] a = {{1,2,}, {3,4}};
//    int [] b = (int[]) a[1];
//    Object o1 = a;
//    int[][] a2 = (int[][]) o1;
//    int[] b2 = (int[]) o1;
//  System.out.println(b[1]);

	//List<List<Integer>> table = new ArrayList<ArrayList<Integer>>();
	// List<List<Integer>> table = new ArrayList<ArrayList<Integer>>();
        for (int i =0; i<=10; i++) {
	   List<Integer> row = new ArrayList<Integer>();
	   for( int j=0; j<=10 ;j++)
		row.add(i*j);
	   table.add(row);
}
	for( List<Integer> row:table)
		System.out.println(row);
}
}


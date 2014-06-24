package com.jainishshah.www;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class jms {
 
	public static void main(String args[]){
 
		int[] num = {3,4,6347,7457,7457,457,1,2,4};
		     int j;                     // the number of items sorted so far
		     int key;                // the item to be inserted
		     int i;  

		     for (j = 1; j < num.length; j++)    // Start with 1 (not 0)
		    {
		           key = num[ j ];
		           for(i = j - 1; (i >= 0) && (num[ i ] < key); i--)   // Smaller values are moving up
		          {
		                 num[ i+1 ] = num[ i ];
		          }
		         num[ i+1 ] = key;    // Put the key in its proper location
		         
		    }
		     for (int k = 1; k < num.length; k++)  
		     System.out.println(num[k]);
		}
	}

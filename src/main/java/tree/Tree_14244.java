package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class Tree_14244 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int leaf = 0;
		if (m == 2) {
			leaf = 1;
		}
		
		int last_leaf = 0;
		
		for (int i = 1 ; i < n ; i++) {
			if(m > leaf) {
				System.out.println("0 " +i);
				leaf++;
			}else {
				System.out.println(last_leaf + " " + i);
			}
			last_leaf = i;
		}
		
		/*
		ArrayList<String> list = new ArrayList<String>();
		list.add(0, "0 1");
		for (int i = 1; i < m; i++) {
			list.add(i, "1 " +(i+1));
		}
		System.out.println("ASDSAD : " + list.get(list.size()-1));
		String aa = list.get(list.size()-1);
		String aaa = aa.substring( aa.length() -1 );
		int last = Integer.parseInt(aaa);

		for ( int x = last ; x < n-1 ; x++) {
			System.out.println( x + "  22@!#!@#");
			list.add(x, x + " " +(x+1));
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
			
		*/
	}
	
 
}

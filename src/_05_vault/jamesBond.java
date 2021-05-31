package _05_vault;

import javax.swing.JOptionPane;

public class jamesBond {
		public int findCode(vault v) {
			
		
		for (int i = 0; i < 100001; i++) {
			System.out.println(i);
			if(v.tryCode(i)) {
			return i;
				
			}
		
		}
		return -1;
	}
		

}
package _05_vault;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class vault {
	
static void tryCode() {
	int code = 118;
	for (int i = 0; i < 1001; i++) {
		System.out.println(i);
		if(i == code) {
			JOptionPane.showMessageDialog(null, "The code was " + code + "!");
			
		}
	}
	
	
}
}

package com.mycompany.ludogame;

import javax.swing.JFrame;

public class SplashScreen {
	   public static void main(String[] args) {
	        JFrame mainf = new JFrame();
	        mainf.setBounds(10,10,1000,600);
	        mainf.setTitle("LUDO GAME IN JAVA");
	        mainf.setResizable(false);
	        mainf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        LUDOMoves ludo = new LUDOMoves();
	        ludo.setFocusable(true);
	        ludo.addKeyListener(ludo);
	        ludo.addMouseListener(ludo);
	        mainf.add(ludo);
	        mainf.setVisible(true);
	   }
}

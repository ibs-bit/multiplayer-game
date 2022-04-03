package com.mycompany.ludogame;

import java.awt.Graphics2D;

public class Gamers {
	int height,width,status,coin;
	Settings[] pa=new Settings[4];
	public Gamers(int height,int width) {
		status=-1;
		coin=0;
		for(int i=0;i<4;i++) {
			pa[i]=new Settings(height,width);
		}
	}
	public void draw(Graphics2D grafity) {
		// TODO Auto-generated method stub
	
	}
}

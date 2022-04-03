package com.mycompany.ludogame;


import java.awt.Graphics2D;

public class Games {

	Gamers[] pl=new Gamers[4]; 
	int[][] initialx= {
			{1,1,3,3},
			{10,10,12,12},
			{10,10,12,12},
			{1,1,3,3}
	};
	int[][] initialy= {
			{1,3,1,3},
			{1,3,1,3},
			{10,12,10,12},
			{10,12,10,12}
	};
	public Games(int height, int width) {
	
		for(int i=0;i<4;i++) {
			pl[i]=new Gamers(height,width);
		}
	}
	public void draw(Graphics2D grafity) {
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				pl[i].pa[j].draw(grafity,initialx[i][j],initialy[i][j],i);
			}
		}
	}
	
}

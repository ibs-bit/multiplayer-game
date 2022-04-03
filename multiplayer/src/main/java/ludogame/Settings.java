package com.mycompany.ludogame;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class Settings {
	int x,y;
	int current;
	int height,width;
	public Settings(int h,int w){
		current=-1;
		x=-1;
		y=-1;
		height=h;
		width=w;
	}
	public void draw(Graphics2D grafity, int i, int j,int varGame) {
		// TODO Auto-generated method stub
		if(current==-1) {
			int var1=80+(height/2),var2=50+(width/2);
			x=i;
			y=j;
			if(varGame==0) {
				grafity.setColor(Color.ORANGE);
			}
			else if(varGame==1) {
				grafity.setColor(Color.GREEN);
			}
			else if(varGame==2) {
				grafity.setColor(Color.GRAY);
			}
			else if(varGame==3) {
				grafity.setColor(Color.CYAN);
			}
			grafity.fillOval(var1+5+(i*width),var2+5+(j*height),width-10,height-10);
			grafity.setStroke(new BasicStroke(2));
			grafity.setColor(Color.BLACK);
	    	grafity.drawOval(var1+5+(i*width),var2+5+(j*height),width-10,height-10);
		}
		else
		{
			int var1=80,var2=50;
			x=ShortestWay.ax[varGame][current];
			y=ShortestWay.ay[varGame][current];
			if(varGame==0) {
				grafity.setColor(Color.ORANGE);
			}
			else if(varGame==1) {
				grafity.setColor(Color.GREEN);
			}
			else if(varGame==2) {
				grafity.setColor(Color.GRAY);
			}
			else if(varGame==3) {
				grafity.setColor(Color.CYAN);
			}
			grafity.fillOval(var1+5+(x*width),var2+5+(y*height),width-10,height-10);
			grafity.setStroke(new BasicStroke(2));
			grafity.setColor(Color.BLACK);
	    	grafity.drawOval(var1+5+(x*width),var2+5+(y*height),width-10,height-10);
		}
	}
}

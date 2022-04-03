package com.mycompany.ludogame;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

public class Interface {
	
	int var_a,y,width,height;
	public Interface(int xi,int yi) {
		var_a=xi;
		y=yi;
		width=30;
		height=30;
	}
	public void draw(Graphics2D grafity){
		grafity.setColor(Color.WHITE);
        grafity.fillRect(var_a,y,15*width,15*height);
        for(int i=0;i<6;i++) {
        	grafity.setColor(Color.ORANGE);
        	grafity.fillRect(var_a+(i*width),y, width, height);
        	grafity.fillRect(var_a, y+(i*height), width, height);
        	grafity.fillRect(var_a+(i*width),y+(5*height), width, height);
        	grafity.fillRect(var_a+(5*width), y+(i*height), width, height);
        	grafity.setColor(Color.GREEN);
        	grafity.fillRect(var_a+((i+9)*width),y, width, height);
        	grafity.fillRect(var_a+(9*width), y+(i*height), width, height);
        	grafity.fillRect(var_a+((i+9)*width),y+(5*height), width, height);
        	grafity.fillRect(var_a+(14*width), y+(i*height), width, height);
        	grafity.setColor(Color.GRAY);
        	grafity.fillRect(var_a+((i+9)*width),y+(9*height), width, height);
        	grafity.fillRect(var_a+(9*width), y+((i+9)*height), width, height);
        	grafity.fillRect(var_a+((i+9)*width),y+(14*height), width, height);
        	grafity.fillRect(var_a+(14*width), y+((i+9)*height), width, height);
        	grafity.setColor(Color.CYAN);
        	grafity.fillRect(var_a+(i*width),y+(9*height), width, height);
        	grafity.fillRect(var_a, y+((i+9)*height), width, height);
        	grafity.fillRect(var_a+(i*width),y+(14*height), width, height);
        	grafity.fillRect(var_a+(5*width), y+((i+9)*height), width, height);
        }
        for(int i=1;i<6;i++) {
        	grafity.setColor(Color.ORANGE);
        	grafity.fillRect(var_a+(i*width),y+(7*height), width, height);
        	grafity.setColor(Color.GRAY);
        	grafity.fillRect(var_a+((8+i)*width),y+(7*height), width, height);
        	grafity.setColor(Color.GREEN);
        	grafity.fillRect(var_a+(7*width),y+(i*height), width, height);
        	grafity.setColor(Color.CYAN);
        	grafity.fillRect(var_a+((7)*width),y+((8+i)*height), width, height);
        }
        grafity.setColor(Color.ORANGE);
    	grafity.fillRect(var_a+(1*width),y+(6*height), width, height);
    	grafity.setColor(Color.GRAY);
    	grafity.fillRect(var_a+((13)*width),y+(8*height), width, height);
    	grafity.setColor(Color.GREEN);
    	grafity.fillRect(var_a+(8*width),y+(1*height), width, height);
    	grafity.setColor(Color.CYAN);
    	grafity.fillRect(var_a+((6)*width),y+((13)*height), width, height);
    	int var1=var_a+45,var2=y+45;
    	for(int i=0;i<2;i++) {
    		for(int j=0;j<2;j++) {
    			grafity.setColor(Color.ORANGE);
    	    	grafity.fillRect(var1+(2*i*width),var2+(2*j*height), width, height);
    	    	grafity.setColor(Color.GRAY);
    	    	grafity.fillRect(var1+(2*i*width)+9*width,var2+(2*j*height)+9*height, width, height);
    	    	grafity.setColor(Color.GREEN);
    	    	grafity.fillRect(var1+(2*i*width)+9*width,var2+(2*j*height)+0*height, width, height);
    	    	grafity.setColor(Color.CYAN);
    	    	grafity.fillRect(var1+(2*i*width)+0*width,var2+(2*j*height)+9*height, width, height);
    		}
    	}
    	grafity.setColor(Color.ORANGE);
    	int xpoints0[] = {var_a+(6*width),var_a+(6*width), var_a+15+(7*width)};
        int ypoints0[] = {y+(6*height),y+(9*height),y+15+(7*width)};
        int npoints = 3;
        grafity.fillPolygon(xpoints0, ypoints0, npoints);
    	grafity.setColor(Color.GRAY);
    	int xpoints1[] = {var_a+(9*width),var_a+(9*width), var_a+15+(7*width)};
        int ypoints1[] = {y+(6*height),y+(9*height),y+15+(7*width)};
        int npoints1= 3;
        grafity.fillPolygon(xpoints1, ypoints1, npoints1);
    	grafity.setColor(Color.GREEN);
    	int xpoints2[] = {var_a+(6*width),var_a+(9*width), var_a+15+(7*width)};
        int ypoints2[] = {y+(6*height),y+(6*height),y+15+(7*width)};
        int npoints2= 3;
        grafity.fillPolygon(xpoints2, ypoints2, npoints2);
    	grafity.setColor(Color.CYAN);
    	int xpoints3[] = {var_a+(6*width),var_a+(9*width), var_a+15+(7*width)};
        int ypoints3[] = {y+(9*height),y+(9*height),y+15+(7*width)};
        int npoints3= 3;
        grafity.fillPolygon(xpoints3, ypoints3, npoints3);
    	grafity.setStroke(new BasicStroke(2));
    	grafity.setColor(Color.BLACK);
    	for(int i=0;i<3;i++) {
    		for(int j=0;j<6;j++) {
    	        grafity.drawRect(var_a+((i+6)*width),y+(j*height), width, height);
    	        grafity.drawRect(var_a+((j)*width),y+((i+6)*height), width, height);
    	        grafity.drawRect(var_a+((i+6)*width),y+((j+9)*height), width, height);
    	        grafity.drawRect(var_a+((j+9)*width),y+((i+6)*height), width, height);
    		}
    	}
    	grafity.drawRect(var_a+((1)*width),y+(1*height),4*width,4*height);
    	grafity.drawRect(var_a+((10)*width),y+(1*height),4*width,4*height);
    	grafity.drawRect(var_a+((1)*width),y+(10*height),4*width,4*height);
    	grafity.drawRect(var_a+((10)*width),y+(10*height),4*width,4*height);
        grafity.drawRect(var_a,y,15*width,15*height);
        for(int i=0;i<2;i++) {
    		for(int j=0;j<2;j++) {
    	    	grafity.drawRect(var1+(2*i*width),var2+(2*j*height), width, height);
    	    	grafity.drawRect(var1+(2*i*width)+9*width,var2+(2*j*height)+9*height, width, height);
    	    	grafity.drawRect(var1+(2*i*width)+9*width,var2+(2*j*height)+0*height, width, height);
    	    	grafity.drawRect(var1+(2*i*width)+0*width,var2+(2*j*height)+9*height, width, height);
    		}
    	}
        grafity.drawPolygon(xpoints0, ypoints0, npoints);
        grafity.drawPolygon(xpoints1, ypoints1, npoints1);
        grafity.drawPolygon(xpoints2, ypoints2, npoints2);
        grafity.drawPolygon(xpoints3, ypoints3, npoints3);
        grafity.drawOval(var_a+5+(6*width),y+5+(2*height),width-10,height-10);
        grafity.drawOval(var_a+5+(12*width),y+5+(6*height),width-10,height-10);
        grafity.drawOval(var_a+5+(8*width),y+5+(12*height),width-10,height-10);
        grafity.drawOval(var_a+5+(2*width),y+5+(8*height),width-10,height-10);
        grafity.setFont(new Font("serif", Font.BOLD, 40));
        grafity.drawString("Gamer 1", 90, 35);
        grafity.drawString("Gamer 2", 370, 35);
        grafity.drawString("Gamer 3", 90, 540);
        grafity.drawString("Gamer 4", 370, 540);
        grafity.drawString("Readme:", 550,300);
        grafity.drawString("1.Click ENTER to start.", 550,350);
        grafity.drawString("2.Click on the coin to play.", 550,400);
    }
}

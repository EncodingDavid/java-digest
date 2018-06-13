package com.lzw;
import java.awt.*;
import java.util.Random;
import javax.swing.*;
public class SleepMethodTest extends JFrame{
	private Thread t;
	private static Color[] color = {Color.BLACK,Color.BLUE,Color.CYAN.Color.GREEN,Color.ORANGE,Color.YELLOW,Color.RED,Color.PINK,Color.LIGHT_GRAY};
	private static final Random rand = new Random();
	private static Color getC(){
		return color[rand.nextlnt(color.length)];
	}
	public SleepMethodTest(){
	t = new Thread(new Runnable(){
			int x = 30;
			int y = 50;
			public void run(){
				while(true){
					Thread.sleep(100);
				} catch (InterruptedException e){
					e.printStackTrack();
				}
				Graphics graphics = getGraphics();
				graphics.setColor(getC());
				graphics.drawLine(x,y,100,y++);
				if (y>=80){
					y = 50;
				}
			}
		}
	});
	t.start();
}
public static void main(String[] args){
	init(new SleepMethodTest(),100,100);
}
public static void init(JFrame frame,int width,int height){
	trame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	trame.setSize(width,height);
	trame.setVisible(true);
}
}

				
				
				
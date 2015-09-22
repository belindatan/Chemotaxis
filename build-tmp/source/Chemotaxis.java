import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Chemotaxis extends PApplet {

Bacteria [] colony;
//Bat one; //declare bacteria variables here   
 public void setup()   
 {     
    colony=new Bacteria[100];
 	size(500,500);//initialize bacteria variables here 
 	for(int i = 0; i < colony.length; i++) 
	{
	colony[i]=new Bacteria (350,350);
	}
 }   
 public void draw()   
 {  
 	//x=(int)(Math.random())*255;
 	//y=(int)(Math.random())*255;  
 	background (255);
 	
 	frameRate(5);



 	for (int i=0; i<colony.length; i++)
 		{
 
 		colony[i].move();
 		colony[i].show();
 		}//move and show the bacteria   
 }  
 class Bacteria    
 {  int myx, myy;

 	Bacteria(int x, int y)
 	{	myx=x;
 		myy=y;
 	}  
 	public void move()
{	
	
	//myx=(int)(Math.random()*42)-1;
	//myy=(int)(Math.random()*42)-1;

	int direction=(int)(Math.random()*4);
		if (direction==0)
			{
				myx=myx+10;
			}
		else if (direction==1)
			{
				myx=myx-10;
			}
		else if (direction==2)
			{
				myy=myy+10;
			}
		else
			{
				myy=myy-10;
			}
}

public void show()
{	
	fill ((int)(Math.random()*240),(int)(Math.random()*240),(int)(Math.random()*240));
	

	ellipse (myx,myy,20,20);
}
 	//lots of java!   
 }     	
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Chemotaxis" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}

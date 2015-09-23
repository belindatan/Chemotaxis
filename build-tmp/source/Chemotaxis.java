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
    colony=new Bacteria[99];
 	size(500,500);//initialize bacteria variables here 
 	for(int i = 0; i < colony.length; i++) 
	{
	colony[i]=new Bacteria (250,250);
	}
 }   
 public void draw()   
 {  
 	
 	background (255);
 	
 	frameRate(1);



 	for (int i=0; i<colony.length; i++)
 		{
 
 		colony[i].move();
 		colony[i].show();
 		}//move and show the bacteria   
 }  
 class Bacteria    
 {  int myx, myy,x,y,c1,c2,c3;

 	Bacteria(int x, int y)
 	{	myx=x;
 		myy=y;
	//x=(int)(Math.random()*20);
 	//y=(int)(Math.random()*20);  
 	c1=(int)(Math.random()*340);
 	c2=(int)(Math.random()*340);
 	c3=(int)(Math.random()*340);
 	}  
 	public void move()
{	
	
//	myx=(int)(Math.random()*4)-1;
//	myy=(int)(Math.random()*4)-1;

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
{	noStroke();
	fill (c1,c2,c3,20);
	

	ellipse (myx,myy,30,30);

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

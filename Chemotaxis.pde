Bacteria [] colony;
//Bat one; //declare bacteria variables here   
 void setup()   
 {     
    colony=new Bacteria[100];
 	size(500,500);//initialize bacteria variables here 
 	for(int i = 0; i < colony.length; i++) 
	{
	colony[i]=new Bacteria (350,350);
	}
 }   
 void draw()   
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
 	void move()
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

void show()
{	
	fill ((int)(Math.random()*240),(int)(Math.random()*240),(int)(Math.random()*240));
	

	ellipse (myx,myy,20,20);
}
 	//lots of java!   
 }     	
import processing.core.PApplet;

/*
* A program that draws a house
* @author: L. Pei
*/

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    
    // background sky
    fill(173, 216, 230);
    rect(0, 0, 400, 275);

    // background sun
    fill(255, 255, 0);
    ellipse(375, 25, 100, 100);

    //chimney
    fill(168, 96, 50);
    rect(155, 100, 15, 35);

    //shape of the house
    fill(168, 96, 50);
    rect(60, 150, 125, 125);

    fill(168, 96, 50);
    triangle(35, 150, 122, 92, 210, 150);

    // window 1
    fill(225, 225, 225);
    ellipse(92 ,185, 30, 30);

    stroke(0, 0, 0);
    line(77, 185, 107, 185);

    stroke(0, 0, 0);
    line(92, 170, 92, 200);


    // window 2
    fill(225, 225, 225);
    ellipse(155, 185, 30, 30);

    stroke(0, 0, 0);
    line(140, 185, 170, 185);

    stroke(0, 0, 0);
    line(155, 170, 155, 200);

    //door
    fill(145, 61, 7);
    rect(110, 220, 25, 55);


  }
  

}
import processing.core.PApplet;

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

    //house body
    fill(168, 96, 50);
    rect(60, 150, 125, 125);

    //top of the house
    fill(168, 96, 50);
    triangle(60, 150, 123, 100, 185, 150);

    //window
    fill(225, 225, 225);
    ellipse(150, 190, 30, 30);

    //door
    fill(145, 61, 7);
    rect(110, 225, 25, 50);


  }
  

}
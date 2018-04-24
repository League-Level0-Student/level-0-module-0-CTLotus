void setup(){
  size(860, 680);
 PImage face = loadImage("derp.jpg");
 image(face, 0, 0);
 face.resize(860, 680);
 
  
  
  
}

void draw(){
  fill(0,0,0);
  ellipse(170,240,20,20);
  fill(mouseX, mouseY, 0);
  ellipse(170,240, 10, 10);
  fill(0,0,0);
  ellipse(351,234,20,20);
  fill(mouseX, mouseY, 0);
  ellipse(351,234,10,10);
  
}

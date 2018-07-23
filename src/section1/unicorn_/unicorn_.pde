PImage rainbow;
PImage unicorn;

void setup(){rainbow=loadImage("download.png");
size(800,600); 
rainbow.resize(800,600);
unicorn=loadImage("images.jpg");
background(rainbow);}
void draw(){background(rainbow);
image(unicorn,mouseX,mouseY);}
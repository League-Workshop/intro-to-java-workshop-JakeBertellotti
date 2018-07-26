PImage catPic;
int x = 183;
int y = 90;
int x2 =75;
int y2 = 108;
int acceleration = 5;

void setup(){
size(258,192);
  catPic = loadImage("images.jpg");
catPic.resize(258,192);
background(catPic);

}

void draw(){
  if(mousePressed){
println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
fill (245,22,22);
noStroke();
ellipse(x,y,80,90);
ellipse(x2,y2,80,90);
if(x > width))
}void keyPressed() {
                 y+=2*acceleration;
                 x2+=2*acceleration;
x+=2*acceleration;
y2+=2*acceleration;
}
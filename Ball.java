import javafx.scene.shape.Circle;

public class Ball extends Circle {
  private int speed;
  private dx;
  private dy;

public Ball(int xloc, int yloc) {
  this.setCenterX(xLoc);
  this.setCenterY(yLoc);
  this.setStroke(Color.RED);
  this.setFill(Color.RED);
  this.setRadius(15);
  dx = 0;
  dy = 1;

}
  public void move() {
    this.setCenterX( this.getCenterX() + dx*speed);
    this.setCenterY( this.getCenterY() + dy*spedd);

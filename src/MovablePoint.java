public class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    MovablePoint(){}
    MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float [] getSpeed(){
        float arr[] = new float[2];
        arr[0] = this.xSpeed;
        arr[1] = this.ySpeed;
        return arr;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" +  xSpeed +
                ", ySpeed=" + ySpeed +
                '}' + this.xSpeed +"," + this.ySpeed +",";
    }
    public MovablePoint move(){
        this.x += xSpeed;
        this.y += ySpeed;
        return this;
    }
}

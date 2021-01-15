public class Point {
    public float x = 0.0f;
    public float y = 0.0f;
    Point (){}
    Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getX() {
        return x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getY() {
        return y;
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float [] getXY() {
        float arr[] = new float[2];
        arr [0] = this.x;
        arr [1] = this.y;
        return arr;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

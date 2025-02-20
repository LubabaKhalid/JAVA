class Point {
    int x_m,y_m;
    public Point(){
        x_m=0;
        y_m=0;
    }
    public Point(int x,int y){
        x_m=x;
        y_m=y;
    }
    public static void main(String args[]){
        Point p=new Point();
        System.out.println(p.x_m+" "+p.y_m);
    }
    
}

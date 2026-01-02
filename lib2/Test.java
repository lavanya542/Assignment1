import java.util.*;
class Circle implements Comparable<Circle> {
    int x,y,r;
    Circle(int x,int y,int r){this.x=x;this.y=y;this.r=r;}
    public int compareTo(Circle c){ return this.r - c.r; }
    public boolean equals(Object o){
        Circle c=(Circle)o;
        return x==c.x && y==c.y && r==c.r;
    }
    public int hashCode(){ return Objects.hash(x,y,r); }
}
class Test {
    public static void main(String[] args) {
        HashSet<Circle> hs = new HashSet<>();
        TreeSet<Circle> ts = new TreeSet<>();
        hs.add(new Circle(1,2,3));
        hs.add(new Circle(1,2,3));
        ts.add(new Circle(2,3,5));
        ts.add(new Circle(2,3,5));
        System.out.println(hs.size()+" "+ts.size());
    }
}


package main;

public class Vector {

    public int x;
    public int y;
    public int z;

    Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double length() {
        return Math.sqrt(x*x+y*y+z*z);
    }
    public double scalar(Vector v2) {
        return x*v2.x+y*v2.y+z*v2.z;
    }
    public double[] vector(Vector v2)  {
        double[] arr = new double[3];
        arr[0] = y*v2.z-z*v2.y;
        arr[1] = z*v2.x-x*v2.z;
        arr[2] = x*v2.y-v2.x*y;
        return arr;
    }
    public double angle(Vector v2) {
        return this.scalar(v2)/(Math.abs(this.length())*Math.abs(v2.length()));
    }
    
    public double[] summ(Vector v2) {
        double[] arr = new double[3];
        arr[0] = x+v2.x;
        arr[1] = y+v2.y;
        arr[2] = z+v2.z;
        return arr;
    }
    
    public double[] diff(Vector v2) {
        double[] arr = new double[3];
        arr[0] = x-v2.x;
        arr[1] = y-v2.y;
        arr[2] = z-v2.z;
        return arr;
    }
    
    public static Vector[] rand(int n) {
        Vector[] arr = new Vector[n];
        for (int i = 0; i < n; i++) {
            
            arr[i] = Vector((int) (Math.random() * 10), (int) (Math.random() * 10), (int) (Math.random() * 10));
        }
        return arr;
    }
}

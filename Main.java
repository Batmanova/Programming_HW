package main;

public class Main {

    public static void main(String[] args) {
        int c = 1;
        first(c, -1);
        int[] array = new int[] {1,2,3,4,5};
        System.out.println(binarySearch(array, 4, 0, array.length-1));
        double low = 0;
        double high = 10;
        System.out.println(find(low, high));
    }
    
    public static String first(int c, int n) {
        if (c <= n) {
            System.out.println(c);
            return first(c+1, n);
        } else {
            return "Done";
        }
    }
    
    public static int binarySearch( int [ ] a, int x, int low, int high ) {
        if( low > high ) {
            return -1;
        }
        int mid = ( low + high ) / 2;
        if( a[mid] < x) {
          return binarySearch( a, x, mid + 1, high );
        } else if( a[mid] > x) {
            return binarySearch( a, x, low, mid - 1 );
        }
        else {
            return mid;
        }
    }
    
    public static double find(double low, double high) { 
        double x = (low + high)/2;
        double res = Math.cos(Math.cos(Math.pow(x, 5)))+ Math.pow(x, 4) - 345.3*x - 23;
        if (res < -0.0001) {
            return find(low+x, high);
        } else if (res > 0.0001) {
            return find(low, high-x);
        } else {
            return x;
        }
    }
        
}

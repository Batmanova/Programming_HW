package main;

public class Main {

    public static void main(String[] args) {

    }
        public static Vector[] rand(int n) {
        Vector[] arr = new Vector[n];
        for (int i = 0; i < n; i++) {
            Vector a = new Vector((int) (Math.random() * 10), (int) (Math.random() * 10), (int) (Math.random() * 10));
            arr[i] = a;
        }
        return arr;
    }
}

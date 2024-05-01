/*
 * date-30/04/24
 * name- krish zinzuvadiya
 * Aim - Take 2D matrix with Integer values.
 * - Create number of thread = number of rows
 * - Each thread will calculate sum of elements of respective row.
 */

class Ex56 {
   public static void main(String[] args) {
      int a[][] = { { 8, 9, 10 }, { 5, 6, 9 }, { 3, 4, 5 } };
      Matrix m[] = new Matrix[10];
      for (int i = 0; i < a.length; i++) {
         m[i] = new Matrix("Row " + i, a, i);
         m[i].start();
         m[i].join();
      }
   }
}

class Matrix extends Thread {
   int a[][];
   int i;

   public Matrix(String name, int[][] a, int i) {
      super(name);
      this.a = a;
      this.i = i;
   }

   public void run() {
      Thread t = Thread.currentThread();
      int sum = 0;
      for (int j = 0; j < a[i].length; j++) {
         sum += a[i][j];
      }
      System.out.println(t.getName() + " Sum of Elements Is : " + sum);
   }
}
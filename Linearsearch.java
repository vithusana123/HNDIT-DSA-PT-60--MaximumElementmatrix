
public class Linearsearch {
public static void main(String[] args) {
     int[][] matrix ={{1, 2, 3},{4, 5, 6}};
     int maxElement = Integer.MIN_VALUE;
     for (int[] row : matrix) {
         for (int element : row) {
             if (element > maxElement) {
                 maxElement = element; 
             }
         }
     }
     System.out.println("Maximum Element = " + maxElement);
 }
}



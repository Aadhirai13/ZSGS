package febevaluation;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        rotate(arr);
        System.out.println();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotate(int[][] arr) {
        int n = arr.length;
           for (int i = 0; i < n / 2; i++) {
               for (int j = i; j < n - i - 1; j++) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][n-i-1];
                    arr[j][n-i-1] = arr[n - i - 1][n - j - 1];
                    arr[n - i - 1][n - j - 1] = arr[n-j-1][i];
                    arr[n - j - 1][i] = temp;
                }
            }
        }

    }
package Ex_004_JavaPrograms;

public class Lab009_InvertedRightAllignedTriangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) { //i=1, 2
            for (int k = 1; k < i; k++) { // k=1,
                System.out.print(" ");
            }
            for (int j = 1; j <= (n + 1) - i; j++) { //j=1,2,3,4,5
                System.out.print("*");
            }
            System.out.println();
        }
    }
        /*for(int i = n; i>=1; i--){
            for(int k=i;k<n;k++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){ //j=1,2,3,4,5
                System.out.print("*");
            }
            System.out.println();
        }
            }
        }*/
}
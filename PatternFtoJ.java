import java.util.Scanner;

public class PatternFtoJ{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the alphabet : ");
        int n = sc.nextInt();
        System.out.println();

        // To print the alphabet F
        System.out.println("The alphabet F will look like this : ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j==0 || i==0 && j<(n-1)/2 || i==(n-1)/2 && j<(n-1)/2){
                    System.out.print('*');
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        // To print the alphabet G
        System.out.println("The alphabet G will look like this : ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 && j>0 && j<(n-1) || j==0 && i>0 && i<(n-1) || i==(n-1) && j>0 && j<=(n-1) || j==(n-1) && i>=(n-1)/2 || i==(n-1)/2 && j>=(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                } 
            }
            System.out.println();
        }

        // To print the alphabet H
        System.out.println("The alphabet H will look like this : ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j==0 || j==(n-1) || i==(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // To print the alphabet I
        System.out.println("The alphabet I will look like this : ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 || i==(n-1) || j==(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // To print the alphabet J
        System.out.println("The alphabet J will look like this : ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 || j==(n-1) && i<(n-1)|| i==(n-1) && j>0 && j<(n-1) || j==0 && i>(n-1)/2 && i<(n-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

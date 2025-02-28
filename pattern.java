import java.util.Scanner;

class pattern{
    public static void main(String[] args) {

        // To take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the alphabet : ");
        int n = sc.nextInt();

        // To print the alphabet A
        System.out.println("The alphabet A will look like this : ");
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i==0 && j>0 && j<(n-1) || j==0 && i>0 || i==(n-1)/2  || j==(n-1) && i>0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }

        // To print the alphabet B
        System.out.println("The alphabet B will look like this : ");
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(j==0 || i==0 && j<((n-1)/2) || i==n-1 && j<((n-1)/2) || j==((n-1)/2) && i>0 && i<(n-1) || i==((n-1)/2) && j<((n-1)/2)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // To print the alphabet C
        System.out.println("The alphabet C will look like this : ");
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i==0 && j>0 && j<((n-1)/2) || j==0 && i>0 && i<(n-1) || i==(n-1) && j>0 && j<((n-1)/2)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // To print the alphabet D
        System.out.println("The alphabet D will look like this : ");
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(j==0 || i==0 && j<((n-1)/2) || j==((n-1)/2) && i>0 && i<(n-1) || i==(n-1) && j<((n-1)/2)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // To print the alphabet E
        System.out.println("The alphabet E will look like this : ");
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(j==0 || i==0 && j<((n-1)/2) || i==((n-1)/2) && j<((n-1)/2) || i==(n-1) && j<((n-1)/2)){
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
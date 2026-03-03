public class FullPyramid {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
public class  FullPyramidPattern {
    public static void main(String[] args) {
        
        for (int i = 5; i >= 1; i--) {   // Outer loop for rows
            
            for (char ch = 'A'; ch < 'A' + i; ch++) {  // Print letters
                System.out.print(ch + " ");
            }
            
            System.out.println();  // Move to next line
        }
    }
}
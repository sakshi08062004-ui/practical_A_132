public class InvertedPyramid {
    public static void main(String[] args) {
        for(int i=6;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
public class RightHalfPyramid {
    public static void main(String[] args) {
        
        int num = 1;  // Starting number
        
        for (int i = 1; i <= 5; i++) {        // Outer loop for rows
            
            for (int j = 1; j <= i; j++) {    // Inner loop for numbers in each row
                
                System.out.print(num + " ");
                
                num++;                        // Increase number
                
                if (num == 10) {              //  after 9
                    num = 1;
                }
            }
            
            System.out.println();             
        }
    }
}

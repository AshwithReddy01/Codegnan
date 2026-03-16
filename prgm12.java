
public class prgm12 {
    public static void main(String[] args) {
        int MyArray[][] = new int[3][];
         MyArray[0] = new int[1];
         MyArray[1] = new int[2]; 
         MyArray[2] = new int[3];
         MyArray[0][0] = 39;
         MyArray[1][0] = 40;
         MyArray[1][1] = 50;
         MyArray[2][0] = 50;
         MyArray[2][1] = 76;
         MyArray[2][2] = 89;

         for(int i =0;i<MyArray.length;i++){
            for(int j=0;j<MyArray[i].length;j++){
                System.out.print((MyArray[i][j] +" "));
            }
            System.out.println();
         }

    }
    
}

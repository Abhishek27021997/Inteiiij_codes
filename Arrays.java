import java.util.*;


                           //Program-1 (Minimum size of Arrays)

//class Arrays{
//    public static void main(String args[]){
//
//        int[] array={1,2,3,4,5,6,8,6,5,8,2,56,8,2,8,2,56,5,};
//        int[] arrays={4,5,5,8,22,5,82,2,12,8,2,2,5,4,1646,919,494,1,619,94,981,9819,491,919,94,94,996,1};
//
//        int size=Math.min(arrays.length,array.length);                    //Math Function to calculate min size
//
//        System.out.println("Min Size of the array" + size);
//    }
//}


                           //Program-2.1(Addition of Arrays (Same Size))

//public class Arrays {
//    public static void main(String[] args) {
//
//        int i;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the Size of Arrays:");
//        int size = sc.nextInt();
//
//        int[] array1 = new int[size];
//        int[] array2 = new int[size];
//
//
//        System.out.println("Enter the elements of First Arrays:");
//        for (i = 0; i < size; i++) {
//            array1[i] = sc.nextInt();
//        }
//
//        System.out.println("Enter the elements of Second Arrays:");
//        for (i = 0; i < size; i++) {
//            array2[i] = sc.nextInt();
//        }
//
//        System.out.println("Printing elements of both arrays");
//
//        for (i = 0; i < size; i++) {
//            System.out.print(array1[i] + " ");
//        }
//
//        System.out.println();
//
//        for (i = 0; i < size; i++) {
//            System.out.print(array2[i] + " ");
//        }
//
//        System.out.println();
//
//        int[] result=new int[size];
//
//        //perform addition
//        for(i=0;i<size;i++){
//            result[i]=array1[i] + array2[i];
//        }
//
//        System.out.print("Resultant addition of both arrays:");
//        for(i=0;i<size;i++){
//            System.out.print(result[i] + " ");
//        }
//    }
//}

                           //Program-2.2 (Addition of Two Arrays (Different Size))

//public class Arrays{
//    public static void main(String[] args) {
//
//        int i;
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the Size of Array1:");
//        int size1=sc.nextInt();
//        System.out.print("Enter the Size of Array2:");
//        int size2=sc.nextInt();
//
//        int[] array1=new int[size1];
//        int[] array2=new int[size2];
//
//
//        System.out.print("Elements of array1:");
//          for(i=0;i<size1;i++){
//              array1[i]=sc.nextInt();
//          }
//
//          System.out.println();
//
//        System.out.print("Elements of array2:");
//        for(i=0;i<size2;i++){
//            array2[i]=sc.nextInt();
//        }
//
//        int Minsize=Math.min(array1.length,array2.length);
//        int[] result=new int[Minsize];
//
//        //Addition of two Arrays
//        for(i=0;i<Minsize;i++){
//            result[i]=array1[i]+array2[i];
//        }
//        System.out.print("Addition of two arrays: [");
//        for(i=0;i<Minsize;i++){
//            System.out.print(result[i] + " ");
//           if (i < result.length - 1) {
//               System.out.print(", ");
//            }
//        }
//
//        System.out.println("]");
//    }
//}

                               //Program-3(find Largest element in an array)

//class Arrays {
//    public static void main(String[] args){
//
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter Size:");
//        int size=sc.nextInt();
//        int[] array=new int[size];
//
//        System.out.print("Enter Elements:");
//        for(int i=0;i<size;i++){
//            array[i]=sc.nextInt();
//        }
//
//        int max=array[0];
//        for(int i=0;i<array.length;i++){
//            if(array[i]> max){
//                max=array[i];
//            }
//        }
//        System.out.println("Largest element of Arrays is: " + max);
//    }
//}

                                 //Program-4(Program to Find the Transpose)

//class Arrays{
//    public static void main(String[] args){
//
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the size:");
//        int size=sc.nextInt();
//
//        int[][] matrix=new int[size][size];
//
//        System.out.println("Enter the elements:");
//
//        for(int i=0;i<size;i++){
//            for(int j=0;j<size;j++){
//                matrix[i][j]=sc.nextInt();
//            }
//            System.out.println();
//        }
//
//        System.out.println("Printing the elements:");
//
//        for(int i=0;i<size;i++){
//            for(int j=0;j<size;j++){
//                System.out.print(matrix[j][i] + " ");
//            }
//            System.out.println();
//        }
//    }
//}
                             //Program-5(Copy All the Elements of One Arrays to Another Arrays)

//class Arrays{
//    public static void main(String[] args){
//
//        Scanner sc=new Scanner(System.in);
//        int size=sc.nextInt();
//
//        int[] a=new int[size];
//        int[] b=new int[a.length];
//
//        for(int i=0;i<size;i++){
//            a[i]=sc.nextInt();
//        }
//
//        b=a;
//
//        //Printing
//        for(int i=0;i<size;i++){
//            System.out.print(a[i] + ",");
//        }
//
//        System.out.println();
//
//        for(int i=0;i<a.length;i++) {
//            System.out.print(b[i] + " ");
//        }
//    }
//}

                            //Program-6(Program to Check Whether Two Matrix Are Equal or Not)

//class Arrays{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter the number of rows for the matrices: ");
//        int rows = sc.nextInt();
//
//        System.out.print("Enter the number of columns for the matrices: ");
//        int columns = sc.nextInt();
//
//        int[][] matrix1 = new int[rows][columns];
//        int[][] matrix2 = new int[rows][columns];
//
//        System.out.println("Enter the elements of the first matrix:");
//
//        // Input elements for the first matrix
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                matrix1[i][j] = sc.nextInt();
//            }
//        }
//
//        System.out.println("Enter the elements of the second matrix:");
//
//        // Input elements for the second matrix
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                matrix2[i][j] = sc.nextInt();
//            }
//        }
//
//        // Compare matrices for equality
//        boolean isEqual = true;
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                if (matrix1[i][j] != matrix2[i][j]) {              //Comparing two Matrix
//                    isEqual = false;
//                    break;
//                }
//            }
//        }
//
//        if (isEqual) {
//            System.out.println("The two matrices are equal.");
//        } else {
//            System.out.println("The two matrices are not equal.");
//        }
//    }
//}

                                  //Program-7 (Compute the Sum of Diagonals of a Matrix)

//class Arrays{
//    public static void main(String[] args){
//
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the size of Row:");
//        int row=sc.nextInt();
//        System.out.print("Enter the size of Column:");
//        int col=sc.nextInt();
//
//        int[][] matrix=new int[row][col];
//
//        for(int i=0;i<row;i++){
//            for(int j=0;j<col;j++){
//                matrix[i][j]=sc.nextInt();
//            }
//
//        }
//
//        //Primary Diagonal
//
//        int Pri_Diagonal=0;
//        for(int i=0;i<row;i++){
//            Pri_Diagonal+=matrix[i][i];
//        }
//
//        //Secondary Diagonal
//
//        int Sec_Diagonal=0;
//        for(int i=0;i<row;i++){
//            Sec_Diagonal+=matrix[row-i-1][i];
//        }
//
//        //Printing the Sum of Diagonal
//
//        System.out.print("Sum of Primary Diagonal:");
//        System.out.println(Pri_Diagonal);
//        System.out.print("Sum of Secondary Diagonal:");
//        System.out.println(Sec_Diagonal);
//
//        int Result=Pri_Diagonal+Sec_Diagonal;
//
//        System.out.print("Total Result:");
//        System.out.println(Result);
//    }
//}

                              //Program-8




import java.util.*;

                          //(Simple Array Program)
//public class Arrays {
//    public static void main(String[] args){
//
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the size:");
//        int size=sc.nextInt();
//
//        int[] array=new int[size];
//
//        for(int i=0;i<size;i++){
//            System.out.println(i);
//        }
//    }
//}

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
//        System.out.println("Enter the elements of First Array:");
//        for (i = 0; i < size; i++) {
//            array1[i] = sc.nextInt();
//        }
//
//        System.out.println("Enter the elements of Second Array:");
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

public class Arrays{
    public static void main(String[] args) {

        int i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of Array1:");
        int size1=sc.nextInt();
        System.out.print("Enter the Size of Array2:");
        int size2=sc.nextInt();

        int[] array1=new int[size1];
        int[] array2=new int[size2];


        System.out.print("Elements of array1:");
          for(i=0;i<size1;i++){
              array1[i]=sc.nextInt();
          }

          System.out.println();

        System.out.print("Elements of array2:");
        for(i=0;i<size2;i++){
            array2[i]=sc.nextInt();
        }

        int Minsize=Math.min(array1.length,array2.length);
        int[] result=new int[Minsize];

        //Addition of two Arrays
        for(i=0;i<Minsize;i++){
            result[i]=array1[i]+array2[i];
        }
        System.out.println("Addition of two arrays:");
        for(i=0;i<Minsize;i++){
            System.out.print(result[i] + " ");
        }
    }
}






//public class Arrays {
//    public static void main(String[] args) {
//        int[] array1 = {1, 2, 3, 4, 5};
//        int[] array2 = {6, 7, 8};
//
//        int minLength = Math.min(array1.length, array2.length);
//        int[] sumArray = new int[minLength];
//
//        for (int i = 0; i < minLength; i++) {
//            sumArray[i] = array1[i] + array2[i];
//        }
//
//        System.out.print("Sum of arrays: [");
//        for (int i = 0; i < sumArray.length; i++) {
//            System.out.print(sumArray[i]);
//            if (i < sumArray.length - 1) {
//                System.out.print(", ");
//            }
//        }
//        System.out.println("]");
//    }
//}





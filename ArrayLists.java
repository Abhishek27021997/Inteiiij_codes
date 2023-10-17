import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {
    public static void main(String[] args){

        ArrayList<Integer> list=new ArrayList<>();

     //Adding elements
        list.add(7);
        list.add(3);
        list.add(9);

        System.out.println(list);

    //Add element in between
        list.add(0,1);
        list.add(3,4);

        System.out.println(list);

    //Get operation
        int var1=list.get(1);
        System.out.println("[" + var1 + "]");


    //Set element
        list.set(2,0);
        System.out.println(list);

    //delete element
        list.remove(2);
        System.out.println(list);

    //Size
        int size=list.size();
        System.out.println(size);

    //Looping
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();

    //Sorting
        Collections.sort(list);
        System.out.println(list);
    }
}

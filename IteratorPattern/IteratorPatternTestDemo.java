package IteratorPattern;

/**
 * Created by Ajay on 9/1/2016.
 */
public class IteratorPatternTestDemo {

    public static void main(String args[]) {
        carCollection col = new carCollection();

        Iterator itr = col.getIterator(); // get iterator object

        while(itr.hasNext()==true){ // iterate over it untill it returns null

            System.out.println("Cars:"+itr.next().toString());

        }



    }




}

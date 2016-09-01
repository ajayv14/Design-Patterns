package IteratorPattern;

/**
 * Created by Ajay on 9/1/2016.
 */
public class carCollection implements Icontainer {

// cars array to be iterated upon
    String cars[] = {"Tesla","VW","Audi","BMW"};

// implementation of abstract method getIterator in Icontainer
public Iterator getIterator(){
       //some iterator instance
        carIterator itr = new carIterator();
        return itr;
}

private class carIterator implements Iterator {

    int pointer;

    // implementation for abstract method hasNext()
    public boolean hasNext() {

        if (pointer < cars.length) return true; // the pointer.next() is not null
        else return false;
    }

    //implementation for abstract method next()
    public Object next() {

        if (this.hasNext()) {
               return cars[pointer++];

        } else return null;
    }


}

}

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterator {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<String>();
        //set does not allow null values
        hashSet.add("pear");
        hashSet.add("pear");
        hashSet.add("Apple");
        hashSet.add("papaya");
        hashSet.add("Bananna");
        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        for(String h: hashSet){
            System.out.println(h);
        }

        if(hashSet.contains("Apple")){
            System.out.println("Apple is there");
        }else{
            System.out.println("Apple is not there");
        }
    }

}

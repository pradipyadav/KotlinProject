import android.os.Build;
import android.support.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
/**
 * Created by sony on 25/3/18.
 */
public class CollectionJava
{
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {
        //List
        ArrayList<String> list=new ArrayList<String>();
        list.add("Android");
        list.add("Kotlin");
        list.add("Java");
        list.add("Angularjs");
        list.add("php");
        for(String obj:list)
            System.out.println("ArrayList "+obj);
        //HashMap
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(1,"Android");
        hm.put(2,"Kotlin");
        hm.put(3,"Java");
        hm.put(4,"Angularjs");
        hm.put(5,"Android");
        hm.put(6,"php");
        System.out.println("HashMap "+hm);
        //HashSet
        HashSet<String> set=new HashSet<String>();
        set.add("Android");
        set.add("Kotlin");
        set.add("Java");
        set.add("Angularjs");
        set.add("php");
        System.out.println("HashSet "+set);
    }
}

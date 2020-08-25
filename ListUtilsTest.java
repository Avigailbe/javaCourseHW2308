package home_work2308;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ListUtilsTest extends TestCase {


    //using newly created interface
    public void testForEachWithDelayNew() throws InterruptedException {
        List<String> petList = List.of("Dog","Cat","Horse","Tiger","Fish","Parrot");
        List<String> reversedList = new ArrayList<>();

/*      ListUtils.forEachWithDelayNew(petList, 2000, new Order<String>() {
            @Override
            public void reverse(String t1) {
                String reverse = new StringBuilder(t1).reverse().toString();
                System.out.println("element = " + reverse);
                reversedList.add(reverse);
            }*/

        System.out.println("List before reversal (new interface):");
        ListUtils.forEachWithDelayNew(petList, 200, t1 -> String.valueOf(reversedList.add(new StringBuffer(t1).reverse().toString())));
        System.out.println("List after reversal (new interface):");
        ListUtils.forEachWithDelayNew(reversedList, 200, s2 ->{} );
    }

    //using existing interface
    public void testForEachWithDelayExisting() throws InterruptedException {
        List<String> farmList = List.of("cow","sheep","goat","chicken","horse","duck");
        List<String> reversedList = new ArrayList<>();
        System.out.println("List before reversal (existing interface):");
        ListUtils.forEachWithDelayExisting(farmList, 200, (Consumer<String>) s1 -> String.valueOf(reversedList.add(new StringBuilder(s1).reverse().toString())));
        System.out.println("List after reversal (existing interface):");
        ListUtils.forEachWithDelayNew(reversedList, 200, s1 ->{} );
    }
}
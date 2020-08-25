package home_work2308;

import java.util.List;
import java.util.function.Consumer;

//add 3rd param to method which will be action that should be invoked
//on each list element with delay  between iterations
//2 solutions:
//1.with interface that you create
//2.with existing interface

public class ListUtils {

    //with new interface
    public static <T> void forEachWithDelayNew(List<T> list, int delay, Order<T> order) throws InterruptedException {
        for (T t1 : list){
            order.reverse(t1);
            Thread.sleep(delay);
            System.out.println(t1);
        }
    }

    //with existing interface
    public static <T> void forEachWithDelayExisting(List<T> list, int delay, Consumer<T> consumer) throws InterruptedException {
        for (T t1 : list){
            consumer.accept(t1);
            Thread.sleep(delay);
            System.out.println(t1);
        }
    }
}

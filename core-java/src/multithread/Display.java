package multithread;
import java.util.concurrent.locks.*;
public class Display {
                ReentrantLock l= new ReentrantLock();
                public void wish(String name) {
                           l.lock();
                }
}

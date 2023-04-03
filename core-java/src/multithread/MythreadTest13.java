package multithread;

public class MythreadTest13 extends Thread {
           Mythread13 t;
           String name;
           public MythreadTest13() {
			             this.t=t;
			             this.name=name;
		}
           public void  run() {
        	              t.wish(name);
           }
}

package multithread;

public class ThreadGroupDemo2 {

	public static void main(String[] args) throws Exception {
	
                              ThreadGroup pg=new ThreadGroup("parentGroup");
                              ThreadGroup cg=new ThreadGroup(pg,"childGroup");
                              MythreadDemo t1=new MythreadDemo(pg,"childThread1");
                              MythreadDemo t2=new MythreadDemo(pg,"childThread2");
                              t1.start();
                              t2.start();
                              System.out.println(pg.activeCount());
                              System.out.println(pg.activeGroupCount());
                              pg.list();
                              Thread.sleep(10000);
                              System.out.println(pg.activeCount());
                              System.out.println(pg.activeGroupCount());
                              pg.list();
                              
                              
	}

}

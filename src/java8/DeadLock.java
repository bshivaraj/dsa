package java8;

public class DeadLock {
    public static void main(String[] args) {
       Pen pen=new Pen();
       Paper paper=new Paper();

       Runnable r1= () -> pen.writeWithPenAndPaper(paper);
       Runnable r2= () -> paper.writeWithPaperAndPen(pen);

       Thread t1=new Thread(r1);
       Thread t2=new Thread(r2);

       t1.start();
       t2.start();
    }
}
class Pen{

    synchronized public void writeWithPenAndPaper(Paper paper){
      System.out.println(Thread.currentThread().getName()+" finished using pen "+this);
      paper.finishWriting();
    }

     synchronized public void finishWriting(){
        System.out.println("paper...!");
    }

}
class Paper{

    synchronized public void writeWithPaperAndPen(Pen pen){
        System.out.println(Thread.currentThread().getName()+" finished using paper "+this);
        pen.finishWriting();
    }

     synchronized public void finishWriting(){
        System.out.println("pen...!");
    }

}

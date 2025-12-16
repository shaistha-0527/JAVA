class CollegeThread extends Thread {
    public void run() {
        try {
            for(int i=0;i<4;i++) {
                System.out.println("BMS College of Engineering");
                Thread.sleep(10000); // 10 seconds
            }
        } catch (InterruptedException e) {
            System.out.println("College Thread interrupted");
        }
    }
}

class CSEThread extends Thread {
    public void run() {
        try {
             for(int i=0;i<4;i++){
                System.out.println("CSE");
                Thread.sleep(2000); // 2 seconds
            }
        } catch (InterruptedException e) {
            System.out.println("CSE Thread interrupted");
        }
    }
}

public class Threaddemo {
    public static void main(String[] args) {
        CollegeThread t1 = new CollegeThread();
        CSEThread t2 = new CSEThread();

        t1.start();
        t2.start();
    }
}

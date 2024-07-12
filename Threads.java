//Works with OS Scheduler

// class A implements Runnable{
//     public void run() {
//         for(int i = 1; i <= 5; i++){
//             System.out.println("A Class");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

class B extends Thread{
    public void run() {
        for(int i = 1; i <= 5; i++){
            System.out.println("B Class");
            try {
                Thread.sleep(11);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// class C extends A {
//     System.out.println("Class C");
// }

public class Threads {
    
    public static void main(String args[]) {

        // Runnable obj1 = new A();
        // Runnable obj1 = new Runnable() {
        //     public void run() {
        //         for(int i = 1; i <= 5; i++){
        //             System.out.println("A Class");
        //             try {
        //                 Thread.sleep(10);
        //             } catch (InterruptedException e) {
        //                 e.printStackTrace();
        //             }
        //         }
        //     }
        // };

        Runnable obj1 = () -> {
                for(int i = 1; i <= 5; i++) {
                    System.out.println("A Class");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
            }
        };

        Runnable obj2 = new B();

        // System.out.println(obj1.getPriority());

        // obj2.setPriority(Thread.MAX_PRIORITY);

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }
}

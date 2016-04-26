class Thread1 implements Runnable{
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(i);
			}
		}
	}
class Thread2 implements Runnable{
	public void run(){
		for(int i=11;i<=20;i++){
			System.out.println(i);
			}
		}
	}
class Thread3 implements Runnable{
	public void run(){
		for(int i=21;i<=30;i++){
			System.out.println(i);
			}
		}
	}
class ThreadDemo2{
	public static void main(String args[]){
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		Thread th3 = new Thread(t3);
		th1.start();
		th2.start();
		th3.start();
		}
	}
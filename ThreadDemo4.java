class Thread1 extends Thread{
	int sum=0;
	public void run(){
		for(int i=1;i<=10;i++){
			sum=sum+i;
			}
		}
	}
class Thread2 extends Thread{
	int sum=0;
	public void run(){
		for(int i=11;i<=20;i++){
			sum=sum+i;
			}
		}
	}
class Thread3 extends Thread{
	int sum=0;
	public void run(){
		for(int i=21;i<=30;i++){
			sum=sum+i;
			}
		}
	}
class ThreadDemo4{
	public static void main(String args[])throws InterruptedException{
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		t2.setPriority(10);
		int val = t3.getPriority();
		System.out.println(val);
		t1.start();
		t2.start();
		t3.start();
		t1.join();
		t2.join();
		t3.join();
		System.out.println(t1.sum);
		System.out.println(t2.sum);
		System.out.println(t3.sum);
		System.out.println(t1.sum+t2.sum+t3.sum);
		}
	}
package assignment2;

public class Reader implements Runnable {
	private boolean writer;
	private Buffer buffer;
	private Writer w;
	private Thread t1;
	private GUIMutex gui;
	
	
	public Reader(Buffer b, GUIMutex gui){
		this.gui=gui;
		t1 = new Thread(this);
		this.buffer=b;
	}
	@Override
	public void run() {
		
		while(writer){
			System.out.println("sejhak");
		
		}
		System.out.println("erik");
		gui.setReader(buffer.getChar()+".");
		w.setReading(false);
		
	}
	public void start(){
		t1.start();
	}
	public void setWriter(boolean b){
		writer = b;
	}
	public void writer(Writer r){
		this.w=r;
	}
	
	
}

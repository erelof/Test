package assignment2;

public class Writer implements Runnable {
	
	private Thread t1;
	
	private boolean reading = true;
	private Reader r; 
	private Buffer buffer = new Buffer();
	private char charArr[];
	private GUIMutex gui;
	private int i=0;
	public Writer(Buffer b, GUIMutex gui){
		this.gui=gui;
		t1 = new Thread(this);
		this.buffer=b;
	}

	@Override
	public void run() {
		
		while(reading){
			System.out.print("LÄS vänta");
		
		
		}
		
		System.out.print("LÄS");
		buffer.setChar(charArr[i]);
		gui.setWriter(charArr[i]+".");	
		i++;
		r.setWriter(false);
		
		
	
	}
	public void array(char[] array){
		charArr = array;
		for(int i =0; i<array.length;i++){
		System.out.print(array[i]);
		}
	}
	public void setReading(boolean b){
		reading = b;
	}
	public void start(){
		t1.start();
	}
	public void reader(Reader r){
		this.r = r ;
	}
	
}

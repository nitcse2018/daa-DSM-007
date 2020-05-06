
public class ProducerConsumerBox {

	private String message;
	private boolean hasMessage;
	
	//producer
	public synchronized void putmeassage(String message) {
		// no space
		while(hasMessage) {
			try {
				wait();   //release the lock(resource) of this object
				          //and pause
			}
			catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		//if space is available
		hasMessage = true;
		this.message = message;
		//acquire the lock(resource) and awake the other
		notify();
	}
	
	//consumer
	public synchronized String getmeassage() {
		//if space is available
		while(!hasMessage) {
			//relase the lock
			try {
				wait(); 
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		//if space is full
		hasMessage = false;
		notify();
		return message;
	}

}


public class ProducerConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final ProducerConsumerBox box = new ProducerConsumerBox();
		
		Thread producerThread = new Thread() {
	        //abstract method override
			public void run() {
				System.out.println("producer started ...");
				box.putmeassage("I am sending SOS message");
				System.out.println("SOS message is sent");
			}
		};
		
		Thread ConsumerThread = new Thread() {
			//abstract method override
			public void run() {
				System.out.println("consumer thread started....");
				for(int i =1;i<3;i++) {
					System.out.println("Consumer thread get '"+ box.getmeassage()+"'");
				}
			}
		};
		ConsumerThread.start();
		producerThread.start();
	}

}

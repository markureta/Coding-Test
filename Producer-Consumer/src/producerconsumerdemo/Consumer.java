package producerconsumerdemo;

public class Consumer extends Thread {

	
	  private Producer producer;

	    public Consumer(Producer producer) {
	        this.producer = producer;
	    }

	    @Override
	    public void run() {
	        try {
	            while (true) {
	                String item = producer.consume();
	                System.out.println("Fetched by  " + Thread.currentThread().getName() );
	                Thread.sleep(2000);
	            }
	        } catch (Exception exp) {
	        }
	    }
}

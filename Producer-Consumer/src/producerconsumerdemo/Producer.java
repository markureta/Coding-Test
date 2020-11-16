package producerconsumerdemo;


import java.util.ArrayList;
import java.util.List;

public class Producer extends Thread {

	  private static final int LIMIT = 4;
	    private final List<String> product = new ArrayList<>();

	    @Override
	    public void run() {
	        try {
	            while (true) {
	                produce();
	            }
	        } catch (Exception exp) {
	        }
	    }

	    private synchronized void produce() throws Exception {
	        while (product.size() == LIMIT) {
	            System.out.println("Queue limit reached. Waiting for consumption");
	            wait();
	            System.out.println("Consumer get product from producer");
	        }
	        String item = "Dummy product";
	        product.add(item);
	        System.out.println("Product created --> Total product in queue : "+product.size());
	        notify();
	    }

	    public synchronized String consume() throws Exception {
	        notify();
	        while (product.isEmpty()) {
	            wait();
	        }
	        String item = product.get(0);
	        product.remove(item);
	        return item;
	    }
}

package producerconsumerdemo;

public class MainClass {
	 public static void main(String[] args) {
	     
		 
		 startingpoint();
	    }
	 
	 
 static void	 startingpoint(){
		   Producer producer = new Producer();
	        producer.setName("Producer");
	        producer.start();
	        Consumer consumer = new Consumer(producer);
	        consumer.setName("Consumer1");
	        consumer.start();
	        Consumer consumer1 = new Consumer(producer);
	        consumer1.setName("Consumer2");
	        consumer1.start();
	        Consumer consumer2 = new Consumer(producer);
	        consumer2.setName("Consumer3");
	        consumer2.start();
	 }
}

package prg7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  MessageBoard board = new MessageBoard();
	        Producer p = new Producer(board);
	        Consumer c = new Consumer(board);

	        p.start();
	        c.start();

	}

}

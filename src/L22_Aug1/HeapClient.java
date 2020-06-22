package L22_Aug1;


public class HeapClient {

	public static void main(String[] args) {

		Heap heap = new Heap();
		heap.add(10);
		heap.add(5);
		heap.display();
		heap.add(100);
		heap.display();
		heap.add(3);
		heap.display();
		heap.add(2);
		heap.display();
		heap.add(1);
		heap.display();
		
		System.out.println(heap.remove());
		heap.display();
		System.out.println(heap.remove());
		System.out.println(heap.remove());
		System.out.println(heap.remove());
		System.out.println(heap.remove());
		System.out.println(heap.remove());

	}

}

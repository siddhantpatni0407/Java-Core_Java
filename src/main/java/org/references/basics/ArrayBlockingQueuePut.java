package org.references.basics;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueuePut {

	public static void main(String[] args) {
		// define capacity of ArrayBlockingQueue
		int capacity = 3;

		try {
			// Create object of ArrayBlockingQueue
			ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(capacity);

			// Add elements to ArrayBlockingQueue
			queue.put(
					"Lorem Ipsum，也称乱数�?�文或者哑元文本， 是�?�刷�?�排版领域所常用的虚拟文字。由于曾�?一�?�匿�??的打�?�机刻�?打乱了一盒�?�刷字体从而造出一本字体样�?书，Lorem Ipsum从西元15世纪起就被作为此领域的标准文本使用。它�?仅延续了五个世纪，还通过了电�?排版的挑战，其�?形�?��?然�?存至今。在1960年代，�?Leatraset�?公�?��?�布了�?�刷�?�Lorem Ipsum段�?�的纸张，从而广泛普�?�了它的使用。最近，计算机桌�?�出版软件�?Aldus PageMaker�?也通过�?�样的方�?使Lorem Ipsum�?�入大众的视野。\n\n");
			queue.put(
					"Lorem Ipsum，也称乱数�?�文或者哑元文本， 是�?�刷�?�排版领域所常用的虚拟文字。由于曾�?一�?�匿�??的打�?�机刻�?打乱了一盒�?�刷字体从而造出一本字体样�?书，Lorem Ipsum从西元15世纪起就被作为此领域的标准文本使用。它�?仅延续了五个世纪，还通过了电�?排版的挑战，其�?形�?��?然�?存至今。在1960年代，�?Leatraset�?公�?��?�布了�?�刷�?�Lorem Ipsum段�?�的纸张，从而广泛普�?�了它的使用。最近，计算机桌�?�出版软件�?Aldus PageMaker�?也通过�?�样的方�?使Lorem Ipsum�?�入大众的视野。\n\n");
			queue.put(
					"Lorem Ipsum，也称乱数�?�文或者哑元文本， 是�?�刷�?�排版领域所常用的虚拟文字。由于曾�?一�?�匿�??的打�?�机刻�?打乱了一盒�?�刷字体从而造出一本字体样�?书，Lorem Ipsum从西元15世纪起就被作为此领域的标准文本使用。它�?仅延续了五个世纪，还通过了电�?排版的挑战，其�?形�?��?然�?存至今。在1960年代，�?Leatraset�?公�?��?�布了�?�刷�?�Lorem Ipsum段�?�的纸张，从而广泛普�?�了它的使用。最近，计算机桌�?�出版软件�?Aldus PageMaker�?也通过�?�样的方�?使Lorem Ipsum�?�入大众的视野。");

			System.out.println("Queue contains: " + queue);

		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}
}

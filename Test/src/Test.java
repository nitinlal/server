import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Test {

	InsertList getInnerInstance() {
		return new InsertList(); // static inner class ??nnk
	}

	public static void main(String[] args) {
		String a = "something";
		String b = "nothing";
		Integer one = 1;
		Integer two = 2;

		System.out.printf("%s is better then %s", a, b);
		System.out.printf("%d plus %d is equal to %d", one, one, two);

		Integer[] intArray = { 4, 5, 1, 2, 8, 4, 0, 3 };

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for (int i : intArray)
			pq.add(i);
		System.out.println("\n");
		System.out.println(pq);

		System.out.println("\n After Sorting: \n");

		// priority queue
		Test test = new Test();
		sortInt soInt = test.new sortInt();
		PriorityQueue<Integer> sortedPq = new PriorityQueue<Integer>(10, soInt);

		for (int i : intArray)
			sortedPq.add(i);
		System.out.println(sortedPq);

		List<Comparable> list = new ArrayList<Comparable>();
		list.add(new String("nitin"));
		list.add(new Integer(28));
		System.out.println(list);

		/**
		 * playing with unsafe generic code
		 */

		List<Integer> odd = new ArrayList<Integer>();
		odd.add(3);
		odd.add(5);

		List<Integer> even = new ArrayList<Integer>();
		even.add(2);
		even.add(4);

		InsertList insertList = new InsertList();
		List result = insertList.insert(odd, even);
		System.out.println();
		System.out.println(result);

		InsertList insertList2 = new InsertList();
		System.out.println();
		System.out.println(insertList2.getList());

		/**
		 * 
		 * Generics are awesome for maintaining type safety
		 * 
		 * I can use it for seperating out children of a common parent.
		 * 
		 */
		Being<Human> human = new Human();
		human.setAge(5);

		Being<Alien> alien = new Alien();
		alien.setAge(5000);

		Adder adder = new Adder();
		adder.add(human);

	}

	static class Adder {

		Integer add(Being<? extends Human> human) {
			return null;

		}
	}

	static class Human implements Being<Human> {

		private Integer age = 0;

		@Override
		public void setAge(Integer age) {

			this.age = age;
		}

	}

	static class Alien implements Being<Alien> {

		private Integer age = 0;

		@Override
		public void setAge(Integer age) {
			this.age = age;
		}

	}

	static interface Being<T> {

		void setAge(Integer age);
	}

	/**
	 * inner class implements comparator
	 * 
	 * @author nitin
	 * 
	 */
	class sortInt implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return 01 - 02;
		}
	}

	@SuppressWarnings(value = { "all" })
	static class InsertList {

		private List list = new ArrayList();

		List insert(List... lists) {
			for (List list : lists) {
				this.list.addAll(list);
			}
			return list;
		}

		List getList() {
			return list;
		}
	}

}

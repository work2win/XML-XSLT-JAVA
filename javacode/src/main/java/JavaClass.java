
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.Lock;


class Item{
	public void doProcess() {}
	public void getCount() {}
}

public class JavaClass implements Runnable{
	
	private Item item;
	private Lock lock;

	
	public JavaClass(Item item) {
		this.item = item;
	}
	public static void main(String[] arg) {
		// TODO Auto-generated method stub
			List<String> list = Arrays.asList("dog","over","good");
			list.stream().reduce((x1,x2)-> x1.length()> x2.length()?x1:x2).ifPresent(System.out::println);
			list.stream().reduce((x1,x2)->x1.length()==3? x1:x2).ifPresent(System.out::println);
			//System.out.println(//list.stream().reduce(new Character(), (Character s1,s2)-> s1+s2.charAt(0),(c1,c2)0>c+=c2));
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		item.doProcess();
		item.getCount();
	}
	
	

}

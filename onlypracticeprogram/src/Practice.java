import java.util.ArrayList;

public class Practice {
	public static void main(String[] args) {
		ArrayList arrayList=new ArrayList<Object>();
		arrayList.add(123);
		arrayList.add("sadanand");
		int max=10;
		int min=1;
		for (Object object : arrayList) {
			int b=(int)(Math.random()*(max-min+1)+min);
			System.out.println(b);
			break;
		}
	}
}

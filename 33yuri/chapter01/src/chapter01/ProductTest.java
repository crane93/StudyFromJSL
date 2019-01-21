package chapter01;

class Product{
	static int count = 0;
	int serialNo;
	{
		++count;
		serialNo = count;
	}
}
public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();

		System.out.println("p1의 제품번호는: " + p1.serialNo);
		System.out.println("p2의 제품번호는: " + p2.serialNo);
		System.out.println("p3의 제품번호는: " + p3.serialNo);
		System.out.println(Product.count);
	}

}

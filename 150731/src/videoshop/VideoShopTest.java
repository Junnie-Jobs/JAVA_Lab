package videoshop;

public class VideoShopTest {

	public static void main(String[] args) {
		
		IQueue vShop = new VideoShop();
		vShop.enQueue("matrix1");
		vShop.enQueue("matrix2");
		vShop.enQueue("matrix3");
		
		System.out.println(vShop.deQueue());
		System.out.println(vShop.deQueue());
		System.out.println(vShop.deQueue());
	}

}

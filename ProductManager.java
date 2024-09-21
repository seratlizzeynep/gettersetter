package encapsulationgettersetter;

public class ProductManager {


	public void Add(Product urun) {
		
		System.out.println("Ürün eklendi: " +  urun.name  );
		System.out.println( "Ürün id: " + urun.id);
		System.out.println( "Ürün aciklamasi : " + urun.description);
		System.out.println( "Ürün stogu: " + urun.stockAmount);
		System.out.println( "Ürün fiyati:" + urun.price);
	}
}

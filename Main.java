package encapsulationgettersetter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product urun = new Product();
		urun.name= "Laptop";
		urun.id = 1;
		urun.description = "Asus Laptop";
		urun.price = 50000;
		urun.stockAmount = 43;
		
		ProductManager urunyonetici= new ProductManager();
		urunyonetici.Add(urun);
	}

}

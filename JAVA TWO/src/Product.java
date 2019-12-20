
public class Product {
	private long id;
	private String productName;
	private String supplierName;
	
	public Product(long id, String productName, String supplierName) {
		super();
		this.id = id;
		this.productName = productName;
		this.supplierName = supplierName;
	}
	public Product() {
	}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}	
	public void display()
	{
		System.out.println("Product id \n" + getId());
		System.out.println("Product Name is \n " +getProductName());
		System.out.println("Supplier Name is \n " +getSupplierName());
}
}
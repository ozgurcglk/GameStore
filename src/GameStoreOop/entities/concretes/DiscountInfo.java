package GameStoreOop.entities.concretes;

public class DiscountInfo {
	private int id;
	private String catchline;
	private int discount;
	
	public DiscountInfo() {
		super();
	}

	public DiscountInfo(int id, String catchline, int discount) {
		super();
		this.id = id;
		this.catchline = catchline;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCatchline() {
		return catchline;
	}

	public void setCatchline(String catchline) {
		this.catchline = catchline;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	
}

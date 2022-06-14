package day0428;

public class TestVO {
	private String name,msg;
	
	

	public TestVO() {
		super();
	}

	public TestVO(String name, String msg) {
		super();
		this.name = name;
		this.msg = msg;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "TestVO [name=" + name + ", msg=" + msg + "]";
	}
	
	
	
}

package myspring.di.xml;

public class StringPrinter implements Printer {
	private StringBuffer buffer = new StringBuffer();

	public void print(String message) {
		// TODO Auto-generated method stub
		this.buffer.append(message);
	}
	public String toString() {
		return this.buffer.toString();
	}

}

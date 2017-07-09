package myspring.di.xml;

public class Hello {
	String name;
	Printer printer;
	
	public Hello(){}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	public String sayHello(){
		 return "hello" + name;
	
	}
	public void print(){
		this.printer.print(sayHello());
	}
	
	
}

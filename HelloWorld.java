package com.acn;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld hello = new HelloWorld();
		hello.showHello(args);
		//hello.showArgs(args);
	}

	private void showHello(String[] args) {
		String name = (args.length > 0) ? args[0] : "anonymous";
		System.out.println("Hello  " + name);
	} 
	
	

}

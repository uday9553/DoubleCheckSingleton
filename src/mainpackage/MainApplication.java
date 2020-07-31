package mainpackage;

import SingletonPackage.SingletonClass;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start;
		long stop;
		start=System.currentTimeMillis();
		SingletonClass singletonClass=SingletonClass.getSingletonClassInstance();
		stop=System.currentTimeMillis();
		System.out.println("instance created in "+ (stop-start) + "   milliseconds  instance is "+ singletonClass);
		
		start=System.currentTimeMillis();
		SingletonClass singletonClass1=SingletonClass.getSingletonClassInstance();
		stop=System.currentTimeMillis();
		System.out.println("instance created in "+ (stop-start)+ "  milliseconds instance is "+ singletonClass1);
		
		
		
	}

}

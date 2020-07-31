package SingletonPackage;

public class SingletonClass {
	
	private static volatile SingletonClass singletonClassInstance;
	
	private SingletonClass() {
		if(singletonClassInstance!=null) {
			throw new RuntimeException("instance already created");
		}
	}
	
	public static SingletonClass getSingletonClassInstance() {
		
		if(singletonClassInstance==null) {
			synchronized (SingletonClass.class) {
				
				if(singletonClassInstance==null) {
					singletonClassInstance=new SingletonClass();
				}
			}
		}
		return singletonClassInstance;
	}

}

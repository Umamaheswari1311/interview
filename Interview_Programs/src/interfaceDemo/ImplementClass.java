package interfaceDemo;

public class ImplementClass implements NewProject,OtherProjectInterface {
	@Override
	public void method() {
		System.out.println("method");
		
	}

	@Override
	public void method2() {
		System.out.println("method2 ");
		
	}

	@Override
	public void methodOne() {
		System.out.println("methodOne");
		
		
	}


	public static void main(String [] args)
	{
		
		  ImplementClass obj=new ImplementClass(); 
		  System.out.println(projectName);
		  obj.method(); 
		  obj.method2(); 
		  obj.methodOne();
		 
		
		
		
		  OtherProjectInterface objectRef=new ImplementClass(); 
		   objectRef.method2(); 
		  objectRef.methodOne();objectRef.method();
		 
		 
		
		
		
		  NewProject objreference=new ImplementClass(); 
		  objreference.method();
		  objreference.method2();
		 
		
	}

}

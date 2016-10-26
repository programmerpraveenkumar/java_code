interface sample_interface{
	public void sample_method();
}

abstract class abstc_class{
	public void hello(){
		
	}
	abstract void should_implement();
}

class main_java extends abstc_class implements sample_interface{
	public static void main(String args[]){
		sample_interface s_i = new main_java();
		s_i.sample_method();
		abstc_class s_i_abs = new main_java();
		((abstc_class) s_i).should_implement();
	}

	public void sample_method() {
		// TODO Auto-generated method stub
		System.out.println("sample method calling praveen...");
	}

	@Override
	public void should_implement() {
		// TODO Auto-generated method stub
		System.out.println("should_implement method calling praveen...");
		
	}	
}
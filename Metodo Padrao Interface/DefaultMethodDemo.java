class DefaultMethodDemo {

	public static void main(String args[]) {
		MyIFImp obj = new MyIFImp();
	
		//metodo getUserId() implementado por MyIFImp
		System.out.println("User ID is " + obj.getUserId());
	
		//também pode chamar getAdminId(), por causa	
		//da implementação padrão
		System.out.println("Admin Id is " + obj.getAdminId());
		
		//sobrescrevendo metodo padrao
		System.out.println("Manager Id is: " + obj.getManagerId());
		
		//utlizando metodo estatico da interface MyIf
		
		int uId = MyIF.getUniversalId();
		System.out.println("Unviversal Id(static): " + uId);
	}
}
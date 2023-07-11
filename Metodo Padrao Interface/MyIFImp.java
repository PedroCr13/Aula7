class MyIFImp implements MyIF {
	
	//só o metodo getUseriD() definido por MyIf precisa ser implementado.
	//a versão padrão de getAdminId() pode ser usada.
	public int getUserId(){
		return 100;
	}
	
	//sobrescrevendo um metodo padrao
	public int getManagerId(){
		return 13;
	}
	
}
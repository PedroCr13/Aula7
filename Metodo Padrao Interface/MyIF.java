public interface MyIF {
	
	//metodo não padrao, deve ser implementado.
	int getUserId(); 
	
	//metodo padrão
	//fornece uma implementação padrão.
	default int getAdminId(){
		return 1;
	}
	
	default int getManagerId(){
		return 10;
	}	
	
	//metodo de interface estatico
	//pode ser utilzado sem instanciar objeto.
	static int getUniversalId(){
		return 0;
	}
}
//interface de fila de caracteres
public interface ICharQ {
	
	//insere caracteres na fila
	void put(char ch);
	
	//remove caracteres na fila
	char get();
	
	//mostra o tamanho do array
	int getSizeActual();
}
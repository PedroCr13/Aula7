package bookpackext;

class ProtectDemo {
	public static void main(String args[]){
		ExtBook books[] = new ExtBook[5];
		
		books[0] = new ExtBook("Java: A Begginer's Reference", "Schildt", 2014, "McGraw-Hill Professional");
		books[1] = new ExtBook("Java: The Complete Referente", "Schildt", 2014, "McGraw-Hill Professional");
		books[2] = new ExtBook("The art of Java", "Schildt and Holmes", 2003, "McGraw-Hill Professional");
		books[3] = new ExtBook("Red Storm Rising", "Clancy", 2003, "Putmam");
		books[4] = new ExtBook("On The Road", "Kerouac", 1955, "Viking");
		
		for(int i=0; i < books.length; i++)
			books[i].show();
		
		//encontra livros por autor
		for(int i=0; i < books.length; i++)
			if(books[i].getAuthor() == "Schildt")
				System.out.println(books[i].getTitle());
			
		//books[0].title = "test title"; //erro nao pode ser acessado
	}
}
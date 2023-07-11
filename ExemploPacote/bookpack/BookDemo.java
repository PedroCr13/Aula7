package bookpack;

class BookDemo {
	public static void main(String args[]){
		Book books[] = new Book[5];
		
		books[0] = new Book("Java: A Begginer's Reference", "Schildt", 2014);
		books[1] = new Book("Java: The Complete Referente", "Schildt", 2014);
		books[2] = new Book("The art of Java", "Schildt and Holmes", 2003);
		books[3] = new Book("Red Storm Rising", "Clancy", 2003);
		books[4] = new Book("On The Road", "Kerouac", 1995);

		for(int i=0; i < books.length; i++){
			books[i].show();
		}
		
	}
}
package se.lexicon.omar.model;

public class TeenageBook extends Book{

    private static Book[] TeenageBook = new TeenageBook[0];

    public Book[] getTeenageBook() {
      return TeenageBook;
    }

    public static String SearchTeenageBook(String title){
        for(Book teenage : TeenageBook){
            if(teenage.getTitle().equalsIgnoreCase(title)){
                return "Title: " + teenage.getTitle() + "\n" + "Author: " + teenage.getAuthor() + "\n" +
                        "Category: " + teenage.getCategory()  + "\n" + "Pages: " + teenage.getPages()  + "\n" + "Year: " + teenage.getYear() ;
            }
        }
        return "Book does not exist!";
    }

}

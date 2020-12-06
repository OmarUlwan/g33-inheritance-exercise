package se.lexicon.omar;


import se.lexicon.omar.model.Book;
import se.lexicon.omar.model.ChildBook;
import se.lexicon.omar.model.TeenageBook;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        System.out.print("Which book you want to find typing the title: ");
        Scanner scan = new Scanner(System.in);
        String title = scan.nextLine();
        String book = TeenageBook.SearchTeenageBook(title);
        System.out.println(book);
    }
}

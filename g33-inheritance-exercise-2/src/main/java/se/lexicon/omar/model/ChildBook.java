package se.lexicon.omar.model;

import java.util.Date;

public class ChildBook extends Book {

    private Book[] childBook = new ChildBook[0];

    public Book[] getChildBooks() {
        return childBook;
    }
}

package com.kenzie.library.model;

//TODO: Complete LibraryBook class by extending Book and adding required elements
public class LibraryBook extends Book{
    private String isbn;
    private String subjectList;

    public LibraryBook() {
        super();
        this.isbn = "";
        this.subjectList = "";
    }

    public LibraryBook(String title, String author) {
        super(title, author);
        this.isbn = "";
        this.subjectList = "";
    }

    @Override
    public String toString() {
        String format = "LibraryBook{title='"+title+"', author='"+author+"', isbn='"+
                isbn+ "', subjectList='"+subjectList+"'}";

        return format;
    }

    @Override
    public void setBookInfo(String detailString) {
        String[] bookInfo = detailString.split("\\|");
        setTitle(bookInfo[0]);
        setAuthor(bookInfo[1]);
        setIsbn(bookInfo[2]);
        setSubjectList(bookInfo[3]);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(String subjectList) {
        this.subjectList = subjectList;
    }
}
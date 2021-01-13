/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mac
 */
public class BooksInformation {
    private String title;
    private String pages;
    private String publicationYear;
    
    public BooksInformation (String title, String pages, String publicationYear){
    this.title = title;
    this.pages = pages;
    this.publicationYear = publicationYear;
    }
    public String getTitle() {
        return title;
    }

    public String getPages() {
        return pages;
    }

    public String getPublicationYear() {
        return publicationYear;
    }
    @Override
    public String toString(){
     return this.title + ", " + this.pages + " pages, " + this.publicationYear;
    }
    
}

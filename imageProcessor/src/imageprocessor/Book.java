package imageprocessor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MandoG
 */
public class Book {
    private String title;
    private String author;
    private int yearPub;
    private int pages;
    private String coverType;

    public Book(String title, String author, int yearPub, int pages, String coverType){
        this.title = title;
        this.author = author;
        this.yearPub = yearPub;
        this.pages = pages;
        this.coverType = coverType;
    }
    
    public void checkOut(){
        System.out.println(title +" by " + author + " has been checkout out.");
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public int getYearPub(){
        return yearPub;
    }
    
    public int getPages(){
        return pages;
    }

    public String getCoverType() {
        return coverType;
    }
    

    
    
    
    
}

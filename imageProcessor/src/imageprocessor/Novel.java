package imageprocessor;


import imageprocessor.Book;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MandoG
 */
public class Novel extends Book{
    private int chapters;
    private String genre;
    
    public Novel(String title, String author, int yearPub, int pages, 
            String coverType, int chapters, String genre) {
        super(title, author, yearPub, pages, coverType);
        this.chapters = chapters;
        this.genre = genre;
    }
    
    public int getChapters(){
        return chapters;
    }
    
    public String getGenre(){
        return genre;
    }
}

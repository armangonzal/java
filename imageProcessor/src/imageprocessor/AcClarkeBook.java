/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageprocessor;

/**
 *
 * @author MandoG
 */
public class AcClarkeBook extends Novel{
    private String series;

    public AcClarkeBook(String title, int yearPub, 
            int pages, String coverType, int chapters, String series) {
        super(title, "Arthur C. Clarke", yearPub, pages, coverType, chapters, 
                "Science Fiction");
        this.series = series;
    }


    public String getSeries() {
        return series;
    }
    
    
    
    
    
    
}

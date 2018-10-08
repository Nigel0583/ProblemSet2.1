import javax.swing.*;

public class Film {
    private String title, director;
    private int duration;
    private static  int numberOfFilms = 0;

    //accessor methods
    public String getDirector() {
        return director;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public static int getNumberOfFilms() {
        return numberOfFilms;
    }

    //mutator methods

    public void setDirector(String director) {
        this.director = director;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    //toString
    public String toString(){

        return String.format("\n\nFilm: %5s \nDirector: %5s \nDuration: %5d", getTitle(),getDirector(),getDuration());
    }

    //3-argument constructor
    public Film(String title,String director, int duration){
        setTitle(title);
        setDirector(director);
        setDuration(duration);
        numberOfFilms++;
    }

    //no argument constructor
    public Film(){
        this("Unknown","Unknown", 0);
    }



    public static  Film[] growCatalog(Film[] oldArray){

        Film[] newArray = new Film[oldArray.length+1];

        for (int i=0; i<oldArray.length; i++){

            newArray[i] = oldArray[i];
        }

        return newArray;
    }

    public static Film[] addToCatalog(Film[] catalog, Film newCatalog){

        Film[] newFilm = growCatalog(catalog);
        newFilm[newFilm.length-1] = newCatalog;

        return newFilm;
    }

    public static void display(Film[] catalog){

        JTextArea disCatalog  = new JTextArea();
        disCatalog.setText("Number of Films: "+getNumberOfFilms()+"\n");

        StringBuilder text = new StringBuilder();

        for (Film aCatalog : catalog) {
            text.append(aCatalog.toString()).append("\n");
        }

        disCatalog.append(text.toString());

        JOptionPane.showMessageDialog(null,disCatalog);

    }
}

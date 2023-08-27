package oop.classes;

public class Movie {
    private String title;
    private int durationInMinute;

    public void setTitle(String title){
        this.title = title;
    }

    public void setDurationInMinute(int durationInMinute){
        this.durationInMinute = durationInMinute;
    }

    public String getTitle(){
        return title;
    }

    public int getDurationInMinute(){
        return durationInMinute;
    }

    public void play(){
        System.out.println("The movie " + title + "is playng");
    }

    public void stop() {
        System.out.println("The movie " + title + " has stopped");
    }
}

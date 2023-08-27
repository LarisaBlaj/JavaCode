package oop.books;

public class Book {

    String title;// has default acces modifier
    public String author; //has public acces modifier
    private int numberOfPages; //has private acces modifier

    public void setNumberOfPages(int numberOfPages) {
        if (numberOfPages > 0) {
            this.numberOfPages = numberOfPages;
        }else {
            System.out.println("The number of pages is incorrect");
        }
    }
    public int getNumberOfPages(){
        return numberOfPages;
    }

    private boolean isNumberOfPagesValid(int noOfPages){
        return noOfPages > 0;
    }






}

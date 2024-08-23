public class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    Book(String title, String author, boolean isAvailable){
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void bookInfo(){
        System.out.println("책 제목 : " + title+ "저자 : " + author +" 대여 가능여부 : "+ isAvailable);
    }
}

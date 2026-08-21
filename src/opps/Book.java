package opps;

public class Book {
  private   String author;
   private String title;
   private int pageCount;

    Book(String author, String title, int pageCount) {
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
    }

    //    Getter
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        if (pageCount < 10)
            throw new IllegalStateException("A book must have at least 10 pages!");
        else {
            this.pageCount = pageCount;
            System.out.println("Page is updated to " + pageCount);
        }
    }
}
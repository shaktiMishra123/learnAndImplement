package builderExercise;

public class BookDefaultConstructor {
  private final String title;
  private final String author;
  private final String publisher;

  public BookDefaultConstructor(String title, String author, String publisher) {
    this.title = title;
    this.author = author;
    this.publisher = publisher;
  }

  public static BookDefaultConstructor DEFAULT(){
    return new BookDefaultConstructor(null,null,null);
  }

  @Override
  public String toString() {
    return "Book{" +
        "title='" + title + '\'' +
        ", author='" + author + '\'' +
        ", publisher='" + publisher + '\'' +
        '}';
  }
}

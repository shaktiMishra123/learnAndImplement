package Exercise1;

public class BookBuilder {
  private final String title;
  private final String author;
  private final String publisher;

  public BookBuilder(Builder builder) {
    this.title = builder.title;
    this.author = builder.author;
    this.publisher = builder.publisher;
  }


  public static class Builder {
    private final String title;
    private final String author;
    private final String publisher;

    public Builder(String title, String author, String publisher) {
      this.title = title;
      this.author = author;
      this.publisher = publisher;
    }

    public BookBuilder build() {
      return new BookBuilder(this);
    }
  }


  @Override
  public String toString() {
    return "BookBuilder{" +
        "title='" + title + '\'' +
        ", author='" + author + '\'' +
        ", publusher='" + publisher + '\'' +
        '}';
  }
}

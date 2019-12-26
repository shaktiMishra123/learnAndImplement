package Exercise1;

public class BookMain {
  public static void main(String[] args) {
    BookDefaultConstructor book = BookDefaultConstructor.DEFAULT();
    System.out.println(book);

    BookBuilder bookBuilder = new BookBuilder.Builder("let us C","Yashwant karnetkar","xyz").build();
    System.out.println(bookBuilder);

    BookBuilderWithAllOptionalParam bookBuilderWithAllOptionalParam = new BookBuilderWithAllOptionalParam.Builder().build();
    System.out.println(bookBuilderWithAllOptionalParam);
    
    BookBuilderWithAllOptionalParam bookBuilderWithAllOptionalParam1 = new BookBuilderWithAllOptionalParam.Builder().setAuthor("Shakti").setTitle("Test").build();
    System.out.println(bookBuilderWithAllOptionalParam1);
  }
}

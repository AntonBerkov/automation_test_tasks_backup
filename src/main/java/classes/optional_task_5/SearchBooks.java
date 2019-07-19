package classes.optional_task_5;

public class SearchBooks {

    public void search() {
        Book[] bookList = new Book[5];
        setBooks(bookList);
        sort(bookList);
    }

    public Book[] setBooks(Book[] bookList) {
        bookList[0] = new Book(1, "Sword of Destiny", 1992, 384, 16.99);
        bookList[1] = new Book(2, "The Last Wish", 1993, 288, 17.08);
        bookList[2] = new Book(3, "Before the Storm", "Del Rey", 2018, 411, 19.28);
        bookList[3] = new Book(4, "Arthas: Rise of the Lich King ", "Pocket Books", 2009, 312, 19.12);
        bookList[4] = new Book(5, "Roadsize Picnic", new String[]{"Arkady Strugatsky", "Boris Strugatsky"}, "Macmillan", 1972, 224, 19.02);
        return bookList;
    }

    public void sort(Book[] bookList) {
        Criterion criterion;
        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i].getPublisher().equals("Macmillan")) {
                criterion = Criterion.PUBLISHER;
                print(bookList, i, criterion);
            }
            if (bookList[i].getPublishYear() > 2009) {
                criterion = Criterion.PUBLISH_YEAR;
                print(bookList, i, criterion);
            }
            for (int j = 0; j < bookList[i].getAuthors().length; j++) {
                if (bookList[i].getAuthors()[j].equals("Andrzej Sapkowski")) {
                    criterion = Criterion.AUTHOR;
                    print(bookList, i, criterion);
                }
            }
        }
    }

    public void print(Book[] bookList, int i, Criterion criterie) {
        String result = bookList[i].toString();
        System.out.println("criterion " + criterie.toString().toLowerCase() + ": " + result);
    }
}

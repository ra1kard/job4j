package com.oreilly.chapter_1;

public class Books {
    String title;
    String autor;
}

class BooksTestDrive {
    public static void main(String[] args) {

        Books[] myBooks = new Books[3];
        int x = 0;
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();
        myBooks[0].title = "Плоды Java";
        myBooks[1].title = "Java Гэтсби";
        myBooks[2].title = "Сборник рецептов по Java";
        myBooks[0].autor = "Боб";
        myBooks[1].autor = "Сью";
        myBooks[2].autor = "Ян";

        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(" , автор ");
            System.out.println(myBooks[x].autor);
            x = x + 1;
        }
    }
}

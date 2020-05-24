package com.oreilly.chapter_2.Dvd;

public class DVDPlayerTest {
    public static void main(String[] args) {
        DVDPlayer d = new DVDPlayer();
        d.canRecord = true;

        if (d.canRecord == true) {
            d.recordDVD();
        }
    }
}

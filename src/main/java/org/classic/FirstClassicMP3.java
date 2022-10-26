package org.classic;

public class FirstClassicMP3 extends ClassicMP3 {
    String nameTrack = "Nucturn 2";
    String author = "Shopen";

    public String getNameTrack() {
        return nameTrack;
    }

    public void setNameTrack(String nameTrack) {
        this.nameTrack = nameTrack;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "FirstClassicTrack{" +
                "nameTrack='" + nameTrack + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
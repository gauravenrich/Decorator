package com.gaurav.composite;

public class DisplayMain {
    public static void main(String[] args) {
        Directory moviesDir=new Directory("Movies");
        File borderMovie=new File("Border.mkv");
        moviesDir.add(borderMovie);
        Directory comedyMovieDirectory = new Directory("ComedyMovie");
        File hulchul = new File("Hulchul");
        comedyMovieDirectory.add(hulchul);
        moviesDir.add(comedyMovieDirectory);
        moviesDir.ls();
    }
}

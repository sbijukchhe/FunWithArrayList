/*
Create an application which will prompt the user to enter the name of their favorite Movie. Add the Movie to an
array list.  Use a loop to continue adding movies to the array until the user presses q or Q.

Once the user presses Q then print the list of movies before exiting the program.

HINT: You can use the .toLowerCase() method of the String class to convert the 'Q' to 'q'. So if your response is
 stored in a variable called userAnswer then userAnswer.toLowerCase() will evaluate to a 'q'. Alternatively, you can use the userAnswer.equalsIgnoreCase("q") method.

BONUS: Print out the list of movies sorted in alphabetical order.

BONUS x2: Suggest a movie to the user to watch by randomly selecting a movie from the list of movies entered.
 */

import java.util.*;

public class ArrayListDemoMovies {

    public static void main(String[] args) {

        String newMovie = "";
        String answer = "y";
        Movie randMovie;
        ArrayList<Movie> movieList = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        while ((answer.equalsIgnoreCase("Y"))) {
            System.out.println("Do you want to enter movie? (Y/N)");
            answer = input.next();

            if ((answer.equalsIgnoreCase("Y"))) {
                Movie movie = new Movie();
                System.out.print("Enter the name:");
                movie.setName(input.next());
                System.out.print("Enter the actor: ");
                movie.setActor(input.next());

                // adding movies to movieList
                movieList.add(movie);
            }


            // printing a list of movies after users add
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println("List of all the movies before sorting - ");
            for (Movie myMovie : movieList) {
                System.out.print("Name: ");
                System.out.print(myMovie.getName());
                System.out.print(" / ");
                System.out.print("Actor: ");
                System.out.print(myMovie.getActor());
                System.out.println();

            }
            Collections.sort(movieList);
            System.out.println("\n\nList of all the movies after sorting - ");
            System.out.println("------------------------------------------------");
            for (Movie myMovie : movieList) {
                System.out.print("\nName: ");
                System.out.print(myMovie.getName());
                System.out.print(" / ");
                System.out.print("Actor: ");
                System.out.print(myMovie.getActor());
                System.out.println();


            }
            randMovie = movieList.get((int)(Math.random() * movieList.size()));
            System.out.println("\n********** This movie is nice one. Do you want to watch??? - "+ randMovie.name+" ***********");
                System.out.println("------------------------------------------------------------------------------------");


                System.out.println("\nPlease add more movies");
                System.out.println("Or, press \"Q\" to quit !!!");
            }
        }
    }


    /**
     * creating class Movie
     */
    class Movie implements Comparable<Movie> {

        String name;
        String actor;

        public Movie() {
        }

        public Movie(String name) {
            this.name = name;
        }

        public Movie(String name, String actor) {
            this.name = name;
            this.actor = actor;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getActor() {
            return actor;
        }

        public void setActor(String actor) {
            this.actor = actor;
        }

        @Override
        public String toString() {
            return "Movie{" +
                    "name='" + name + '\'' +
                    ", actor='" + actor + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Movie otherMovie) {
            //compare name
            int nameDiff = name.compareToIgnoreCase(otherMovie.name);
            if (nameDiff != 0) {
                return nameDiff;
            }
            return 0;
        }
}

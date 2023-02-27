import java.util.Arrays;

class movie {
         public static void main(String[] args){
    
         String[] movies = {"Indiana Jones et la Dernière Croisade ", "Indiana Jones et le Temple maudit ", "Les Aventuriers de l'Arche perdue"};

String[] movie1 = {"Harryson Ford", "Seann connery", "Denholm Elliott"};
String[] movie2 = {"Harrison Ford","Kate Capshaw", "Ke Huy Quan"};
String[] movie3 = {"Harrison Ford", " Karen Allen", "Paul Freeman"};

String [][] tableauMovies ;
tableauMovies = new String[][] {
    movie1,
    movie2,
    movie3
};

// for (int i = 0; i < movies.length; i++) { for (int j = 0; j < tableauMovies.length; j++)

//     System.out.println(movies[i] + tableauMovies[j][j]);

//          }
for (int i = 0; i < tableauMovies.length; i++) {
    System.out.println("dans le film"+movies[i] +"les principaux acteurs"+ Arrays.toString(tableauMovies[i]));
}

         }
}

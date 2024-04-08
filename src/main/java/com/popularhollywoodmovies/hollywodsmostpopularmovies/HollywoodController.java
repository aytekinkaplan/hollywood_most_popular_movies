package com.popularhollywoodmovies.hollywodsmostpopularmovies;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class HollywoodController {

    // Örnek veri oluşturulması
    private List<Hollywood> getSampleMovies() {
        List<Hollywood> movies = new ArrayList<>();
        movies.add(new Hollywood(1, "Avatar", 2009, 2784, "James Cameron", Arrays.asList("Sam Worthington", "Zoe Saldana"), Arrays.asList("Science Fiction", "Adventure", "Action")));
        movies.add(new Hollywood(2, "Avengers: Endgame", 2019, 2798, "Anthony Russo", Arrays.asList("Robert Downey Jr.", "Chris Evans", "Mark Ruffalo"), Arrays.asList("Action", "Adventure", "Sci-Fi")));
        movies.add(new Hollywood(3, "Titanic", 1997, 2208, "James Cameron", Arrays.asList("Leonardo DiCaprio", "Kate Winslet"), Arrays.asList("Drama", "Romance")));
        movies.add(new Hollywood(4, "Star Wars: The Force Awakens", 2015, 2068, "J.J. Abrams", Arrays.asList("Harrison Ford", "Mark Hamill", "Carrie Fisher"), Arrays.asList("Action", "Adventure", "Fantasy", "Sci-Fi")));
        movies.add(new Hollywood(5, "Avengers: Infinity War", 2018, 2048, "Anthony Russo", Arrays.asList("Robert Downey Jr.", "Chris Hemsworth", "Mark Ruffalo"), Arrays.asList("Action", "Adventure", "Sci-Fi")));
        movies.add(new Hollywood(6, "Jurassic World", 2015, 1672, "Colin Trevorrow", Arrays.asList("Chris Pratt", "Bryce Dallas Howard"), Arrays.asList("Action", "Adventure", "Sci-Fi", "Thriller")));
        movies.add(new Hollywood(7, "The Lion King", 2019, 1657, "Jon Favreau", Arrays.asList("Donald Glover", "Beyoncé", "Seth Rogen"), Arrays.asList("Animation", "Adventure", "Drama", "Family")));
        movies.add(new Hollywood(8, "The Avengers", 2012, 1519, "Joss Whedon", Arrays.asList("Robert Downey Jr.", "Chris Evans", "Scarlett Johansson"), Arrays.asList("Action", "Adventure", "Sci-Fi")));
        movies.add(new Hollywood(9, "Fast & Furious 7", 2015, 1516, "James Wan", Arrays.asList("Vin Diesel", "Paul Walker", "Dwayne Johnson"), Arrays.asList("Action", "Adventure", "Crime", "Thriller")));
        movies.add(new Hollywood(10, "Avengers: Age of Ultron", 2015, 1405, "Joss Whedon", Arrays.asList("Robert Downey Jr.", "Chris Hemsworth", "Mark Ruffalo"), Arrays.asList("Action", "Adventure", "Sci-Fi")));
        movies.add(new Hollywood(11, "Frozen", 2013, 1379, "Chris Buck, Jennifer Lee", Arrays.asList("Kristen Bell", "Idina Menzel"), Arrays.asList("Animation", "Adventure", "Comedy", "Family", "Fantasy", "Musical")));
        movies.add(new Hollywood(12, "Harry Potter and the Deathly Hallows – Part 2", 2011, 1341, "David Yates", Arrays.asList("Daniel Radcliffe", "Emma Watson", "Rupert Grint"), Arrays.asList("Adventure", "Drama", "Fantasy")));
        movies.add(new Hollywood(13, "The Lion King", 1994, 1307, "Roger Allers, Rob Minkoff", Arrays.asList("Matthew Broderick", "Jeremy Irons", "James Earl Jones"), Arrays.asList("Animation", "Adventure", "Drama", "Family", "Musical")));
        movies.add(new Hollywood(14, "Jurassic World: Fallen Kingdom", 2018, 1303, "J.A. Bayona", Arrays.asList("Chris Pratt", "Bryce Dallas Howard", "Rafe Spall"), Arrays.asList("Action", "Adventure", "Sci-Fi", "Thriller")));
        movies.add(new Hollywood(15, "Frozen II", 2019, 1301, "Chris Buck, Jennifer Lee", Arrays.asList("Kristen Bell", "Idina Menzel", "Josh Gad"), Arrays.asList("Animation", "Adventure", "Comedy", "Family", "Fantasy", "Musical")));
        movies.add(new Hollywood(16, "Beauty and the Beast", 2017, 1264, "Bill Condon", Arrays.asList("Emma Watson", "Dan Stevens", "Luke Evans"), Arrays.asList("Family", "Fantasy", "Musical", "Romance")));
        movies.add(new Hollywood(17, "Incredibles 2", 2018, 1242, "Brad Bird", Arrays.asList("Craig T. Nelson", "Holly Hunter", "Sarah Vowell"), Arrays.asList("Animation", "Action", "Adventure", "Comedy", "Family", "Sci-Fi")));
        movies.add(new Hollywood(18, "The Fate of the Furious", 2017, 1235, "F. Gary Gray", Arrays.asList("Vin Diesel", "Dwayne Johnson", "Jason Statham"), Arrays.asList("Action", "Adventure", "Crime", "Thriller")));
        movies.add(new Hollywood(19, "Iron Man 3", 2013, 1215, "Shane Black", Arrays.asList("Robert Downey Jr.", "Gwyneth Paltrow", "Don Cheadle"), Arrays.asList("Action", "Adventure", "Sci-Fi")));
        movies.add(new Hollywood(20, "Minions", 2015, 1150, "Pierre Coffin, Kyle Balda", Arrays.asList("Sandra Bullock", "Jon Hamm", "Michael Keaton"), Arrays.asList("Animation", "Adventure", "Comedy", "Family")));

        return movies;
    }

    @GetMapping("/popular-movies")
    public String getPopularMovies(Model model) {
        List<Hollywood> movies = getSampleMovies();
        model.addAttribute("movies", movies);
        return "popular-movies";
    }
}

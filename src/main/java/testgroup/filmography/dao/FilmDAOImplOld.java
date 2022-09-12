//package testgroup.filmography.dao;
//
//import org.springframework.stereotype.Repository;
//import testgroup.filmography.model.Film;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.concurrent.atomic.AtomicInteger;
//
///**
// * @ In the name of Allah, most gracious and most merciful 12.09.2022
// */
//@Repository
//public class FilmDAOImplOld implements FilmDAO {
//    private static final AtomicInteger AUTO_ID = new AtomicInteger(0);
//    private static Map<Integer, Film> films = new HashMap<>();
//
//    static {
//        Film film1 = new Film();
//        film1.setId(AUTO_ID.getAndIncrement());
//        film1.setTitle("Inception");
//        film1.setYear(2010);
//        film1.setGenre("sci-fi");
//        film1.setWatched(true);
//        films.put(film1.getId(), film1);
//
//        Film film2 = new Film();
//        film2.setId(AUTO_ID.getAndIncrement());
//        film2.setTitle("Inception2");
//        film2.setYear(2012);
//        film2.setGenre("sci-fi");
//        film2.setWatched(true);
//        films.put(film2.getId(), film2);
//
//        Film film3 = new Film();
//        film3.setId(AUTO_ID.getAndIncrement());
//        film3.setTitle("Inception3");
//        film3.setYear(2013);
//        film3.setGenre("sci-fi");
//        film3.setWatched(true);
//        films.put(film3.getId(), film3);
//
//        Film film4 = new Film();
//        film4.setId(AUTO_ID.getAndIncrement());
//        film4.setTitle("Inception4");
//        film4.setYear(2014);
//        film4.setGenre("sci-fi");
//        film4.setWatched(true);
//        films.put(film4.getId(), film4);
//    }
//
//    @Override
//    public List<Film> allFilms() {
//        return new ArrayList<>(films.values());
//    }
//
//    @Override
//    public void add(Film film) {
//        film.setId(AUTO_ID.getAndIncrement());
//        films.put(film.getId(), film);
//    }
//
//    @Override
//    public void delete(Film film) {
//        films.remove(film.getId(), film);
//    }
//
//    @Override
//    public void edit(Film film) {
//        films.put(film.getId(), film);
//    }
//
//    @Override
//    public Film getById(int id) {
//        return films.get(id);
//    }
//}

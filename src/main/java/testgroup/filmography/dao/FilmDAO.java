package testgroup.filmography.dao;

import testgroup.filmography.model.Film;

import java.util.List;

/**
 * @ In the name of Allah, most gracious and most merciful 12.09.2022
 */
public interface FilmDAO {
    List<Film> allFilms(int page);
    public int filmsCount();
    void add(Film film);
    void delete(Film film);
    void edit(Film film);
    Film getById(int id);
}

package testgroup.filmography.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testgroup.filmography.dao.FilmDAO;
import testgroup.filmography.model.Film;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @ In the name of Allah, most gracious and most merciful 12.09.2022
 */
@Service
public class FilmServiceImpl implements FilmService {
    private FilmDAO filmDAO;

    @Autowired
    @Transactional
    public void setFilmDAO(FilmDAO filmDAO) {
        this.filmDAO = filmDAO;
    }

    @Override
    @Transactional
    public int filmsCount() {
        return filmDAO.filmsCount();
    }

    @Override
    @Transactional
    public List<Film> allFilms(int page) {
//        return filmDAO.allFilms();
        return filmDAO.allFilms(page);
    }

    @Override
    @Transactional
    public void add(Film film) {
        filmDAO.add(film);
    }

    @Override
    @Transactional
    public void delete(Film film) {
        filmDAO.delete(film);
    }

    @Override
    @Transactional
    public void edit(Film film) {
        filmDAO.edit(film);
    }

    @Override
    @Transactional
    public Film getById(int id) {
        return filmDAO.getById(id);
    }
}

package ru.netology;

import lombok.Data;

@Data

public class FilmManager {
    private String[] movies = new String[0];
    private int limit;

    public FilmManager() {
        limit = 10;
    }

    public FilmManager(int limit) {
        this.limit = limit;
    }


    // Добавление нового фильма

    public void addMovie(String newMovie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = newMovie;
        movies = tmp;
    }


    //Вывод всех фильмов в порядке добавления
    public String[] findAll() {
        return movies;
    }

    //Вывод последних добавленных фильмов
    public String[] findLast() {
        String[] last;
        if (limit < movies.length) {
            last = new String[limit];
        } else {
            last = new String[movies.length];
        }
        for (int i = 0; i < last.length; i++) {
            last[i] = movies[movies.length - i - 1];
        }
        return last;
    }


}

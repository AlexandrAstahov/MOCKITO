package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmManagerTest {

    FilmManager manager = new FilmManager();
    String[] actualAllLast = manager.findLast();
    String[] actualAll = manager.findAll();

    String[] expectedAllLast = {"Гнев человеческий", "Рыцари справедливости", "Никто", "Назад в будущее 2", "Ултиматум Борна",
            "Превосходство Борна", "Назад в будущее 3", "Молодой мастер", "Святые из бундока", "На гребне волны", "Гангстер"};

    String[] expectedAll = {"Гангстер", "На гребне волны", "Святые из бундока", "Молодой мастер", "Назад в будущее 3",
            "Превосходство Борна", "Ултиматум Борна", "Назад в будущее 2", "Никто", "Рыцари справедливости", "Гнев человеческий"};

    @Test
    void shouldAddMovie() {

        manager.addMovie("Гангстер");
        manager.addMovie("На гребне волны");
        manager.addMovie("Святые из бундока");
        manager.addMovie("Молодой мастер");
        manager.addMovie("Назад в будущее 3");
        manager.addMovie("Превосходство Борна");
        manager.addMovie("Ултиматум Борна");
        manager.addMovie("Назад в будущее 2");
        manager.addMovie("Никто");
        manager.addMovie("Рыцари справедливости");
        manager.addMovie("Гнев человеческий");

        String[] actualAll = manager.findAll();
        String[] expectedAll = {"Гангстер", "На гребне волны", "Святые из бундока", "Молодой мастер", "Назад в будущее 3",
                "Превосходство Борна", "Ултиматум Борна", "Назад в будущее 2", "Никто", "Рыцари справедливости", "Гнев человеческий"};
        Assertions.assertArrayEquals(actualAll, expectedAll);

    }

    @Test
    void shouldFindAll() {
        manager.addMovie("Гангстер");
        manager.addMovie("На гребне волны");
        manager.addMovie("Святые из бундока");
        manager.addMovie("Молодой мастер");
        manager.addMovie("Назад в будущее 3");
        manager.addMovie("Превосходство Борна");
        manager.addMovie("Ултиматум Борна");
        manager.addMovie("Назад в будущее 2");
        manager.addMovie("Никто");
        manager.addMovie("Рыцари справедливости");
        manager.addMovie("Гнев человеческий");

        String[] actualAll = manager.findAll();
        String[] expectedAll = {"Гангстер", "На гребне волны", "Святые из бундока", "Молодой мастер", "Назад в будущее 3",
                "Превосходство Борна", "Ултиматум Борна", "Назад в будущее 2", "Никто", "Рыцари справедливости", "Гнев человеческий"};

        Assertions.assertArrayEquals(actualAll, expectedAll);

    }

    @Test
    void shouldFindAllLast() {
        FilmManager manager = new FilmManager();

        manager.addMovie("Гангстер");
        manager.addMovie("На гребне волны");
        manager.addMovie("Святые из бундока");
        manager.addMovie("Молодой мастер");
        manager.addMovie("Назад в будущее 3");
        manager.addMovie("Превосходство Борна");
        manager.addMovie("Ултиматум Борна");
        manager.addMovie("Назад в будущее 2");
        manager.addMovie("Никто");
        manager.addMovie("Рыцари справедливости");
        manager.addMovie("Гнев человеческий");

        String[] actualAllLast = manager.findLast();
        String[] expectedAllLast = {"Гнев человеческий", "Рыцари справедливости", "Никто", "Назад в будущее 2", "Ултиматум Борна",
                "Превосходство Борна", "Назад в будущее 3", "Молодой мастер", "Святые из бундока", "На гребне волны"};

        Assertions.assertArrayEquals(actualAllLast, expectedAllLast);


    }

    @Test
    void shouldFindAllLastForLimit() {
        FilmManager manager = new FilmManager(5);

        manager.addMovie("Гангстер");
        manager.addMovie("На гребне волны");
        manager.addMovie("Святые из бундока");
        manager.addMovie("Молодой мастер");
        manager.addMovie("Назад в будущее 3");
        manager.addMovie("Превосходство Борна");
        manager.addMovie("Ултиматум Борна");
        manager.addMovie("Назад в будущее 2");
        manager.addMovie("Никто");
        manager.addMovie("Рыцари справедливости");
        manager.addMovie("Гнев человеческий");

        String[] actualAllLast = manager.findLast();
        String[] expectedAllLast = {"Гнев человеческий", "Рыцари справедливости", "Никто", "Назад в будущее 2", "Ултиматум Борна"};

        Assertions.assertArrayEquals(actualAllLast, expectedAllLast);


    }

}
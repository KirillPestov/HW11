import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.manager.Manager;

public class ManagerTest {

    @Test
    public void addFilmTest() {
        Manager manager = new Manager();
        manager.addFilms("Бладшот");
        String[] expected = {"Бладшот"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void addFilmsTest() {
        Manager manager = new Manager();
        manager.addFilms("Бладшот");
        manager.addFilms("Вперёд");
        manager.addFilms("Джентельмены");
        String[] expected = {"Бладшот", "Вперёд", "Джентельмены"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void lustLimitFilmsTest() {
        Manager manager = new Manager(4);
        manager.addFilms("Бладшот");
        manager.addFilms("Вперёд");
        manager.addFilms("Джентельмены");
        manager.addFilms("Человек-Невидимка");
        manager.addFilms("Троли");
        manager.addFilms("Номер Один");
        String[] expected = {"Номер Один", "Троли", "Человек-Невидимка", "Джентельмены"};
        String[] actual = manager.findLust();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void lustFilmsTest1() {
        Manager manager = new Manager();
        manager.addFilms("Бладшот");
        manager.addFilms("Вперёд");
        manager.addFilms("Джентельмены");
        manager.addFilms("Человек-Невидимка");
        manager.addFilms("Троли");
        manager.addFilms("Номер Один");
        String[] expected = {"Номер Один", "Троли", "Человек-Невидимка", "Джентельмены", "Вперёд"};
        String[] actual = manager.findLust();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void lustFilmsTest2() {
        Manager manager = new Manager();
        manager.addFilms("Человек-Невидимка");
        manager.addFilms("Троли");
        manager.addFilms("Номер Один");
        String[] expected = {"Номер Один", "Троли", "Человек-Невидимка"};
        String[] actual = manager.findLust();
        Assertions.assertArrayEquals(expected, actual);
    }

}

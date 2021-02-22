package pl.marand;

public interface Repo {
    void save(String text); //opcja zapisu
    void get(); //opcja odczytu - ogólnie
    default void getById(int id) {  //domyślnie metoda abstrakcyjna
        System.out.println("Get by Id.");  //łagodna implementacja
    }
}

package pl.marand;

public class DBRepo implements Repo {
    @Override
    public void save(String text) {
        System.out.println("Save to database: " + text);
    }

    @Override
    public void get() {
        System.out.println("Get data from database.");
    }
    @Override
    public void getById(int id){
        System.out.println("Get by id database.");
    }
}

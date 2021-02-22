package pl.marand;

public class FileRepo implements Repo {
    @Override
    public void save(String text) {
        System.out.println("Save to file: " + text);
    }

    @Override
    public void get() {
        System.out.println("Get data from file.");
    }
}

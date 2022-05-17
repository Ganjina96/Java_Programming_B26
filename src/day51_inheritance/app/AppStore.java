package day51_inheritance.app;

public class AppStore {
    public static void main(String[] args) {

        Instagram app1 = new Instagram(3.2);
        app1.download();
        app1.postPicture();

        YouTube app2 = new YouTube(1.4);
        app2.download();
        app2.watchVideo();

    }
}

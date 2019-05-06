package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
       // launch(args);
        ArrayList<Korisnik> korisnikArrayList=new ArrayList<>();
        korisnikArrayList.add(new Korisnik("meho3","mehic", LocalDate.now()));
        korisnikArrayList.add(new Korisnik("meho","mehic1", LocalDate.now()));
        korisnikArrayList.add(new Korisnik("meho3","mehic1", LocalDate.now()));
        korisnikArrayList.add(new Korisnik("meho","mehic", LocalDate.now()));
        System.out.println(korisnikArrayList);
        korisnikArrayList.sort((a,b)-> {
            String x=a.getIme()+" "+a.getPrezime();
            String y=b.getIme()+" "+b.getPrezime();
            return x.compareTo(y);

        });
        System.out.println(korisnikArrayList);

    }
}

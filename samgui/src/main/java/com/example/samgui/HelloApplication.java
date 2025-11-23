package com.example.samgui; // To musi być zgodne z Twoim pakietem w IntelliJ

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        // 1. Utwórz główny kontener BorderPane
        BorderPane root = new BorderPane();

        // --- SEKCJA TOP (GÓRA) ---
        VBox topContainer = createTopSection();
        root.setTop(topContainer);

        // --- SEKCJA LEFT (LEWA STRONA) ---
        // Wykorzystanie TitledPane i VBox
        VBox leftContainer = createLeftSection();

        // Dodajemy ScrollPane, żeby panel przewijał się na małych ekranach
        ScrollPane scrollPane = new ScrollPane(leftContainer);
        scrollPane.setFitToWidth(true);
        root.setLeft(scrollPane);

        // --- SEKCJA CENTER (ŚRODEK) ---
        Pane centerPane = createCenterSection();
        root.setCenter(centerPane);

        // Ustawienie sceny
        Scene scene = new Scene(root, 900, 600);
        primaryStage.setTitle("Symulator Samochodu");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Metoda tworząca górną sekcję (Menu + Pasek narzędzi)
    private VBox createTopSection() {
        // Pasek Menu
        MenuBar menuBar = new MenuBar();
        Menu menuFile = new Menu("Plik");
        Menu menuEdit = new Menu("Edycja");
        menuBar.getMenus().addAll(menuFile, menuEdit);

        // Pasek narzędzi
        HBox toolBar = new HBox(10); // odstępy 10px
        toolBar.setPadding(new Insets(10));
        toolBar.setStyle("-fx-background-color: #804141;"); // szare tło

        Label labelSamochod = new Label("Samochód:");

        // ComboBox do wyboru samochodu
        ComboBox<String> carComboBox = new ComboBox<>();
        carComboBox.getItems().addAll("Porsche", "Fiat", "Tesla");
        carComboBox.setPromptText("Wybierz samochód...");

        // Przyciski Dodaj i Usuń
        Button btnAdd = new Button("Dodaj nowy");
        Button btnRemove = new Button("Usuń");

        toolBar.getChildren().addAll(labelSamochod, carComboBox, btnAdd, btnRemove);

        return new VBox(menuBar, toolBar);
    }


    private VBox createLeftSection() {
        VBox container = new VBox();
        container.setPadding(new Insets(5));
        container.setSpacing(5); // odstępy między panelami
        container.setPrefWidth(250); // Szerokość panelu bocznego

        VBox carContent = new VBox(5);
        carContent.setPadding(new Insets(10));
        carContent.getChildren().addAll(
                new Label("Model:"), new TextField(),
                new Label("Nr rejestracyjny:"), new TextField(),
                new Label("Waga:"), new TextField(),
                new Label("Prędkość:"), new TextField(),
                new Separator(),
                new HBox(5, new Button("Włącz"), new Button("Wyłącz")) // Przyciski w poziomie
        );
        TitledPane carPane = new TitledPane("Samochód", carContent);
        carPane.setCollapsible(true);

        // 2. Panel Skrzynia Biegów
        VBox gearboxContent = new VBox(5);
        gearboxContent.setPadding(new Insets(10));
        gearboxContent.getChildren().addAll(
                new Label("Nazwa:"), new TextField(),
                new Label("Cena:"), new TextField(),
                new Label("Waga:"), new TextField(),
                new Label("Bieg:"), new TextField(),
                new Separator(),
                new HBox(5, new Button("Zwiększ bieg"), new Button("Zmniejsz bieg"))
        );
        TitledPane gearboxPane = new TitledPane("Skrzynia Biegów", gearboxContent);

        // 3. Panel Silnik
        VBox engineContent = new VBox(5);
        engineContent.setPadding(new Insets(10));
        engineContent.getChildren().addAll(
                new Label("Nazwa:"), new TextField(),
                new Label("Cena:"), new TextField(),
                new Label("Waga:"), new TextField(),
                new Label("Obroty:"), new TextField(),
                new Separator(),
                new HBox(5, new Button("Dodaj gazu"), new Button("Ujmij gazu"))
        );
        TitledPane enginePane = new TitledPane("Silnik", engineContent);

        // 4. Panel Sprzęgło
        VBox clutchContent = new VBox(5);
        clutchContent.setPadding(new Insets(10));
        clutchContent.getChildren().addAll(
                new Label("Nazwa:"), new TextField(),
                new Label("Cena:"), new TextField(),
                new Label("Waga:"), new TextField(),
                new Label("Stan:"), new TextField(),
                new Separator(),
                new HBox(5, new Button("Wciśnij"), new Button("Zwolnij"))
        );
        TitledPane clutchPane = new TitledPane("Sprzęgło", clutchContent);

        container.getChildren().addAll(carPane, gearboxPane, enginePane, clutchPane);
        return container;
    }
    private Pane createCenterSection() {
        Pane mapPane = new Pane();
        // Ustawienie zielonego tła (trawa)
        mapPane.setStyle("-fx-background-color: #cd8d8d;");

        // Dodanie obrazka samochodu
        // Używam linku internetowego, żeby zadziałało od razu bez wgrywania pliku na dysk
        Image carImage = new Image("https://img.icons8.com/?size=160&id=111278&format=png");
        ImageView imageView = new ImageView(carImage);

        imageView.setX(50); // Pozycja początkowa X
        imageView.setY(50); // Pozycja początkowa Y

        Label mapLabel = new Label("Mapa");
        mapLabel.setPadding(new Insets(10));

        mapPane.getChildren().addAll(mapLabel, imageView);
        return mapPane;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
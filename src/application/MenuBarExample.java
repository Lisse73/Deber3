package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuBarExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Crear la barra de menú
        MenuBar menuBar = new MenuBar();

        // Crear los menú
        Menu archivoMenu = new Menu("Archivo");
        Menu editarMenu = new Menu("Editar");
        Menu ayudaMenu = new Menu("Ayuda");

        // Crear los elementos de menú
        MenuItem nuevoItem = new MenuItem("Nuevo");
        MenuItem abrirItem = new MenuItem("Abrir");
        MenuItem guardarItem = new MenuItem("Guardar");
        MenuItem salirItem = new MenuItem("Salir");

        MenuItem cortarItem = new MenuItem("Cortar");
        MenuItem copiarItem = new MenuItem("Copiar");
        MenuItem pegarItem = new MenuItem("Pegar");

        MenuItem acercaDeItem = new MenuItem("Acerca de...");

        // Añadir los elementos de menú a los menús correspondientes
        archivoMenu.getItems().addAll(nuevoItem, abrirItem, guardarItem, new SeparatorMenuItem(), salirItem);
        editarMenu.getItems().addAll(cortarItem, copiarItem, pegarItem);
        ayudaMenu.getItems().addAll(acercaDeItem);

        // Definir acciones para los elementos de menú
        nuevoItem.setOnAction(e -> System.out.println("Se seleccionó Nuevo"));
        abrirItem.setOnAction(e -> System.out.println("Se seleccionó Abrir"));
        guardarItem.setOnAction(e -> System.out.println("Se seleccionó Guardar"));
        salirItem.setOnAction(e -> primaryStage.close());

        cortarItem.setOnAction(e -> System.out.println("Se seleccionó Cortar"));
        copiarItem.setOnAction(e -> System.out.println("Se seleccionó Copiar"));
        pegarItem.setOnAction(e -> System.out.println("Se seleccionó Pegar"));

        acercaDeItem.setOnAction(e -> System.out.println("Se seleccionó Acerca de..."));

        // Añadir los menús a la barra de menú
        menuBar.getMenus().addAll(archivoMenu, editarMenu, ayudaMenu);

        // Crear el diseño
        BorderPane root = new BorderPane();
        root.setTop(menuBar);

        // Crear la escena
        Scene scene = new Scene(root, 400, 300);

        // Configurar la escena y mostrar la ventana
        primaryStage.setScene(scene);
        primaryStage.setTitle("Ejemplo de Barra de Menú");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


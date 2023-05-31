module br.ifba.poo.projeto.biblioteca {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens br.ifba.poo.projeto.biblioteca to javafx.fxml;
    exports br.ifba.poo.projeto.biblioteca;
}

package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class Controller {
    @FXML
    private TextField messageLine;

    @FXML
    private TextArea mainTextArea;

    @FXML
    void getMessageText(ActionEvent event) {
        if (!messageLine.getText().equals("")) {
            mainTextArea.appendText(messageLine.getText() + "\n");
            messageLine.clear();
        }
    }

    @FXML
    void disableTextInput(KeyEvent event) {
        mainTextArea.editableProperty().setValue(false);
    }

    @FXML
    public void mouseClickedTextArea(MouseEvent mouseEvent) {
        mainTextArea.editableProperty().setValue(false);
    }
}


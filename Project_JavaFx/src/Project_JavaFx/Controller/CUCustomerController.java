/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project_JavaFx.Controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/**
 *
 * @author lehie
 */
public class CUCustomerController {
    @FXML
    void btnCancel(ActionEvent event) throws IOException {
        Navigator.getInstance().goToMain();
    }

    @FXML
    void btnSave(ActionEvent event) {

    }

    @FXML
    void txtAddress(ActionEvent event) {

    }

    @FXML
    void txtEmail(ActionEvent event) {

    }

    @FXML
    void txtName(ActionEvent event) {

    }

    @FXML
    void txtPhone(ActionEvent event) {

    }
}
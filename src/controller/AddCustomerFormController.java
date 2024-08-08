package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.Customer;


import java.util.ArrayList;
import java.util.List;

public class AddCustomerFormController {

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtSalary;

    List<Customer> customerList = new ArrayList<>();
    @FXML
    void btnAddOnAction(ActionEvent event) {


//        String id = txtId.getText();
//        String name = txtName.getText();
//        String address = txtAddress.getText();
//        double salary = Double.parseDouble(txtSalary.getText());
//
//        Customer customer = new Customer(id, name, address, salary);
//
//        customerList.add(customer);

        customerList.add(new Customer(
                txtId.getText(),
                txtName.getText(),
                txtAddress.getText(),
                Double.parseDouble(txtSalary.getText())));

        customerList.forEach(cus -> {
            System.out.println(cus);
        } );
        System.out.println("==========================");
    }

    @FXML
    void btnDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void btnSearchOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

}

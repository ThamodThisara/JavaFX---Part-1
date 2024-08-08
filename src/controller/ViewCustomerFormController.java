package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Customer;

import java.util.Observable;

public class ViewCustomerFormController {

    @FXML
    public TableView tblCustomer;

    public TableColumn colId;
    public TableColumn colName;
    public TableColumn colAddress;
    public TableColumn colSalary;

    @FXML
    void btnReloadOnAction(ActionEvent event) {

        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colSalary.setCellValueFactory(new PropertyValueFactory<>("salary"));

        ObservableList<Customer> customerObservableList = FXCollections.observableArrayList();
        customerObservableList.add(new Customer("001", "Kamal", "Ganemulla", 45000.0 ));
        customerObservableList.add(new Customer("001", "Kamal", "Ganemulla", 45000.0 ));
        customerObservableList.add(new Customer("001", "Kamal", "Ganemulla", 45000.0 ));

        tblCustomer.setItems(customerObservableList);
    }

}

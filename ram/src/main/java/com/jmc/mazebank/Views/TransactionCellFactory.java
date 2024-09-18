package com.jmc.mazebank.Views;

import com.jmc.mazebank.Controllers.Client.TransactionCellController;
import com.jmc.mazebank.Models.Transaction;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListCell;

public class TransactionCellFactory extends ListCell<Transaction> {
    @Override
    protected void updateItem(Transaction transaction, boolean empty) {
        super.updateItem(transaction, empty);
        if(empty) {
            setText(null);
            setGraphic(null);
        } else {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/jmc/mazebank/Controllers/Client/TransactionCell.fxml"));
            TransactionCellController controller = new TransactionCellController(transaction);
            loader.setController(controller);
            setText(null);
            try {
                setGraphic(loader.load());
            } catch(Exception err) {
                System.out.println(err.getMessage());
                err.printStackTrace();
            }
        }
    }
}

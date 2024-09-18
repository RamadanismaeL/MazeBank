package com.jmc.mazebank.Controllers.Client;

import java.lang.classfile.Label;
import java.net.URL;
import java.util.ResourceBundle;

import com.jmc.mazebank.Models.Transaction;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.fxml.Initializable;

public class TransactionCellController implements Initializable {
    @SuppressWarnings("exports")
    public FontAwesomeIconView in_icon;
    @SuppressWarnings("exports")
    public FontAwesomeIconView out_icon;
    public Label trans_date_lbl;
    public Label sender_lbl;
    public Label receiver_lbl;
    public Label amount_lbl;

    @SuppressWarnings("unused")
    private final Transaction transaction;

    public TransactionCellController(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {}
    
}

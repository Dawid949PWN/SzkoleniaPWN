package contact;

import com.sun.javafx.scene.control.skin.FXVK;
import java.awt.Image;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import javax.swing.event.ChangeListener;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javax.swing.event.ChangeEvent;
import javafx.scene.ImageCursor;
import javafx.event.event;
import javafx.scene.Node;





public class Controller implements Initializable {

    @FXML
    private Label Contactbook;
    @FXML
    private StackPane menuPanel;
    @FXML
    private Pane ContactPn;
    @FXML
    private Pane exportPn;
    @FXML
    private TableView<Person> table;
    @FXML
    private TextField inputlastnm;
    @FXML
    private TextField inputfirstnm;
    @FXML
    private TextField inputemail;
    @FXML
    private Button btncontent;
    
    private final String MENU_CONTACTS = "KONTAKTY";
    private final String MENU_LIST = "DOCUMENT";
    private final String MENU_EXPORT = "EXPORT";
    private final String MENU_EXIT = "WYLOGUJ";

    private final ObservableList<Person> data = FXCollections.observableArrayList(
            new Person("Daniel", "Bak", "danielbak@gmail.com"),
            new Person("Julia", "Jatrzebska", "jatrzebska@wp.pl"),
            new Person("Klaudia", "Nowosielska", "klaudianow@gmail.com"));
    
    public void setTableData() {
        TableColumn firstnameCol = new TableColumn("Imie");
        firstnameCol.setMinWidth(120);
        firstnameCol.setCellFactory(TextFieldTableCell.forTableColumn());
        firstnameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("firstname"));

        TableColumn lastnameCol = new TableColumn("Nazwisko");
        lastnameCol.setMinWidth(120);
        lastnameCol.setCellFactory(TextFieldTableCell.forTableColumn());
        lastnameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("lastname"));

        TableColumn emailCol = new TableColumn("Email adres");
        emailCol.setMinWidth(200);
        emailCol.setCellFactory(TextFieldTableCell.forTableColumn());
        emailCol.setCellValueFactory(new PropertyValueFactory<Person, String>("email"));

        table.getColumns().addAll(firstnameCol, lastnameCol, emailCol);
        table.setItems(data);
    }


    private void setMenuData() {
        TreeItem<String> treeItemrootjed = new TreeItem<String>("Menu");
        TreeView<String> treeView = new TreeView<String>(treeItemrootjed);

        TreeItem<String> nodeItem1 = new TreeItem<String>(MENU_CONTACTS);
        TreeItem<String> nodeItem2 = new TreeItem<String>(MENU_EXIT);

        nodeItem1.setExpanded(true);
        
        /*Node contactsNode = new ImageView(new Image(getClass().getResourceAsStream("/contact.png")));        
        Node contactsNode = new ImageView(new Image(getClass().getResourceAsStream("/contact1.png")));*/
        
        TreeItem<String> nodeItem11 = new TreeItem<String>(MENU_LIST);
        TreeItem<String> nodeItem22 = new TreeItem<String>(MENU_EXPORT);

        nodeItem1.getChildren().addAll(nodeItem11,nodeItem22);
        treeItemrootjed.getChildren().addAll(nodeItem1,nodeItem2);

        menuPanel.getChildren().add(treeView);
        

        treeView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener(){
        public void changed(ObservableValue observable, Object oldValue, Object newValue){
            
                        TreeItem<String> selectedItem = (TreeItem<String>) newValue;
                        String selectedMenu;
                        selectedMenu = selectedItem.getValue();
                        
                        if (null != selectedMenu) {
                            switch (selectedMenu) {
                                
                                case MENU_CONTACTS:
                                selectedItem.setExpanded(true);
                                break;
                                
                                case MENU_LIST:
                                ContactPn.setVisible(true);
                                exportPn.setVisible(false);
                                break;
                                
                                case MENU_EXPORT:
                                ContactPn.setVisible(false);
                                exportPn.setVisible(true);
                                break;
                                
                                case MENU_EXIT:
                                    System.exit(0);
                                    break;
                            }
                        }
                    }   
                });
            }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        setTableData();
        setMenuData();
    }
}

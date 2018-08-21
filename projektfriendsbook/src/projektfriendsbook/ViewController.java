package projektfriendsbook;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class ViewController implements Initializable {

    @FXML
    private Label Friendsbook;

    @FXML
    private StackPane menuPane;

    @FXML
    private Pane contactPane;

    @FXML
    private Pane exportPane;

    @FXML
    private TableView table;

    @FXML
    private TextField inputFirstname;

    @FXML
    private TextField inputLastname;

    @FXML
    private TextField inputEmail;

    @FXML
    private Label Imie;

    @FXML
    private Label Nazwisko;

    @FXML
    private Label Email;

    @FXML
    private Button addNewContactButton;

    private final String mnznajomy = "Znajomy";
    private final String mnzaswiadczenia = "Lista Znajomych";
    private final String mnzapisz = "Zapisanie";
    private final String mnexit = "Wyloguj";
    
    private final ObservableList<Person> data
            = FXCollections.observableArrayList(
                    new Person("Daniel", "Domalski", "daniel@gmail.com"),
                    new Person("Paulina", "Rudowska", "rudowska@gmail.com"),
                    new Person("Daria", "Stepien", "stepien.a@gmail.com"));

    public void setTableData() {
        TableColumn firstNameCol = new TableColumn("Imie");
        firstNameCol.setMinWidth(10);
        firstNameCol.setCellFactory(TextFieldTableCell.forTableColumn());
        firstNameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("firstName"));

        firstNameCol.setOnEditCommit(
                new javafx.event.EventHandler<TableColumn.CellEditEvent<Person, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Person, String> t) {
                ((Person) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())).setFirstName(t.getNewValue());
            }
        }
        );

        TableColumn lastNameCol = new TableColumn("Nazwisko");
        lastNameCol.setMinWidth(10);
        lastNameCol.setCellFactory(TextFieldTableCell.forTableColumn());
        lastNameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("lastName"));

        lastNameCol.setOnEditCommit(
                new javafx.event.EventHandler<TableColumn.CellEditEvent<Person, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Person, String> t) {
                ((Person) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())).setLastName(t.getNewValue());
            }
        }
        );

        TableColumn emailCol = new TableColumn("Email");
        emailCol.setMinWidth(20);
        emailCol.setCellValueFactory(new PropertyValueFactory<Person, String>("email"));
        emailCol.setCellFactory(TextFieldTableCell.forTableColumn());

        emailCol.setOnEditCommit(
                new javafx.event.EventHandler<TableColumn.CellEditEvent<Person, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Person, String> t) {
                ((Person) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())).setEmail(t.getNewValue());
            }
        }
        );

        table.getColumns().addAll(firstNameCol, lastNameCol, emailCol);
        table.setItems(data);
    }

    public void setMenuData() {
        TreeItem<String> treeItemRoot1 = new TreeItem<>("Menu");
        TreeView<String> treeView = new TreeView<>(treeItemRoot1);
        treeView.setShowRoot(false);

        TreeItem<String> nodeItemX = new TreeItem<>(mnznajomy);
        TreeItem<String> nodeItemY = new TreeItem<>(mnexit);

        TreeItem<String> nodeItemX1 = new TreeItem<>(mnzaswiadczenia);
        TreeItem<String> nodeItemX2 = new TreeItem<>(mnzapisz);

        nodeItemX.getChildren().addAll(nodeItemX1, nodeItemX2);
        treeItemRoot1.getChildren().addAll(nodeItemX, nodeItemY);

        menuPane.getChildren().add(treeView);

        treeView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {
            public void changed(ObservableValue observable, Object oldValue, Object newValue) {
                TreeItem<String> selectedItem = (TreeItem<String>) newValue;
                String selectedMenu;
                selectedMenu = selectedItem.getValue();
                System.out.println("Wybierane modul: " + selectedMenu);

                if (null != selectedMenu) {
                    switch (selectedMenu) {
                        case mnznajomy:
                            try {
                                selectedItem.setExpanded(true);
                            } catch (Exception ex) {
                                }
                            break;
                        case mnexit:
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

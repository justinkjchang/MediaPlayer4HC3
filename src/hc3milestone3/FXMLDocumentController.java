/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hc3milestone3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeView;
import javafx.scene.image.ImageView;

/**
 *
 * @author Koosha
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private SplitPane sp1;
    @FXML
    private SplitPane sp2;
    @FXML
    private Accordion leftMediaMenu;
    @FXML
    private TreeView<?> leftPlaylistTree;
    @FXML
    private SplitPane sp3;
    @FXML
    private SplitPane sp4;
    @FXML
    private SplitPane sp5;
    @FXML
    private ImageView imgSearch;
    @FXML
    private TextField searchText;
    @FXML
    private Button btnSearchClr;
    @FXML
    private SplitPane sp6;
    @FXML
    private Button sortBtnTitle;
    @FXML
    private Button sortBtnArtist;
    @FXML
    private Button sortBtnAlbum;
    @FXML
    private Button sortBtnDuration;
    @FXML
    private ListView<String> listViewTitle;
    @FXML
    private ListView<String> listViewArtist;
    @FXML
    private ListView<String> listViewAlbum;
    @FXML
    private ListView<String> listViewDuration;
    @FXML
    private SplitPane sp7;
    @FXML
    private SplitPane sp8;
    @FXML
    private SplitPane sp9;
    @FXML
    private Button ctrlBtnPrev;
    @FXML
    private Button ctrlBtnNext;
    @FXML
    private Button ctrlBtnStop;
    @FXML
    private Button ctrlBtnPause;
    @FXML
    private Button ctrlBtnPlay;
    @FXML
    private Slider sliderVolume;
    @FXML
    private ImageView imgVolumeIcon;
    @FXML
    private ProgressBar progDurationBar;
    @FXML
    private Label labelTimeDone;
    @FXML
    private Label labelTimeLeft;
    @FXML
    private SplitPane sp0;
    @FXML
    private Label labelStatus;
    @FXML
    private SplitPane sp10;
    @FXML
    private Label labelSong;
    @FXML
    private Label labelArtist;
    @FXML 
    private SplitPane spArtist;
    @FXML 
    private SplitPane spTitle;
    @FXML 
    private SplitPane spDuration;
    @FXML 
    private SplitPane spAlbum;
    
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        populateListView();
        
    }    
    
    public void populateListView() {
        
        ObservableList<String> songTitles = FXCollections.observableArrayList (
            "Never Gonna Give You Up", "Jump", "Bat Country", "Age of Reason", "One",
                "End of the Beginning", "Good is Dead");
        ObservableList<String> songArtists = FXCollections.observableArrayList (
            "Rick Astley", "Van Halen", "Avenged Sevenfold", "Black Sabbath", "Metallica",
                "Black Sabbath", "Black Sabbath");
        ObservableList<String> songAlbums = FXCollections.observableArrayList (
            "Whenever You Need Somebody", "1984", "Avanged Sevenfold", "13", 
                "...And Justice for All", "13", "13");
        ObservableList<String> songDurations = FXCollections.observableArrayList (
            "3:32", "4:04", "5:12", "7:01", "7:24", "8:05", "8:52");
        
        listViewTitle.setItems(songTitles);
        listViewArtist.setItems(songArtists);
        listViewAlbum.setItems(songAlbums);
        listViewDuration.setItems(songDurations);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hc3milestone3;

import java.net.URL;
import java.util.ArrayList;
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
import javafx.scene.control.TitledPane;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

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
    private TreeView<String> leftPlaylistTree;
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
    @FXML
    private ImageView imgClear;
    
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        setIcons();
        populateListView();
        populateAccordionView();
        populateTreeView();
        
    }    
    
    public void populateTreeView() {
        TreeItem<String> rootItem = new TreeItem<> ("Playlists");
        rootItem.setExpanded(true);
        for (int i = 1; i < 10; i++) {
            TreeItem<String> item = new TreeItem<> ("Playlist " + i);            
            rootItem.getChildren().add(item);
        }        
        leftPlaylistTree.setRoot(rootItem);
    }
    
    public void populateAccordionView() {
        GridPane gpMusic = new GridPane(); 
        GridPane gpMovies = new GridPane(); 
        GridPane gpTV = new GridPane(); 
        gpMusic.setVgap(5);
        gpMovies.setVgap(5);
        gpTV.setVgap(5);
        for (int i = 0; i < 5; ++i) {
            gpMovies.add(new Button("Movie Item " + i), 0, i);
            gpTV.add(new Button("TV Item " + i), 0, i);
            gpMusic.add(new Button("Music Item " + i), 0, i);
        }
        leftMediaMenu.getPanes().get(0).setContent(gpMusic);
        leftMediaMenu.getPanes().get(1).setContent(gpTV);
        leftMediaMenu.getPanes().get(2).setContent(gpMovies);
    }
    
    public void setIcons() {
        Image img = new Image("file:clear_search.png");
        imgSearch.setImage(img);    
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
   
    @FXML
    private void titleLVPressed(MouseEvent event) {
        int selected = listViewTitle.getSelectionModel().getSelectedIndex(); 
        listViewAlbum.getSelectionModel().select(selected);
        listViewArtist.getSelectionModel().select(selected);
        listViewDuration.getSelectionModel().select(selected);
    }

    @FXML
    private void artistLVPressed(MouseEvent event) {
        int selected = listViewArtist.getSelectionModel().getSelectedIndex(); 
        listViewAlbum.getSelectionModel().select(selected);
        listViewTitle.getSelectionModel().select(selected);
        listViewDuration.getSelectionModel().select(selected);
    }

    @FXML
    private void albumLVPressed(MouseEvent event) {
        int selected = listViewAlbum.getSelectionModel().getSelectedIndex(); 
        listViewTitle.getSelectionModel().select(selected);
        listViewArtist.getSelectionModel().select(selected);
        listViewDuration.getSelectionModel().select(selected);
    }

    @FXML
    private void durationLVPressed(MouseEvent event) {
        int selected = listViewDuration.getSelectionModel().getSelectedIndex(); 
        listViewAlbum.getSelectionModel().select(selected);
        listViewArtist.getSelectionModel().select(selected);
        listViewTitle.getSelectionModel().select(selected);
    }
}

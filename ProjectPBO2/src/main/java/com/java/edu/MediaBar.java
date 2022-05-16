/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.edu;

import java.util.concurrent.Callable;
import javafx.application.Platform;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaPlayer.Status;
import javafx.util.Duration;

/**
 *
 * @author axels
 */
public class MediaBar extends HBox{
    private Slider time = new Slider();
    private Slider vol = new Slider();
    
    private Button playButton = new Button("||");
    
    private Label volume = new Label("Volume : ");
    private Label awal = new Label("00:00");
    private Label delimiter = new Label("/");
    private Label akhir = new Label("00:00");
    
    private MediaPlayer player;

    public MediaBar(MediaPlayer play) {
        this.player = play;
        
        setAlignment(Pos.CENTER);
        setPadding(new Insets(5,10,5,10));
        
        vol.setPrefWidth(70);
        vol.setMinWidth(30);
        vol.setValue(100);
        
        HBox.setHgrow(time, Priority.ALWAYS);
        
        playButton.setPrefWidth(30);
        
        // menentukan durasi total video (contoh = 34:25)
        tentukanDurasi();
        
        getChildren().add(playButton);
        getChildren().add(awal);
        getChildren().add(delimiter);
        getChildren().add(akhir);
        getChildren().add(time);
        getChildren().add(volume);
        getChildren().add(vol);
        
        // tombol pause & play
        playButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Status status = player.getStatus();
                
                if (status == Status.PLAYING) {
                    // kalo di pencet waktu video sudah selesai
                    if (player.getCurrentTime().greaterThanOrEqualTo(player.getTotalDuration())) {
                        player.seek(player.getStartTime());
                        player.play();
                    }else{
                        player.pause();
                        playButton.setText(">");
                    }
                }
                // kalo di pause
                if (status == Status.PAUSED || status == Status.HALTED || status == Status.STOPPED) {
                    player.play();
                    playButton.setText("||");
                }
            }
        });
        
        
        // untuk membuat video skip ke bagian kita pencet
        time.valueProperty().addListener(new InvalidationListener() {
            public void invalidated(Observable observable) {
                if (time.isPressed()) {
                    player.seek(player.getMedia().getDuration().multiply(time.getValue()/100));
                }
            }
        });
        
        // mengatur volume
        vol.valueProperty().addListener(new InvalidationListener(){
            @Override
            public void invalidated(Observable observable) {
                if (vol.isPressed()) {
                    player.setVolume(vol.getValue()/100); 
                }
            }
        });
        
        // update slider biar sesuai sama video
        player.currentTimeProperty().addListener(new InvalidationListener() {
            public void invalidated(Observable observable) {
                updatesValue();
            }
        });
    }
    
    public void updatesValue(){
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                // mbikin biar slider bisa jalan sesuai waktu di video (kaya slider merah di youtube)
                time.setValue(player.getCurrentTime().toMillis()/player.getTotalDuration().toMillis()*100);
                
                // mengupdate waktu biar sesuai dengan waktu yang ada di video sekarang (contoh = 01:22 / 23:00)
                awal.textProperty().bind(Bindings.createStringBinding(new Callable<String>() {
                    @Override
                    public String call() throws Exception {
                        return getTime(player.getCurrentTime());
                    }
                } , player.currentTimeProperty()));
                
            }
        });
    }
    
    public String getTime(Duration time){
        String x = "";
        int jam = (int) time.toHours();
        int menit = (int) time.toMinutes();
        int detik = (int) time.toSeconds();
        
        if (detik>59) {
            detik = detik % 60;
        }
        if (menit>59) {
            menit = menit % 60;
        }
        if (jam>59) {
            jam = jam % 60;
        }
        
        if (jam>0) {
            x = String.format("%d:%02d:%02d", jam, menit, detik);
        }else {
            x = String.format("%02d:%02d", menit, detik);
        }
        return x;
    }
    
    public void tentukanDurasi(){
        akhir.textProperty().bind(Bindings.createStringBinding(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return getTime(player.getTotalDuration());
            }
        } , player.totalDurationProperty()));
    }
    
}

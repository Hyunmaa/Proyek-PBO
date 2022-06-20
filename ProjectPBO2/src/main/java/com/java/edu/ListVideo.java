/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.edu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.util.stream.*;

/**
 *
 * @author axels
 */
public class ListVideo {
    String[] tempArgs;
    ArrayList<Video> listVideo;

    public ListVideo() {
        listVideo = Menu.getVideo();
        showVideo();
    }

    public ListVideo(ArrayList<Video> lv) {
        listVideo = lv;
        showVideo();
    }

    public void showVideo() {
        JFrame lv = new JFrame();

        JPanel vp = new JPanel();
        vp.setLayout(new GridLayout(0, 5, 30, 50));
        vp.setBackground(Color.BLACK);

        for (int i = 0; i < listVideo.size(); i++) {
            VideoPanel jp = new VideoPanel(listVideo.get(i));
            JLabel video = new JLabel();

            video.setIcon(listVideo.get(i).getIcon());
            video.setText(listVideo.get(i).getJudul() + "  ||  " + listVideo.get(i).getViews() + " views");
            video.setForeground(Color.WHITE);
            video.setHorizontalTextPosition(JLabel.CENTER);
            video.setVerticalTextPosition(JLabel.BOTTOM);

            JLabel nama = new JLabel(listVideo.get(i).getOwner().getNama());
            nama.setForeground(Color.WHITE);

            jp.setPreferredSize(new Dimension(200, 100));
            jp.add(video);
            jp.add(nama);
            jp.setBackground(Color.black);

            vp.add(jp);
            vp.revalidate();
        }
        JScrollPane js = new JScrollPane(vp, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        // js.setPreferredSize(new Dimension(710,150));

        lv.add(js);
        lv.pack();
        lv.setPreferredSize(new Dimension(800, 400));
        lv.setVisible(true);
    }

    public List<Video> sortVideo() {
        List<Video> sortedList = listVideo.stream().sorted().collect(Collectors.toList());

        return sortedList;
    }
}

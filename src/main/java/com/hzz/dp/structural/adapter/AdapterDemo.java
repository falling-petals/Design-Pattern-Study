package com.hzz.dp.structural.adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();

        player.play("mp3", "海阔天空.mp3");
        player.play("mp4", "电影.mp4");
        player.play("vlc", "纪录片.vlc");
        player.play("avi", "视频.avi");
    }
}

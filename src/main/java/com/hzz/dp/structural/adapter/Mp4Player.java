package com.hzz.dp.structural.adapter;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        // 不支持
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("播放 mp4: " + fileName);
    }
}

package com.hzz.dp.structural.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("播放 vlc: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // 不支持
    }
}

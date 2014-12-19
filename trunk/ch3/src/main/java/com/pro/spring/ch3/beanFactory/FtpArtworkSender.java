package com.pro.spring.ch3.beanFactory;

public class FtpArtworkSender implements ArtworkSender {
    
    public void sendArtwork(String artworkPath, Recipient recipient) {
        // ftp logic here...
    }

    
    public String getFriendlyName() {
        return "File Transfer Protocol";
    }

    
    public String getShortName() {
        return "ftp";
    }
}

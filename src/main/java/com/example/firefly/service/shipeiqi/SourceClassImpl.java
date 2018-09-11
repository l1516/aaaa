package com.example.firefly.service.shipeiqi;

public class SourceClassImpl extends DestinationClassImpl implements SourceClass {

    @Override
    public String mp4() {
        String a = mp3();
        return "i am InterfaceImpl1 mp4;" + a;
    }
}

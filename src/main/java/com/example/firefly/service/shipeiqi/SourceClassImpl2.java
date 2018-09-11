package com.example.firefly.service.shipeiqi;

public class SourceClassImpl2 implements SourceClass {

    private DestinationClass destinationClass;

    public SourceClassImpl2(DestinationClass destinationClass) {
        this.destinationClass = destinationClass;
    }

    @Override
    public String mp4() {
        String a = this.destinationClass.mp3();
        return "i am InterfaceImpl1 mp4;" + a;
    }
}

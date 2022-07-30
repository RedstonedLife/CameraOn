package com.bss.inc.cameraon.utils.net.angryscan.feeders;


import com.bss.inc.cameraon.i18n.I18n;

public abstract class AbstractFeeder implements Feeder {

    public String getName() {
        return I18n.tl(getId());
    }

    @Override
    public String toString() {
        return getName() + ": " + getInfo();
    }
}

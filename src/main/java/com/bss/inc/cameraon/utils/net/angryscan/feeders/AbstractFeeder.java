package com.redsoftware.ltd.bnc.utils.networking.angryscan.feeders;

import com.redsoftware.ltd.bnc.i18n.I18n;

public abstract class AbstractFeeder implements Feeder {

    public String getName() {
        return I18n.tl(getId());
    }

    @Override
    public String toString() {
        return getName() + ": " + getInfo();
    }
}

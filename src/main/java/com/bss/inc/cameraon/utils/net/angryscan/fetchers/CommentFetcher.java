package com.bss.inc.cameraon.utils.net.angryscan.fetchers;

import com.bss.inc.cameraon.utils.net.angryscan.ScanningSubject;

public class CommentFetcher extends AbstractFetcher {
    public static final String ID = "fetcher.comment";

    private CommentsConfig commentsConfig;

    public CommentFetcher(CommentsConfig commentsConfig) {
        this.commentsConfig = commentsConfig;
    }

    public String getId() {
        return ID;
    }

    public Object scan(ScanningSubject subject) {
        String mac = (String) subject.getParameter(MACFetcher.ID);
        return commentsConfig.getComment(subject.getAddress(), mac);
    }
}

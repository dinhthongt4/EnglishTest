package com.example.thongdt.englishtest.objects;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by thongdt on 02/11/2015.
 */
public class Grammar {
    private String urlAvatar;
    private String title;

    public String getUrlAvatar() {
        return urlAvatar;
    }

    public void setUrlAvatar(String urlAvatar) {
        this.urlAvatar = urlAvatar;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

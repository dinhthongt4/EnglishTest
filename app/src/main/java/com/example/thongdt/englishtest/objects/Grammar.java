package com.example.thongdt.englishtest.objects;

import com.orm.SugarRecord;

/**
 * Created by thongdt on 02/11/2015.
 */
public class Grammar extends SugarRecord<Grammar> {
    private String urlAvatar;
    private String title;
    private String structure;
    private String use;
    private String spelling_rules;
    private String key;

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public String getSpelling_rules() {
        return spelling_rules;
    }

    public void setSpelling_rules(String spelling_rules) {
        this.spelling_rules = spelling_rules;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

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

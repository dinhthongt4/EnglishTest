package com.example.thongdt.englishtest.objects;

import java.util.ArrayList;

/**
 * Created by thongdt on 11/11/2015.
 */
public class GrammarResponse {

    private ArrayList<Grammar> grammar;
    private boolean error;

    public ArrayList<Grammar> getGrammar() {
        return grammar;
    }

    public void setGrammar(ArrayList<Grammar> grammar) {
        this.grammar = grammar;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public class Grammar {
        String name;
        String structure;
        String use;
        String spelling_rules;
        String key;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUse() {
            return use;
        }

        public void setUse(String use) {
            this.use = use;
        }

        public String getStructure() {
            return structure;
        }

        public void setStructure(String structure) {
            this.structure = structure;
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

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        String avatar;
    }
}

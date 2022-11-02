package com.mysite.core.models;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class)
public class Footer {

    @Inject
    @Default(values = "BEST ORGANIZATION")
    private String text;
    @Inject
    @Default(values = "BEST ORGANIZATION1")
    private String text1;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }



}

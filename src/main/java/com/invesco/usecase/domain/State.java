package com.invesco.usecase.domain;

import javax.persistence.Embeddable;

@Embeddable
public class State {


    private String province;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}

package com.example.checklistversion8;

import java.io.Serializable;

public class Tracker implements Serializable {
    private Boolean checked = false;
    private String buttonName;


    public Tracker(String btnName) {
        buttonName = btnName;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public String getButtonName() {
        return buttonName;
    }

    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
    }

    @Override
    public String toString() {
        return "Tracker{" +
                "checked=" + checked +
                ", buttonName='" + buttonName + '\'' +
                '}';
    }
}

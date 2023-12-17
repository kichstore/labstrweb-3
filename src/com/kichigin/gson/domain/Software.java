package com.kichigin.gson.domain;

import java.util.List;

public class Software {
    List<Staff> staff;
    @Override
    public String toString() {
        return "Software [employees=" + staff + "]";
    }
}

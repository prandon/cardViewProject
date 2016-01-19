package com.hello.megamind.cardview;

import java.util.List;

class Information {
    String name;

    Information(String name){
        this.name = name;
    }
}

private List<Information> informationList;

private void intialiseData(){
    informationList = new Information<>();
    informationList.add(new Information("pranjal"));
    informationList.add(new Information("akshay"));
    informationList.add(new Information("pam"));
}
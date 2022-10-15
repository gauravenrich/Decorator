package com.gaurav.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{

    String directoryName;
    List<Object> objectList;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        objectList=new ArrayList<>();
    }

    public void add(Object object){
        objectList.add(object);
    }

    @Override
    public void ls() {
        System.out.println("Directory name "+directoryName);
        objectList.forEach(o -> {
            if(o instanceof File){
                ((File) o).ls();
            } else if (o instanceof Directory) {
                ((Directory) o).ls();
            }
        });

    }
}

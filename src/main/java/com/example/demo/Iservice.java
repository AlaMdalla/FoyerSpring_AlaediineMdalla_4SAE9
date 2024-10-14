package com.example.demo;

import jakarta.persistence.Id;

import java.util.List;

public interface Iservice<Obj,Id>{
    Obj addTo(Obj object);
    void delete(Id id);
    List<Obj> getAll();
    Obj update(Obj object);


}

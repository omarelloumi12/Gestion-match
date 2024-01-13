package com.example.stade.dtos;

import jakarta.persistence.*;
import lombok.*;


@Data
public class PersonneDTO {
    private int id;
    private  String firstName;
    private String lastName;
    private  String nation;
    private  String picture;
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.medicare.model;

/**
 *
 * @author RewSum
 */
public class Doctor {
    private String id;
    private String name;
    private String specialty;
    private String schedule;

    public Doctor(String id, String name, String specialty, String schedule) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Doctor{" + "specialty=" + specialty + '}';
    }
    
}

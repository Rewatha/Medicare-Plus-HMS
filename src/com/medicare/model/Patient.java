/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.medicare.model;

/**
 *
 * @author RewSum
 */
public class Patient {
    private String id;
    private String name;
    private int age;
    private String contactNumber;
    private String medicalHistory;

    public Patient(String id, String name, int age, String contactNumber, String medicalHistory) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.contactNumber = contactNumber;
        this.medicalHistory = medicalHistory;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    @Override
    public String toString() {
        return "Patient{" + "id=" + id + ", name=" + name + '}';
    }
    
}

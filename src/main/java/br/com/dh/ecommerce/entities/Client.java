package br.com.dh.ecommerce.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table
public class Client implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idclient;
    private String email;
    private String fullname;
    private Date birthdate;
    private String cpf;
    private String city;
    private String postalcode;
    private String state;
    private String street;
    private String residencenumber;
    private String  residencecomplement;
    private LocalDate creationdate;

    // Construtores
    public Client() {
    }

    public Client(Integer idclient, String email, String fullname, Date birthdate, String cpf, String city, String postalcode, String state, String street, String residencenumber, String residencecomplement, LocalDate creationdate) {
        this.idclient = idclient;
        this.email = email;
        this.fullname = fullname;
        this.birthdate = birthdate;
        this.cpf = cpf;
        this.city = city;
        this.postalcode = postalcode;
        this.state = state;
        this.street = street;
        this.residencenumber = residencenumber;
        this.residencecomplement = residencecomplement;
        this.creationdate = creationdate;
    }


    // Getters and Setters


    public Integer getIdclient() {
        return idclient;
    }

    public void setIdclient(Integer idclient) {
        this.idclient = idclient;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getResidencenumber() {
        return residencenumber;
    }

    public void setResidencenumber(String residencenumber) {
        this.residencenumber = residencenumber;
    }

    public String getResidencecomplement() {
        return residencecomplement;
    }

    public void setResidencecomplement(String residencecomplement) {
        this.residencecomplement = residencecomplement;
    }

    public LocalDate getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(LocalDate creationdate) {
        this.creationdate = creationdate;
    }
}
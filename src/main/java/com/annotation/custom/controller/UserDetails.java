package com.annotation.custom.controller;

import com.annotation.custom.validators.Phone;
import com.annotation.custom.validators.Year;
import org.hibernate.validator.constraints.Email;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.util.Date;


public class UserDetails {

    @Size(min = 2, max = 30)
    private String name;

    @NotNull
    @Email
    private String email;

    @NotNull
    @Min(13)
    @Max(110)
    private Integer age;

    @Size(min = 10)
    @Phone
    private String phone;

    @NotNull
    private Gender gender;

    @DateTimeFormat(pattern = "MM/dd/yyyy")
    @NotNull
    @Past
    @Year(1989)
    private Date birthday;

    private Boolean receiveNewsletter;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(final Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(final String phone) {
        this.phone = phone;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(final Gender gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(final Date birthday) {
        this.birthday = birthday;
    }

    public Boolean getReceiveNewsletter() {
        return receiveNewsletter;
    }

    public void setReceiveNewsletter(final Boolean receiveNewsletter) {
        this.receiveNewsletter = receiveNewsletter;
    }

    @Override
    public String toString() {
        return "UserDetails [name=" + name + ", email=" + email + ", age=" + age
                + ", phone=" + phone + ", gender=" + gender + ", birthday="
                + birthday + ", receiveNewsletter=" + receiveNewsletter + "]";
    }

    public enum Gender {
        MALE, FEMALE
    }

}
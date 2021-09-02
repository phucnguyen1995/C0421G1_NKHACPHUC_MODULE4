package com.example.dto;

import com.example.model.entity.User;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserDto implements Validator {

    private Integer id;


    @NotBlank(message = "Tên không được để trống")
    @Size(min=5,max = 45,message = "Tên phải có ít nhất 5 kí tự,nhiều nhất 45 kí tự")
    private String firstName;

    @NotBlank(message = "Tên không được để trống")
    @Size(min=5,max = 45,message = "Tên phải có ít nhất 5 kí tự,nhiều nhất 45 kí tự")
    private String lastName;


    private String phoneNumber;


    @Min(value = 18,message = "tuổi phải lớn hơn 18")
    private int age;

    @Email(message = "Vui lòng nhập đúng định dạng email")
    private String email;

    public UserDto() {
    }

    public UserDto(Integer id, @NotBlank(message = "Tên không được để trống") @Size(min = 5, max = 45, message = "Tên phải có ít nhất 5 kí tự,nhiều nhất 45 kí tự") String firstName, @NotBlank(message = "Tên không được để trống") @Size(min = 5, max = 45, message = "Tên phải có ít nhất 5 kí tự,nhiều nhất 45 kí tự") String lastName, String phoneNumber, @Min(value = 18, message = "lớn hơn 18") int age, @Email(message = "Vui lòng nhập đúng định dạng email") String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        UserDto userDto =(UserDto) target;

     



    }
}

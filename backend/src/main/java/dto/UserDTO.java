package com.todolist.dto;
import javax.validation.constraints.NotBlank;

public class UserDto {

    @NotBlank(message = "Username is mandatory")
    private String username;

    @NotBlank(message = "Level is mandatory")
    private String nivel;

    public UserDto() {
    }

    public UserDto(String username, String nivel) {
        this.username = username;
        this.nivel = nivel;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}

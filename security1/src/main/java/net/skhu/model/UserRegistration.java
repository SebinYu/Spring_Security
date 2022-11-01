package net.skhu.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class UserRegistration {

    @NotEmpty @NotBlank
    @Email
    String email;

    @NotEmpty
    @Size(min=6, max=12)
    String passwd;

    @NotEmpty @NotBlank
    @Size(min=2, max=30)
    String name;

    @NotEmpty
    String address;

    @NotEmpty
    String address_detail;
}

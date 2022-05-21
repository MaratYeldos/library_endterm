package com.example.final_java_yeldos.dto;


import com.example.final_java_yeldos.model.RoleType;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDataDTO {

    @ApiModelProperty(position = 0)
    private String username;
    @ApiModelProperty(position = 1)
    private String email;
    @ApiModelProperty(position = 2)
    private String password;
    @ApiModelProperty(position = 3)
    List<RoleType> appUserRoles;

}


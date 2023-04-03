package com.school.user.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description TODO
 * @ClassName LoginDto
 * @Author 龙涛05664416459
 * @Date 2023/4/3 19:51
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginDto implements Serializable {

    private String userPhone;

    private String userPassward;
}

package com.example.code.service;

import java.awt.*;

/**
 * 生成验证码图片
 * @Date: 2022-04-11 20:13
 * version 1.0
 */
public interface IGenerateImageService {

    /**
     * 根据给定的字符串生成验证码图片
     * @param verifyCode 验证码字符串
     * @return 验证码图片
     */
    Image imageWithDisturb(String verifyCode);

}
package com.example.mimall.mi.util;
/**
 * @Author: kotori
 * @Date: 2020/10/14 15:26
 * @Description:
 */

import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @ClassName Md5Encrypt
 * @Description TODO
 * @Author kotori
 */
@Component
public class Md5Encrypt {
    private static String byteToHexString(byte b) {
        int bInt = b;
        if (bInt < 0) {
            b ^= (1 << 7);
            bInt = b + (1 << 7);
        }

        String lowBit = Integer.toHexString(bInt / 16);
        String highBit = Integer.toHexString(bInt % 16);

        return lowBit + highBit;
    }

    public String computeHexString(String str) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("md5");
            byte[] resultBytes = md5.digest(str.getBytes(StandardCharsets.UTF_8));

            StringBuilder builder = new StringBuilder();
            for (byte b : resultBytes) {
                builder.append(byteToHexString(b));
            }

            return builder.toString();
        } catch (NoSuchAlgorithmException ex) {
            return "";
        }
    }
}

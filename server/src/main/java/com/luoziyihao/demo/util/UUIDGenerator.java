package com.luoziyihao.demo.util;


import java.util.UUID;

/**
 * @author xiang.rao created on 2/6/18 4:22 PM
 * @version $Id$
 */
public interface UUIDGenerator {




    static String uuid() {
        String s = UUID.randomUUID().toString();
        // 去掉 "-" 符号
        StringBuilder builder = new StringBuilder()
                .append(s.substring(0, 8))
                .append(s.substring(9, 13))
                .append(s.substring(14, 18))
                .append(s.substring(19, 23))
                .append(s.substring(24));
        return builder.toString();
    }
}

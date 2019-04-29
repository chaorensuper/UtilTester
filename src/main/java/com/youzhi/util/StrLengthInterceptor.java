package com.youzhi.util;

/**
 * Create by 姚兰 2019/4/28  15:58
 */
public class StrLengthInterceptor {
    public static String strLLengthInterceptor(String str ,Integer len) {
        String str_new = null;
        if(str.length()>ConstantUtil.StrConstant){
            str_new = str.substring(0, ConstantUtil.StrConstant);
        }
        return str_new+"...";
    }

    public static String strLLengthInterceptor(String str) {
        return strLLengthInterceptor(str,ConstantUtil.StrConstant);
    }

    public static void main(String[] args) {
        System.out.println(StrLengthInterceptor.strLLengthInterceptor("djsiaofiajfiwehffuhf"));
    }
}

package com.san.Filter;

import com.google.gson.Gson;
import com.san.security.Security;
import com.san.userInfo.UserInfo;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.mvc.method.annotation.RequestBodyAdvice;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;

@RestControllerAdvice
public class MyRestControllerAdvice implements RequestBodyAdvice {

    public static boolean set(Object o, String fieldName, Object fieldValue) {
        Class<?> clazz = o.getClass();
        while (clazz != null) {
            try {
                Field field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                field.set(o, fieldValue);
                return true;
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static <V> V get(Object o, String fieldName) {
        Class<?> clazz = o.getClass();
        while (clazz != null) {
            try {
                Field field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                return (V) field.get(o);
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public boolean isTokenUserInfoValid(UserInfo userInfo) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
        if (request.getRemoteAddr().trim().equals(userInfo.getIp().trim()) && request.getHeader("user-agent").trim().equals(userInfo.getAgent().trim()))
            return true;
        return false;
    }

    @Override
    public boolean supports(MethodParameter methodParameter, Type type, Class<? extends HttpMessageConverter<?>> aClass) {
        return true;
    }

    @Override
    public Object handleEmptyBody(Object o, HttpInputMessage httpInputMessage, MethodParameter methodParameter, Type type, Class<? extends HttpMessageConverter<?>> aClass) {
        return null;
    }

    @Override
    public HttpInputMessage beforeBodyRead(HttpInputMessage httpInputMessage, MethodParameter methodParameter, Type type, Class<? extends HttpMessageConverter<?>> aClass) throws IOException {
        return httpInputMessage;
    }

    public UserInfo decryptJWToken(String jwtoken) {
        Gson gson = new Gson();
        Security security = new Security();
        return gson.fromJson(security.decryptAES(jwtoken), UserInfo.class);
    }

    @Override
    public Object afterBodyRead(Object body, HttpInputMessage httpInputMessage, MethodParameter methodParameter, Type type, Class<? extends HttpMessageConverter<?>> aClass) {

        UserInfo userInfo = get(body, "userInfo");
        if (userInfo != null) {
            userInfo = decryptJWToken(userInfo.getAccess_token());
            if (!isTokenUserInfoValid(userInfo))
                throw new java.lang.Error("Invalid Token");
            set(body, "userInfo", userInfo);
        }
        return body;
    }
}

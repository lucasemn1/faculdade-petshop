package com.AnormaisEBruna.petshop.interceptors;

import com.AnormaisEBruna.petshop.models.UserModel;
import com.AnormaisEBruna.petshop.services.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import java.io.PrintWriter;

public class AuthInterceptor implements HandlerInterceptor {
    @Autowired
    private UserService userService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String email = request.getHeader("email");
        String password = request.getHeader("password");

        try {
            UserModel user = this.userService.findByCredentials(email, password);
            request.setAttribute("user", user);

            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());

            response.setStatus(HttpServletResponse.SC_FORBIDDEN);
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");

            String mensagem = "Acesso negado";
            PrintWriter writer = response.getWriter();
            writer.print(mensagem);
            writer.flush();

            return false;
        }
    }
}

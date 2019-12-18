//package com.example.auditable.configuration;
//
//import lombok.extern.log4j.Log4j2;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Log4j2
//public class AuthFilter extends OncePerRequestFilter {
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws ServletException, IOException {
//        log.info("ENTER|doFilterInternal|request : " + request.toString() + " |response : " + response.toString());
//        String userId = request.getHeader("user-id");
//        System.out.println("user-id : " + userId);
//        log.debug("CHKVAL|userId : " + userId);
//
//        List<String> authorities = Arrays.asList(new String[]{"ROLE_ADMIN"});
//        UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(userId,
//                null, authorities.stream().map(a -> new SimpleGrantedAuthority(a)).collect(Collectors.toList()));
//        SecurityContextHolder.getContext().setAuthentication(auth);
//
//        chain.doFilter(request, response);
//    }
//}

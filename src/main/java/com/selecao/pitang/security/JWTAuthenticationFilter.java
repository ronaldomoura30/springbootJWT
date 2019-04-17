package com.selecao.pitang.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;

/* Classe responsavel por validarmos a existencia de um JWT nas requisições, com ajuda do service TokenAuthenticationService*/
public class JWTAuthenticationFilter extends GenericFilterBean {
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		
		Authentication authentication = TokenAuthenticationService
				.getAuthentication((HttpServletRequest) request);
		
		SecurityContextHolder.getContext().setAuthentication(authentication);
		filterChain.doFilter(request, response);
	}

}

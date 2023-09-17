/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.llq.Security.Dto;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;


public class JwtDto {
    private String Token;
    private String bearer = "Bearer";
    private String nombreUsuario;
    private Collection<? extends GrantedAuthority> athorities;

    public JwtDto(String Token, String nombreUsuario, Collection<? extends GrantedAuthority> athorities) {
        this.Token = Token;
        this.nombreUsuario = nombreUsuario;
        this.athorities = athorities;
    }

    public String getToken() {
        return Token;
    }

    public void setToken(String Token) {
        this.Token = Token;
    }

    public String getBearer() {
        return bearer;
    }

    public void setBearer(String bearer) {
        this.bearer = bearer;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Collection<? extends GrantedAuthority> getAthorities() {
        return athorities;
    }

    public void setAthorities(Collection<? extends GrantedAuthority> athorities) {
        this.athorities = athorities;
    }
    
    
                    
}

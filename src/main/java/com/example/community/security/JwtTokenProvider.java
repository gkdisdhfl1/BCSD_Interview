//package com.example.community.security;
//
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//import java.util.Date;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class JwtTokenProvider {
//  @Autowired
//  private JwtConfig jwtConfig;
//
//  public String generateToken(String username) {
//    Date now = new Date();
//    Date expiryDate = new Date(now.getTime() + jwtConfig.getExpirationMs());
//
//    return Jwts.builder()
//        .setSubject(username)
//        .setIssuedAt(new Date())
//        .setExpiration(expiryDate)
//        .signWith(SignatureAlgorithm.HS512, jwtConfig.getSecret())
//        .compact();
//  }
//
//  public String getUsernameFromToken(String token) {
//    return Jwts.parser()
//        .setSigningKey(jwtConfig.getSecret())
//        .parseClaimsJws(token)
//        .getBody()
//        .getSubject();
//  }
//
//  public boolean validateToken(String token) {
//    try {
//      Jwts.parser().setSigningKey(jwtConfig.getSecret()).parseClaimsJws(token);
//      return true;
//    } catch (Exception e) {
//      // 유효하지 않은 토큰
//      return false;
//    }
//  }
//}

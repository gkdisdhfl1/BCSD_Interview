package com.example.community.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;

public class JwtTokenUtil {

  // JWT 발급
  public static String createToken(String loginId, String key, long expireTimeMs) {
    // Claim = Jwt Token에 들어갈 정보
    // Claim에 loginId를 넣어 줌으로써 나중에 loginId를 꺼낼 수 있음
    Claims claims = Jwts.claims();
    claims.put("loginId", loginId);

    return Jwts.builder()
        .setClaims(claims)
        .setIssuedAt(new Date(System.currentTimeMillis()))
        .setExpiration(new Date(System.currentTimeMillis() + expireTimeMs))
        .signWith(SignatureAlgorithm.HS256, key)
        .compact();
  }

  // claims에서 login id 꺼내기
  public static String getLoginId(String token, String secretKey) {
    return extractClaims(token, secretKey).get("loginId").toString();
  }

  // 발급된 tokendl 만료 시간이 지났는지 확인
  public static boolean isExpired(String token, String secretKey) {
    Date expiredDate = extractClaims(token, secretKey).getExpiration();
    // Token의 만료 날짜가 지금보다 이전인지 check
    return expiredDate.before(new Date());
  }

  private static Claims extractClaims(String token, String secretKey) {
    return Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token).getBody();
  }
}

package com.aniket;

import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.crypto.SecretKey;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

public class Test {

    public static void main(String[] args) {

        // Demo key: use a securely stored secret in real applications
        String secret = "0123456789abcdef0123456789abcdef";

        SecretKey key = Keys.hmacShaKeyFor(
                secret.getBytes(StandardCharsets.UTF_8));

        // Generate JWT
        String token = Jwts.builder()
                .id("8562455")
                .subject("sample")
                .issuedAt(new Date())
                .expiration(new Date(
                        System.currentTimeMillis()
                        + TimeUnit.MINUTES.toMillis(2)))
                .issuer("Aniket")
                .signWith(key)
                .compact();

        System.out.println(token);

        // Parse JWT and verify its signature
        Claims c = Jwts.parser()
                .verifyWith(key)
                .build()
                .parseSignedClaims(token)
                .getPayload();

        // Read claims
        System.out.println(c.getSubject());
        System.out.println(c.getIssuer());
        System.out.println(c.getExpiration());
    }
}

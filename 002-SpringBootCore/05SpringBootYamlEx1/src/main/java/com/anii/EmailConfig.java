package com.anii;

import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("my.app")
public class EmailConfig {

	 private String host;
	 private int port;
	 private String username;
	 private String password;
	 
	 private Set<String> protocol;
	 private Map<String,String> headers;
	 
	 //object creted automatically
	 private Certificate cobj;
	 
	 public Set<String> getProtocol() {
		return protocol;
	}
	 public void setProtocol(Set<String> protocol) {
		 this.protocol = protocol;
	 }
	 public Map<String, String> getHeaders() {
		 return headers;
	 }
	 public void setHeaders(Map<String, String> headers) {
		 this.headers = headers;
	 }
	 public Certificate getCobj() {
		 return cobj;
	 }
	 public void setCobj(Certificate cobj) {
		 this.cobj = cobj;
	 }
	 public String getHost() {
		 return host;
	 }
	 public void setHost(String host) {
		 this.host = host;
	 }
	 public int getPort() {
		 return port;
	 }
	 public void setPort(int port) {
		 this.port = port;
	 }
	 public String getUsername() {
		 return username;
	 }
	 public void setUsername(String username) {
		 this.username = username;
	 }
	 public String getPassword() {
		 return password;
	 }
	 public void setPassword(String password) {
		 this.password = password;
	 }
	 @Override
	 public String toString() {
		return "EmailConfig [host=" + host + ", port=" + port + ", username=" + username + ", password=" + password
				+ ", protocol=" + protocol + ", headers=" + headers + ", cobj=" + cobj + "]";
	 }
	 
	 
	 
}

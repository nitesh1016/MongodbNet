package com.netflix.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter 
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "UserLogin")
public class UserLogin {
	@Id
	private int id;
	private String name;
	private String email;
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getUserId() {
//		return UserId;
//	}
//	public void setUserId(String userId) {
//		UserId = userId;
//	}
//	public String getName() {
//		return Name;
//	}
//	public void setName(String name) {
//		Name = name;
//	}
//	public String getEmail() {
//		return Email;
//	}
//	public void setEmail(String email) {
//		Email = email;
//	}
//	public Userbasic(int id, String userId, String name, String email) {
//		super();
//		this.id = id;
//		UserId = userId;
//		Name = name;
//		Email = email;
//	}
//	public Userbasic() {
//		super();
//		
//	}
//	
//	
	

}

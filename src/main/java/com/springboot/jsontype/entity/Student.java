package com.springboot.jsontype.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import com.vladmihalcea.hibernate.type.json.JsonStringType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TypeDef(name = "json", typeClass = JsonStringType.class)
public class Student {
	@Id
	@GeneratedValue
	private Long id;
	
	@Type(type = "json")
	@Column(columnDefinition = "json")
	private String data;
	
	@Transient
	private Object json;
}

package com.latam.JPAcrud.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Contiene el mensaje y el código, para no crear los atributos y repetir código en todas las clases VO
//que creemos.

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GenericVO {
	String mensaje;
	String codigo;
}

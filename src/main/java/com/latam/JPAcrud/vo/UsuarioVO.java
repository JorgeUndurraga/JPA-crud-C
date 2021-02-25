package com.latam.JPAcrud.vo;

import java.util.List;

import com.latam.JPAcrud.modelo.Usuario;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true) /*sirve para utilizar la superclase
GenericVO al llamar al método equals de UsuarioVO y comparar incluyendo los
atributos heredados ( equals sirve para comparar dos instancias).
*/
public class UsuarioVO extends GenericVO{
	
	List<Usuario> usuarios;
	
	public UsuarioVO(String mensaje, String codigo, List<Usuario> usuarios) {
		super(mensaje, codigo);
		this.usuarios = usuarios;
		}

	

}

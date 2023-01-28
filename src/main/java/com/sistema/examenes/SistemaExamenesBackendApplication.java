package com.sistema.examenes;

import com.sistema.examenes.entity.Rol;
import com.sistema.examenes.entity.Usuario;
import com.sistema.examenes.entity.UsuarioRol;
import com.sistema.examenes.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SistemaExamenesBackendApplication implements CommandLineRunner {

	@Autowired
	private UsuarioService usuarioService;

	public static void main(String[] args) {
		SpringApplication.run(SistemaExamenesBackendApplication.class, args);
	}


		@Override
		public void run(String... args) throws Exception {
//			Usuario usuario = new Usuario();
//			usuario.setNombre("Danilo");
//			usuario.setApellido("Gomez");
//			usuario.setUsername("Tokio");
//			usuario.setPassword("123");
//			usuario.setEmail("tokio@gmail.com");
//			usuario.setTelefono("123456789");
//			usuario.setPerfil("foto.png");
//
//			Rol rol = new Rol();
//
//			rol.setId(1L);
//			rol.setNombre("ADMIN");
//
//			Set<UsuarioRol> usuarioRoles = new HashSet<>();
//
//			UsuarioRol usuarioRol = new UsuarioRol();
//			usuarioRol.setRol(rol);
//			usuarioRol.setUsuario(usuario);
//			usuarioRoles.add(usuarioRol);
//
//			Usuario usuarioGuardado = usuarioService.guardarUsuario(usuario, usuarioRoles);
//			System.out.println(usuarioGuardado.getUsername());
		}
}

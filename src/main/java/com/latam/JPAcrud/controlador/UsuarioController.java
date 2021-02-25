package com.latam.JPAcrud.controlador;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.latam.JPAcrud.modelo.Usuario;
import com.latam.JPAcrud.servicio.UsuarioService;
import com.latam.JPAcrud.vo.UsuarioVO;

public class UsuarioController {
	
	private static final Logger log = LoggerFactory.getLogger(UsuarioController.class);
	
	@Autowired
	private UsuarioService svc;

	
//	Las solicitudes de la página principal
	@GetMapping({ "/", "/home" })
	public String home(Model model) {
		model.addAttribute("VO", svc.getAllUsuarios());
	
	return "home";
	}
	
	
//	Abre el formulario de edición cargando los datos del usuario	
	@GetMapping("/editarForm")
	public ModelAndView editarForm(Model model, @RequestParam String idUsuario, RedirectAttributes ra) {
		UsuarioVO respuestaServicio = new UsuarioVO();
		
		respuestaServicio.setMensaje("No se pudo cargar la vista de edición, intente nuevamente.");
		
		try {
			Integer id = (Integer.parseInt(idUsuario));
			respuestaServicio = svc.findById(id);
			model.addAttribute("mensaje", respuestaServicio.getMensaje());
			model.addAttribute("VO", respuestaServicio.getUsuarios().get(0));
			return new ModelAndView("editar");
		
		} catch (Exception e) {
		log.error("Error en UsuarioController eliminar", e);
		}
		
	ra.addFlashAttribute("mensaje", respuestaServicio.getMensaje());
	
	respuestaServicio = svc.getAllUsuarios();
	
	return new ModelAndView("redirect:/home");
	
	}

	
	// Llama al método del servicio que se encarga de actualizar los datos del usuario en base de datos
	@PostMapping("/editar")
	public ModelAndView editar(@ModelAttribute Usuario usuario, RedirectAttributes ra) {
		UsuarioVO respuestaServicio = svc.update(usuario);
		
		ra.addFlashAttribute("mensaje", respuestaServicio.getMensaje());
		
		if (respuestaServicio.getCodigo().equals("0")) {
			return new ModelAndView("redirect:/home");
		
		} else {
			return new ModelAndView("redirect:/editarForm");
		}
	}

	
//	Abre el formulario de creación de usuarios	
	@GetMapping("/agregarForm")
	public String agregarForm(Model model) {
		return "agregar";
	}

	
//	Llama al método del servicio que se encarga de crear los datos del usuario en base de datos	
	@PostMapping("/agregar")
	public ModelAndView agregarSubmit(@ModelAttribute Usuario usuario, RedirectAttributes ra) {
		
		UsuarioVO respuestaServicio = svc.add(usuario);
		
		ra.addFlashAttribute("mensaje", respuestaServicio.getMensaje());
		
		if (respuestaServicio.getCodigo().equals("0")) {
			return new ModelAndView("redirect:/home");
		} else {
			return new ModelAndView("redirect:/agregarForm");
		}
	}

	
//	Llama al método del servicio que se encarga de eliminar los datos del usuario en base de datos y redirecciona al home.	
	@GetMapping("/eliminar")
	public ModelAndView eliminar(Model model, @RequestParam String idUsuario, RedirectAttributes ra) {
		UsuarioVO respuestaServicio = new UsuarioVO();
		
		respuestaServicio.setMensaje("No se pudo eliminar al usuario, intente nuevamente.");
		
		try {
			Usuario eliminado = new Usuario();
			
			eliminado.setIdUsuario(Integer.parseInt(idUsuario));
			
			respuestaServicio = svc.delete(eliminado);
			
			ra.addFlashAttribute("mensaje", respuestaServicio.getMensaje());
			
			return new ModelAndView("redirect:/home");
			
		} catch (Exception e) {
		log.error("Error en UsuarioController eliminar", e);
		}
		
	ra.addFlashAttribute("mensaje", respuestaServicio.getMensaje());

	respuestaServicio = svc.getAllUsuarios();
	
	ra.addAttribute("VO", respuestaServicio);
	
	return new ModelAndView("redirect:/home");
	}

}

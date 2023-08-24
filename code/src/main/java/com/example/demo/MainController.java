package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
@Controller
public class MainController {
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("codigo");
		return "index.jsp";
	}
	
	@PostMapping("/code")
	public String checkCode(@RequestParam("codigoSecreto") String codigoSecreto, RedirectAttributes redirectAttribute) {
		if(codigoSecreto.equals("bushido")) {
			return "code.jsp";
		}
		redirectAttribute.addFlashAttribute("error", "You must train harder");
		return "redirect:/";
	}
}

package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Xiaomi redmi note 8");
		pedido.setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/51Fv-PIiDQL.__AC_SY300_QL70_ML2_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Smartphone-Xiaomi-Redmi-Note-4RAM/dp/B07Y9XWK4M?source=ps-sl-shoppingads-lpcontext&psc=1");
		pedido.setDescricao("Smartphone Xiaomi Redmi note 8 64GB 4GB RAM Azul Versão Global\r\n" + 
				"Sistema operacional: MIUI 10 (Base no sistema operacional Android 9)\r\n" + 
				"RAM: 4GB ROM: 64GB\r\n" + 
				"Tela 6.3");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}
}

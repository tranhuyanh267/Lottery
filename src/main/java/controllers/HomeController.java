package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String goHomePage() {
		// Using HttpSession in order to pass value to view
		//httpSession.setAttribute("key", "value is huyanhkute");
		return "index";
	}

	/*@RequestMapping("/")
	public ModelAndView secondWayToPassData() {
		ModelAndView modelAndView = new ModelAndView("index");
		Map<String, Object> model = modelAndView.getModel();
		model.put("key", "huyanhkute");
		return modelAndView;
	}*/
	
	/*@RequestMapping("/")
	public String thirdWay(Model model) {
		model.addAttribute("key", "huyanhkute wa di");
		return "index";
	}*/

}

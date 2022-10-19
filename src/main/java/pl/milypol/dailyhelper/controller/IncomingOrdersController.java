package pl.milypol.dailyhelper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.milypol.dailyhelper.repository.IncomingOrdersRepository;

@Controller
@RequestMapping("/incomings")
public class IncomingOrdersController {
    private final IncomingOrdersRepository incomingOrdersRepository;

    public IncomingOrdersController(IncomingOrdersRepository incomingOrdersRepository) {
        this.incomingOrdersRepository = incomingOrdersRepository;
    }
    @GetMapping
    public String IncomingOrder(Model model){
        model.addAttribute("order",incomingOrdersRepository.findAll());
        return "incomingOrder";
    }
}

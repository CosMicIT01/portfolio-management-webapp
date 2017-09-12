package de.cosmicit.pms.controller;

import de.cosmicit.pms.model.Subscription;
import de.cosmicit.pms.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/agent")
public class AgentController {

    @Autowired
    AgentService agentService;

//    @Override
//    public Class<Agent> getEntityClass() {
//        return Agent.class;
//    }

    @RequestMapping(value="/dashboard", method= RequestMethod.GET)
    public String getAgentDashboard() {
        return "agentDashboard";

    }

    @RequestMapping(value="/managedSubscriptions", method= RequestMethod.GET)
    public String getAgentManagedSubscriptions( Model model, HttpServletRequest request) {
        long agentId = 1;
        List<Subscription> subscriptionsList = agentService.getSubscriptionsByAgentIdNumeric(agentId);
        System.out.printf("subscriptionsList : "+ subscriptionsList);
        HttpSession session = request.getSession();
        model.addAttribute("subscriptions",subscriptionsList);
        session.setAttribute("subscriptions",subscriptionsList);
        return "agentManagedSubscriptions";

    }
}

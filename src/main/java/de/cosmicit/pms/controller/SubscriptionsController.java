package de.cosmicit.pms.controller;

import de.cosmicit.pms.model.Subscription;
import de.cosmicit.pms.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/subscription")
public class SubscriptionsController {


    @Autowired
    SubscriptionService subscriptionService;


    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public String getSubscriptionById(@PathVariable("id") Long id, Model model, HttpServletRequest request){
        Subscription subscription = subscriptionService.getSubscriptionById(id);
        HttpSession session = request.getSession();
        model.addAttribute("subscription",subscription);
        session.setAttribute("subscription",subscription);
      return "subscriptionDetails";
    }
}

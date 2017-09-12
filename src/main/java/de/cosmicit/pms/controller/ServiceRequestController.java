package de.cosmicit.pms.controller;

import de.cosmicit.pms.model.ServiceRequest;
import de.cosmicit.pms.service.ServiceRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ServiceRequestController {

    @Autowired
    ServiceRequestService serviceRequestService;

    @RequestMapping(value="/servicerequest", method= RequestMethod.GET)
    public String getServiceReguestForm(Model model, HttpServletRequest request) {
        model.addAttribute("serviceRequestForm", new ServiceRequest());
        return "createServiceRequest";
    }

    @RequestMapping(value="/servicerequest", method= RequestMethod.POST)
    public String createServiceRequest(@ModelAttribute("serviceRequestForm") ServiceRequest serviceRequest, BindingResult bindingResult, Model model, HttpServletRequest request) {

        ServiceRequest req = serviceRequestService.createServiceRequest(serviceRequest);

        return "createServiceRequest";
    }
}

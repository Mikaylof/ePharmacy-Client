package az.mushfigm.client.controller;

import az.mushfigm.client.dto.response.RespCustomer;
import az.mushfigm.client.dto.response.RespMedication;
import az.mushfigm.client.dto.response.Response;
import az.mushfigm.client.service.CustomerService;
import az.mushfigm.client.service.MedicationService;
import az.mushfigm.client.util.Utility;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MainController {
    private final MedicationService medicationService;

    private final CustomerService customerService;

    @GetMapping({"/", "/GetCustomerList"})
    public ModelAndView getCustomerList() {
        ModelAndView model = new ModelAndView("index");
        Response<List<RespCustomer>> result = customerService.getCustomerList();
        if (result.getStatus().getCode() == 1) {
            model.addObject("result", result.getT());
        } else {
            model.addObject("msg", result.getStatus().getMessage());
        }
        return model;
    }

    @GetMapping("/GetMedicationList/{customerId}")
    public ModelAndView getMedicationList(@PathVariable Long customerId) {
        ModelAndView model = new ModelAndView("account");
        Response<List<RespMedication>> result = medicationService.getMedicationList(customerId);
        if (result.getStatus().getCode() == 1) {
            model.addObject("result", result.getT());
        } else {
            model.addObject("msg", result.getStatus().getMessage());
        }
        return model;
    }

}

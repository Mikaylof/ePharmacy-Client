package az.mushfigm.client.service;

import az.mushfigm.client.dto.response.RespCustomer;
import az.mushfigm.client.dto.response.Response;

import java.util.List;

public interface CustomerService {
    Response<List<RespCustomer>> getCustomerList();
}

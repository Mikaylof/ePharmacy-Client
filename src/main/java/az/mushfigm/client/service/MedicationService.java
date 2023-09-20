package az.mushfigm.client.service;


import az.mushfigm.client.dto.response.RespMedication;
import az.mushfigm.client.dto.response.Response;

import java.util.List;

public interface MedicationService {
     Response<List<RespMedication>> getMedicationList(Long customerId);
}

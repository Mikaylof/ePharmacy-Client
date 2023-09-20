package az.mushfigm.client.service.impl;

import az.mushfigm.client.dto.response.RespMedication;
import az.mushfigm.client.dto.response.Response;
import az.mushfigm.client.service.MedicationService;
import az.mushfigm.client.util.Utility;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@PropertySource("classpath:config.properties")
public class MedicationServiceImpl implements MedicationService {

    private final Utility utility;

    @Value("${api.url}")
    private String apiUrl;

    ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public Response<List<RespMedication>> getMedicationList(Long customerId) {
        Response<List<RespMedication>> response = null;
        try {
            String url = apiUrl + "medication/GetMedicationListByCustomerId/" + customerId;
            String result = utility.sendGet(url);
            response = objectMapper.readValue(result, new TypeReference<Response<List<RespMedication>>>() {
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return response;
    }
}

package az.mushfigm.client.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RespMedication {
    private Long id;
    private String medication_name;
    private Double medication_cost;
    private Date manufactured_date;
    private Date expired_date;
    private RespCustomer respCustomer;
}

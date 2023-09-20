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
public class RespCustomer {
    private Long id;
    private String name;
    private String surname;
    private String gender;
    private Date dob;
    private String phone;
}

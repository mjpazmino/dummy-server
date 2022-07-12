package ec.edu.espe.arquitectura.dummyserver.dummyserver.dto;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductDTO {

    private String id;
    private String name;
    private Float price;
    private Integer existence;
    private Date manufacturDate;
}

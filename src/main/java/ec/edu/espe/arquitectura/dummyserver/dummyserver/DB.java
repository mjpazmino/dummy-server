package ec.edu.espe.arquitectura.dummyserver.dummyserver;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import ec.edu.espe.arquitectura.dummyserver.dto.ProductDTO;

public class DB {

    private static Map<String, ProductDTO> db = new HashMap<>();

    public static void initializer() {
        ProductDTO dto1 = ProductDTO.builder()
                .id("123456")
                .name("mouse")
                .existence(5)
                .price(23.98f)
                .manufacturDate(new Date()).build();
        ProductDTO dto2 = ProductDTO.builder()
                .id("234567")
                .name("monitor")
                .existence(2)
                .price(198.87f)
                .manufacturDate(new Date()).build();
        ProductDTO dto3 = ProductDTO.builder()
                .id("345678")
                .name("laptop")
                .existence(10)
                .price(786.67f)
                .manufacturDate(new Date()).build();
        db.put(dto1.getId(), dto1);
        db.put(dto2.getId(), dto2);
        db.put(dto3.getId(), dto3);
    }

    public static Collection<ProductDTO> findAll() {
        return DB.db.values();
    }

    public static ProductDTO findById(String id) {
        return DB.db.get(id);
    }

    public static void add(ProductDTO product) {
        DB.db.put(product.getId(), product);
    }

}

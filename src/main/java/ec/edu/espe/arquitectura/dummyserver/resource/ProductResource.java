package ec.edu.espe.arquitectura.dummyserver.resource;

import java.util.Collection;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.arquitectura.dummyserver.dto.ProductDTO;
import ec.edu.espe.arquitectura.dummyserver.dummyserver.DB;
import ec.edu.espe.arquitectura.dummyserver.dummyserver.DummyServerApplication;

@RestController
@RequestMapping(path = "/products")
public class ProductResource {

    @GetMapping
    public ResponseEntity<Collection<ProductDTO>> obtainAll() {
        System.err.println("All");
        return ResponseEntity.ok(DB.findAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<ProductDTO> obtainById(@PathVariable("id") String id) {
        System.err.println("Antes de Id");
        return ResponseEntity.ok(DB.findById(id));
    }

    @PostMapping
    public ResponseEntity<ProductDTO> add(@RequestBody ProductDTO product) {
        product.setId(UUID.randomUUID().toString());
        DB.add(product);
        return ResponseEntity.ok(product);
    }

}

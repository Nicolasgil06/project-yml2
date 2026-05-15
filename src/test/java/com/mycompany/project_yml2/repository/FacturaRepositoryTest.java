package com.mycompany.project_yml2.repository;

import com.mycompany.project_yml2.domain.Cliente;
import com.mycompany.project_yml2.domain.Factura;
import com.mycompany.project_yml2.domain.TipoDocumento;
import com.mycompany.project_yml2.domain.enumeracion.Estado;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.mongodb.test.autoconfigure.DataMongoTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;


@DataMongoTest
class FacturaRepositoryTest {

    @Autowired
    private FacturaRepository facturaRepository;

    @Autowired
    private TipoDocumentoRepository TipoDocumentoRepository;

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private TipoDocumentoRepository tipoDocumentoRepository;

    @Test
    void insert(){
        tipoDocumentoRepository.deleteAll();
        clienteRepository.deleteAll();
        facturaRepository.deleteAll();

        TipoDocumento tipoDocumentoCedula = tipoDocumentoRepository.insert(
                new TipoDocumento(null, "CC", "Cedula de ciudadania", Estado.ACTIVO)
        );

        Cliente cliente = new Cliente(null, "123456789", "John", "Doe", "Smith", "Johnson");
        Cliente cliente2 = new Cliente(null, "987654321", "Doe", "John", "Johnson", "Smith");

        assertNotNull(tipoDocumentoCedula);

        cliente.setTipoDocumento(tipoDocumentoCedula);
        cliente2.setTipoDocumento(tipoDocumentoCedula);

        Cliente clienteGuardado = clienteRepository.insert(cliente);
        Cliente clienteGuardado2 = clienteRepository.insert(cliente2);

        Factura factura1 = new Factura(null, 1L,2026,new Date(),23800.0,3800,20000);
        Factura factura2 = new Factura(null, 2L,2026,new Date(),23800.0,3800,20000);
        Factura factura3 = new Factura(null, 3L,2026,new Date(),23800.0,3800,20000);
        Factura factura4 = new Factura(null, 4L,2026,new Date(),23800.0,3800,20000);

        facturaRepository.insert(factura1);
        facturaRepository.insert(factura2);
        facturaRepository.insert(factura3);
        facturaRepository.insert(factura4);

        clienteGuardado.getFacturaSet().add(factura1);
        clienteGuardado.getFacturaSet().add(factura2);
        clienteGuardado.getFacturaSet().add(factura3);
        clienteGuardado.getFacturaSet().add(factura4);

        clienteRepository.save(clienteGuardado);
    }

}
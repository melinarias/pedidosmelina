package com.finnegans.pedidosmelina.controller;

import com.finnegans.pedidosmelina.entity.Producto;
import com.finnegans.pedidosmelina.repository.ProductoRepository;
import com.finnegans.pedidosmelina.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoCtrl {

    /*
        @Autowired
        ProductoService productoService;
    */

    /*
    @GetMapping(value = "/cargarProducto")
    public String cargarProducto(){
        return "Producto: Coca Cola, Sabor cola, 2";
    }
    */

    @Autowired
    public ProductoRepository productoRepository;

    @GetMapping("/listaDeProductos")
    public List<Producto> listAll() {
        List<Producto> listaDeProductos = productoRepository.findAll();
        return listaDeProductos;
    }

    @PostMapping("/guardarProducto")
    public Producto producto(@RequestBody Producto producto){
        productoRepository.save(producto);
        return producto;
    }


}



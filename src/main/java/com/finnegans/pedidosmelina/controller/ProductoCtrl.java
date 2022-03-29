package com.finnegans.pedidosmelina.controller;

import com.finnegans.pedidosmelina.entity.Producto;
import com.finnegans.pedidosmelina.repository.ProductoRepository;
import com.finnegans.pedidosmelina.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/productos")
@CrossOrigin()
public class ProductoCtrl {

    @Autowired
    public ProductoRepository productoRepository;

    @GetMapping("/obtenerProducto/{id}")
    public Producto obtenerProducto(@PathVariable String id){
        Producto producto = productoRepository.findById(Integer.parseInt(id)).get();
        return producto;
    }

    @CrossOrigin()
    @GetMapping("/listaDeProductos")
    public List<Producto> listAll() {
        List<Producto> listaDeProductos = productoRepository.findAll();
        return listaDeProductos;
    }

    @PostMapping("/guardarProducto")
    public Producto guardarProdcuto(@RequestBody Producto producto){
        productoRepository.save(producto);
        return producto;
    }

    @PutMapping("/modificarProducto/{id}")
    public Producto modificarProducto(@PathVariable String id, @RequestBody Producto productoDelFormulario ){
        Producto producto = obtenerProducto(id);
        System.out.println(productoDelFormulario.getNombre());
        producto.setNombre(productoDelFormulario.getNombre());
        producto.setDescripcion(productoDelFormulario.getDescripcion());
        producto.setImpuesto(productoDelFormulario.getImpuesto());
        producto.setCantidad(productoDelFormulario.getCantidad());
        producto.setPrecioBase(productoDelFormulario.getPrecioBase());
        productoRepository.save(producto);
        return producto;
    }

    @DeleteMapping("/eliminarProducto/{id}")
    public String eliminarProducto(@PathVariable String id){
        productoRepository.deleteById(Integer.parseInt(id));
        return "Se elimino con exito";
    }

}



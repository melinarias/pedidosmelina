package com.finnegans.pedidosmelina.service.impl;

import com.finnegans.pedidosmelina.entity.Producto;
import com.finnegans.pedidosmelina.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ProductoServiceImpl implements ProductoService {

    public List listaDeProductos = new ArrayList();

    @Override
    public void altaDeProducto(Producto producto) {
        //Prueba de metodo provisoria hasta que tenga bases de datos en donde guardar
        listaDeProductos.add(producto);

        System.out.println(listaDeProductos);
    }

    @Override
    public void bajaDeProducto(Integer idProducto) {
        listaDeProductos.remove(idProducto);
        System.out.println(listaDeProductos);
    }

    @Override
    public void modificarProducto(Integer idProducto, Producto producto) {

        //Mostramos los datos del producto que queremos modificar

        listaDeProductos.set(idProducto, producto);
        System.out.println(listaDeProductos);
    }
}

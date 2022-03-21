package com.finnegans.pedidosmelina.service;

import com.finnegans.pedidosmelina.entity.Producto;

public interface ProductoService {

    public void altaDeProducto (Producto producto);

    public void bajaDeProducto (Integer idProducto);

    public void modificarProducto (Integer idProducto, Producto producto);

}

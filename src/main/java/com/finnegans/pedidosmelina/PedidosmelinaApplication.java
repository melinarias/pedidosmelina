package com.finnegans.pedidosmelina;

import com.finnegans.pedidosmelina.entity.Producto;
import com.finnegans.pedidosmelina.service.ProductoService;
import com.finnegans.pedidosmelina.service.impl.ProductoServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

@SpringBootApplication
public class PedidosmelinaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PedidosmelinaApplication.class, args);

		Scanner teclado = new Scanner(System.in);

		Producto producto1 = new Producto();
		String nombre = "";
		String descripcion = "";
		int id = 0;
		char salir = 'n';

		ProductoServiceImpl productoService = new ProductoServiceImpl();


		do{

			//Seteo el id automatica e incrementalmente


			//Seteo el nombre
			System.out.println("Ingrese el nombre: ");
			nombre = teclado.nextLine();

			//Seteo la Descripcion
			System.out.println("Ingrese la descripcion: ");
			descripcion = teclado.nextLine();

			//Doy de alta el producto
			productoService.altaDeProducto(new Producto(nombre, null, id, descripcion, null, null));

			System.out.println("Desea salir? Ingrese 's' si desea salir, si no 'n' para continuar...");
			salir = teclado.nextLine().charAt(0);

			id ++;

		}while(salir != 's');

		//-------------------------------
		//ACA PROBAMOS LA BAJA DEL PRODUCTO
		int idDeProducto;

		//Formulario nos el numero

		System.out.println("Ingrese el codigo o id que identifique al producto que desea eliminar");
		idDeProducto = teclado.nextInt();

		productoService.bajaDeProducto(idDeProducto);

		//-------------------------------
		//ACA PROBAMOS LA MODIFICION DEL PRODUCTO

		System.out.println("Ingrese los datos que quiere modificar del producto");
		idDeProducto = teclado.nextInt();


		//Seteo el nombre
		System.out.println("Ingrese el nombre: ");
		nombre = teclado.nextLine();
		producto1.setNombre(nombre);

		//Seteo la Descripcion
		System.out.println("Ingrese la descripcion: ");
		descripcion = teclado.nextLine();
		producto1.setDescripcion(descripcion);

		productoService.modificarProducto(idDeProducto, producto1);


	}

}

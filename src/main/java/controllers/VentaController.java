package controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import models.ProductoModel;
@FeignClient(name="getProductosventas")
@RequestMapping("/ventas")
public interface VentaController {

	
@GetMapping()
public ArrayList<ProductoModel> obtener();
}

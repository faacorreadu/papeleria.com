package co.edu.unab.papelapp.controlador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unab.papelapp.modelo.ArticuloModelo;
import co.edu.unab.papelapp.repositorio.ArticuloRepositorio;

@RestController
@RequestMapping(path = "/articulo")
public class ArticuloControlador {
    @Autowired
    ArticuloRepositorio articuloRepositorio;
        @GetMapping()
        public Iterable<ArticuloModelo> getAllArticulos(){
            return articuloRepositorio.findAll();
        }

        @PostMapping()
        public ArticuloModelo saveArticulo(@RequestBody ArticuloModelo articulo){
            return articuloRepositorio.save(articulo); 
        }

        @DeleteMapping(path = "/{id}")
        public void deleteArticulobyId(@PathVariable("id")int id){
            articuloRepositorio.deleteById(id);
        }
}

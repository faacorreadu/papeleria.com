package co.edu.unab.papelapp.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.unab.papelapp.modelo.ArticuloModelo;

@Repository
public abstract interface ArticuloRepositorio extends CrudRepository <ArticuloModelo,Integer> {
    
}

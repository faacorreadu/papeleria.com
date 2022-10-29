package co.edu.unab.papelapp.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "articulo")

public class ArticuloModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idArticulo;
    private String nombre;
    private String codigo;
    private String descripcion;
    private double precio;
    private String categoria;
    private long stock;
    
}

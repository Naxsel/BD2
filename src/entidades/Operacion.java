package entidades;

import oracle.sql.DATE;

import javax.persistence.*;

/**
 * Created by anicacortes on 18/04/2016.
 */
@Entity
@IdClass(CuentaOperacion.class)
public class Operacion {

    @Id
    @Column(name = "iban",nullable = false, length = 34)
    private String iban;

    @Id
    @Column(name = "contador",nullable = false)
    private String contador;

    @Column(name = "tipo",nullable = false)
    private String tipo;

    @Column(name = "fecha",nullable = false)
    private DATE fecha;

    @Column(name = "hora",nullable = false)
    private String hora;

    @Column(name = "cDestino",nullable = false, length = 34)
    private String cDestino;

    @Column(name = "cantidad",nullable = false)
    private double cantidad;

    @Column(name = "concepto",nullable = false, length = 200)
    private String concepto;
}

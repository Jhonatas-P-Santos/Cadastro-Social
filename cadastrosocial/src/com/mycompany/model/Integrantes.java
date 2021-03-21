/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

import com.mycompany.dao.EntidadeBase;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author JHONATAN
 */
@Entity
@Table(name = "integrantes")
@NamedQueries({
    @NamedQuery(name = "Integrantes.findAll", query = "SELECT i FROM Integrantes i")})
public class Integrantes implements Serializable, EntidadeBase {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "datanascimento")
    private String datanascimento;
    @Basic(optional = false)
    @Column(name = "escolaridade")
    private String escolaridade;
    @Basic(optional = false)
    @Column(name = "genero")
    private String genero;
    @Basic(optional = false)
    @Column(name = "parentesco")
    private String parentesco;
    @Basic(optional = false)
    @Column(name = "frequentador")
    private short frequentador;
    @Basic(optional = false)
    @Column(name = "estudando")
    private short estudando;
    @JoinColumn(name = "Assistido_idAssistido", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Assistido assistido;

    public Integrantes() {
    }

    public Integrantes(Integer id) {
        this.id = id;
    }

    public Integrantes(Integer id, String nome, String datanascimento, String escolaridade, String genero, String parentesco, short frequentador, short estudando) {
        this.id = id;
        this.nome = nome;
        this.datanascimento = datanascimento;
        this.escolaridade = escolaridade;
        this.genero = genero;
        this.parentesco = parentesco;
        this.frequentador = frequentador;
        this.estudando = estudando;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public short getFrequentador() {
        return frequentador;
    }

    public void setFrequentador(short frequentador) {
        this.frequentador = frequentador;
    }

    public short getEstudando() {
        return estudando;
    }

    public void setEstudando(short estudando) {
        this.estudando = estudando;
    }

    public Assistido getAssistido() {
        return assistido;
    }

    public void setAssistido(Assistido assistido) {
        this.assistido = assistido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Integrantes)) {
            return false;
        }
        Integrantes other = (Integrantes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.model.Integrantes[ id=" + id + " ]";
    }
    
}

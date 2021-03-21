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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author JHONATAN
 */
@Entity
@Table(name = "psc")
@NamedQueries({
    @NamedQuery(name = "Psc.findAll", query = "SELECT p FROM Psc p")})
public class Psc implements Serializable, EntidadeBase {

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
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "cep")
    private String cep;
    @Basic(optional = false)
    @Column(name = "cidade")
    private String cidade;
    @Basic(optional = false)
    @Column(name = "telefone")
    private String telefone;
    @Basic(optional = false)
    @Column(name = "genero")
    private String genero;
    @Basic(optional = false)
    @Column(name = "varacriminal")
    private String varacriminal;
    @Basic(optional = false)
    @Column(name = "datainicio")
    private String datainicio;
    @Basic(optional = false)
    @Column(name = "datatermino")
    private String datatermino;
    @Basic(optional = false)
    @Column(name = "horastotal")
    private String horastotal;
    @Basic(optional = false)
    @Column(name = "horassemana")
    private String horassemana;
    @Basic(optional = false)
    @Column(name = "diassemana")
    private String diassemana;
    @Basic(optional = false)
    @Column(name = "horariosemana")
    private String horariosemana;

    public Psc() {
    }

    public Psc(Integer id) {
        this.id = id;
    }

    public Psc(Integer id, String nome, String endereco, String cidade, String telefone, String genero, String varacriminal, String datainicio, String datatermino, String horastotal, String horassemana, String diassemana, String horariosemana) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.telefone = telefone;
        this.genero = genero;
        this.varacriminal = varacriminal;
        this.datainicio = datainicio;
        this.datatermino = datatermino;
        this.horastotal = horastotal;
        this.horassemana = horassemana;
        this.diassemana = diassemana;
        this.horariosemana = horariosemana;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getVaracriminal() {
        return varacriminal;
    }

    public void setVaracriminal(String varacriminal) {
        this.varacriminal = varacriminal;
    }

    public String getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(String datainicio) {
        this.datainicio = datainicio;
    }

    public String getDatatermino() {
        return datatermino;
    }

    public void setDatatermino(String datatermino) {
        this.datatermino = datatermino;
    }

    public String getHorastotal() {
        return horastotal;
    }

    public void setHorastotal(String horastotal) {
        this.horastotal = horastotal;
    }

    public String getHorassemana() {
        return horassemana;
    }

    public void setHorassemana(String horassemana) {
        this.horassemana = horassemana;
    }

    public String getDiassemana() {
        return diassemana;
    }

    public void setDiassemana(String diassemana) {
        this.diassemana = diassemana;
    }

    public String getHorariosemana() {
        return horariosemana;
    }

    public void setHorariosemana(String horariosemana) {
        this.horariosemana = horariosemana;
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
        if (!(object instanceof Psc)) {
            return false;
        }
        Psc other = (Psc) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.model.Psc[ id=" + id + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

import com.mycompany.dao.EntidadeBase;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author JHONATAN
 */
@Entity
@Table(name = "assistido")
@NamedQueries({
    @NamedQuery(name = "Assistido.findAll", query = "SELECT a FROM Assistido a")})
public class Assistido implements Serializable, EntidadeBase {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Column(name = "foto")
    private String foto;
    @Basic(optional = false)
    @Column(name = "rg")
    private String rg;
    @Basic(optional = false)
    @Column(name = "cpf")
    private String cpf;
    @Basic(optional = false)
    @Column(name = "datanascimento")
    private String datanascimento;
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
    @Column(name = "escolaridade")
    private String escolaridade;
    @Basic(optional = false)
    @Column(name = "moradorescasa")
    private int moradorescasa;
    @Basic(optional = false)
    @Column(name = "filho")
    private short filho;
    @Column(name = "quantosfilhos")
    private Integer quantosfilhos;
    @Column(name = "idadefilhos")
    private String idadefilhos;
    @Basic(optional = false)
    @Column(name = "estadocivil")
    private String estadocivil;
    @Column(name = "bolsafamilia")
    private Short bolsafamilia;
    @Column(name = "rendacidada")
    private Short rendacidada;
    @Column(name = "cad")
    private Short cad;
    @Basic(optional = false)
    @Column(name = "doen\u00e7as")
    private short doenças;
    @Column(name = "quaisdoen\u00e7as")
    private String quaisdoenças;
    @Basic(optional = false)
    @Column(name = "trabalha")
    private String trabalha;
    @Basic(optional = false)
    @Column(name = "doacao")
    private short doacao;
    @Column(name = "qualdoacao")
    private String qualdoacao;
    @Column(name = "datadoacao")
    private String datadoacao;
    @Basic(optional = false)
    @Column(name = "genero")
    private String genero;
    @Column(name = "gravida")
    private Short gravida;
    @Column(name = "dataparto")
    private String dataparto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "assistido")
    private List<Integrantes> integrantesList;

    public Assistido() {
    }

    public Assistido(Integer id) {
        this.id = id;
    }

    public Assistido(Integer id, String nome, String rg, String cpf, String datanascimento, String endereco, String cidade, String telefone, String escolaridade, int moradorescasa, short filho, String estadocivil, short doenças, String trabalha, short doacao, String genero) {
        this.id = id;
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.datanascimento = datanascimento;
        this.endereco = endereco;
        this.cidade = cidade;
        this.telefone = telefone;
        this.escolaridade = escolaridade;
        this.moradorescasa = moradorescasa;
        this.filho = filho;
        this.estadocivil = estadocivil;
        this.doenças = doenças;
        this.trabalha = trabalha;
        this.doacao = doacao;
        this.genero = genero;
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

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
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

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public int getMoradorescasa() {
        return moradorescasa;
    }

    public void setMoradorescasa(int moradorescasa) {
        this.moradorescasa = moradorescasa;
    }

    public short getFilho() {
        return filho;
    }

    public void setFilho(short filho) {
        this.filho = filho;
    }

    public Integer getQuantosfilhos() {
        return quantosfilhos;
    }

    public void setQuantosfilhos(Integer quantosfilhos) {
        this.quantosfilhos = quantosfilhos;
    }

    public String getIdadefilhos() {
        return idadefilhos;
    }

    public void setIdadefilhos(String idadefilhos) {
        this.idadefilhos = idadefilhos;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public Short getBolsafamilia() {
        return bolsafamilia;
    }

    public void setBolsafamilia(Short bolsafamilia) {
        this.bolsafamilia = bolsafamilia;
    }

    public Short getRendacidada() {
        return rendacidada;
    }

    public void setRendacidada(Short rendacidada) {
        this.rendacidada = rendacidada;
    }

    public Short getCad() {
        return cad;
    }

    public void setCad(Short cad) {
        this.cad = cad;
    }

    public short getDoenças() {
        return doenças;
    }

    public void setDoenças(short doenças) {
        this.doenças = doenças;
    }

    public String getQuaisdoenças() {
        return quaisdoenças;
    }

    public void setQuaisdoenças(String quaisdoenças) {
        this.quaisdoenças = quaisdoenças;
    }

    public String getTrabalha() {
        return trabalha;
    }

    public void setTrabalha(String trabalha) {
        this.trabalha = trabalha;
    }

    public short getDoacao() {
        return doacao;
    }

    public void setDoacao(short doacao) {
        this.doacao = doacao;
    }

    public String getQualdoacao() {
        return qualdoacao;
    }

    public void setQualdoacao(String qualdoacao) {
        this.qualdoacao = qualdoacao;
    }

    public String getDatadoacao() {
        return datadoacao;
    }

    public void setDatadoacao(String datadoacao) {
        this.datadoacao = datadoacao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Short getGravida() {
        return gravida;
    }

    public void setGravida(Short gravida) {
        this.gravida = gravida;
    }

    public String getDataparto() {
        return dataparto;
    }

    public void setDataparto(String dataparto) {
        this.dataparto = dataparto;
    }

    public List<Integrantes> getIntegrantesList() {
        return integrantesList;
    }

    public void setIntegrantesList(List<Integrantes> integrantesList) {
        this.integrantesList = integrantesList;
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
        if (!(object instanceof Assistido)) {
            return false;
        }
        Assistido other = (Assistido) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.model.Assistido[ id=" + id + " ]";
    }
    
}

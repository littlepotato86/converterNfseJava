package com.constanzooficial.integracao.model.nfse.go.rioVerde;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 *
 * @author Waislan Sanches
 */
@XStreamAlias("Endereco")
public class Endereco {
    
    @XStreamAlias("Endereco")
    private String endereco;
    
    @XStreamAlias("Numero")
    private String numero;
    
    @XStreamAlias("Complemento")
    private String complemento;
    
    @XStreamAlias("Bairro")
    private String bairro;
    
    @XStreamAlias("CodigoMunicipio")
    private String codigoMunicipio;
    
    @XStreamAlias("Cep")
    private String cep;

    public String getEndereco() {
        return endereco;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCodigoMunicipio() {
        return codigoMunicipio;
    }

    public String getCep() {
        return cep;
    } 
    
}

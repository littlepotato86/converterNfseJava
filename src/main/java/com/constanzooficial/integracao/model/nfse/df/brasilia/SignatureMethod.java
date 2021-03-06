package com.constanzooficial.integracao.model.nfse.df.brasilia;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 *
 * @author Waislan Sanches
 */
@XStreamAlias("SignatureMethod")
public class SignatureMethod {
    
    @XStreamAlias("Algorithm")
    @XStreamAsAttribute
    private String algorithm;

    public String getAlgorithm() {
        return algorithm;
    }

}

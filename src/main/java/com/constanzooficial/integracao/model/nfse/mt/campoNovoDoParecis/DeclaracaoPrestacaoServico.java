package com.constanzooficial.integracao.model.nfse.mt.campoNovoDoParecis;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 *
 * @author Yuri Fernandes de Oliveira
 */
@XStreamAlias("DeclaracaoPrestacaoServico")
public class DeclaracaoPrestacaoServico {

    @XStreamAlias("InfDeclaracaoPrestacaoServico")
    private InfDeclaracaoPrestacaoServico infDeclaracaoPrestacaoServico;

    public InfDeclaracaoPrestacaoServico getInfDeclaracaoPrestacaoServico() {
        return infDeclaracaoPrestacaoServico;
    }
}

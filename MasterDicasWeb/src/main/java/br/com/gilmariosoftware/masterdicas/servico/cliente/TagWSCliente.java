/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gilmariosoftware.masterdicas.servico.cliente;

import br.com.gilmariosoftware.masterdicas.servico.cliente.tags.TagServicoInterface;
import br.com.gilmariosoftware.masterdicas.servico.cliente.tags.TagWS;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

/**
 *
 * @author gilmario
 */
@Stateless
public class TagWSCliente {

    private TagServicoInterface servico;

    @PostConstruct
    private void inicializar() {
        servico = new TagWS().getTagWSPort();
    }

    public TagServicoInterface getServico() {
        return servico;
    }

}

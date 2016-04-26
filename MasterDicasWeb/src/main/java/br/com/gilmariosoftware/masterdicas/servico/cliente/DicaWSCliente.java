package br.com.gilmariosoftware.masterdicas.servico.cliente;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

/**
 *
 * @author gilmario
 */
@Stateless
public class DicaWSCliente {

    private DicaServicoInterface servico;

    @PostConstruct
    protected void inicializar() {
        servico = new DicaWS().getDicaWSPort();
    }

    public DicaServicoInterface getServico() {
        return servico;
    }

}

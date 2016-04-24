package br.com.gilmariosoftware.masterdicas.servico.cliente;

import br.com.gilmariosoftware.masterdicas.servico.cliente.dicas.DicaServicoInterface;
import br.com.gilmariosoftware.masterdicas.servico.cliente.dicas.DicaWS;
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
    private void inicializar() {
        servico = new DicaWS().getDicaWSPort();
    }

    public DicaServicoInterface getServico() {
        return servico;
    }

}

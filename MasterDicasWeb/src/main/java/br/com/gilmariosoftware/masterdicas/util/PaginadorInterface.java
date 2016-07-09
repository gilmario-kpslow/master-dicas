/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gilmariosoftware.masterdicas.util;

import java.util.List;

/**
 *
 * @author gilmario
 */
public interface PaginadorInterface {

    public abstract void proximo();

    public abstract void voltar();

    public List<Long> getPaginas();

    public abstract void irPara(int pagina);

}

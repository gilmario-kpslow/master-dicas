/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gilmariosoftware.masterdicas.servico.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 *
 * @author gilmario
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class PaginarTagsResponse {

    protected ListaDeTags tags;

    public ListaDeTags getTags() {
        return tags;
    }

    public void setTags(ListaDeTags tags) {
        this.tags = tags;
    }
}

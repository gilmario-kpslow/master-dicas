/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gilmariosoftware.masterdicas.seguranca;

import br.com.gilmariosoftware.masterdicas.dominio.Usuario;
import java.io.Serializable;
import java.util.Objects;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author gilmario
 */
@SessionScoped
@Named
public class UsuarioSession implements Serializable {

    private Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public boolean isLogado() {
        return Objects.nonNull(usuario);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gilmariosoftware.masterdicas.mb;

import br.com.gilmariosoftware.masterdicas.dominio.Usuario;
import br.com.gilmariosoftware.masterdicas.negocio.UsuarioNegocio;
import br.com.gilmariosoftware.masterdicas.util.GeradorMensagem;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author gilmario
 */
@Named
@ViewScoped
public class UsuarioCadastroView implements Serializable {

    @EJB
    private UsuarioNegocio negocio;
    private Usuario usuario;
    @EJB
    private GeradorMensagem mensagem;

    @PostConstruct
    private void iniciar() {
        usuario = new Usuario();
    }

    public void salvar() {
        try {
            usuario = negocio.salvar(usuario);
            mensagem.info("Usuário Cadastrada");
            iniciar();
        } catch (Exception e) {
            mensagem.erro(e.getMessage());
        }
    }

    public void remover(Usuario usuario) {
        try {
            negocio.excluir(usuario);
            mensagem.info("Usuário excluído com sucesso!");
            iniciar();
        } catch (Exception e) {
            mensagem.erro(e.getMessage());
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}

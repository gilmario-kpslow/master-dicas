/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gilmariosoftware.masterdicas.mb;

import br.com.gilmariosoftware.masterdicas.dominio.Senha;
import br.com.gilmariosoftware.masterdicas.dominio.Usuario;
import br.com.gilmariosoftware.masterdicas.negocio.SenhaNegocio;
import br.com.gilmariosoftware.masterdicas.negocio.UsuarioNegocio;
import br.com.gilmariosoftware.masterdicas.util.GeradorMensagem;
import java.io.Serializable;
import java.time.LocalDate;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.EJBTransactionRolledbackException;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author gilmario
 */
@Named
@ViewScoped
public class SenhaCadastroView implements Serializable {

    @EJB
    private UsuarioNegocio usuarioNegocio;
    @EJB
    private SenhaNegocio negocio;
    private Senha senha;
    private String login;
    private String email;
    @EJB
    private GeradorMensagem mensagem;

    @PostConstruct
    private void iniciar() {
        senha = new Senha();
        senha.setValidade(LocalDate.now().plusMonths(1));
    }

    public void gerarSenha() {
        try {
            Usuario usuario = usuarioNegocio.encontrarPorLoginEmail(login, email);
            usuario.setSenha(negocio.salvar(senha));
            usuarioNegocio.alterar(usuario);
            mensagem.info("Senha cadastrada.");
            iniciar();
        } catch (EJBTransactionRolledbackException e) {
            mensagem.erro("Usuário não encontrado");
        } catch (Exception e) {
            mensagem.erro(e.getMessage());
        }
    }

    public Senha getSenha() {
        return senha;
    }

    public void setSenha(Senha senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

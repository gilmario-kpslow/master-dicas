/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gilmariosoftware.masterdicas.seguranca;

import br.com.gilmariosoftware.masterdicas.dominio.Usuario;
import br.com.gilmariosoftware.masterdicas.negocio.UsuarioNegocio;
import br.com.gilmariosoftware.masterdicas.util.CriptografiaUtil;
import java.io.IOException;
import java.util.Objects;
import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author gilmario
 */
@WebServlet(urlPatterns = {"/logar", "/login"})
public class LoginServlet extends HttpServlet {

    @EJB
    private UsuarioNegocio negocio;
    @Inject
    private UsuarioSession sessao;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = (String) req.getParameter("login_");
        String token = (String) req.getParameter("token_");
        String senha = CriptografiaUtil.SHA1((String) req.getParameter("senha_"));
        try {
            Usuario u = negocio.logar(login, senha);
            if (!Objects.isNull(u)) {
                sessao.setUsuario(u);
                req.setAttribute("mensagem", "Bem vindo.");
                req.getRequestDispatcher("/index.xhtml").forward(req, resp);
            } else {
                req.setAttribute("mensagem", "Usuário ou senha incorretos");
                req.getRequestDispatcher("/login.xhtml").forward(req, resp);
            }
        } catch (Exception e) {
            req.setAttribute("mensagem", "Usuário ou senha incorretos");
            req.getRequestDispatcher("/login.xhtml").forward(req, resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/login.xhtml").forward(req, resp);
    }

}

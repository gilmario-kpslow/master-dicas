/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gilmariosoftware.masterdicas.seguranca;

import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author gilmario
 */
@WebServlet(urlPatterns = "/logout")
public class LogoutServlet extends HttpServlet {

    @Inject
    private UsuarioSession session;

    private void destruirSessao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        session.setUsuario(null);
        HttpSession sessao = request.getSession();
        sessao.invalidate();
        request.setAttribute("mensagem", "Você foi deslogado corretamente.");
        request.getRequestDispatcher("/login.xhtml").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        destruirSessao(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        destruirSessao(req, resp);
    }

}

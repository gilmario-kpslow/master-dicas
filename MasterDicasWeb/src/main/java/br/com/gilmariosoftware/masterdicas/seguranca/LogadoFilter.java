package br.com.gilmariosoftware.masterdicas.seguranca;

import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 *
 * @author gilmario
 */
@WebFilter(urlPatterns = {"/login.xhtml", "/login", "/logar"})
public class LogadoFilter implements Filter {

    @Inject
    private UsuarioSession session;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        if (session.isLogado()) {
            request.getRequestDispatcher("/index.xhtml").forward(request, response);
        } else {
            chain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {

    }

}

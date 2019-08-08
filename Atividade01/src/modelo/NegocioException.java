
package modelo;

import modelo.persistencia.DadosException;

public class NegocioException extends Exception {

    public NegocioException(String message) {
        super(message);
    }

    public NegocioException(Throwable cause) {
        super(cause);
    }

    NegocioException(String ocorreu_um_erro, DadosException ex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
   
    
}
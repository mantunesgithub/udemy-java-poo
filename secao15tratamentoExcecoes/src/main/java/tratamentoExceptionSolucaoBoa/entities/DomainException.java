package tratamentoExceptionSolucaoBoa.entities;

public class DomainException extends RuntimeException {
//
//    RuntimeException = o compilador  NAO obriga a tratar
//    Exception = o compilador obriga a tratar com try catch / throws
//
        private static final long serialVersionUID = 1L;

        public DomainException(String msg) {
            super(msg);
        }
}

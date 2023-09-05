public class ParametrosInvalidosException extends Exception {

    // sobrecarrega um metodo da classe exception que exibe uma mensagem quando o exeção é lançada
    @Override
    public String getMessage(){
        return "O segundo parâmetro deve ser maior que o primeiro";
    }
    
}

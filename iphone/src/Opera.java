public class Opera implements NavegadorInternet{

    private boolean wiFi;
    private boolean bluetooth;
    private boolean teclado;
    
    @Override
    public void exibirPagina(String pagina) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exibirPagina'");
    }

    @Override
    public void adcionarNovaAba() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adcionarNovaAba'");
    }

    @Override
    public void atualizarPagina(String pagina) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizarPagina'");
    }

    public boolean isWiFi() {
        return wiFi;
    }

    public void setWiFi(boolean wiFi) {
        this.wiFi = wiFi;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public boolean isTeclado() {
        return teclado;
    }

    public void setTeclado(boolean teclado) {
        this.teclado = teclado;
    }
    
}

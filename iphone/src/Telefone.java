public class Telefone implements AparelhoTelefonico{

    private boolean wiFi;
    private boolean bluetooth;
    private boolean teclado;
    private int volume;

    public void aumentarVolume(int volume){
    }

    public void diminuirVolume(int volume){        
    }

    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ligar'");
    }

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atender'");
    }

    @Override
    public void iniciarCorreioVoz() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iniciarCorreioVoz'");
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

     public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }    
}

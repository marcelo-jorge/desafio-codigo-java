public class Iphone {

    private boolean headSet;
    private String layoutTeclado;
    private boolean camera;
    private boolean retratoPaisagem;

    Ipod ipod;
    Telefone telefone;
    Opera opera;
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public boolean isHeadSet() {
        return headSet;
    }

    public void setHeadSet(boolean headSet) {
        this.headSet = headSet;
    }

    public String getLayoutTeclado() {
        return layoutTeclado;
    }

    public void setLayoutTeclado(String layoutTeclado) {
        this.layoutTeclado = layoutTeclado;
    }

    public boolean isCamera() {
        return camera;
    }

    public void setCamera(boolean camera) {
        this.camera = camera;
    }

    public boolean isRetratoPaisagem() {
        return retratoPaisagem;
    }

    public void setRetratoPaisagem(boolean retratoPaisagem) {
        this.retratoPaisagem = retratoPaisagem;
    }

    public Ipod getIpod() {
        return ipod;
    }

    public void setIpod(Ipod ipod) {
        this.ipod = ipod;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public Opera getOpera() {
        return opera;
    }

    public void setOpera(Opera opera) {
        this.opera = opera;
    }
}

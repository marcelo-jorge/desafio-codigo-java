public class Ipod implements ReprodutorMusical{

    private String musica;
    private String album;
    private String capaAlbum;
    private String artista;
    private boolean wideScreenVideo;    
    
    public String procurarMusica(){
        throw new UnsupportedOperationException("Unimplemented method 'procurarMusica'");
    }

    @Override
    public void tocar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tocar'");
    }

    @Override
    public void pausar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pausar'");
    }

    @Override
    public void selecionarMusica(String musica) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selecionarMusica'");
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCapaAlbum() {
        return capaAlbum;
    }

    public void setCapaAlbum(String capaAlbum) {
        this.capaAlbum = capaAlbum;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public boolean isWideScreenVideo() {
        return wideScreenVideo;
    }

    public void setWideScreenVideo(boolean wideScreenVideo) {
        this.wideScreenVideo = wideScreenVideo;
    }
    
}

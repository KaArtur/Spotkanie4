package Interface.Lab15;

public class CDplayer extends MusicPlayer{

    public CDplayer(Song[] library) {
        super(library);
    }

    @Override
    public void play() {
        System.out.println("CD odtwarza " + getCurrentSong());
    }

    @Override
    public void pause() {
        System.out.println("CD pauza " + getCurrentSong());
    }

    @Override
    public void stop() {
        System.out.println("CD stop");
    }
}

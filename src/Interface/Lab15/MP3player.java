package Interface.Lab15;

public class MP3player extends MusicPlayer {

    public MP3player(Song[] library) {
        super(library);
    }

    @Override
    public void play() {
        System.out.println("MP3 odtwarza " + getCurrentSong());
    }

    @Override
    public void pause() {
        System.out.println("MP3 pausa "+ getCurrentSong());
    }

    @Override
    public void stop() {
        System.out.println("MP3 stop");
    }
}

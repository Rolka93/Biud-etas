public class Suvestinė {

    private int mėnesioIšlaidos;
    private int mėnesioPajamos;

    public int getMėnesioIšlaidos() {
        return mėnesioIšlaidos;
    }

    public void setMėnesioIšlaidos(int mėnesioIšlaidos) {
        this.mėnesioIšlaidos = mėnesioIšlaidos;
    }

    public int getMėnesioPajamos() {
        return mėnesioPajamos;
    }

    public void setMėnesioPajamos(int mėnesioPajamos) {
        this.mėnesioPajamos = mėnesioPajamos;
    }


    public Suvestinė(int mėnesioIšlaidos, int mėnesioPajamos) {
        this.mėnesioIšlaidos = mėnesioIšlaidos;
        this.mėnesioPajamos = mėnesioPajamos;
    }
}

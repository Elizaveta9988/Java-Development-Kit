public class Map  JPanel {
    public Map() {
        setBackground(Color.BLACK);
    }
    void startNewGame(int mode,int fSzX,int fSzY,int wLen ){
        System.out.printf("Mode: %d;\nSize:= x=%d, y=%d;\nWin Length:= %d",mode,fSzX,fSzY,wLen);
    }
}


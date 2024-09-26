public class players {
    private String name;
    private int player, start, end, mancala;

    public players() {}

    public players(String n, int p) {
        name = n;
        player = p;
        if (p ==1) {
            start =0;
            end = 5;
            mancala = 6;
        } else {
            start = 7; 
            end = 12; 
            mancala = 13;
        }
        }
    public void setName(String n) { name = n; }

    public String getName() {return name;}

    public int getStart() { return start;}

    public int getEnd() {return end;}

    public int getMancala() {return mancala;}
    }
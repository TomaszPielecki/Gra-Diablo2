package Team;

public class Member {
    private final String name;
    private String type;
    private int lvl;
    private int rank;

    public Member(String name, String type, int lvl, int rank) {
        this.name = name;
        this.type = type;
        this.lvl = lvl;
        this.rank = rank;
    }
    public String toString(){
    return name+" "+type+" "+lvl+" "+rank;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLvl() {
        return lvl;}

    public int getRank() {
            return rank;}
            public void gracze(){
            System.out.println("Jestem "+getName()+" gram taka profesja: "+ getType()+" Mam "+getLvl()+"lvl");
        }
        }






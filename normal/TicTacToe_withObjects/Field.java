package TicTacToe_withObjects;

public class Field {
    private boolean Fieldempty=true;
    private byte player=0;//0->empty,1->X,2->O
    public Field(){}
    public boolean IsnotEmpty(){
        return !Fieldempty;}
    public byte getPlayer(){
        return player;}
    public boolean SetPlayer(byte Player){
        if(Fieldempty){
            player=Player;
            Fieldempty=false;
            return true;}
        else{return false;}
    }
}

package TicTacToe_withObjects;
public class TicTacToe_withObjects{
    private Field[] Fields=new Field[9];
    private byte currentplayer=1;
    public static void main(String[] args) {
        System.out.println("The game is starting in a few Milliseconds.");
        TicTacToe_withObjects ttt = new TicTacToe_withObjects();
        ttt.startgame();
    }
    public TicTacToe_withObjects(){}
    public void startgame(){
        for(int i=0;i<9;i++){
            Fields[i]=new Field();
        }
        gameloop();}
    public void gameloop(){
        while(checkwin()==0){
            try{Fields[(Integer.parseInt(System.console().readLine()))-1].SetPlayer(currentplayer);
            currentplayer=currentplayer==1?(byte)2:(byte)1;}
            catch (Exception e) {System.out.println("Invalid Input");}
            printboard();}
        switch(checkwin()){
            case 1:System.out.println("Player X won the game.");break;
            case 2:System.out.println("Player O won the game.");break;
            case 3:System.out.println("It's a draw.");break;}
    }
    public byte checkwin(){ //0->no winner, 1->X, 2->O, 3-> draw
        for(int i=0;i<9;i+=3){
            if(Fields[i].getPlayer()==Fields[i+1].getPlayer()&&Fields[i].getPlayer()==Fields[i+2].getPlayer()&&Fields[i].getPlayer()!=0){return Fields[i].getPlayer();}}
        boolean draw = true;
        for(int i=0;i<9;i++){
            draw = Fields[i].IsnotEmpty()?draw:false;
        }
        if(draw) return 3;
        for(int i=0;i<3;i++){
            if(Fields[i].getPlayer()==Fields[i+3].getPlayer()&&Fields[i].getPlayer()==Fields[i+6].getPlayer()&&Fields[i].getPlayer()!=0){return Fields[i].getPlayer();}
        }
        return 0;
    }
    public void printboard(){
        for(int i=0;i<9;i+=3){System.out.println((Fields[i].getPlayer()==0?" - ":Fields[i].getPlayer()==1?" X ":" O ")+(Fields[i+1].getPlayer()==0?" - ":Fields[i+1].getPlayer()==1?" X ":" O ")+(Fields[i+2].getPlayer()==0?" - ":Fields[i+2].getPlayer()==1?" X ":" O "));}
    }
}
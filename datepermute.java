/*
datepermute.java takes in command lind argument strings from String[] arg
which is supposed to be entered in dd/mm/yy format with a space inbetween each
value. It then rearranges the numbers to a specific 6 character string that can then
be entered onto [redacted] to find a specific [redacted]]
*/
import java.util.ArrayList;
import java.util.List;
class datepermute{
    public int dd,mm,yy;
    
    public datepermute(int dd, int mm, int yy){
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }
    /**
     * Main function that rearranged arguments in 3 permutations. 
     * @param args - 3 2 character string arguments, rearranged in 3 permutations that correspond with [redacted] numbering system
     */
    public static void main(String[] args){
        String dd = args[0];
        String mm = args[1];
        String yy = args[2];
        if(args[0].length()!=2 || args[1].length()!=2 || args[2].length()!=2){
            throw new IllegalArgumentException("UWU uhhh ohh, wooks wike u chose the wrong input to get the [redacted] number. Pwease entew an awgument of onwy 2 chawactews in wength pwease daddy");
        }
        System.out.println(dd+mm+yy+"\n" + dd+yy+mm + "\n" + mm+dd+yy + "\n"
                            +yy+dd+mm+"\n"+yy+mm+dd+"\n"+mm+yy+dd);

    }
}
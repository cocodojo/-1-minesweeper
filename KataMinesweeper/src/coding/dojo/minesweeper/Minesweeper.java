/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coding.dojo.minesweeper;

/**
 *
 * @author ciber_000
 */
public class Minesweeper {

    public String[] weepMines(String[] data) {
        int row=data.length;
        int col=data[0].length();
        String[] out=new String[row];
        
        for(int r=0;r<row;r++) {        
            char[] line=new char[col];
            for(int c=0;c<col;c++) {
                int count=calNumberofMine(data,r,c);
                if(count==-1){
                    line[c]='*';
                }else{
                    line[c]=(""+count).charAt(0);
                }
            }
            out[r]=new String(line);
        }
        return out;
    }
    
    public int calNumberofMine(String[]data,int r,int c) {
        int total=0;
        int height=data.length-1;
        int width=data[0].length()-1;
        char pos=data[r].charAt(c);
        if(pos=='*') {
            return -1;
        }
        int tl;
        int top;
        int tr;
        int left;
        int right;
        int bl;
        int br;
        int bottom;
        
        tl=(c==0||r==0)?0:data[r-1].charAt(c-1)=='*'?1:0;
        top=(r==0)?0:data[r-1].charAt(c)=='*'?1:0;
        tr=(c==width||r==0)?0:data[r-1].charAt(c+1)=='*'?1:0;
        
        left=(c==0)?0:data[r].charAt(c-1)=='*'?1:0;
        right=(c==width)?0:data[r].charAt(c+1)=='*'?1:0;
        
        bl=(c==0||r==height)?0:data[r+1].charAt(c-1)=='*'?1:0;
        bottom=(r==height)?0:data[r+1].charAt(c)=='*'?1:0;
        br=(c==width||r==height)?0:data[r+1].charAt(c+1)=='*'?1:0;
        total=tl+tr+top+left+right+bottom+bl+br;
        return total;
    }
}

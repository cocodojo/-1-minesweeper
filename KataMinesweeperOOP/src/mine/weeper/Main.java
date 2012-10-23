/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mine.weeper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ciber_000
 */
public class Main {

    public static void main(String[] args) {
        try {

            char[][] input;
            int row;
            int col;
            

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("number of rows:");
            row = Integer.parseInt(br.readLine());
            System.out.print("number of columns:");
            col = Integer.parseInt(br.readLine());

            input = new char[row][col];
            
            for (int i = 0; i < row; i++) {
                input[i] = br.readLine().toCharArray();
            }
            Minesweeper minesweeper = new Minesweeper(input);
            Cell[][] output = minesweeper.getData();
            for (int r = 0; r < row; r++) {
                for (int c = 0; c < col; c++) {
                    System.out.print(output[r][c].getValue());
                }
                System.out.println();
            }
            
            
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}

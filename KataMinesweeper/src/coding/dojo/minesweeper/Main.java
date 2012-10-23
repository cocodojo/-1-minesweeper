/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coding.dojo.minesweeper;

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
            String[] input;
            int row;
            int col;

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("number of rows:");
            row = Integer.parseInt(br.readLine());
            System.out.print("number of columns:");
            col = Integer.parseInt(br.readLine());
            input = new String[row];
            for (int i = 0; i < row; i++) {
                input[i] = br.readLine();
            }

            String[] out = new Minesweeper().weepMines(input);
            for (int i = 0; i < row; i++) {
                System.out.println(out[i]);
            }

        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}

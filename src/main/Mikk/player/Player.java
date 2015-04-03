package main.Mikk.player;

import javax.swing.*;
import main.Mikk.player.ui.Download;

/**
 * Player.java
 *
 *
 * @author Mikk
 *
 *
 * @version 0.0.1
 *
 *
 * @since April 3, 2015
 *
 */

public class Player {

    public static void main(String[] args) {

        try {

            /** Setting the look and feel of the Youtube Player **/
            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel");

            Download.load();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
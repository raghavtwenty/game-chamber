package game_chamber;

import javax.swing.*;
import java.awt.*;

public class n_main {
    public static void main(String[] args) {
        leaderb lead = new leaderb();
        lead.call();
        subwaysurfers ss = new subwaysurfers();
        ss.callsub();

        bgmi bg = new bgmi();
        bg.callbgmi();
        coc cc = new coc();
        cc.call_COC();
        candy crush = new candy();
        crush.call_CANDY();
    }
}
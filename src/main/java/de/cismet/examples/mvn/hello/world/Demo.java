/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.cismet.examples.mvn.hello.world;

import com.github.lalyos.jfiglet.FigletFont;

/**
 *
 * @author thorsten
 */
public class Demo {

    public static void main(String[] args) {
        String asciiArt = FigletFont.convertOneLine("Hello World!");
        System.out.println(asciiArt);
    }
}

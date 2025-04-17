import java.io.IOException;

import javax.sound.midi.SysexMessage;

class MultiLine {
    public static void main(String args[]) throws Exception{
        //println --> new line
        System.out.println("This is");
        System.out.println("multiline ");

        //using print --> same line
        System.out.print("My name is ");
        System.out.print("Lubaba");

        // \n for new line
        System.out.print("\nI am 22 years old\nThank you");

        // \\
        System.out.println("\\ hahaha");

        // \t tab
        System.out.println("This is \t tab darling");

        // \"
        System.out.println(" \"Ab\" ");

    
    }
}

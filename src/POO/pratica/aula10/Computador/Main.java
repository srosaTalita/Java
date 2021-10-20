package Computador;

public class Main {

    public static void main(String[] args) {

        Computador pc = new Computador();
        pc.marca = "Dell";
        pc.memoriaRam = "16GB";
        pc.processador = "i5";
        pc.discoRigido = "1TB";

        Notebook note = new Notebook();
        note.marca = "Dell";
        note.memoriaRam = "16GB";
        note.processador = "i5";
        note.discoRigido = "1TB";
        note.bateria = "Dell";
        note.velocidadeWifi = "1000 mbps";
        note.versaoBluetooth = "5.0";

        Desktop desk = new Desktop();
        desk.marca = "Dell";
        desk.memoriaRam = "16GB";
        desk.processador = "i5";
        desk.discoRigido = "1TB";
        desk.monitorExterno = "Dell 24°";
        desk.tamanhoGabinete = "70 cm x 45cm";
        desk.fonte = "200W";

        // Crie objetos da classe Object através da instância das classes Computador, Notebook e Desktop.

        Object objPc = pc;
        Object objNote = note;
        Object objDesk = desk;

        // Converta os objetos da classe Object para as classes Computador, Notebook e Desktop.

        Computador objPcConvertido = (Computador)objPc;
        Notebook objNoteConvertido = (Notebook)objNote;
        Desktop objDeskConvertido = (Desktop)objDesk;

        //Imprima os dados dos objetos convertidos
        System.out.println("\n" + objPcConvertido);
        System.out.println("\n" + objNoteConvertido);
        System.out.println("\n" + objDeskConvertido);
    }
}

package by.pvt.serializablenote;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\artem\\IdeaProjects\\SerializableText\\src\\text.txt");
        File file1 = new File("src\\text1.txt");
        try(FileWriter fileWriter = new FileWriter(file);
        FileWriter fileWriter1 = new FileWriter(file1)) {
            fileWriter.write("The Rostóvs knew everybody in Moscow. " +
                    "The old count had money enough that year, as all his estates had been remortgaged, and so Nicholas, acquiring a trotter of his own, very stylish riding breeches of the latest cut, such as no one else yet had in Moscow, and boots of the latest fashion, with extremely pointed toes and small silver spurs, passed his time very gaily. " +
                    "After a short period of adapting himself to the old conditions of life, Nicholas found it very pleasant to be at home again. " +
                    "He felt that he had grown up and matured very much. His despair at failing in a Scripture examination, his borrowing money from Gavríl to pay a sleigh driver, his kissing Sónya on the sly—he now recalled all this as childishness he had left immeasurably behind. " +
                    "Now he was a lieutenant of hussars, in a jacket laced with silver, and wearing the Cross of St. George, awarded to soldiers for bravery in action, and in the company of well-known, elderly, and respected racing men was training a trotter of his own for a race. " +
                    "He knew a lady on one of the boulevards whom he visited of an evening." +
                    " He led the mazurka at the Arkhárovs’ ball, talked about the war with Field Marshal Kámenski, visited the English Club, and was on intimate terms with a colonel of forty to whom Denísov had introduced him.");
            fileWriter1.write("The Rostóvs knew everybody in Moscow. " +
                    "The old count had money enough that year, as all his estates had been remortgaged, and so Nicholas, acquiring a trotter of his own, very stylish riding breeches of the latest cut, such as no one else yet had in Moscow, and boots of the latest fashion, with extremely pointed toes and small silver spurs, passed his time very gaily. " +
                    "After a short period of adapting himself to the old conditions of life, Nicholas found it very pleasant to be at home again. " +
                    "He felt that he had grown up and matured very much. His despair at failing in a Scripture examination, his borrowing money from Gavríl to pay a sleigh driver, his kissing Sónya on the sly—he now recalled all this as childishness he had left immeasurably behind. " +
                    "Now he was a lieutenant of hussars, in a jacket laced with silver, and wearing the Cross of St. George, awarded to soldiers for bravery in action, and in the company of well-known, elderly, and respected racing men was training a trotter of his own for a race. " +
                    "He knew a lady on one of the boulevards whom he visited of an evening." +
                    " He led the mazurka at the Arkhárovs’ ball, talked about the war with Field Marshal Kámenski, visited the English Club, and was on intimate terms with a colonel of forty to whom Denísov had introduced him.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(FileReader fileReader = new FileReader(file);
        FileReader fileReader1 = new FileReader(file1)) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String text = bufferedReader.readLine();
            System.out.println(text);

            BufferedReader bufferedReader1 = new BufferedReader(fileReader1);
            String text1 = bufferedReader1.readLine();
            System.out.println(text1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

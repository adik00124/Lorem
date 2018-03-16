package pl.adriandlugosz.loremIpsum.repository;

public interface LoremIpsumGenerator {

    String generateParagraphs(int number);
    String generateSentences(int number);
    String generateWords(int number);




}

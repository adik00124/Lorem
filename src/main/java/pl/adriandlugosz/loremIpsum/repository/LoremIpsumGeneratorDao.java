package pl.adriandlugosz.loremIpsum.repository;


import de.svenjacobs.loremipsum.LoremIpsum;
import org.springframework.stereotype.Component;

@Component
public class LoremIpsumGeneratorDao implements LoremIpsumGenerator {

    private String type;
    private int number;

    private LoremIpsum loremIpsum = new LoremIpsum();

    @Override
    public String generateParagraphs(int number) {
        return loremIpsum.getParagraphs(number);

    }

    @Override
    public String generateSentences(int number) {
        return loremIpsum.getWords(10);
    }

    @Override
    public String generateWords(int number) {
        return loremIpsum.getWords(number);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

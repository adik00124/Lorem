package pl.adriandlugosz.loremIpsum.repository;


import de.svenjacobs.loremipsum.LoremIpsum;
import org.springframework.stereotype.Component;

@Component
public class LoremIpsumGeneratorDao implements LoremIpsumGenerator {

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

}

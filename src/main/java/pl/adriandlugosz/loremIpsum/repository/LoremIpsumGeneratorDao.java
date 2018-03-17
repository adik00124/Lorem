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

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < number; i++) {
                String first = loremIpsum.getWords(1,1);
                first = first.substring(0, 1).toUpperCase()
                        + first.substring(1);
                sb.append(first);
                sb.append(loremIpsum.getWords(15,2));
                sb.append(".  ");
            }
            sb.append("\n");
            return sb.toString();
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

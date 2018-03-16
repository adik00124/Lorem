package pl.adriandlugosz.loremIpsum.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.adriandlugosz.loremIpsum.repository.LoremIpsumGeneratorDao;


@Controller
public class HomeController {

    @Autowired
    private LoremIpsumGeneratorDao loremIpsumGeneratorDao;


    @GetMapping("/")
    public String form() {
        return "form";
    }

    @GetMapping("/data")
    public String data(@RequestParam String type,@RequestParam int number) {

        switch (type){
            case "sentences": loremIpsumGeneratorDao.generateSentences(number);
            break;
            case "paragraphs": loremIpsumGeneratorDao.generateParagraphs(number);
            break;
            case "words": loremIpsumGeneratorDao.generateWords(number);
            break;
        }
        return "form";
    }














}

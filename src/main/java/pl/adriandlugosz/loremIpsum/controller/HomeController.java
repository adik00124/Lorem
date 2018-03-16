package pl.adriandlugosz.loremIpsum.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.adriandlugosz.loremIpsum.repository.LoremIpsumGeneratorDao;


@Controller
public class HomeController {


    @Autowired
    private LoremIpsumGeneratorDao loremIpsumGeneratorDao;


    @PostMapping("/form")
    public String data(@RequestParam String type,@RequestParam int userNumber,ModelMap modelMap) {
        switch (type){
            case "sentences": modelMap.addAttribute("data",loremIpsumGeneratorDao.generateSentences(Math.abs(userNumber)));
                break;
            case "paragraphs": modelMap.addAttribute("data",loremIpsumGeneratorDao.generateParagraphs(Math.abs(userNumber)));
                break;
            case "words": modelMap.addAttribute("data",loremIpsumGeneratorDao.generateWords(Math.abs(userNumber)));
                break;
        }
      return "form";
    }

    @GetMapping("/")
    public String view(){
        return "form";
    }

}

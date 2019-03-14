package pl.akademiakodu.kwejk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.akademiakodu.kwejk.data.GifRepository;
import pl.akademiakodu.kwejk.model.Gif;

import java.util.List;

@Controller
public class GifController {

    @Autowired
    GifRepository gifRepository;

    @RequestMapping("/")
    public String listGifs(ModelMap modelMap){
        List<Gif> gifs = gifRepository.getAllGifs();
        modelMap.put("gifs", gifs);
        return "home";
    }
}

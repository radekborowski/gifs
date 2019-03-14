package pl.akademiakodu.kwejk.data;


import org.springframework.stereotype.Component;
import pl.akademiakodu.kwejk.model.Gif;

import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {

    public static List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("cowboy-coder", "mols",true,1),
            new Gif("compiler-bot", "mika",false,2),
            new Gif("book-dominos", "mom",true,3),
            new Gif("ben-and-mike", "bot",false,2),
            new Gif("android-explosion", "kot",true,1),
            new Gif("infinite-andrew", "kot",true,1)


    );
    public static List<Gif>getAllGifs (){
        return ALL_GIFS;
    }
}

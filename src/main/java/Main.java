import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
    public static void main (String[] args) throws Exception {
        Document doc = Jsoup.connect("https://skillbox-java.github.io/").get();
        Element metrodata = doc.getElementById("metrodata");
        Elements text = metrodata.getElementsByClass("js-metro-line");
        for(Element src : text){
                System.out.println(src.attr("data-line"));
        }
       // WriteJsonFile.writeJsonSimpleDemo("files/simlpe.json");
       // WriteJsonFile.writeJsonSimpleDemo("C://Users/Anton/IdeaProjects/javaWorkhome/ParseMetro/src/files/example.json");
    }
}

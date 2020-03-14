package bzh.jojal.web.service;

import bzh.jojal.web.model.Gif;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CodingLoveService {

  public Gif getLastGif(String htmlPage) {

    Document document = Jsoup.parse(htmlPage);
    Element firstElement = document.select(".container #ljdc-main .ljdc-posts .post-container .blog-post").first();

    String description = firstElement.text();
    String gifUrl = firstElement.select(".blog-post-content video object").attr("data");

    Gif gif = new Gif();
    gif.setTitle(description);
    gif.setUrl(gifUrl);

    return gif;
  }
}

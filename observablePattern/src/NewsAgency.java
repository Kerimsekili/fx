import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private String news;
    private final List<Channel> channels = new ArrayList<>();

    public NewsAgency(String news) {
        this.news = news;
    }

    public void addObserver(Channel channel) {
        channels.add(channel);
    }

    public void getNews() {
        System.out.println("Current News: " + this.news);
    }

    public void setNews(String news) {
        this.news = news;
        for (Channel channel : this.channels) {
            channel.update(this.news);
        }
    }
}
